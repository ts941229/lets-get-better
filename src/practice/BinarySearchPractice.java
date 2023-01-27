package practice;

public class BinarySearchPractice {
	
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println(binarySearch1(1, arr.length, 99, arr));
		System.out.println(binarySearch1(2, arr.length, 99, arr));
	}
	
	public static int binarySearch1(int start, int end, int target, int[] arr) {
		
		int mid = 0;

		while(start<=end){
			mid = (start+end)/2;
		    
			if(arr[mid]==target) {
				return mid;
			}else {
				
				if(arr[mid]<target){
					start = mid+1;
			    }else{
			    	end = mid-1;
			    }
				
			}
		}
		
		return -1;
	}

	
	public static int binarySearch2(int start, int end, int target, int[] arr) {
		
		int mid = 0;

		while(start<=end){
			mid = (start+end)/2;
		    
			if(arr[mid]==target) {
				return mid;
			}else {
				
				if(arr[mid]<target){
					return binarySearch2(mid+1, end, target, arr);
			    }else{
			    	return binarySearch2(start, mid-1, target, arr);
			    }
				
			}
		}
		
		return -1;
	}
	
}
