import java.util.stream.IntStream;

public class Program8 {
    public static void main(String[] args) {
        int n = 5;

        long factorial = IntStream.rangeClosed(1, n)
                .asLongStream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Number = " + n);
        System.out.println("Factorial = " + factorial);
    }
}
