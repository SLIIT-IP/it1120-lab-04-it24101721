import java.util.Scanner;
public class it24101721Lab4Q1{
	public static void main(String[]args){
		Scanner Scanner = new Scanner(System.in);

		System.out.println( " Enter a number :");
		int Number = Scanner.nextInt();
			if (Number>0)
			{
				System.out.println("This number is : positive");
			}
			else if(Number<0)
{
				System.out.println("This number is : negative");
			}
			else
			{
				System.out.println("This number is : 0");

			}
		}
	}