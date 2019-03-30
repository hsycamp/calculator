import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("첫번째 입력값: ");
		int first = scanner.nextInt();

		int result = first;
		while (true) {

			System.out.println("연산기호를 입력하세요: ");
			String symbol = scanner.next();

			if (symbol.equals("quit")) {
				System.out.println("결과값: " + result);
				break;
			}

			System.out.println("두번째 입력값: ");
			int second = scanner.nextInt();

			if (symbol.equals("+")) {
				result += second;
				System.out.println("덧셈" + result);
			} else if (symbol.equals("-")) {
				result -= second;
				System.out.println("뺄셈" + result);
			} else if (symbol.equals("*")) {
				result *= second;
				System.out.println("곱셈" + result);
			} else if (symbol.equals("/")) {
				result /= second;
				System.out.println("나눗셈" + result);
			} else {
				System.out.println("사칙연산 기호가 아닙니다.");
			}
		}
		scanner.close();

	}

}
