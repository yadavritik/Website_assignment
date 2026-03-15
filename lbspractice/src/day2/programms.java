package day2;

public class programms {
	//program2
		public static double sqrt(int num,double guess) {
			double new_guess=(guess+num/guess)/2;
			if(new_guess==guess) {
				return new_guess;
			}
			return sqrt(num, new_guess);
		}
		public static void main(String[] args) {
			//program1
			
			int n=6,n2=12,gcd=0;
			for(int i=1; i<=n && i<=n2; i++) {
				if (n%i==0 && n2%i==0) {
					gcd=i;
				}
			}
			int Lcm=(n*n2)/gcd;
			System.out.println(Lcm);
			
			//program2
			System.out.println(sqrt(3,3/2));
		
			//program3
			int num=10;
			String binary="";
			while(num!=0) {
				int rem=num%2;
				binary=rem+binary;
				num=num/2;
			}
			System.out.println(binary);
			
		}

	}
