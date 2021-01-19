package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_내정답 {

	public static void main(String[] args) { // 2020.12.15  12:32 - 12:37
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		int i = 0;
		int total = 0;
		
		while (i <= 5) {
			total = total + i;
			i++;
		}
		System.out.println(total);
		System.out.println();
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		i = 1;
		while (i <= 10) {
			if(i < 3 || i >= 7) {
				System.out.println(i);
			}
			i++;
		}
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		System.out.println();
		
		i = 1;
		total = 0;
		while (i <= 10) {
			if(i<3 || i >= 7) {
				total = total + i;
			}
			i++;
		}
		System.out.println(total);
		System.out.println();
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6

		i = 1;
		int cnt = 0;
		
		while (i <= 10) {
			if(i<3 || i >=7) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		
	}

}
