package step1_06.loop;

/*
 * 
 *  # 삼각형 출력하기
 * 
 *         1           9   
 *        2 2         10
 *       3 3 3        11
 *      4 4 4 4       12
 *     5 5 5 5 5      13
 *    6 6 6 6 6 6     14
 *   7 7 7 7 7 7 7    15
 *  8 8 8 8 8 8 8 8   16
 * 9 9 9 9 9 9 9 9 9  17
 * 
*/

public class LoopEx27_내정답 {

	public static void main(String[] args) { // 2020.12. 17  1:26 - 1:30

		int k = 0;
		for(int i = 0; i<9; i++) {
			for(int j = 8; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= k; j++) {
				if(j % 2 == 0) {
					System.out.print(i + 1);
				}
				else {
					System.out.print(" ");
				}
			}
			k += 2;
			System.out.println();
		}
		
		

	}

}
