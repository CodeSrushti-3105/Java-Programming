interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}

public class Sorting {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 1, 3};
        int[] array2 = {7, 4, 8, 2, 6};

        Sortable bubble = new BubbleSort();
        Sortable selection = new SelectionSort();

        System.out.println("Original array1: ");
        printArray(array1);
        bubble.sort(array1);
        System.out.println("Sorted using Bubble Sort:");
        printArray(array1);

        System.out.println("\nOriginal array2: ");
        printArray(array2);
        selection.sort(array2);
        System.out.println("Sorted using Selection Sort:");
        printArray(array2);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
