package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_내정답 { // 2020.12.16 12:20 - 12:23

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=50) {
			
			int x = i / 10;
			int y = i % 10;
			int cnt = 0;
			
			if(x == 3 || x == 6 || x == 9) {
				cnt++;
			}
			
			if(y == 3 || y == 6 || y == 9) {
				cnt++;
			}
			
			if(cnt == 0) {
				System.out.println(i);
			}
			else if(cnt == 1) {
				System.out.println("짝");
			}
			else if(cnt == 2) {
				System.out.println("짝짝");
			}
			
			i++;
		}
		
		
		
	}

}
