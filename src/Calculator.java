import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("첫번째 입력값: ");
		int first = scanner.nextInt();

		System.out.println("연산기호를 입력하세요: ");
		String symbol = scanner.next();

		System.out.println("두번째 입력값: ");
		int second = scanner.nextInt();

		if (symbol.equals("+")) {
			System.out.println(first + second);
		} else if (symbol.equals("-")) {
			System.out.println(first - second);
		} else if (symbol.equals("*")) {
			System.out.println(first * second);
		} else if (symbol.equals("/")) {
			System.out.println(first / second);
		} else {
			System.out.println("사칙연산 기호가 아닙니다.");
		}

		scanner.close();
	}

}
