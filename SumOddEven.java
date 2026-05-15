import java.util.Scanner;
public class rangeOddEven {
	public static void main(String[] arg) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Range:");
		n=sc.nextInt();
		
		if(n%2==0) {// if Number is divisible by 2 then number is EVEN.
			//then come into for loop to execute the code.
			for(int i=0;i<=n;i+=2) {//Put i value is zero and increase i twice(2).
				sum+=i;
			}System.out.print("Sum of Even Number is :"+sum);
		}
		else {//the Number is not divisible by 2 then number is ODD.
			//then come into for loop to execute the code.
			for(int i=1;i<=n;i+=2) {//Put i value is one and increase i twice(2).
				sum+=i;
			}System.out.print("Sum of Odd Number is:"+sum);
		}
		sc.close();
	}
}
