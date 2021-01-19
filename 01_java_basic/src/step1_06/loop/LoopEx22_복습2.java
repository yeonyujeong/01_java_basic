package step1_06.loop;


// # 삼각형 그리기

public class LoopEx22_복습2 {
	
	public static void main(String[] args) {
		
	
		int k = 1;
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(" ");
			}
			for(int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < k; j++) {		
					System.out.print("*");	
			}
			
			k += 2;
			System.out.println();
		}
		System.out.println("      |");
		System.out.println();
		System.out.println("Merry Christmas~");
		
		
	}
}
