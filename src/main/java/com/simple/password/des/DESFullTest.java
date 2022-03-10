package com.simple.password.des;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述: des综合测试
 *
 * @author: WuChengXing
 * @create: 2022-03-10 22:45
 **/
public class DESFullTest {
    public static void main(String[] args) throws Exception {
        String input = "hello world";
        String key = "970412cc";
        String algorithm = "DES";
        String s = encryptDES(input, key, algorithm);
        System.out.println(s);
        System.out.println(decryptDES(s, key, algorithm));
        
    }

    public static String encryptDES(String input, String key, String algorithm) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithm);
        // 设置加密规则
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] bytes = cipher.doFinal(input.getBytes());
        return Base64.encode(bytes);
    }

    public static String decryptDES(String encryptInput, String key, String algorithm) throws Exception{
        Cipher cipher = Cipher.getInstance(algorithm);
        // 设置加密规则
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] bytes = cipher.doFinal(Base64.decode(encryptInput));
        return new String(bytes);
    }
}
