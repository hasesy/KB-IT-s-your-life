package afternoon.nested.nedted.ex1;

import java.util.Random;

public class Network {
    private boolean networkCondition;

    public boolean checkNetwork() {
        System.out.println("네트워크 상태를 점검합니다.");
        Random random = new Random();
        networkCondition = random.nextBoolean();

        if (networkCondition) {
            System.out.println("네트워크 상태 정상");
            return true;
        } else {
            System.out.println("네트워크 상태 비정상");
            return false;
        }
    }

    public void sendMag(String msg) {
        NetworkMsg networkMsg = new NetworkMsg(msg);
        networkMsg.send();
    }
}
