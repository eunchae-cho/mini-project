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

		menu.setDish(Prompt.inputInt("메인 음식 번호를 입력해주세요 : "));
		menu.setSide(Prompt.inputInt("사이드 음식 번호를 입력해주세요 : "));
		menu.setBeverage(Prompt.inputInt("음료 번호를 입력해주세요: "));
	}
}
















