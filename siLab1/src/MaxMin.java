
public class MaxMin {
	

	public int  maximo(int[] array){
		int max = 0;
		for(int i = 0; i <= array.length; i++){
			if(array[i]> max){
				max = array[i];
			}
			
		}
		
		return max;
	}
	 public int  minimo(int[] array){
			int min = 0;
			for(int i = 0; i <= array.length; i++){
				if(array[i]< min){
					min = array[i];
				}
				
			}
			
			return min;
			
			
		}
}
