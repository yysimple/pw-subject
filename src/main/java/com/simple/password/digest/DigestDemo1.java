package com.simple.password.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述: 数字摘要算法
 * 它是一个唯一对应一个消息或文本的固定长度的值，它由一个单向Hash加密函数对消息进行作用而产生
 *
 * @author: WuChengXing
 * @create: 2022-03-12 12:00
 **/
public class DigestDemo1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 原文
        String input = "aa";
        // 算法
        String algorithm = "MD5";
        // 获取数字摘要对象
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        // 获取消息数字摘要的字节数组
        byte[] digest = messageDigest.digest(input.getBytes());
        System.out.println(new String(digest));
    }
}
