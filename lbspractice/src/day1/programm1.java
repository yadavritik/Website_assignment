package day1;
import java.util.Iterator;
public class programm1 {
	public static void main(String[] args) {

		// program1

		int num = 7;
		boolean isprime = true;
		for (int i = 0; i < num; i++) {
			if (num % i == 0) {
				isprime = false;
			}
		}
		if (isprime) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");

		}
		
		//program2
		
		int num1=5;
		int fact=1;
		for(int i=5; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		//program3
		
		int num2=121,reverse=0;
		int n=num2;
		while(num2!=0) {
			int rem=num%10;
			reverse=reverse*10+rem;
			num2=num2/10;
		}
		if (n==reverse) {
			System.out.println("palindrom");
		} else {
			System.out.println("not");
		}

	}
}
