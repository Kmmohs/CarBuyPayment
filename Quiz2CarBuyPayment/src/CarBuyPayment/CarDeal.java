package CarBuyPayment;

public class CarDeal {
	private final double totalPrice;
	private final double downPayment;
	private final double monthsOfLoan;
	private final double interstRate;
	
	public CarDeal (double givenTotalPrice, double givenDownPayment, double monthsOfLoan2, double givenInterstRate) {
		this.totalPrice = givenTotalPrice;
		this.downPayment = givenDownPayment;
		this.monthsOfLoan = monthsOfLoan2;
		this.interstRate = givenInterstRate;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public double getMonthsOfLoan() {
		return monthsOfLoan;
	}

	public double getInterstRate() {
		return interstRate;
		
	}
}
