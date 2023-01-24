package lesson10;

public class StringIdAccount {

    private String fullName;
    private String id;
    private Integer amount;

    public StringIdAccount(String fullName, String id, Integer amount) {
        this.fullName = fullName;
        this.id = id;
        this.amount = amount;
    }

    public String getFullName() {
        return fullName;
    }

    public String getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
