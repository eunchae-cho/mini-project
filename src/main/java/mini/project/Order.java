package mini.project;

import java.util.ArrayList;

import mini.project.util.Prompt;

public class Order {

	ArrayList<Integer> orderList = new ArrayList<>();
	ArrayList<Integer> amountList = new ArrayList<>();
	MenuList menuList = new MenuList();

	
	public void addMenu() {
		orderList.add(Prompt.inputInt(" - 주문 번호: "));
	}
	
	
	public void addAmount() {
		amountList.add(Prompt.inputInt(" - 수량: "));
	}
	


	public void list() {
		System.out.println("[ 주문 목록 ]\n");
		System.out.println("| 주문 번호  |  수량   |");
		for(int i = 0; i < orderList.size(); i++) {
			System.out.printf("  %d번   %d개\n",orderList.get(i),amountList.get(i));			
		}
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
















