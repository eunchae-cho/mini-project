package mini.project;

import java.util.ArrayList;

public class PriceList {
	
	ArrayList<Price> priceList = new ArrayList<>();
	
	public void price() {
		Price price = new Price();
		price.setDish1(8000);
		price.setDish2(8000);
		price.setDish3(8000);
		price.setDish4(10000);
		price.setSide5(14000);
		price.setSide6(5000);
		price.setBeverage7(2000);
		price.setBeverage8(2000);
		price.setAlcohol9(4000);
		price.setAlcohol10(4000);
		price.setAlcohol11(4000);
		
		priceList.add(price);
		
	}
}
