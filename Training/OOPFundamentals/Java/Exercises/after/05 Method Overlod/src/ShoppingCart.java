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
        this.addItems(price, 1);
    }

    public void addItems(Item item) {
        float itemPrice = item.getPrice();
        this.addItems(itemPrice);
    }

    public void addItems(Item... list) {
        for(Item item : list) {
            this.addItems(item);
        }
    }

}
