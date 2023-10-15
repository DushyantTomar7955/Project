package com.jspider;
import java.util.*;
public class RomanToNumber
{
    public static int romanNumber(String s){
        Map<Character,Integer>mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int result=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && mp.get(s.charAt(i))<mp.get(s.charAt(i+1))){
                result-=mp.get(s.charAt(i));
            }
            else{
                result+=mp.get(s.charAt(i));
            }
        }
    
        return result;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the roman Number: ");
        String s=sc.next();
		int n=romanNumber(s);
		System.out.println("After Converting Roman Number to Number: "+n);
	}
}
