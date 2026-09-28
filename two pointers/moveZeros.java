public class moveZeros{
	public static void main (String []args){
		int[] arr = {0,1,0,3,12};
		int slow =0;
		int fast =0;
		int temp;
		for ( int i=0; i < arr.length; i ++){
			if( arr[fast]  != 0 ){
				temp = arr[slow];
				arr[slow]=arr[fast];
				arr[fast]= temp;
				slow++;
			}
		}	
		for ( int i : arr){
			System.out.print(i+" ");
				
		}
	}
}
