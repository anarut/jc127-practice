package lesson10;

public class GenericAccount<T, N extends Number> {

    private String fullName;
    private T id;
    private N amount;

    public GenericAccount(String fullName, T id, N amount) {
        this.fullName = fullName;
        this.id = id;
        this.amount = amount;
    }

    public String getFullName() {
        return fullName;
    }

    public T getId() {
        if (id instanceof String  s) {
            //too
        } if (String.class.equals(id.getClass())) {

        }
        return id;
    }

    public N getAmount() {
        return amount;
    }

    public void setAmount(N amount) {
        this.amount = amount;
    }

    public <K> K todo(K obj) {
        System.out.println("");
        return obj;
    }
}
