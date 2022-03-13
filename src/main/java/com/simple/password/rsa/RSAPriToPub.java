package com.simple.password.rsa;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述: 使用私钥加密公钥解密
 *
 * @author: WuChengXing
 * @create: 2022-03-13 12:24
 **/
public class RSAPriToPub {
    public static void main(String[] args) throws Exception {
        String value = "hello world";
        String type = "RSA";
        KeyPairGenerator generator = KeyPairGenerator.getInstance(type);
        KeyPair keyPair = generator.generateKeyPair();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        Cipher cipher = Cipher.getInstance(type);
        // 使用私钥进行加密
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        byte[] privateBytes = cipher.doFinal(value.getBytes());
        System.out.println(Base64.encode(privateBytes));
        // 使用公钥进行解密
        cipher.init(Cipher.DECRYPT_MODE, publicKey);
        byte[] publicBytes = cipher.doFinal(privateBytes);
        System.out.println(new String(publicBytes));
    }

}
