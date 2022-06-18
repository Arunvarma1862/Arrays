package comm;

public class test {
        int i;
        int j;
        
	public test() {
		i=20;
		j=40;
	}
	public test(int i ,int j) {
	     this.i=i;
	     this.j=j;
		 
	}

	public static void main(String[] args) {
		  test t1 = new test();
		  test t2 = new test(30,50);
		  test t3 = new test();
		  test t4 = new test();
		  System.out.println(t1.add());
		  System.out.println(t2.add());
		  System.out.println(t3.i);
		  System.out.println(t4.j);
		  name("amul");
		 
		  
		  
		  
//		  System.out.println(t1.hashCode());
//		  System.out.println(t2.hashCode());
//		  System.out.println(t3.hashCode());

	}
	public int add() {
		return i+j;
	}
	public static void name(String name) {
		 System.out.println(name);
		
	}
	

}
