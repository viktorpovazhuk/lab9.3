package atm;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;

public abstract class BaseBill implements Bill{
    @Getter
    private Bill next = null;
    @Getter
    @Setter
    private int billValue;
    @Getter
    @Setter
    private int numOfBills;

    BaseBill() {
    }

    @Override
    public void setNext(Bill bill) {
        next = bill;
    }

    @Override
    public void handle(int amount) {
        setNumOfBills(amount / billValue);
        if (getNext() != null) {
            getNext().handle(amount % billValue);
        } else if (amount % billValue != 0) {
            throw new InputMismatchException();
        }
        System.out.printf("number of bills of value %d is %d\n", billValue, numOfBills);
    }
}
