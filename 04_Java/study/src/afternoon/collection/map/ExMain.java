package afternoon.collection.map;

import java.util.HashMap;
import java.util.Random;

public class ExMain {
    public static void main(String[] args) {
        int[] arr = new int[10];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
            hashMap.put(i + 1, 0);
        }

        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
        }

        System.out.println("hashMap = " + hashMap);
    }
}
