import java.util.ArrayList;
import java.util.Collections;

public class Assignment8_2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("yellow");

        list.sort(null);


        for(String s : list){
            System.out.println(s);
        }
    }
}
