package hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: 两个数组的交集
 * @Author: cry
 * @CreateTime: 2024/12/12 11:06
 * @Version: 1.0
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1==null||nums1.length==0||nums2==null||nums2.length==0){
            return new int[0];
        }
        Set<Integer> intSet = new HashSet<Integer>();
        Set<Integer> resSet = new HashSet<Integer>();

        for (int i : nums1) {
            intSet.add(i);
        }

        for (int i : nums2) {
            if (intSet.contains(i)){
                resSet.add(i);
            }
        }

        return resSet.stream().mapToInt(x->x).toArray();
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        if (nums1==null||nums1.length==0||nums2==null||nums2.length==0){
            return new int[0];
        }
        Set<Integer> intSet = new HashSet<Integer>();
        Set<Integer> resSet = new HashSet<Integer>();

        for (int i : nums1) {
            intSet.add(i);
        }

        for (int i : nums2) {
            if (intSet.contains(i)){
                resSet.add(i);
            }
        }

        int[] resArr = new int[resSet.size()];
        int j=0;
        for (Integer integer : resSet) {
            resArr[j++]=integer;
        }

        return resArr;
    }

    /*
     * @Description: 使用数组
     * @param:
     * @return: null
     * @Author:  cry
     * @date:  2024/12/12 14:01
     */

    public int[] intersection3(int[] nums1, int[] nums2) {
        int[] hashA = new int[1002];
        int[] hashB = new int[1002];
        for (int i : nums1) {
            hashA[i]++;
        }
        for (int i : nums2) {
            hashB[i]++;
        }

        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < 1002; i++) {
            if (hashA[i]>0&&hashB[i]>0){
                resList.add(i);
            }
        }
        return  resList.stream().mapToInt(x -> x).toArray();
    }
}
