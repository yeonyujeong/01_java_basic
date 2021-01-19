package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계]
 * 
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 *    
 */


public class LoopEx25_내정답 {  // 2020.12.18  6:33 - 6:43 / 6:44 - 6:50
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int getNumber = scan.nextInt();
	
		// 풀이1
		System.out.println("풀이1");
		int cnt = 0;
		
	
			for (int i = getNumber; i < getNumber + 999; i++) {
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) {
						cnt++;
					}
			
				}
				if(cnt == 2) {
					System.out.println(getNumber + "보다 큰 첫번째 소수는 : " + i);
					break;
				}
				else {
					cnt = 0;
				}
			}			
			
		//풀이2
		
		System.out.println("풀이2");
		cnt = 0;
		
		boolean isRun = true;
		int num = getNumber + 1;
		
		while(isRun) {
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					cnt++;
				}		
			}
			if(cnt == 2) {				
				System.out.println(getNumber + "보다 큰 첫번째 소수는 : " +num );
				isRun = false;
			}
			else {
				cnt = 0;
				num++;
			}
		}
		
		
		
		scan.close();
		
	
		
	}

}
