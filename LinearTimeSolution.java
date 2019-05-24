
public class LinearTimeSolution {

	// [ 1, 2, 3, 4, 5 ]
	
	// create pre-product array  [ 1,         1*2,     1*2*3,   1*2*3*4, 1*2*3*4*5 ]
	
	// create post-product array [ 1*2*3*4*5, 2*3*4*5, 3*4*5,   4*5,     5 ] 
	
	// combine to createn result [ 2*3*4*5,   1*3*4*5, 1*2*4*5, 1*2*3*5, 1*2*3*4 ]
	
	public int[] productOfArray(int[] arr) {
		
		int arraySize = arr.length;
		int[] result = new int[arraySize], pre = new int[arraySize], 
			post = new int[arraySize];
		
		for(int i= 0; i < arraySize; ++i) {
			
			if(i == 0) {
				pre[i] = arr[i];
			}else {
				pre[i] = pre[i-1] * arr[i];
			}
		}
		
		
		for(int i = arraySize - 1; i >= 0; --i) {
			
			if(i == arraySize - 1) {
				post[i] = arr[i];
			}else {
				post[i] = post[i+1] * arr[i];
			}
			
		}
		
		for(int i = 0; i < arraySize; ++i) {
			
			if(i == 0) {
				result[i] = post[i + 1];
			}else if(i == arraySize - 1) {
				result[i] = pre[i - 1];
			}else {
				result[i] = pre[i - 1] * post[i + 1];
			}
			
			
			
		}
		
	
		
		return result;
	}
	
	
	
}

