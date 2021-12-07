package atm;

public class ATM {
    private final BaseBill firstBill;

    public ATM() {
        BaseBill bill5 = new Bill5();
        BaseBill bill10 = new Bill10();
        BaseBill bill20 = new Bill20();

        bill20.setNext(bill10);
        bill10.setNext(bill5);

        this.firstBill = bill20;
    }

    public void handle(int amount) {
        firstBill.handle(amount);
    }
}
