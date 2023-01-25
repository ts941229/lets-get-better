package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CutCable2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

		long[] vals = new long[k];
		
		for(int i=0; i<vals.length; i++) {
			vals[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(vals);
		
		long start = 1;
		long end = vals[vals.length-1];
		long mid = 0;
		long max = 0;
		
		while(start <= end) {
			mid = (start + end) / 2;
			
			long sum = 0;
			for(int i=0; i<vals.length; i++) {
				sum += vals[i]/mid;
			}
			
			if(sum>=n) {
				start = mid+1;
				
				if(max<mid) {
					max = mid;
				}
				
			}else {
				end = mid-1;
			}
			
		}
		
		System.out.println(max);
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}

