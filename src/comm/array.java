package comm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// program 1 array using for each loop
		//		   int arr[]= {4,5,6,7,8,9};
		//		   for(int bar:arr) {
		//			   System.out.println(bar);
		//		   }

		// program 2 array using for loop	
		//		  
		//		int arr[]= {4,5,6,8,7,9};
		//		System.out.println(arr.length);
		//		for(int i=0;i<arr.length;i++) {
		//			System.out.print(arr[i]+" ");
		//		}

		// program 3 single dimensional array

		//				         int arr[]= new int[6];
		//				         arr[0]=5;
		//				         arr[1]=5;
		//				         arr[2]=6;
		//				         arr[3]=5;
		//				         arr[4]=10;
		//				         System.out.println(arr[0]);
		//				         System.out.println(arr[1]);
		//				         System.out.println(arr[2]);
		//				         System.out.println(arr[3]);
		//				         System.out.println(arr[4]);
		//				         System.out.println(arr[5]);

		// program 4 two dimensional array using for loop

		//				int arr[][]= {{5,6,8},
		//						       {8,6,8,}};
		////		System.out.print(arr.length);      //  2
		//		    System.out.print(arr[0].length);   // 3
		//		    System.out.print(arr[1].length);   // 3

		//				for(int i=0;i<arr.length;i++) {
		//					for(int j=0;j<arr[i].length;j++) {
		//						System.out.print(arr[i][j]);
		//					}
		//					System.out.println();
		//				}
		// program 5 jagged array using for loop

		//	           int arr[][]= {{5,6,8},{8},{8,9},{8,8,6,9}};
		//		   System.out.println(arr.length);      // 4
		//		   System.out.println(arr[0].length);   // 3
		//		   System.out.println(arr[1].length);   // 1
		//		   System.out.println(arr[2].length);   // 2
		//		   System.out.println(arr[3].length);   // 4
		//		   
		//		   for(int i=0;i<arr.length;i++) 
		//		   {
		//			   for(int j=0;j<arr[i].length;j++) {
		//				   System.out.print(arr[i][j]);
		//			   }
		//			   System.out.println();
		//		   }

		// program 6 jagged array using for each loop

		//		//		
		//				   int arr[][]= {{4,6,8,7,8},{8,6,9},{4,9},{9}};
		//				         for(int [] sda :arr) {
		//				        	 for(int ele: sda) {
		//				        		 System.out.print(ele);
		//				        	 }
		//				        	 System.out.println();
		//				         }

		// program 7 using for loop

		//		   int arr[]= {5,6,7,8};
		//		   for(int i=0;i<arr.length;i++) {
		//			  int  arrayitem = arr[i];
		//			   System.out.print(arrayitem);
		//		   }
		//	
		// program 8 using for each

		//		  int arr[]= {5,3,2};
		//		  for(int bar:arr) {
		//			  System.out.print(bar+"   ");
		//		  }

		// program 9 string array

		//		String arr[]= {"hello","world","india"};
		//		
		//		for(int i=0;i<arr.length;i++) {
		//			System.out.println(arr[i]);
		//	}

		// program 10 to string , as list, deep to string(for two dimensional)
		//
		//		   String  arr[]= {"hello","566899","india"};
		//			System.out.println("to string   "+ Arrays.toString(arr));
		//			System.out.println("as list  "+ Arrays.asList(arr));
		//
		//				int ar[][]= {{4,5},{5,6}};
		//				System.out.println("deep to string   "+ Arrays.deepToString(ar));

		//    program 11 find length of array
		//		int arr[]= {4,5,6,8,9};
		//		System.out.println(arr.length);

		// program 12 print array int in reverse order

		//				int arr[]= {4,5,6,7,8,9};
		//				for(int i=arr.length-1;i>=0;i--) {
		//					System.out.println(arr[i]);
		//				}

		// program 12 print string array in reverse order

		//				   String arr[]= {"hello ", "world", "welcome"};
		//				   for(int i=arr.length-1;i>=0;i--) {
		//					   System.out.println(arr[i]);
		//				   }

		// program 13 copy array in another array

		//				int aar[]= {4,5,6,7,8};
		//				for(int i=0;i<aar.length;i++) {
		//					int bar= aar[i];
		//					System.out.println(bar);
		//					System.err.println(aar);
		//					
		//					
		//		}
	                          // program 14 add array elements
		//				    int sum=0;
		//				    int arr[]= {4,5,6,7,8,9};
		//				    for(int i=0;i<arr.length;i++) {
		//				    	sum = sum+ arr[i];
		//				    }
		//				    System.out.println(sum);
		
		
		                // program 15 search an element in array
		//               int n=5,count=0;
		//               int arr[]= {1,2,5,3};
		//                for(int i=0;i<arr.length;i++) {
		//                	if(arr[i]==n) {
		//                		count++;
		//                		}
		//                }
		//                	if(count>0)
		//                		System.out.println("found:"+n);
		//                	else 
		//                		System.out.println("not found");
		//                }
		//		//				   

	                            	// program 16 average of an array
		//		  int sum =0;
		//		  int arr[]= {4,2,1,5,3};
		//		  
		//		  for(int i=0;i<arr.length;i++) {
		//			  sum= sum+arr[i];
		//		  }
		//		     int avg=sum/5;
		//		     System.out.println(avg);

	                           	// program 17 ascending order

		//				 int temp;
		//				 int arr[]= {15,10,12,65,14};
		//				 for(int i=0;i<arr.length;i++)
		//				 {
		//					 for(int j=i+1;j<arr.length;j++)
		//					 {
		//						 if(arr[i]>arr[j])  
		//						 {
		//							temp=arr[i];      
		//							arr[i]=arr[j];   
		//							arr[j]=temp;     
		//						 }
		//						 
		//					 }
		//					 System.out.println(arr[i]);
		//				 }
		                           // program 18  decending order

		//				int temp;
		//				int arr[]= {12,85,45,75,95};
		//				for(int i=0;i<arr.length;i++) {
		//					for(int j=i+1;j<arr.length;j++) {
		//						 if(arr[i]<arr[j]) {
		//							 temp=arr[i];
		//							 arr[i]=arr[j];
		//							 arr[j]=temp;
		//						 }
		//					}
		//					System.out.println(arr[i]);
		//				}

		                     // program 19  biggest element in array
		//
		//		       int max;
		//		       int arr[]= {25,35,55,65,75,85};
		//		       max=arr[0];
		//		       for(int i=1;i<arr.length;i++)
		//		       {
		//		    	   if(arr[i]>max)
		//		    	   {
		//		    		   max=arr[i];
		//		    		   
		//		    	   }
		//		    	   
		//		       }
		//		       System.out.println(max);
		                      // program 20 smallest element in array

		//		int min;
		//		int arr[]= {45,25,456,26,28};
		//		min=arr[0];
		//		for(int i=1;i<arr.length;i++)
		//		{
		//			if(arr[i]<min)
		//			{
		//				min=arr[i];
		//			}
		//		}
		//		System.out.println("minimum value is  "+min);

		                                      // program 21
		//		int arrayitem=0;
		//		int arr[]= {5,8,9};
		//		for(int i=0;i<arr.length;i++)
		//		{
		//			if(i==1) 
		//			{
		//				arrayitem=arr[i-1];
		//				System.out.println(arrayitem);
		//			}
		//
		//			else {
		//				arrayitem=arr[i];
		//			System.out.println(arrayitem);
		//		}
		//	}

		                          // program 22 compare arrays ==,equals()
		//		int a[]= {10,20,30,40,50};
		//		int b[]= {10,20,30,40,50};
		//	    if(Arrays.equals(a,b))            //if(a== b)
		//			System.out .println("both are equal");
		//		else
		//			System.out.println("both are not equal");

		                                // program 23
		//		
		//		int arr[][]= {{4,6,5},{2,5,8},{4,5}};
		//		System.out.println(arr.length);
		//		System.out.println(arr[0].length);
		//		System.out.println(arr[1].length);
		//		System.out.println(arr[2].length);
		//		  for(int i=0;i<arr.length;i++)
		//		  {
		//			  for(int j=0;j<arr[i].length;j++) 
		//			  {
		//				  System.out.print(arr[i][j]);
		//			  }
		//			  System.out.println();
		//		}
	                                	//		program 24

		//		  int arr[][]={ {4,5,6},{5,4}};
		//		  for(int []bar:arr) {
		//			  for(int ele:bar) {
		//				  System.out.print(ele);
		//			  }
		//			  System.out.println();
		//		  }
		                                 // program 25    sort()  
		//		
		//		int arr[]= new int[5];
		//		Scanner scan = new Scanner(System.in);
		//		System.out.println("enter array data");
		//		for(int i=0;i<arr.length;i++) {
		//			arr[i]= scan.nextInt();
		//			
		//		}
		//		Arrays.sort(arr);
		//		for(int i=0;i<arr.length;i++) {
		//			System.out.println(arr[i]);
		//		}
		                                           // program 26  equals()
				    /*  int arr[]= new int[2];
				      int arr2[]= new int[2];
				      Scanner scan = new Scanner(System.in);
				      System.out.println("enter array values" );
				      for(int i=0;i<arr.length;i++)
				      {
				    	  arr[i]=scan.nextInt();
				      }
				      System.out.println("enter array element");
				      for(int i=0;i<arr.length;i++) {
				    	  arr2[i]=scan.nextInt();
				      }
				      boolean b=Arrays.equals(arr, arr2);
				      System.out.println("same"+b);*/

		//		              // or
		//		 int arr[]= new int[2];
		//	     int arr2[]= new int[2];
		//	     Scanner scan = new Scanner(System.in);
		//	     boolean b = Arrays.equals(arr, arr2);
		//	     System.out.println("same "+ b);

		//                                         program 27  copyof()
				/*int arr[]= new int[5];
				Scanner scan = new Scanner(System.in);
				System.out.println("enter array data 1");
				for(int i=0;i<arr.length;i++) {
					arr[i]=scan.nextInt();
				}
		        int arr2[]= Arrays.copyOf(arr, 8);
		        arr2[5]=20;
		        arr2[6]=20;
		        arr2[7]=20;
		      
		        System.out.println("enter array data2");
		        for(int i=0;i<arr2.length;i++) {
		        	System.out.println(arr2[i]);
		        }*/

		//		                               program 28   equals()
				/*  int arr[]= {1,2,3,4,5};
				  int arr2[]= {1,2,3,4,5};
				  if(arr==arr2)
				  if(Arrays.equals(arr, arr2))
				  {
					  System.out.println("both are equal");
				  }
				  else
					  System.out.println("both are not equal");*/
		
		                                            // second highest array
		
//		
//		int arr[]= {1,56,25,45,65};  // unsort array
//		Arrays.sort(arr);            // sort array
//		
//	
//		System.out.println(arr.length);
//		System.out.println("first highest array "+ arr[arr.length-1]);
//		System.out.println("second highest array"+ arr[arr.length-2]);
		
		                                       //  first and second highest array
//		
//		int arr[]= new int[5];
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter array");
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]= scan.nextInt();
//			
//		}
//		Arrays.sort(arr);
//		System.out.println("first highest array "+arr[arr.length-1]);
//		System.out.println("second highest array "+arr[arr.length-2]);
//		
		                                                 // smallest array
//		
//		int arr[]= {12,25,75,25,62};
//		Arrays.sort(arr);
//		System.out.println("1st minimum value "+arr[arr.length-5]);
//		System.out.println("2nd minimum value "+arr[arr.length-4]);
//		
		                                               //smallest array
		
		/*int arr[]= new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter unsort array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]= scan.nextInt();
		}
		System.out.println("sorted array");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		System.out.println("1st minimum value "+arr[arr.length-5]);
		System.out.println("2nd minimum value "+arr[arr.length-4]);*/
			
		
		
		                       // program
		int n=5,count=-1;
		int arr[]= {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==n)
			{
				count++;
				
			}
		}
			if(count>0) {
				System.out.println("found");
			}
			else {
				System.out.println("not found");
			
		}

		
	}
}
	


