import java.util.ArrayList;

public class Assignment8_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

    for(int i = 0 ; i < 20; i++){
        list.add(i*2);
     }

    //  for(int i = 0 ; i < 20; i++){
    //         for(int s : list){
    //             System.out.println(s);
    //         }
    //  }


     replaceSecond(1000, list);


     for(int i : list){
    System.out.println(i);
}

    }



    public static void  replaceSecond(int n, ArrayList<Integer> list){
        list.set(1, n);
    }
}
