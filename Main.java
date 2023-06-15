package stream_task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(
                List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
        );

        // До обработки массива

        for (int i = 0; i < arrList.size(); i++) {

            if (arrList.get(i) <= 0) {

                arrList.remove(i);
                i -= 1;

            } else if (arrList.get(i) % 2 != 0) {

                arrList.remove(i);
                i -= 1;

            }

        }
        Collections.sort(arrList);

        //После обработки массива, можно оставить так:
        System.out.println(arrList);

        //А можно вывести значения как сказано в задании
        for (int i : arrList) {
            System.out.print(i + " ");
        }


    }
}
