enum Days {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    boolean isWeekday() {
        return !isWeekend();
    }
}

public class Program4 {
    public static void main(String[] args) {
        for (Days d : Days.values()) {
            System.out.println(d + " -> Weekend: "
                    + d.isWeekend() + ", Weekday: " + d.isWeekday());
        }
    }
}
