package mini.project;

import mini.project.util.Prompt;

public class PosApp {
	
	public static void main(String[] args) {
		TableList tableList = new TableList();
		Order order = new Order();
		MenuList menuList = new MenuList();
		int count = 1;
		
		loop:
			while (true) {
				System.out.println("==================================");
				System.out.println("               POS                ");
				System.out.println("==================================\n");
				System.out.println("       (1) 주문         (2) 결제               \n");
				System.out.println("            (0) 종료                           \n");
				System.out.println("==================================");
				System.out.println("원하시는 서비스의 번호를 입력해주세요:)");
				String command = Prompt.inputString(" > ");
				System.out.println();
				
				switch (command) {
					case "0": 
					System.out.println("프로그램을 종료합니다."); 
					break loop;
					
					case "1": 
					System.out.println("=================================");
					System.out.println("              주문                              ");
					System.out.println("=================================");
					tableList.tableNum = Prompt.inputInt(" - 테이블 번호: ");
					int people = Prompt.inputInt(" - 고객수: ");
					while (true) {
						System.out.println("------------------------------");
						System.out.println("       무엇을 하시겠습니까?\n       ");
						System.out.println("  (1) 메뉴 등록     (2) 메뉴 변경    ");
						System.out.println("------------------------------");
						String ask = Prompt.inputString(" - 번호를 입력해주세요: ");
						if (ask.equals("1")) {
							menuList.menuBoard();
							System.out.println();
							while (true) {
								order.addMenu();
								order.addAmount();
								String str = Prompt.inputString(" - 계속하시겠습니까?(y/N) ");
								if (!str.equalsIgnoreCase("y")) {
									break;
								}
							}
							order.list();
							System.out.println("\n메뉴를 등록했습니다.");
							break;
						} else if (ask.equals("2")) {
							System.out.println("\n메뉴를 변경했습니다.");
							break;
						} else {
							if (count == 3) {
								System.out.println("처음으로 돌아갑니다.");
								count = 1;
								break;
							} else { 
								System.out.println("죄송합니다. 다시 입력해주세요."+" *오류:"+count);
								System.out.println("( 3번째 오류시 처음으로 돌아갑니다.)");
								count++;
							}
						}
					}
					break;
					
					case "2":
					System.out.println("=================================");
					System.out.println("               계산                              ");
					System.out.println("=================================");
					break;
					
					default: 
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				System.out.println();
			}
		Prompt.close();
		
	}
	
	
}
