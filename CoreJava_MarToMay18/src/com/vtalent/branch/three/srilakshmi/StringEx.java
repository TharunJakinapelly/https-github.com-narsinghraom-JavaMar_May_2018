package com.vtalent.branch.three.srilakshmi;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String s1=new String("Abce fgh");
		String s=new String("Abc");
		System.out.println("comparet to"  + s1.compareToIgnoreCase(s));
		System.out.println("charAt output" +s1.charAt(1));
		System.out.println("codepoint output"+s1.codePointAt(2));
		System.out.println("codepointBefore output"+s1.codePointBefore(2));
		System.out.println("codepointCount"+s1.codePointCount(0,1));
		System.out.println(("concat output"+ s1.concat("Def")));
		System.out.println(("contains method"+s1.contains(s)));
		System.out.println(("contentEquals output:"+s1.contentEquals(s)));
		char[] ch=s1.toCharArray();
		System.out.println("char array"+Arrays.toString(ch));
		System.out.println("copy method of:"+s1.copyValueOf(ch));
		System.out.println("copy value of:"+s1.copyValueOf(ch, 0,1));
		System.out.println("lower case:"+s1.toLowerCase());
		System.out.println("upper case:"+s1.toUpperCase());
		System.out.println("trim"+s1.trim());
		System.out.println("replace"+s1.replace('e','d'));
		System.out.println("replace all"+s1.replaceAll(s1,s));
		String s2="abc";
		if(s1.equals(s2))
		{
			System.out.println("both are Same");
		}
		else{
			System.out.println("both are not same");
		}
		s1.compareTo(s2);
		String s3=new String("Abc");
		String s4="Abc";
		s1=new String("Def");
		s3="Abc";
		s2=new String("Def");
		String s5=s2;
	}

}
