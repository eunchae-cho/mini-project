package mini.project;

import java.util.ArrayList;

import mini.project.util.Prompt;

public class Order {

	private static final Object[] Object = null;
	ArrayList<Integer> orderList = new ArrayList<>();
	ArrayList<Integer> amountList = new ArrayList<>();
	MenuList menuList = new MenuList();


	public void addMenu() {
		orderList.add(Prompt.inputInt(" - 주문 번호: "));
	}


	public void addAmount() {
		amountList.add(Prompt.inputInt(" - 수량: "));
	}

	// 안바꾼거
	public void list() {
		System.out.println("[ 주문 목록 ]\n");
		System.out.println("| 주문 번호  |  수량   |");
		for(int i = 0; i < orderList.size(); i++) {
			System.out.printf("  %d번   %d개\n",orderList.get(i),amountList.get(i));			
		}
	}	

	public void pay() {
		System.out.println("[ 계산 ]\n");
		int filter = 0;
		String receipt = null;
		int lastTotal = 0;

		for (int i = 0; i< orderList.size(); i++) {
			if (orderList.get(i) >= 1 && orderList.get(i) <= 3) {
				filter = 8000;
				receipt = "칼국수";
			} else if (orderList.get(i) == 4) {
				filter = 10000;
				receipt = "새알팥죽";
			} else if (orderList.get(i) == 5) {
				filter = 14000;
				receipt = "해물파전";
			} else if (orderList.get(i) == 6) {
				filter = 5000;
				receipt = "왕만두";
			} else if (orderList.get(i) >= 7 && orderList.get(i) <= 8) {
				filter = 2000;
				receipt = "음료수";
			} else if (orderList.get(i) >= 9 && orderList.get(i) <= 11) {
				filter = 4000;
				receipt = "주류";
			}

			int total = filter * amountList.get(i);
			lastTotal = lastTotal + total;
			System.out.printf("%s %d ------ %d원", receipt, amountList.get(i), total);
			System.out.println();
		}
		System.out.println("-*--*--*--*--*--*--*--*--*--*--*-");
		System.out.printf("총 합계는 %d원입니다. ", lastTotal);
	}

	public void change() {
		System.out.println("[ 메뉴 변경 ]\n");

	}





	//	public void change() {
	//		System.out.println("[메뉴 변경]");
	//		int no = Prompt.inputInt("변경하실 메뉴의 번호를 입력해주세요.");
	//		Menu menu = 
	//	}
	//
	//	private Menu findByNo(int no) {
	//		for (int i = 0; i < menuList.size(); i++) {
	//			Menu menu = menuList.get(i);
	//			if (menu.getNo() == no) {
	//				return menu;
	//			}
	//		}
	//		return null;
	//	}

}

















