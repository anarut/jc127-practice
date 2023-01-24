package lesson10;

public class Account {

    private String fullName;
    private Integer id;
    private Integer amount;

    public Account(String fullName, Integer id, Integer amount) {
        this.fullName = fullName;
        this.id = id;
        this.amount = amount;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
