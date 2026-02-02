import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 9, 5, 7, 6, 2, 4, 3 };
        int[] arr1 = arr.clone();
        Arrays.sort(arr);
        int key = 3;

        int first = 0, mid = 0;
        int last = arr.length - 1;

        while (first <= last) {
            mid = (first + last) / 2;

            if (arr[mid] == key) {
                System.out.println("Sorted Array " + Arrays.toString(arr));
                mid += 1;
                System.out.println("Key is present at index " + mid);
                break;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr1[i] == key) {
                System.out.println("Original Array " + Arrays.toString(arr1));
                System.out.println("Key is present at index " + (i + 1) + " in original array");
                break;
            }
        }
    }
}
