package hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 快乐数
 * @Author: cry
 * @CreateTime: 2024/12/12 14:16
 * @Version: 1.0
 */
public class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<>();
        while (n!=1 && !hashSet.contains(n)){
            hashSet.add(n);
            n=getNextNumber(n);
        }
        return n==1;
    }

    private int getNextNumber(int n){
        int res = 0;
        while (n>0){
            int temp= n%10;
            res+=temp*temp;
            n=n/10;
        }
        return res;
    }
}
