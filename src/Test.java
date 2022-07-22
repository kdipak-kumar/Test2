public class Test {
	
	public static void main(String[] args) {
		
		
		findPalindrome(454);
		
	}
	public static void findPalindrome(int n) {
		 int rem=0;
		 int sum=0;
		 int temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		System.out.println("1st time change code");
		if(temp==sum) {
			System.out.println(temp+" is a palindrome number");
		}
		else {
			System.out.println(temp+" is not a palindrome number");
		}
		
	}

}
