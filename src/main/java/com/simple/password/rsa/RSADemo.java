package com.simple.password.rsa;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.security.*;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述: 不对称加密公钥私钥方式
 *
 * @author: WuChengXing
 * @create: 2022-03-13 12:04
 **/
public class RSADemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 加密算法
        String algorithm = "RSA";
        //  创建密钥对生成器对象
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithm);
        // 生成密钥对
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        // 生成私钥
        PrivateKey privateKey = keyPair.getPrivate();
        // 生成公钥
        PublicKey publicKey = keyPair.getPublic();
        // 获取私钥字节数组
        byte[] privateKeyEncoded = privateKey.getEncoded();
        // 获取公钥字节数组
        byte[] publicKeyEncoded = publicKey.getEncoded();
        // 对公私钥进行base64编码
        String privateKeyString = Base64.encode(privateKeyEncoded);
        String publicKeyString = Base64.encode(publicKeyEncoded);
        // 打印私钥
        System.out.println(privateKeyString);
        // 打印公钥
        System.out.println(publicKeyString);
    }
}
