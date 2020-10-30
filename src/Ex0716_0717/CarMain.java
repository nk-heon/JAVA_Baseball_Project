package Ex0716_0717;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt(); 
		Car car = new Car(input);
//		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		System.out.println(car.gas);
		if(gasState) {
			System.out.println("√‚πﬂ");
			car.run();
		}

	}

}
