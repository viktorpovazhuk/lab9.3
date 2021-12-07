package atm;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = sc.nextInt();
//        System.out.println(amount);
        // can work without classes in current case
        // but later - easier to extend
        ATM atm = new ATM();
        atm.handle(amount);
    }
}
