package Fibonnaci.com;

/*Fibonnaci Series:- when the next no. is the sum of the previous 2 no.s 
 * ex:- 0,1,1,2,3,5,8,13,21,34,55 .....
 * 
 * it can be solved in both the recursive and the iterative way 
 * 
 */
public class Main {
	
	static int n1=0,n2=1,n3=0;   // we set the n1=0 and the n2=1 as the first 2 no. will never change
	public static void fibonnaci(int count) {
		
		if(count>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(n3+",");
			fibonnaci(count-1);
			
			
		}
	}
	
	public static void main (String args[]) {
		
		int count = 10;
		System.out.print("Fibonnaci:- "+ n1 + "," +n2+",");
		fibonnaci(count-2);
		
	}
	
	
}
