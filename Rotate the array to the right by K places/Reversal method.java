// the approach is simply comes from the good observation of the result of the array. 
// we can see that numbers are shuffled in the array itself which means there is a possibillity of reversal



class Solution {
    void reverse(int[] arr, int i, int j){
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k != 0){

        reverse(nums,0,nums.length- 1 - k);
        reverse(nums,nums.length - k,nums.length - 1);
        reverse(nums,0,nums.length-1);
        }
    }
}
