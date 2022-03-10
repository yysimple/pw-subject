package com.simple.password.des;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-01 23:34
 **/
public class DesTest {
    public static void main(String[] args) throws Exception {
        String input = "Test DES";
        // 加密选择使用的算法
        String algorithm = "Des";
        String key = "970412cc";
        // transformation:参数表示使用什么类型加密
        Cipher cipher = Cipher.getInstance("DES");
        // 指定秘钥规则
        // 第一个参数表示：密钥，key的字节数组（这里的key只支持八位字符串）
        // 第二个参数表示：算法
        SecretKeySpec sks = new SecretKeySpec(key.getBytes(), algorithm);
        // 对加密进行初始化
        // 第一个参数：表示模式，有加密模式和解密模式
        // 第二个参数：表示秘钥规则
        cipher.init(Cipher.ENCRYPT_MODE,sks);
        // 进行加密
        byte[] bytes = cipher.doFinal(input.getBytes());
        // 使用Base64进行加密
        String encode = Base64.encode(bytes);
        // 打印密文
        System.out.println(encode);

    }
}
