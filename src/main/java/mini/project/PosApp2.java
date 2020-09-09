package mini.project;

import mini.project.util.Prompt;

public class PosApp2 {
	
	public static void main(String[] args) {
		TableList tableList = new TableList();
		
		loop:
			while (true) {
				System.out.println("==================================");
				System.out.println("               POS");
				System.out.println("==================================\n");
				System.out.println("       (1) 주문         (2) 결제 \n");
				System.out.println("            (0) 종료\n");
				System.out.println("==================================");
				System.out.println("원하시는 서비스의 번호를 입력해주세요:)");
				int command = Prompt.inputInt("> ");
				System.out.println();
				
				switch (command) {
					case 0: 
					System.out.println("프로그램을 종료합니다."); 
					break loop;
					
					case 1: 
					System.out.println("----------------------------------");
					System.out.println("                           주문 ");
					System.out.println("----------------------------------");
					tableList.tableNum = Prompt.inputInt(" - 테이블 번호: ");
					int people = Prompt.inputInt(" - 고객수: ");
					System.out.println(" (1) 메뉴 등록     (2) 메뉴 변경");
					int ask = Prompt.inputInt("무엇을 하시겠습니까?\n 번호를 입력해주세요: ");
					while (true) {
						if (ask == 1) {
							break;
						} else if (ask == 2) {
							break;
						} else {
							System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						}
					}
					break;
					
					case 2:
					System.out.println("----------------------------------");
					System.out.println("                           계산 ");
					System.out.println("----------------------------------");
					break;
					
					default: 
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				System.out.println();
			}
		Prompt.close();
		
	}
	
	
}
