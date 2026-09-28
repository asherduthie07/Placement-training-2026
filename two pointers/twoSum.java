public class twoSum{
	public static void main(String[]args){
		int[] arr ={2,6,7,8,19,13,15};
		int target= 18;
		int left =0;
		int right = arr.length -1;
		int temp =0 ;
		while (left < right){
			if ( arr[left] + arr[right]== target){
				System.out.print("ans found: "+ arr[left]+ ", " +arr[right]+ ".");
				temp = 1;
				break;
			}
			else if ( arr[left]+arr[right] > target){
				right--;
				temp =0; 	
			}
			else {
				left++;
				temp =0;
                        }
		}
		if ( temp == 0){
			System.out.println("Not found");
		}
	}
}
