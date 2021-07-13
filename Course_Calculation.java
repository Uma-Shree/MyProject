import java.io.*;
import java.util.*;
public class Course_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tp,cc,it1,it2,it3,it4;
		int it,mit1,mit2,mit3,mit4,m1,m2,m3,m4;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter teaching period: ");
		tp=sin.next();
		System.out.println("Enter the course code: ");
		cc=sin.next();
		System.out.println("How many assessment items are there?");
		it=sin.nextInt();
		System.out.println();
		
	
		
		System.out.println("Enter the name of assessment item #1 :");
		it1=sin.next();
		
		System.out.println("Enter the weighting of assesssment item #1:");
		mit1=sin.nextInt();
		System.out.println();

		System.out.println("Enter the name of assessment item #2 :");
		it2=sin.next();
		System.out.println("Enter the weighting of assesssment item #2:");
		mit2=sin.nextInt();
		System.out.println();
		
		System.out.println("Enter the name of assessment item #3 :");
		it3=sin.next();
		System.out.println("Enter the weighting of assesssment item #3:");
		mit3=sin.nextInt();
		
		System.out.println();
		
		System.out.println("Enter the name of assessment item #4 :");
		it4=sin.next();
		System.out.println("Enter the weighting of assesssment item #4:");
		mit4=sin.nextInt();
		System.out.println();
		System.out.println("Enter your mark for " + " Tutorial Participation" + " as a percentage :");
		m1=sin.nextInt();
		System.out.println("Enter your mark for " +"Homework" +"as a percentage :");
				m2=sin.nextInt();
		System.out.println("Enter your mark for "+"Group Assignment"+" as a percentage :");
				m3=sin.nextInt();
		System.out.println("Enter your mark for "+"Final Exam" +"as a percentage :");
				m4=sin.nextInt();
		
				
		System.out.println(tp +"-"+ cc);
		System.out.println("-----------------------");
		System.out.print(" Assessment Item " );
		System.out.print("Weight");
		System.out.print(" Mark");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.print(it1 );
		System.out.print(mit1);
		System.out.print(m1);
		System.out.println();
		System.out.print(it2);
		System.out.print(mit2);
		System.out.print(m2);
		System.out.println();
		System.out.print(it3);
		System.out.print(mit3);
		System.out.print(m3);
		System.out.println();
		System.out.print(it4);
		System.out.print(mit4);
		System.out.print(m4);
		System.out.println("--------------------------------------------------------------------------------------");
		Systen.out.print(cc +" Final Grade" );
		System.out.print();
		System.out.print("71 CR");
		
		
		
		
		
	}

}
