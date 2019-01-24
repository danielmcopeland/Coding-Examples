import java.util.Arrays;

public class ShoppingCart {

    private float totalPrice;
    private int numberOfItems;

    public float getTotalPrice() {
        return totalPrice;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void addItems(float price, int numberOfItems) {
        this.totalPrice += price;
        this.numberOfItems += numberOfItems;
    }

    public void addItems(float price) {
        this.totalPrice += price;
        this.numberOfItems++;
    }

    public void addItems(Item singleItem) {
        this.totalPrice += singleItem.getPrice();
        this.numberOfItems++;
    }
    public void addItems(Item... list) {
        Arrays.stream(list).forEach(one -> {
            this.numberOfItems++;
            this.totalPrice+=one.getPrice();
        });

    }
}