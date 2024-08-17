import java.util.Scanner;
public class it24101721Lab4Q2{
	public static void main (String[]args){
		Scanner Scanner = new Scanner(System.in);

			System.out.print("Enter exam marks out of 100 :");
			int exammarks = Scanner.nextInt();
			
			if (100<exammarks){
				System.out.print("Invalid input for exam marks. enter marks out of 100.");
			return;
			}

			System.out.print("Enter the lab submission marks out of 100 :");
			int labmarks = Scanner.nextInt();
			if(100<labmarks){
				System.out.print("Invalid input for lab marks. enter marks out of 100");
			return;
			}	
			
			System.out.print("Enter the precentation given for the exam :");
			int examprecentage = Scanner.nextInt();

			System.out.print("Enter the precentation given for the lab session :");
			int labprecentage = Scanner.nextInt();

			if (examprecentage+labprecentage !=100){
				System.out.print("Invalid input for precentages. the precentage amount should be 100 ");
			return;
			}
			double marks = (labmarks*labprecentage/100)+(exammarks*examprecentage/100);
			System.out.print("your final exam mark is = "+marks);
	}
}

				
		