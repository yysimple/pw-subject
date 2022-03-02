package com.simple.password.ascii;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-02 10:22
 **/
public class StringToAscii {
    public static void main(String[] args) {
        String a = "AaZ";
        // 获取ascii码，需要把字符串转成字符
        char[] chars = a.toCharArray();
        for (char c : chars) {
            int asciiCode = c;
            System.out.println(asciiCode);
        }
    }
}
