package afternoon.lang.math.lotto;

import java.util.Random;

public class LottoGenerator {
    int[] lottoNumbers = new int[6];
    Random random = new Random();

    public void generate() {
        int idx = 0;
        int length = 0;

        for (int i = 0; i < 6; i++) {
            int randNum = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (randNum == lottoNumbers[j]) {}
            }
        }
//        while(length < 6) {
//
//            for (int lottoNumber : lottoNumbers) {
//                if (lottoNumber != randNum) {}
//            }
//            if(lottoNumbers[idx].compareTo(randNum) != 0) {
//                lottoNumbers[idx] = randNum;
//                idx++;
//                length++;
//            }
//
//        }
    }

    public void printLottoNumbers() {
        for (int i = 0; i < 6; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
    }
}