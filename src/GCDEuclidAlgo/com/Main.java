package GCDEuclidAlgo.com;
import java.util.Scanner;

/*	GCD:- greatest common divisor Or HCF:- highest common factor
 * 	the gcd of the two no. is the no. which can divide both the no.s completely
 * this is a recursive algo :- EUCLID algo
 * 
 * 	EUCLID(a,b)
 * 			if b==0;
 * 				return a;
 * 			else return EUCLID(b,a mod b)
 * 
 * example:- gcd(30,21)
 * 			30 = 21*1 + 9  here 9 is the mod 
 * 			21 = 9*2 + 3   here we replace the 21 with 30 and the remainder to the place of the 21, this goes on an on
 * 			9 = 3*3 + 0   when we got zero as the remainder then the gcd will be the previous no. i.e 3
 * 			
 * 			hence gcd = 3
 * 
 * WORST case for the euclid algo:-  the worst case is when the a and the b are consecutive fibonnaci no.s
 */

public class Main {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the first no.:- ");
		int no1 = scan.nextInt();
		System.out.print("enter the second no:- ");
		int no2 = scan.nextInt();
		
		System.out.println("GCD of the 2 numbers "+no1+" and "+ no2 + " is:- " + findGCD(no1,no2));
		
	}
	
	public static int findGCD(int no1, int no2) {
		
		if(no2==0) {
			return no1;
		}
		return findGCD(no2, no1%no2);
	}
}
