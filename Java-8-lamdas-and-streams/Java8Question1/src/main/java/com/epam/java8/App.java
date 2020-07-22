package com.epam.java8;

import java.util.*;
import java.util.function.Function;

public class App 
{
    public static void main( String[] args )
    {
    	Integer[] numbers = {51,56,56,48,412,45,48};
        List<Integer> listNumbers = Arrays.asList(numbers);
        float resultList = getLengthList(listNumbers,(Integer i) -> i);
        System.out.println(resultList);
    }
    
    public static float getLengthList(List<Integer> list, Function<Integer,Integer> function){
    	int sum = 0;
    	int count = 0;
    	float avg=0;
    	for(Integer str:list) {
    		sum = sum + function.apply(str);
    		count++;
    	}
    	avg = sum/count;
    	return avg;
    }
}
