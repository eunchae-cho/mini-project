package mini.project;

import java.util.ArrayList;

import mini.project.util.Prompt;

public class Order {

	private static final Object[] Object = null;
	ArrayList<Integer> orderList = new ArrayList<>();
	ArrayList<Integer> amountList = new ArrayList<>();

	//	public Order(ArrayList<Integer> list) {
	//		this.orderList = list;
	//	}
	//	

	public void addMenu() {

		orderList.add(Prompt.inputInt(" - 주문 번호: "));
	}


	public void addAmount() {
		amountList.add(Prompt.inputInt(" - 수량: "));
	}


	public Object[] list() {
		System.out.println("[ 주문 목록 ]");
		Object[] orders = orderList.toArray();
		for (Object obj : orders) {
			System.out.print(obj + "," );
		}
		System.out.println();
		return orders;
	}

	public Object[] list2() {
		System.out.println("[ 주문 수량 ]");
		Object[] amounts = amountList.toArray();
		for (Object obj : amounts) {
			System.out.print(obj + "," );
		}
		return amounts;
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
















