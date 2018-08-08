package program;

import java.util.Scanner;

public class Avg
{

	public static void main(String[] args)
	{
		 float average;
		 int s1,s2,s3,s4,s5,total;
		 Scanner t=new Scanner(System.in);
		 System.out.println("enter the five subject mark");
		 s1=t.nextInt();
		 s2=t.nextInt();
		 s3=t.nextInt();
		 s4=t.nextInt();
		 s5=t.nextInt();
		 total=s1+s2+s3+s4+s5;
		 average = total/5;
		 if ( s1>=48 && s2>=48 && s3>=48 && s4>=48 && s5>=48)
		 {
			 if (average>80)
				 System.out.println("honor");
			 else if(average>=71 && average<=80)
				 System.out.println("first class");
			 else if(average>=61&&average<=70)
				 System.out.println("second class");
			 else if (average>=51&&average<=60)
				 System.out.println("third class");
			 else if(average>=41&&average<=50)
				 System.out.println("pass");
			 else
				 System.out.println("fail");
			 
		 }
		 else
			 System.out.println("fail");
	}

}
