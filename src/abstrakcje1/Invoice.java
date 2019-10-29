package abstrakcje1;

public class Invoice implements Payable {

    private String item;
    private int quantity;
    private double pricePerItem;

    @Override
    public double getPaymentAmount() {
        return quantity*pricePerItem;
    }

    public Invoice(String item, int quantity, double pricePerItem) {
        this.item = item;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", pricePerItem=" + pricePerItem +
                '}';
    }
}
