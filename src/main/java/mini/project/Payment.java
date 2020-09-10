package mini.project;

import java.util.ArrayList;

public class Payment {

	ArrayList<Integer> orderList = new ArrayList<>();
	ArrayList<Integer> amountList = new ArrayList<>();

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

}
