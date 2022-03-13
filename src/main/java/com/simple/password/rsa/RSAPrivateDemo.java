package com.simple.password.rsa;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述: 使用私钥进行加密
 *
 * @author: WuChengXing
 * @create: 2022-03-13 12:10
 **/
public class RSAPrivateDemo {
    public static void main(String[] args) throws Exception {
        String value = "私钥";
        String rsaType = "RSA";
        // 获取密钥生成器
        KeyPairGenerator generator = KeyPairGenerator.getInstance(rsaType);
        // 拿到对应的密钥对
        KeyPair keyPair = generator.generateKeyPair();
        // 拿到对应的私钥
        PrivateKey privateKey = keyPair.getPrivate();
        // 获取加密器
        Cipher cipher = Cipher.getInstance(rsaType);
        // 初始化cipher模式和对应的key
        cipher.init(Cipher.ENCRYPT_MODE, privateKey);
        // 进行加密
        byte[] bytes = cipher.doFinal(value.getBytes());
        System.out.println(Base64.encode(bytes));
    }
}
