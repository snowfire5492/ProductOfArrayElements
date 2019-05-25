

public class UI {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		NaiveSolutionNoDivision naive = new NaiveSolutionNoDivision();
		
		System.out.println(toString(naive.productOfArray(arr)));
		
		LinearTimeSolution linear = new LinearTimeSolution();
		
		
		System.out.println(toString(linear.productOfArray(arr)));
		
	}
	
	public static String toString(int[] arr) {
		String str = "[";
		
		for(int i = 0; i < arr.length; ++i) {
			str += arr[i];
			
			if(i + 1 != arr.length) {
				str += ", ";
			}
			
		}
		
		str += "]";
		return str;
	}

}

