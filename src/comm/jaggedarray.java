package comm;

public class jaggedarray {
  public static void main(String[] args) {
	    // program1
//	  int array[][]= {{5,6,8},{6},{8,4}};
//	  
//	     System.out.print(array[0][0]);
//	     System.out.print(array[0][1]);
//	     System.out.println(array[0][2]);
//	     System.out.println(array[1][0]);
//	     System.out.print(array[2][0]);
//	     System.out.println(array[2][1]);
//	     System.out.println(array[0]);
//	     System.out.println(array.length);
	     
	     
	     // program 2
	     int array[][]=new int[3][];
//	     int array[][];
//	     array = new int[3][];
	     
	     array[0]=new int[3];
	     array[0][0]= 5;
	     array[0][1]= 6;
	     array[0][2]=8;
	      
	     array[1]=new int[1];
	     array[1][0]= 4;
	     
	     array[2]=new int[2];
	     array[2][0]=8;
	     array[2][1]=6;
	     System.out.print(array[0][0]);
	     System.out.print(array[0][1]);
	     System.out.println(array[0][2]);
	     System.out.println(array[1][0]);
	     System.out.print(array[2][0]);
	     System.out.println(array[2][1]);
	     System.out.println(array[0]);
	     System.out.println(array.length);
	     
	     
	     
	     
	     
	     
	     
}
}
