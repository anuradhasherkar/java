public class Program11 {
    static <T extends Number & Comparable<T>> T minimum(T[] arr) {
        T min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0)
                min = arr[i];
        }

        return min;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {40, 20, 10, 50, 30};
        Double[] arr2 = {4.5, 2.3, 8.9, 1.2};

        System.out.println("Minimum Integer = " + minimum(arr1));
        System.out.println("Minimum Double = " + minimum(arr2));
    }
}
