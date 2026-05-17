import java.util.Scanner;
public class swap {
	int remainder,result=0;
	public swap(int n){// public swap is Parameterized Construtor
		while(n>0) {// Value of n, Example:n=45
			remainder=n%10;//To get remainder. example: remainder=5.
			result=(result*10)+remainder;// First time loop is run, example: result=0 then (result*10)+remainder means is (0*10)+5=5. 
                                         // Second time loop is run, example: result=5 then (result*10)+remainder means is (5*10)+4=54. 
			n/=10;// to get divisible value. now n value is 4
		}
		System.out.print("Swapped number is:"+result);
	}
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter more than one number:");
		int n=sc.nextInt();
		new swap(n);// Passing argument (n).
		sc.close();
	}
}
