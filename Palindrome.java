import java.util.Scanner;
public class Palindrome {
	public static void main(String[] arg){
		int remainder,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to know Palindrome:");
		int n=sc.nextInt();
		int num=n;
		while(n>0) {
			remainder=n%10;
			result=(result*10)+remainder;
			n/=10;
		}
		                 //Ternary Operator 
		System.out.print(num==result?"Number is Palindrome":"Number is not Palindrome");
		sc.close();
	}
}
