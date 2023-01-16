package backjoon;

public class GetMinAndMaxFromString {
	public static void main(String[] args) {
		Solution2 solution2 = new Solution2();
		
		solution2.solution("-1 -1");
		System.out.println(solution2.solution("-1 -1"));
	}
}

class Solution2 {
    public String solution(String s) {
    	
    	String[] s_arr = s.split(" ");
    	
    	int[] nums = new int[s_arr.length];
    	
    	for(int i=0; i<s_arr.length; i++) {
    		nums[i] = Integer.parseInt(s_arr[i]);
    	}
    	
    	int max = nums[0];
    	for(int i=0; i<nums.length; i++) {
    		if(max<nums[i]) {
    			max = nums[i];
    		}
    		
    	}
    	
    	int min = max;
    	for(int i=0; i<nums.length; i++) {
    		if(min>nums[i]) {
    			min = nums[i];
    		}
    	}
    	
        String answer = min + " " + max;
        return answer;
    }
}
