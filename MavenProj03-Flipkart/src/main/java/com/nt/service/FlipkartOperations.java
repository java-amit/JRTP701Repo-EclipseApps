package com.nt.service;

import com.nt.util.StringUtil;

/**
 * Hello world!
 */
public class FlipkartOperations {
    public static void main(String[] args) {
        int tokensCount=StringUtil.countWords("Hello, how are u ?");
        System.out.println("Words count::"+tokensCount);
    }
}
