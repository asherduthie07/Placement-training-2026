public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int temp =0;
       for(int i=0;i<nums.length; i++){
            temp += nums[i];
            if ( temp > max){
                max = temp;
            }
            if ( temp <0){
                temp =0;
            }
       } 
       return max;
    }
    public void main (String[] args){
    	int[] arr = {5,1,-2,4,-3,7,-2,0};
	System.out.println(maxSubArray(arr));
    }
}
