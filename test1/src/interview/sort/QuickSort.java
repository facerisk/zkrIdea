package interview.sort;

/**
 * 快速排序：一个哨兵，多次拆分数组
 * 注：若初始记录表有序或基本有序，则快速排序将蜕化为冒泡排序,其时间复杂度为O(n2)；
 * 即：快速排序在表基本有序时，最不利于其发挥效率。
 *
 * 首先取第一个记录，将之与表中其余记录比较并交换，从而将它放到记录的正确的最终位置，使记录表分成两部分
 * {其一（左边的）诸记录的关键字均小于它；其二（右边的）诸记录的关键字均大于它
 * }；然后对这两部分重新执行上述过程，依此类推，直至排序完毕1.基本思想：通过分部排序完成整个表的排
 *
 * 最好的情况O(n) 最坏的情况O(n²) 平均时间复杂度O(n㏒₂n)
 * 快速排序是一种原地排序，只需要一个很小的栈作为辅助空间，空间复杂度为O(n+㏒₂n)，所以适合在数据集比较大的时候使用.(log2n为附加空间—栈)
 *
 * 不稳定排序
 */
public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}