package array;

public class LatestArry {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4,3};
        int target=7;
        int result = minSubArrayLen(target, nums);
        System.out.println("*******************result： " + result);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int res=nums.length;
        int a = 0;
        int snum=0;
        int fnum=nums[0];
        int s=0;
        int f=1;
        while(f<nums.length||fnum-snum>=target){
            if(fnum-snum>=target){
                res=Math.min(res, f - s );
                snum+=nums[s++];
                a=1;
            }else{
                fnum+=nums[f++];
            }
        }
        if(a==1){
            return res;
        }else{
            return 0;
        }
    }
}
