package mini.project;

import java.util.ArrayList;

import mini.project.util.Prompt;

public class Order {
	
	MenuList menuList = new MenuList();
	
	ArrayList<Table> tableList = new ArrayList<>();
	ArrayList<Menu> menuNameList = new ArrayList<>();


	public void add() {
		Table table = new Table();
		table.setOrder(Prompt.inputInt(" - 주문 번호: "));
		table.setAmount(Prompt.inputInt(" - 수량: "));
		
		tableList.add(table);
	}


	
	public void list() {
		System.out.println("[ 주문 목록 ]\n");
		Object[] tables = tableList.toArray();
		for (Object obj : tables) {
			Table table = (Table) obj;
			System.out.printf(" 주문 번호: %d, 수량: %d\n",
					table.getOrder(),table.getAmount());
		}
	}	

	

	public void change() {
		System.out.println("[ 메뉴 변경 ]\n");
		int num = Prompt.inputInt("변경할 테이블 번호: ");
		Table table = findBynum(num);
	}
	
	private Table findByNum(int num) {
		for (int i = 0; i < tableList.size(); i++) {
			Table table = tableList.get(i);
			if (table.getNum() == num) {
				return table;
			}
		}
		return null;
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

















