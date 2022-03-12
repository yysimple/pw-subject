package com.simple.password.digest;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述: MD5算法的原理可简要的叙述为：MD5码以512位分组来处理输入的信息，
 * 且每一分组又被划分为16个32位子分组，经过了一系列的处理后，算法的输出由四个32位分组组成，将这四个32位分组级联后将生成一个128位散列值
 *
 * @author: WuChengXing
 * @create: 2022-03-12 12:05
 **/
public class DigestDemo2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 原文
        String input = "aa";
        // 算法
        String algorithm = "MD5";
        // 获取数字摘要对象
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        // 消息数字摘要
        byte[] digest = messageDigest.digest(input.getBytes());
//        System.out.println(new String(digest));
        // base64编码
        System.out.println(Base64.encode(digest));
    }
}
