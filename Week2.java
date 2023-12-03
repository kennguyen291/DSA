package Week2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
		int binaryGap = binaryGap(599056);
		int prime = prime(11,19);
		int[] A =  {1,2,3};
		int min = missingMinInteger(A);
		System.out.println("binary gap: " + binaryGap);
		System.out.println("prime: "+prime);
		System.out.println("min: " + min);
	}
	
		static public int binaryGap(int N) {
			int quotient = 0;
			int remainder = 0;
			int currentGap = 0;
			int longestGap = 0;
			boolean startCount = false;
			while (N / 2 != 0) {
				quotient = N/2;
				remainder = N%2;
				N = quotient;
				if (remainder == 1) startCount = true;
				if (remainder == 0 && startCount == true ) {
					currentGap++;
				} else {
					currentGap = 0;
				}
				if (currentGap > longestGap) {
					longestGap = currentGap;
				}
			}
	
			return longestGap	;
		}
		
		
		static public int prime(int A, int B) {
			int count = 0;
			for (int i = A; i<= B; i++) {
					boolean isPrime = true;
					for (int m = 2; m < i/2; m++) {
						if (i % m == 0) {
							isPrime = false;
						}
					}
					if (isPrime == true) {
						count ++;
					}
				} 
			
			return count;
		}

		static public int missingMinInteger(int[] A) {
			int min = 1;
			HashSet<Integer> uniqueNumberList = new HashSet<Integer>();
			for (int i: A) {
				uniqueNumberList.add(i);
			}
			while (uniqueNumberList.add(min) == false){
				min++;
			}
			return min;
		}
}