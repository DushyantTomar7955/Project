package com.jspider;

import java.util.*;
public class AnagramString
{
    public static String toLowerCase(String s){
       char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        String s1="";
        for(int i=0;i<chars.length;i++){
            s1+=chars[i];
        }
        return s1;
    }
    public static boolean isLetter(char ch){
        if (!Character.isLetter(ch))
            return false;
 
        return true;
    }
    public static boolean anagram(String s){
        int n=s.length();
        if(n<26){
            return false;
        }
        String s1=toLowerCase(s);
        boolean b[]=new boolean[26];
        for(int i=0;i<s1.length();i++){
            if(isLetter(s1.charAt(i))){
                int k=s1.charAt(i)-'a';
                b[k]=true;
            }
        }
        for(int i=0;i<26;i++){
            if(!b[i])
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.next();
		boolean b=anagram(s);
		if(b){
		    System.out.println("String is Anagram. ");
		}
		else{
		    System.out.println("String is Not a Anagram. ");
		}
	}
}
