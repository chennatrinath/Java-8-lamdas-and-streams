package com.epam.Java8Palindrome;

import java.util.*;
import java.util.function.Function;


public class App 
{
	public static void main(String args[])
    {
        List<String> list=Arrays.asList("aba","abc","madam","teacher");
        List<String> palindrome = palindromeCheck(list,(String str) -> str.equals(palindrome(str)));

        System.out.println(palindrome);
      
    }
	public static List<String> palindromeCheck(List<String> list,Function<String,Boolean> function)
    {
        List<String> newList=new ArrayList<String>();
        for(String str:list)
        {
            if(function.apply(str) )
            	newList.add(str);
        }
        return newList;
    }
	public static String palindrome(String str) {
		char ch[]=str.toCharArray();  
	    String reverse="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        reverse+=ch[i];  
	    }  
	    return reverse;  
	}
}