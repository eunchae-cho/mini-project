package mini.project.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
	static Scanner sc = new Scanner(System.in);
	
	public static String inputString(String value) {
		System.out.print(value);
		return sc.nextLine();
	}
	
	public static int inputInt(int value) {
		System.out.print(value);
		return sc.nextInt();
	}
	
	public static Date inputDate(String value) {
		System.out.print(value);
		return Date.valueOf(inputString(value));
	}
	
	public static void close() {
		sc.close();
	}

}
