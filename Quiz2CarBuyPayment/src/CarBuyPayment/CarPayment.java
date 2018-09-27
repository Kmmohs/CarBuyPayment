package CarBuyPayment;

import java.util.Scanner;

public class CarPayment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the total price of the car including sticker price, taxes and extras.");
		
		double totalPrice = input.nextDouble();
		input.close();
		System.out.println("Total Price of Car: " + totalPrice + "\n");
		
		System.out.println("Please input the down payment on the car.");
		double downPayment = input.nextDouble();
		input.close();
		System.out.println("Down Payment: " + "\n");
		
		System.out.println("Please input the length of the loan in months.");
		double monthsOfLoan = input.nextDouble();
		input.close();
		System.out.println("Months of Loan: " + "\n");
		
		System.out.println("Please input the interest rate on the car.");
		double interestRate = input.nextDouble();
		input.close();
		System.out.println("Interest Rate: " + "\n");
		
		CarDeal carDeal = new CarDeal(totalPrice, downPayment, monthsOfLoan, interestRate);
		
		MonthlyCarPayment carPayment = new MonthlyCarPayment();
		
		carPayment.MonthlyPayments(carDeal.getTotalPrice(), carDeal.getDownPayment(), carDeal.getMonthsOfLoan(), carDeal.getInterstRate());
	
	
	}

}
