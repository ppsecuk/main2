package com.sda.tallinn6.fundamentals.practical.advanced_evgeni.concurrence_practice.exercise;

import java.util.List;
import java.util.concurrent.Callable;

public class SimpleSortCallable implements Callable<List<Integer>> {
    private List<Integer> unsortedNumbers;

    public SimpleSortCallable(List<Integer> unsortedList) {
        this.unsortedNumbers = unsortedNumbers;
    }

    @Override
    public List<Integer> call() throws Exception {
        quickSort((Integer[]) this.unsortedNumbers.toArray(), 0, this.unsortedNumbers.size() - 1);
        return this.unsortedNumbers;
        /*System.out.println("\n The sorted array is: \n");
        for (i = 0; i < 10; i++)
            System.out.println(unsortedNumbers[i]);*/
    }

    public static int partition(Integer[] a, int beg, int end) {

        int left, right, temp, loc, flag;
        loc = left = beg;
        right = end;
        flag = 0;
        while (flag != 1) {
            while ((a[loc] <= a[right]) && (loc != right))
                right--;
            if (loc == right)
                flag = 1;
            else if (a[loc] > a[right]) {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if (flag != 1) {
                while ((a[loc] >= a[left]) && (loc != left))
                    left++;
                if (loc == left)
                    flag = 1;
                else if (a[loc] < a[left]) {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }

    static void quickSort(Integer[] a, int beg, int end) {

        int loc;
        if (beg < end) {
            loc = partition(a, beg, end);
            quickSort(a, beg, loc - 1);
            quickSort(a, loc + 1, end);
        }
    }

}