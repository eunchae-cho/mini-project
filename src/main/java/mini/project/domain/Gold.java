package mini.project.domain;

public class Gold extends Customer {

	double saleRatio; // 할인율

	public Gold() {
		customerGrade = "Gold";
		bonusRatio = 0.05;
		saleRatio = 0.03;
	}

	@Override
	public int calcPrice(int price) {
		bonusRatio += price * bonusRatio; // 보너스 포인트 적립
		return price - (int)(price * saleRatio); // 할인된 가격을 계산하여 변환
	}
}
