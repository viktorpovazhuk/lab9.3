package atm;

public interface Bill {
    void setNext(Bill bill);
    void handle(int amount);
}
