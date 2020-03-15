import java.util.Scanner;

class sorter_run {
    public static void main(String[] args) {
                int[] SortedArray = new int[100];
                System.out.print("Input the number of elements to store in the array: ");
                Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());
                if (n != 0)
                {
                    System.out.println("Input elements in the array:");
                    for (int i = 0; i < n; i++)
                    {
                        System.out.print("element - " + Integer.toString(i) + ": ");
                        SortedArray[i] = Integer.parseInt(scanner.nextLine());
                    }
                }
                else
                {
                    SortedArray = new int[] { -11, 17, 20, 19, 13, -7, 5, -17 };
                    n = 8;
                }
                System.out.println("11 - Bubble Sort, Ascending");
                System.out.println("12 - Bubble Sort, Descending");
                System.out.println("21 - Insertion Sort, Ascending");
                System.out.println("22 - Insertion Sort, Descending");
                System.out.println("31 - Shaker Sort, Ascending");
                System.out.println("32 - Shaker Sort, Descending");
                int inp = Integer.parseInt(scanner.nextLine());
                if (inp == 11)
                    SortedArray = sorter_sample.BubbleSort(SortedArray, false, n);
                if (inp == 12)
                    SortedArray = sorter_sample.BubbleSort(SortedArray, true, n);
                if (inp == 21)
                    SortedArray = sorter_sample.BubbleSort(SortedArray, false, n);
                if (inp == 22)
                    SortedArray = sorter_sample.BubbleSort(SortedArray, true, n);
                if (inp == 31)
                    SortedArray = sorter_sample.BubbleSort(SortedArray, false, n);
                if (inp == 32)
                    SortedArray = sorter_sample.BubbleSort(SortedArray, true, n);
                System.out.println("Sorted array:");
                for (int i = 0; i < n; ++i)
                {
                    System.out.print(Integer.toString(SortedArray[i]) + " ");
                }
                System.out.println();
    }
}
