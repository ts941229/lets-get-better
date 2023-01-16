package backjoon;

import java.util.Arrays;
import java.util.Comparator;

public class GetMinResult {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] A = new int[] {1, 2};
		int[] B = new int[] {3, 4};
		
		int answer = solution.solution(A, B);
		
		System.out.println(answer);
		
	}
	
}

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
//        int[] A_asc = new int[A.length];
//        int[] B_desc = new int[B.length];
        
        Arrays.sort(A);
//        int a = 0;
//        for(int i : A) {
//        	A_asc[a] = i;
//        	a++;
//        }
        
//        for(int i=0; i<A.length; i++) {
//        	A_asc[i] = A[i];
//        }
        
//        Integer[] tmp = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        Arrays.sort(tmp, Comparator.reverseOrder());
        Arrays.sort(B);
//        int b = 0;
//        for(int i : B) {
//        	B_desc[b] = i;
//        	b++;
//        }
//        for(int i=0; i<B.length; i++) {
//        	B_desc[i] = B[i];
//        }
        for(int i=0; i<B.length; i++) {
        	
        	System.out.println(B[i]);
        }
        
        for(int i=0; i<A.length; i++) {
        	answer += (A[i] * B[(B.length-1)-i]);
        }
        
        return answer;
    }
}