package edu.msc.sorting;

/**
 * Created by mcq1 on 3/24/2016.
 */
public class QuickSort {
    static int counter = 0;
    static int flips = 0;
    static void quicksort(int a[], int low, int high)
    {
        if(low < high)
        {
            int q;
            q = partition(a, low, high);
            quicksort(a, low, q);
            quicksort(a, q+1, high);
        }
        counter++;
    }

    static int partition(int a[], int low, int high)
    {
        int i, j, pivot, temp;
        pivot = a[low];
        i = low;
        j = high;
        while(true)
        {
            while(a[i] < pivot && a[i] != pivot)
                i++;
            while(a[j] > pivot && a[j] != pivot)
                j--;
            if(i < j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                flips++;
            }
            else
            {
                return j;
            }
        }
    }

    public static void main(String[] args) {
        counter = 0;
        flips = 0;
        int[] a = new int [] {5,34,4,25,6,8,9, 19};
        //int[] a = new int [] {6,5,4,3,2,1};
        QuickSort.quicksort(a, 0, a.length-1);
        System.out.println("counter = " + counter);
        System.out.println("flips = " + flips);
    }

}
