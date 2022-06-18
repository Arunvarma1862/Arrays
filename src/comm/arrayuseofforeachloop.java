package comm;

public class arrayuseofforeachloop {
 public static void main(String[] args) {
	  // program1
//	 
//	 int bar[]= {5,6,6};
//	 for(int car:bar) {
//		 System.out.print(car+"  ");
//	 }
	 
	 int array[][]= {{8,6,8},
			 {2,4,6}};
	 for(int[] singledimarray:array) {
		 for(int element:singledimarray) {
			 System.out.print(element);
	 }
	 System.out.println();
}
}
}