package com;

public class StringPractice {

public static void main(String[] args)
{

  String s1="heleh";
  String s2="";
      char arr[]= s1.toCharArray();
     for (int i = arr.length-1; i >= 0; i--) 
     {
    	 s2=s2+arr[i];
    		
	}
     System.out.println(s2);
   if(s1.equals(s2)) 
	   System.out.println("palindrome");
   
   else
	   System.out.println("not palindrome");

}
}
