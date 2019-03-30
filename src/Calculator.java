import java.util.Scanner;

public class Calculator {

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

	static int calculate(int first, String symbol, int second) {

		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
			System.out.println("덧셈" + result);
		} else if (symbol.equals("-")) {
			result = first - second;
			System.out.println("뺄셈" + result);
		} else if (symbol.equals("*")) {
			result = first * second;
			System.out.println("곱셈" + result);
		} else if (symbol.equals("/")) {
			result = first / second;
			System.out.println("나눗셈" + result);
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}
		return result;
	}

	static void print(int result) {
		System.out.println("최종 결과값: " + result);
		

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int first = getFirstValue(scanner);
		int result = first;

		while (true) {

			String symbol = getSymbol(scanner);
			if (symbol.equals("quit")) {
				print(result);
				break;
			}
			int second = getSecondValue(scanner);
			result = calculate(result, symbol, second);
		}
		scanner.close();
	}
}
