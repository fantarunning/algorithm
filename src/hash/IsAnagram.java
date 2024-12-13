package hash;

/**
 * @Description: 有效的字母异位词
 * @Author: cry
 * @CreateTime: 2024/12/11 14:11
 * @Version: 1.0
 */
public class IsAnagram {
    public static void main(String[] args) {
        String str = "abcd,efg,bcaef,gd";
        String str2 = "bcaefgd";
        isAnagram(str2,str);
//        System.out.println("***********************A: " + str.charAt(0)-'a');
        System.out.println("***********************A: " + str.charAt(3));
    }

    public static boolean isAnagram(String s, String t) {
        int[] records = new int[26];
        for (int i = 0; i < s.length(); i++) {
            records[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            records[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < records.length; i++) {
            if (records[i]!=0){
                return false;
            }
        }
        return true;
    }
}
