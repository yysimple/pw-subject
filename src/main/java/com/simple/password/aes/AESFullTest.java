package com.simple.password.aes;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-10 23:30
 **/
public class AESFullTest {
    public static void main(String[] args) throws Exception {
        String input = "hello world";
        // AES需要16位的key值
        String key = "970412cc12345678";
        // 这里采用的加密规则改成ASE即可，其他跟DES是一样的
        String algorithm = "AES";
        String s = encryptAES(input, key, algorithm);
        System.out.println(s);
        System.out.println(decryptAES(s, key, algorithm));

    }

    public static String encryptAES(String input, String key, String algorithm) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithm);
        // 设置加密规则
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] bytes = cipher.doFinal(input.getBytes());
        return Base64.encode(bytes);
    }

    public static String decryptAES(String encryptInput, String key, String algorithm) throws Exception{
        Cipher cipher = Cipher.getInstance(algorithm);
        // 设置加密规则
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] bytes = cipher.doFinal(Base64.decode(encryptInput));
        return new String(bytes);
    }
}
