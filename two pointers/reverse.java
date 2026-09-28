public class reverse {
	public static void main(String[]args){
		int[] arr = {1,2,3,4,5};
		for ( int i : arr){
			System.out.print("["+i+"]");
		}
		int left =0;
		int right = arr.length -1;
		int temp;

		while ( left<right ){
			temp = arr[left];
			arr[left]= arr[right];
			arr[right]=temp;

			left ++;
			right --;
		}
		System.out.println("");
		for ( int i : arr){
			System.out.print("["+i+"]");
		}
	}
}
