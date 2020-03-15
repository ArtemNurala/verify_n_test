public class sorter_sample {
        public static int[] BubbleSort(int[] input, boolean order, int n) {
            int temp;
            if (!order) {
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (input[j] < input[i]) {
                            temp = input[j];
                            input[j] = input[i];
                            input[i] = temp;
                        }
                    }
                }
            } else {
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (input[j] > input[i]) {
                            temp = input[j];
                            input[j] = input[i];
                            input[i] = temp;
                        }
                    }
                }
            }
            return input;
        }

        public static int[] InsertionSort(int[] array, boolean order, int n) {
            int[] result = new int[array.length];
            if (!order) {
                for (int i = 0; i < array.length; i++) {
                    int j = i;
                    while (j > 0 && result[j - 1] > array[i]) {
                        result[j] = result[j - 1];
                        j--;
                    }
                    result[j] = array[i];
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    int j = i;
                    while (j > 0 && result[j - 1] < array[i]) {
                        result[j] = result[j - 1];
                        j--;
                    }
                    result[j] = array[i];
                }
            }
            return result;
        }

        public static int[] ShakerSort(int[] myint, boolean order, int n) {
            int beg, end;
            beg = 0;
            end = myint.length - 1;
            while (beg < end) {
                if (!order) {
                    for (int i = beg; i < end; i++) {
                        if (myint[i] > myint[i + 1]) {
                            Swap(myint, i, i + 1);
                        }
                    }
                    end--;

                    for (int i = end; i > beg; i--) {
                        if (myint[i - 1] > myint[i]) {
                            Swap(myint, i - 1, i);
                        }
                    }
                    beg++;
                } else {
                    for (int i = beg; i < end; i++) {
                        if (myint[i] < myint[i + 1]) {
                            Swap(myint, i, i + 1);
                        }
                    }
                    end--;

                    for (int i = end; i > beg; i--) {
                        if (myint[i - 1] < myint[i]) {
                            Swap(myint, i - 1, i);
                        }
                    }
                    beg++;
                }
            }
            return myint;
        }

        public static void Swap(int[] myint, int i, int j) {
            int glass;
            glass = myint[i];
            myint[i] = myint[j];
            myint[j] = glass;
        }
    }
