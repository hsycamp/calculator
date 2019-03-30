package hsycamp.calculator;

import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫번째 입력값: ");
		int first = scanner.nextInt();
		return first;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력값: ");
		int second = scanner.nextInt();
		return second;
	}

	static String getSymbol(Scanner scanner) {
		System.out.println("연산기호를 입력하세요: ");
		String symbol = scanner.next();
		return symbol;
	}
}
