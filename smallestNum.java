import java.util.Scanner;
public class SmallNum {
	public void getNumber() {
		int n1,n2,n3;
		Scanner num1= new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		n1=num1.nextInt();
		Scanner num2= new Scanner(System.in);
		System.out.print("Enter 2nd Number:");
		n2=num2.nextInt();
		Scanner num3= new Scanner(System.in);
		System.out.print("Enter 3rd Number:");
		n3=num3.nextInt();
		
		if(n1<n2||n1<n3) {
			System.out.println(n1+" is Smallest number.");
		}else if(n2<n1||n2<n3) {
			System.out.println(n2+" is Smallest number.");
		}else {
			System.out.println(n3+" is Smallest number.");
		}
		num1.close();
		num2.close();
		num3.close();
	}
	public static void main(String[] arg){
		SmallNum show =new SmallNum();
		show.getNumber();
	}
}
