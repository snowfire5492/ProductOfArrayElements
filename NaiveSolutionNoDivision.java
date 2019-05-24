
public class NaiveSolutionNoDivision {

	public int[] productOfArray(int[] arr) {
		
		int[] output = new int[arr.length];
		
		
		for(int i = 0; i < arr.length; i++) {
			
			output[i] = 1;
			
			for(int j = 0; j < arr.length; j++) {
				
				if(j != i ) {
					output[i] *= arr[j];
				}
				
			}
			
		}
		
			
		return output;
	}
	
	
	
	
}

