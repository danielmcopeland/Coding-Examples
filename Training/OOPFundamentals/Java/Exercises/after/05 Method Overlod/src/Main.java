
public class Main {

	public static void main(String[] args) {
		ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item(10.5f);
        Item item2 = new Item(20.75f);
        Item item3 = new Item(9.99f);
        Item item4 = new Item(14f);
        Item item5 = new Item(100f);
        Item item6 = new Item(55.5f);

        shoppingCart.addItems(item1);
        shoppingCart.addItems(item2, item3, item4, item5, item6);
        shoppingCart.addItems(33.5f);
        shoppingCart.addItems(50f, 2);

        System.out.println(shoppingCart.getNumberOfItems() + " items were added,"
                + " with a total price of $" + shoppingCart.getTotalPrice());
	}

}
