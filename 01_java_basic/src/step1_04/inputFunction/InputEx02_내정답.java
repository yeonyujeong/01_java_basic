package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_내정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		
		// 문제1) 숫자 2개를 입력받아서 합 출력
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int numA = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int numB = scan.nextInt();
		
		System.out.println("입력한 숫자의 합 = " + (numA + numB));
		
			
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		System.out.println();
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = scan.nextInt();
		
		System.out.println(num % 2 == 1);
		
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println();
		System.out.println("성적을 입력하세요 : ");
		int score = scan.nextInt();
		
		System.out.println(score >= 60 && score <= 100);
		
		
		
		scan.close();
	}
	
}
