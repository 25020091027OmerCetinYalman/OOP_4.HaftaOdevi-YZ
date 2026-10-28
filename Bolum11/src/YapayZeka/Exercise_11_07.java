package YapayZeka;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Orijinal Liste: " + list);
        shuffle(list);
        System.out.println("Karistirildiktan Sonra: " + list);
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}

