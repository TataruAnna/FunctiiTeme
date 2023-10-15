package ex13;

public class Transaction {
    private int id;
    private int amount;
    private State state ;

    public Transaction(int id, int amount, State state) {
        this.id = id;
        this.amount = amount;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", state=" + state +
                '}';
    }
}
