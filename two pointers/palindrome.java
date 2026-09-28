public  class palindrome{
	public static void main (String[]args){
		int[] arr = {1,4,2,3,2,4,1};
		int left =0;
		int right= arr.length -1;
		int temp =0;
		while ( left < right){
			if ( arr[left]== arr[right]){
				left ++;
				right --;
				temp = 1;
			}
			else {
				temp =0;
				break;

			}
		}
		if ( temp ==0){
			System.out.println("Not a palindrome.");
		}
		else {
			System.out.println("The numebr is a palindrome.");
		}
	}
}
