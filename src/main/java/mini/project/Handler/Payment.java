package mini.project.Handler;


import mini.project.domain.Table;
import mini.project.util.Prompt;

public class Payment extends Order{

	int price;
	
	public void pay() {

		int num = Prompt.inputInt("결제할 테이블 번호: ");
		Table table = findByNum(num);
		if (table == null) {
			System.out.println("해당 번호의 테이블이 없습니다.");
			return;
		} else {
			switch (table.getOrder()) {
			case 1:
			case 2:
			case 3:
				price = 8000; break;
			case 4:
				price = 10000; break;
			case 5:
				price = 14000; break;
			case 6:
				price = 5000; break;
			case 7:
			case 8:
				price = 2000; break;
			case 9:
			case 10:
			case 11:
				price = 4000; break;
				
			}
		}
		int total = price * table.getOrder() *table.getAmount();
		System.out.println("****** 결제 목록 ******");
		System.out.println(" 테이블 넘버 : "+num);
		System.out.println(" 주문 내용: "+table.getOrder()+"번 메뉴 (가격: "+price+
				")"+table.getAmount()+"개 /n"+" 금액"+total);
		System.out.println("********************");
	}
	
}


//	ArrayList<Integer> orderList = new ArrayList<>();
//	ArrayList<Integer> amountList = new ArrayList<>();


		
//		order.add();
//		System.out.println("[ 계산 ]\n");
//		int filter = 0;
//		String receipt = null;
//		int lastTotal = 0;
//		
//
//		for (int i = 0; i< tableList.size(); i++) {
//			if (tableList. >= 1 && orderList.get(i) <= 3) {
//				filter = 8000;
//				receipt = "칼국수";
//			} else if (orderList.get(i) == 4) {
//				filter = 10000;
//				receipt = "새알팥죽";
//			} else if (orderList.get(i) == 5) {
//				filter = 14000;
//				receipt = "해물파전";
//			} else if (orderList.get(i) == 6) {
//				filter = 5000;
//				receipt = "왕만두";
//			} else if (orderList.get(i) >= 7 && orderList.get(i) <= 8) {
//				filter = 2000;
//				receipt = "음료수";
//			} else if (orderList.get(i) >= 9 && orderList.get(i) <= 11) {
//				filter = 4000;
//				receipt = "주류";
//			}
//
//			int total = filter * amountList.get(i);
//			lastTotal = lastTotal + total;
//			System.out.printf("%s %d ------ %d원", receipt, amountList.get(i), total);
//			System.out.println();
//		}
//		System.out.println("-*--*--*--*--*--*--*--*--*--*--*-");
//		System.out.printf("총 합계는 %d원입니다. ", lastTotal);
//	}


