package com.simple.password.kaisar;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述: 凯撒密码最早由古罗马军事统帅盖乌斯·尤利乌斯·凯撒在军队中用来传递加密信息，故称凯撒密码。这是一种位移加密方式，只对26个字母进行位移替换加密，规则简单，容易破解
 *
 * @author: WuChengXing
 * @create: 2022-03-02 10:29
 **/
public class KaiserDemo {
    public static void main(String[] args) {
        String input = "Hello world";
        // 往右边移动3位
        int key = 3;
        // 用来拼接
        StringBuilder sb = new StringBuilder();
        // 字符串转换成字节数组
        char[] chars = input.toCharArray();
        for (char c : chars) {
            int asciiCode = c;
            // 移动3位
            asciiCode = asciiCode + key;
            char newChar = (char) asciiCode;
            sb.append(newChar);
        }

        System.out.println(sb.toString());
    }
}
