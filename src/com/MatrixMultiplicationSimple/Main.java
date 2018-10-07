package com.MatrixMultiplicationSimple;
import java.util.Scanner;

/*
 * this is the simple matrix multiplication, Stranssen algo is not used 
 * the time complexity of this simple algo is:- O(n^3)
 * this is quite slow 
 */
public class Main {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the base of the matrix");
		int n = scan.nextInt();
		int [][] a= new int [n][n];
		int [][] b = new int[n][n];
		int [][] c = new int [n][n];
		System.out.println("enter the elements of the 1st matrix row wise");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("enter the elemnts of the 2nd matrix row wise");
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("multiplying the matrices");
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for (int k=0; k<n; k++) {
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("the product of the multiplication is: ");
		for(int i=0;  i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
