import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = nums;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
}