package afternoon.pack;

import afternoon.pack.a.Boss;
import afternoon.pack.neww.Customer;

public class PackageMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        afternoon.pack.neww.Customer customer2 = new afternoon.pack.neww.Customer();

        Boss boss1 = new Boss("김서연", 25);
        boss1.printBoss();
    }
}
