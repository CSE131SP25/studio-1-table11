package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the yaer?");
		int n1 = in.nextInt();
		boolean LeapYear = (n1 % 4 == 0) && (n1 % 100 != 0);
		System.out.println(LeapYear);
	}

}
