package mini.project;

import java.util.ArrayList;
import java.util.Scanner;

public class TableHandler {
	
	static final int CAPACITY= 13;
	static ArrayList<Integer> tableList = new ArrayList<>(CAPACITY);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("==================================");
		System.out.println("               POS\n");
		System.out.println("       (1) 주문         (2) 결제 ");
		System.out.println("==================================");
		System.out.println("원하시는 서비스의 번호를 입력해주세요:)");
		System.out.print("> ");
		int choice = sc.next();
		System.out.println();
		if (choice ==  1) {
			System.out.println("----------------------------------");
			System.out.println("                           주문 ");
			System.out.println("----------------------------------");
			System.out.print(" - 테이블 번호: ");
			tableList.Prompt.
			int tableNum = sc.nextInt();
			tableList.add(tableNum); 
			System.out.print(" - 고객수: ");
			// (번호)메뉴명 => 메뉴리스트추가할 것 
			System.out.print(" - 메뉴 번호: ");
			// 메뉴 입력하고 나서 확인 리스트 한 번 보여주고
			
			
		} else if (choice == 2) {
			System.out.println("----------------------------------");
			System.out.println("                           계산 ");
			System.out.println("----------------------------------");
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
		
	}
	
	
	
	
}
