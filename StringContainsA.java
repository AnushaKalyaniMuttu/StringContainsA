package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringContainsA {

	public static void main (String [] args) {
	//String that that contains a in the list
		
		List<String> list=new ArrayList<>(Arrays.asList("abc","def","ghi","jkh"));
	list.stream().filter(s->s.contains("a")).collect(Collectors.toList()).forEach(System.out::println);
	
	}
}
