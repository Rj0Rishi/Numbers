import java.util.Scanner;
public class ArmstrongNum {
	public static void main(String[] args) {
		int n,reminder,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 3-Digit Number:");
		n=sc.nextInt();
		int num=n;
		while(n>0) {
			reminder=n%10;
			sum+=reminder*reminder*reminder;
			n/=10;
		}
		System.out.print(sum+" "+(num==sum?"Number is Armstrong":"Number is not Armstrong"));
		sc.close();
	}
}
