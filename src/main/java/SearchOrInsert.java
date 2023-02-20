public class SearchOrInsert {

    public static void main(String[] args) {
        new SearchOrInsert().searchInsert(new int[] {1,3,5,6}, 0);
    }
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len-1;
        int mid = 0;
        while(low<=high) {
            mid = (low + high) /2 ;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if(nums[mid] > target) return mid;
        else return mid + 1;
    }
}
