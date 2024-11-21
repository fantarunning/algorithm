package array;
/*
* 二分法 左闭右开区间 [ )
*
*/
public class Dichotomy {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,2,5,9,12};
        int target = 6;
//        int dichotomy = dichotomy(nums, target);
//        int dichotomy2 = dichotomy2(nums, target);
//        int search = search(nums, target);
        int change = change(nums, target);
//        System.out.println("*********************dichotomy输出结果为："+dichotomy);
//        System.out.println("*********************dichotomy2输出结果为："+dichotomy2);
//        System.out.println("*********************search输出结果为："+search);
        System.out.println("*********************change输出结果为："+change);
    }
    public static int dichotomy(int[] num,int target){
        int left = 0;
        int right = num.length-1;
        while (left<right){
            int middle = (right-left)/2+left;
            if (num[middle]>target){
                right = middle;
            }else if (num[middle]<target){
                left = middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }

    public static int dichotomy2(int[] num,int target){
        int left = 0;
        int right = num.length-1;
        while (left<right){
            int middle = (right-left)/2+left;
            if (num[middle]>target){
                right = middle-1;
            }else if (num[middle]<target){
                left = middle+1;
            }else {
                return middle;
            }
        }
        return -1;
    }

    public static int change(int[] num,int target){
        if (num[num.length-1]<target){
            return num.length;
        }else if (num[0]>target){
            return 0;
        }else {
            int left = 0;
            int right = num.length-1;
            while (left<right){
                int middle = (right-left)/2+left;
                if (num[middle]>target){
                    right = middle-1;
                }else if (num[middle]<target){
                    left = middle+1;
                }else {
                    return middle;
                }
            }
            return right+1;
        }
    }

    public static int search(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else { // nums[mid] > target
                right = mid - 1;
            }
        }
        // 未找到目标值
        return -1;
    }
}
