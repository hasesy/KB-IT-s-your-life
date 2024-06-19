package afternoon.array;

public class Arr3Ex {
    public static void main(String[] args) {
        int[] nums = new int[]{100, 39, 60, 30, 42, 40, 25, 70, 90, 55};

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        }

        System.out.println("배열의 합산 값 : " + sum);

        double average = (double) sum / nums.length;

        System.out.println("배열의 평균 값 : " + average);
    }
}
