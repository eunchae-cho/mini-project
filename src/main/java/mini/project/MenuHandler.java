package mini.project;

import java.util.ArrayList;

import mini.project.util.Prompt;

public class MenuHandler {

	ArrayList<Menu> menuList = new ArrayList<Menu>();

	public MenuHandler(ArrayList<Menu> list) {
		this.menuList = list;
	}

	public void add() {
		System.out.println("[메뉴 선정]");

		Menu menu = new Menu();

		menu.setDish(Prompt.inputInt("메인 음식 번호를 입력해주세요\n"
				+ "1: 바지락 칼국수\n"
				+ "2: 팥 칼국수\n"
				+ "3: 들깨 칼국수\n"
				+ "4: 새알팥죽"));
		String mainFood = null;
		switch(menu.getDish()) {
		case 1:
			mainFood = "바지락 칼국수";
			break;
		case 2:
			mainFood = "팥 칼국수";
			break;
		case 3:
			mainFood = "들깨 칼국수";
			break;
		case 4:
			mainFood = "새알팥죽";
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}

		menu.setSide(Prompt.inputInt("사이드 음식 번호를 입력해주세요\n"
				+ "5: 해물파전\n"
				+ "6: 왕만두"));

		String sideFood = null;
		switch(menu.getSide()) {
		case 5:
			sideFood = "해물파전";
			break;
		case 6:
			sideFood = "왕만두";
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}

		menu.setBeverage(Prompt.inputInt("음료 번호를 입력해주세요\n"
				+ "7: 콜라\n"
				+ "8: 사이다"));

		String beverage = null;
		switch(menu.getBeverage()) {
		case 7:
			beverage = "콜라";
			break;
		case 8:
			beverage = "사이다";
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}

		menu.setAlcohol(Prompt.inputInt("주류 번호를 입력해주세요\n"
				+ "9: 소주\n"
				+ "10: 맥주\n"
				+ "11: 막걸리"));

		String alcohol = null;
		switch(menu.getSide()) {
		case 9:
			alcohol = "소주";
			break;
		case 10:
			alcohol = "맥주";
			break;
		case 11:
			alcohol = "막걸리";
			break;
		default:
			System.out.println("잘 못 입력하셨습니다.");
			break;
		}

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
















