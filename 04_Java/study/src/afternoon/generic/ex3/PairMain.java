package afternoon.generic.ex3;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, String> nameData = new Pair<>("name", "이효석");
        Pair<String, Integer> ageData = new Pair<>("age", 40);
        Pair<String, Boolean> marriedData = new Pair<>("married", false);

        System.out.println("nameData value : " + nameData.getValue());
        System.out.println("ageData value : " + ageData.getValue());
        System.out.println("marriedData value : " + marriedData.getValue());

        System.out.println(nameData);
        System.out.println(ageData);
        System.out.println(marriedData);
    }
}
