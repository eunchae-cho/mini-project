package mini.project.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
	static Scanner sc = new Scanner(System.in);
	
	public static String inputString(String value) {
		System.out.print(value);
		return sc.nextLine();
	}
	
	public static int inputInt(String value) {
		return Integer.parseInt(inputString(value));
	}
	
	public static Date inputDate(String value) {
		return Date.valueOf(inputString(value));
	}
	
	public static void close() {
		sc.close();
	}

}
