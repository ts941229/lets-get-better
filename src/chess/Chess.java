package chess;

import java.util.Scanner;

public class Chess {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
		int[] chess = new int[] {
				1, 1, 2, 2, 2, 8
		};
		//입력받을 수를 넣을 배열
		int[] input = new int[6];
		
		System.out.println("순서대로 갯수 입력 : ");
		// 입력받은 수 배열에 넣기
		for(int i=0; i<input.length; i++) {
			input[i] = Integer.parseInt(sc.next());
			System.out.print((chess[i]-input[i])+" ");
		}
	}
}
