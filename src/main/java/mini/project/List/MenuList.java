package mini.project.List;

import java.util.ArrayList;

import mini.project.domain.Menu;

public class MenuList {
	
	ArrayList<Menu> menuNameList = new ArrayList<>();
	ArrayList<Menu> menuNumList = new ArrayList<>();
	
	public void menuName() {
		Menu menu = new Menu();
		menu.setDish1("바지락 칼국수");
		menu.setDish2("팥 칼국수");
		menu.setDish3("들깨 칼국수");
		menu.setDish4("새알 팥죽");
		menu.setSide5("해물 파전");
		menu.setSide6("왕만두");
		menu.setBeverage7("콜라");
		menu.setBeverage8("사이다");
		menu.setAlcohol9("소주");
		menu.setAlcohol10("맥주");
		menu.setAlcohol11("막걸리");
		
		menuNameList.add(menu);
		
	}
	
	public void menuNum() {
		Menu menu = new Menu();
		menu.setDish1("1");
		menu.setDish2("2");
		menu.setDish3("3");
		menu.setDish4("4");
		menu.setSide5("5");
		menu.setSide6("6");
		menu.setBeverage7("8");
		menu.setBeverage8("9");
		menu.setAlcohol9("10");
		menu.setAlcohol10("11");
		menu.setAlcohol11("12");
		
		menuNumList.add(menu);
		
	}
	

	public void menuBoard() {
		System.out.println("      [ 메 뉴 판 ]      \n");
		System.out.println(" 1. 바지락 칼국수 8000원");
		System.out.println(" 2. 팥 칼국수       8000원");
		System.out.println(" 3. 들깨 칼국수    8000원");
		System.out.println(" 4. 새알 팥죽      10000원");
		System.out.println(" 5. 해물 파전      14000원");
		System.out.println(" 6. 왕만두          5000원");
		System.out.println(" 7. 콜라             2000원");
		System.out.println(" 8. 사이다          2000원");
		System.out.println(" 9. 소주             4000원");
		System.out.println(" 10. 맥주           4000원");
		System.out.println(" 11. 막걸리        4000원");
		
		
	}
	
	
}
