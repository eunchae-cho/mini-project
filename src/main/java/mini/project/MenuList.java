package mini.project;

import java.util.ArrayList;

public class MenuList {
	
	Menu menu = new Menu();
	//ArrayList menuList = new ArrayList();
	
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
		
	}


	public void menuNum(int value) {
		switch (value) {
		case 1: menu.getDish1();break;
		case 2: menu.getDish2();break;
		case 3: menu.getDish3();break;
		case 4: menu.getDish4();break;
		case 5: menu.getSide5();break;
		case 6: menu.getSide6();break;
		case 7: menu.getBeverage7();break;
		case 8: menu.getBeverage8();break;
		case 9: menu.getAlcohol9();break;
		case 10: menu.getAlcohol10();break;
		case 11: menu.getAlcohol11();break;
		
		}
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
	
	public static void main(String[] args) {
		Menu m = new Menu();
		System.out.println(m.getAlcohol10());
	}
}
