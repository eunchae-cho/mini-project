package mini.project;

import java.util.ArrayList;

import mini.project.util.Prompt;

public class MenuHandler {

	ArrayList<Menu> menuList;

	public MenuHandler(ArrayList<Menu> ArrayList) {
		this.menuList = ArrayList;
	}

	public void add() {
		System.out.println("[메뉴 선정]");

		Menu menu = new Menu();

		menu.setDish(Prompt.inputInt("메인 음식 번호를 입력해주세요\n"
				+ "0: 바지락 칼국수\n"
				+ "1: 팥 칼국수\n"
				+ "2: 들깨 칼국수\n"
				+ "3: 새알팥죽"));
		String food = null;
		switch(menu.getDish()) {
		case 1:
			food = "바지락 칼국수";
			break;
		case 2:
			food = "팥 칼국수";
			break;
		case 3:
			food = "들깨 칼국수";


		}
		menu.setSide(Prompt.inputInt("사이드 음식 번호를 입력해주세요\n"
				+ "5: 해물파전\n"
				+ "6: 왕만두"));
		menu.setBeverage(Prompt.inputInt("음료 번호를 입력해주세요\n"
				+ "7: 콜라\n"
				+ "8: 사이다"));
		menu.setAlcohol(Prompt.inputInt("주류 번호를 입력해주세요\n"
				+ "9: 소주\n"
				+ "10: 맥주\n"
				+ "11: 막걸리"));

		menuList.add(menu);
	}

	public void list() {
		System.out.println("[주문 조회]");

		for (int i = 0; i < menuList.size(); i++) {
			Menu menu = menuList.get(i);
			System.out.printf("%d, %d, %d, %d\n",
					menu.getDish(),
					menu.getSide(),
					menu.getBeverage(),
					menu.getAlcohol());
		}
	}


	public void change() {
		System.out.println("[메뉴 변경]");
		int no = Prompt.inputInt("변경하실 메뉴의 번호를 입력해주세요.");
		Menu menu = 
	}

	private Menu findByNo(int no) {
		for (int i = 0; i < menuList.size(); i++) {
			Menu menu = menuList.get(i);
			if (menu.getNo() == no) {
				return menu;
			}
		}
		return null;
	}


}
















