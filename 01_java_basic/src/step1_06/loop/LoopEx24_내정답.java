package step1_06.loop;

/*
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx24_내정답 {

	public static void main(String[] args) {

		
	//문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력  
		
		int n = 9;
		boolean isRun = true;
		while(isRun) {
			if(n / 10 == 6) {
				isRun = false;
				System.out.println("답 : " + n);
			}
			n += 9;
		}
	
		
    //문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x ) 
		
		//첫번째 
		int x = 1;
		int maxX = 0;
		
		while(x <= 150) {
			if( x % 8 == 5) {
				maxX = x;
			}
			x++;
		}
		System.out.println(maxX);
		
		System.out.println();
		
		//두번째 
		int maxI = 0;
		for(int i = 1; i <= 150; i++) {
			if(i % 8 == 5) {
				maxI = i;
			}
		}
		System.out.println("답 : " + maxI);
		
		System.out.println();
		
	//0문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까? 
		
		int cnt = 0;
		for(int i = 50; i <= 100; i++) {
			if(i % 9 == 0) {
				cnt++;
			}
		}
		System.out.println("답 : " + cnt + "개");
		
	
	//문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요. 
		
		int maxJ = 0;
		for (int j = 100; j <= 999; j++){
			if(j % 28 == 0) {
				maxJ = j;
			}
		}
		System.out.println("답 : " + maxJ);
		
	
	//문제5) 8의 배수를 작은수부터 5개 출력

	//첫번째  
		cnt = 0;
		int y = 1;
		while(cnt <= 4) {
			if(y % 8 == 0) {
				System.out.print(y +" ");
				cnt++;
			}
			y++;
		}
		
	//두번째  

		cnt = 0;
		for(int i = 1; i <= 999; i++) {
			if(i % 8 == 0) {
				System.out.print(i + " ");
				cnt++;
			}
			if(cnt == 5) {
				break;
			}
		}

		
		
	}
}
