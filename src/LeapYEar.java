import java.util.Scanner;

public class LeapYEar {
	public static void main(String args[]){
		int year;
		System.out.println("Enetran year :");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(((year %4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("Leapyear");
			
		}else {
			System.out.println("not leapyear");
		}
	}

}
