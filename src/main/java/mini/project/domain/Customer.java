package mini.project.domain;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected String serverName;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + 
				bonusPoint + "입니다.";
	}

	public String showServerNameInfo() {
		return customerName + "님의" + " 담당 웨이터 이름은 " + serverName + "입니다";
	}



	public String getserverName() {
		return serverName;
	}
}










