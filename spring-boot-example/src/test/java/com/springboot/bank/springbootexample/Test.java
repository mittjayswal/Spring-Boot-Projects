package com.springboot.bank.springbootexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.expression.spel.ast.BooleanLiteral;

public class Test {

	public static void main(String[] args) {
		/*String str="P"; String strj = "J"; String strk= "2";
		System.out.println(str.length()+strj.length()+strk+"80");
		
		String str = "ZS11280";
		System.out.println(str.substring(3, 5));*/
		
		
		/*List<String> list = new ArrayList<>();
		list.add("emanual");
		list.add("sanfransisco");
		list.add("berlin");
		StringBuilder sb = list.stream().mapToInt(i->i.codePointAt(0)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
		System.out.println(sb);*/
		
		int [] m12v12 = null;
		int []m = new int[500];
		int []v = new int[500];
		
		for (int i=0,j=0; i<500; i++,j++) {
			m12v12 [i] = m[i]*v[i] + m[i+1]*v[i+1];
		}
		
	}

}