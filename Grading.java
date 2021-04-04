import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {

		double tutorPercentage;
		double testPercentage;
		double homeworkPercentage;
		double totalPercentage;
		double finalTestPercentage;
		int testPoints;
		int finalGrade;

		Scanner reader = new Scanner(System.in);

		System.out.println("Subject: Computer Science");
		
		System.out.print("Percentage from tutor hours (0-5): ");
		tutorPercentage = reader.nextDouble();
	    
		System.out.print("Percentage from the test (Online) (0-10): ");
		testPercentage = reader.nextDouble();
		
		System.out.print("Homework Percentage (0-15): ");
		homeworkPercentage = reader.nextDouble();
		
		System.out.print("Final test points (0-100): ");
		testPoints = reader.nextInt();
		System.out.println();
		System.out.println();
		
		finalTestPercentage = (testPoints*70)/100;
		totalPercentage = tutorPercentage + testPercentage + homeworkPercentage + finalTestPercentage;	
		
		System.out.println("Percentage from tutor hours: " + tutorPercentage);
		System.out.println("Percentage from the test (Online): " + testPercentage);
		System.out.println("Homework Percentage: " + homeworkPercentage);
		System.out.println("Final test Percentage: " + finalTestPercentage);
		System.out.println("Final Percentage: " + totalPercentage);
		

		if(totalPercentage >= 50 && totalPercentage < 60)
			finalGrade = 6;
		else if (totalPercentage >= 60 && totalPercentage < 70)
			finalGrade = 7;
		else if (totalPercentage >= 70 && totalPercentage < 80)
			finalGrade = 8;
		else if (totalPercentage >= 80 && totalPercentage < 90)
			finalGrade = 9;
		else if (totalPercentage >= 90)
			finalGrade = 10;
		else
			finalGrade = 5;
		
		
		System.out.println("Final Grade: " + finalGrade);
	}

}
