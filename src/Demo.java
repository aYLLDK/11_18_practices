import java.util.*;


public class Demo {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public static int MoreThanHalfNum_Solution(int[] numbers) {
        // write code here
        int[] countNums = new int[10001];
        //遍历numbers数组,每出现一个数字就在对应下标的countNums中+1
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            countNums[cur]++;
        }
        for (int j = 1; j < 10001; j++) {
            if (countNums[j] >= numbers.length)
                return j;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] numbers = {1,2,3,2,2,2,5,4,2};
        int result = MoreThanHalfNum_Solution(numbers);
        System.out.println(result);
    }

}