package afternoon.nested.nedted.ex2;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();

        if (network.checkNetwork()) {
            network.sendMag("내일도 비가 오려나?");
        }
    }
}
