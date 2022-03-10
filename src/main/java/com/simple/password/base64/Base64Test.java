package com.simple.password.base64;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

/**
 * 项目: pw-subject
 * <p>
 * 功能描述:
 *
 * @author: WuChengXing
 * @create: 2022-03-10 23:17
 **/
public class Base64Test {
    /**
     * Base64是网络上最常见的用于传输8Bit字节码的可读性编码算法之一
     * 可读性编码算法不是为了保护数据的安全性，而是为了可读性
     * 可读性编码不改变信息内容，只改变信息内容的表现形式
     * 所谓Base64，即是说在编码过程中使用了64种字符：大写A到Z、小写a到z、数字0到9、“+”和“/”
     * Base58是Bitcoin(比特币)中使用的一种编码方式，主要用于产生Bitcoin的钱包地址
     * 相比Base64，Base58不使用数字"0"，字母大写"O"，字母大写"I"，和字母小写"i"，以及"+"和"/"符号
     * <p>
     * base64 是 3个字节为一组，一个字节 8位，一共 就是24位 ，然后，把3个字节转成4组，每组6位，
     * <p>
     * 3 * 8 = 4 * 6 = 24 ，每组6位，缺少的2位，会在高位进行补0 ，这样做的好处在于 ，
     * base取的是后面6位，去掉高2位 ，那么base64的取值就可以控制在0-63位了，
     * 所以就叫base64，111 111 = 32 + 16 + 8 + 4 + 2 + 1 =
     * <p>
     * base64有个 = 号，但是在映射表里面没有发现 = 号 ，
     * 这个地方需要注意，等号非常特殊，因为base64是三个字节一组 ，如果当我们的位数不够的时候，会使用等号来补齐
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Base64.encode("1".getBytes()));
        System.out.println(Base64.encode("12".getBytes()));
        System.out.println(Base64.encode("123".getBytes()));
        System.out.println(Base64.encode("媛媛".getBytes()));
    }
}
