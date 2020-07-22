package com.epam.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class App 
{
	public static void main(String args[]) {
		List<String> list=Arrays.asList("aba","abc","madam","teacher","ab","abcd","aaaa","aa","aaa");
		List<String> finalList=checking(list,(String s)-> s.charAt(0)=='a' && s.length()==3);
		System.out.println(finalList);
    }
    public static List<String> checking(List<String> list,Function<String,Boolean> function) {
    	
    	List<String> newList=new ArrayList<String>();
        for(String str:list)
        {
            if(function.apply(str) )
            	newList.add(str);
        }
        return newList;
    }
}
