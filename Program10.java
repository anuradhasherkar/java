import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program10 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10).sum();

        System.out.println("Sum = " + sum);

        IntSummaryStatistics stats =
                IntStream.rangeClosed(1, 10).summaryStatistics();

        System.out.println("\nStatistics:");
        System.out.println("Count = " + stats.getCount());
        System.out.println("Sum = " + stats.getSum());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Average = " + stats.getAverage());
    }
}
