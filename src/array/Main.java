package array;

import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] nums = new int[n][m];
        int[] row = new int[m];
        int[] column = new int[n];
        int sum = 0;
        int res = Integer.MAX_VALUE;
        int rnum = 0;
        int cnum = 0;
        for (int i=0;i<n ;i++ ){
            int s=0;
            for (int j=0;j<m ;j++ ){
                nums[i][j]=scanner.nextInt();
                s+=nums[i][j];
                sum+=nums[i][j];
                System.out.println(nums[i][j]);
            }
            cnum+=2*s;
            column[i]=cnum;
        }

        for (int i=0;i<m ;i++ ){
            int s=0;
            for (int j=0;j<n ;j++ ){
                s+=nums[j][i];
            }
            rnum+=2*s;
            row[i]=rnum;
        }
        System.out.println("****************************sum: "+ sum);
        for (int i=0;i<n ;i++ ){
            res=Math.min(res, Math.abs(sum - column[i]));
            System.out.println("****************************column[i]: "+ column[i]);
            System.out.println("****************************res: "+ res);
        }
        for (int i=0;i<m ;i++ ){
            res=Math.min(res, Math.abs(sum - row[i]));
            System.out.println("****************************row[i]: "+ row[i]);
            System.out.println("****************************res: "+ res);
        }

        System.out.println(res);
        scanner.close();

    }
} 