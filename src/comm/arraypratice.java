package comm;

import java.util.Scanner;

public class arraypratice {
	 
   public static void main(String[] args)
   {
//      int temp;
//      int arr[]= {25,45,85,75};
//      for(int i=0;i<arr.length;i++)
//      {
//    	  for(int j=i+i;j<arr.length;j++)
//    	  {
//    		  if(arr[i]<arr[j]) 
//    		  {
//    			  temp=arr[i];
//    			  arr[i]=arr[j];
//    			  arr[j]=temp;
//    		  }
//    		 
//    	  }
//    	  System.out.println(arr[i]);
//      }
 	                     int temp;
 						 int arr[]= {15,10,65,14};
 					     for(int i=0;i<arr.length;i++)
 					     {
 							 for(int j=i+1;j<arr.length;j++)
 							 {
 								 if(arr[i]>arr[j])  
 							 {
 									temp=arr[i];      
 									arr[i]=arr[j];   
 									arr[j]=temp;     
 								 }
 								 
 							 }
 							 System.out.println(arr[i]);
 						 }
    
     
}
}
