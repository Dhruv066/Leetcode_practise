class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        int first = searchBinary(nums , target,true);
        int last= searchBinary(nums ,target,false);
        res[0]=first;
        res[1]=last;

        return res;
    }
     public static int searchBinary(int [] arr, int key, boolean isFirst){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                ans=mid;
                if(isFirst){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            else if(arr[mid]<key){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}