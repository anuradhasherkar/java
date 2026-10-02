import java.util.Arrays;
import java.util.Comparator;

public class Program13 {
    static <T> void selectionSort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (c.compare(arr[i], arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {50, 20, 40, 10, 30};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr, (x, y) -> x - y);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
