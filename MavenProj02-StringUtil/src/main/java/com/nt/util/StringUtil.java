package com.nt.util;

import java.util.StringTokenizer;

/**
 * Hello world!
 */
public class StringUtil {
    public static int countWords(String text) {
    	StringTokenizer tokenizer = new StringTokenizer(text, " ");
    	int count=tokenizer.countTokens();
    	return count;
    	
    } 
}
