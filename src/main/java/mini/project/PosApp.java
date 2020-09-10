package mini.project;

import mini.project.Handler.Order;
import mini.project.Handler.Payment;
import mini.project.List.MenuList;
import mini.project.domain.Table;
import mini.project.util.Prompt;

public class PosApp {

	public static void main(String[] args) {
		
		MenuList menuList = new MenuList();
		Table table = new Table();
		Order order = new Order();
		Payment payment = new Payment();
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
					while (true) {
						System.out.println("------------------------------");
						System.out.println("       무엇을 하시겠습니까?\n       ");
						System.out.println("  (1) 주문 등록     (2) 주문 변경    ");
						System.out.println("------------------------------");						
						String ask = Prompt.inputString(" - 번호를 입력해주세요: ");
						System.out.println();
						if (ask.equals("1")) {
							menuList.menuBoard();
							System.out.println();
							order.add();
							order.list();
							break;
						} else if (ask.equals("2")) {
							order.change();
							System.out.println("\n주문을 변경했습니다.");
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
					payment.pay();
					break;

				default: 
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				System.out.println();
			}
		Prompt.close();

	}


}
