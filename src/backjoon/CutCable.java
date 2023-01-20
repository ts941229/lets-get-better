package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CutCable {
	
	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

		long[] vals = new long[k];
		
		int sum = 0;
		int key = 0;
		
		for(int i=0; i<k; i++) {
			vals[i] = Long.parseLong(br.readLine());
		}
		
		for(int i=0; i<vals.length; i++) {
			key += vals[i];
		}
		
		key = key/n;
		
		while(sum!=n) {
			sum = 0;
			key--;
			
			for(int i=0; i<vals.length; i++) {
				sum += vals[i]/key;
			}
			
		}
		
		System.out.println(key);
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)/1000);
	}
	
}

