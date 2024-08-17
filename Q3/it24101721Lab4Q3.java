import java.util.Scanner;
public class it24101721Lab4Q3 {
	public static void main(String[]args){
		Scanner Scanner = new Scanner(System.in);

		System.out.print("Enter Number :");
		double number = Scanner.nextDouble();

		String numbertype = (number<0?"Negative":number>0?"positive":"zero");

		System.out.print("This number is :"+numbertype);
	}
}	