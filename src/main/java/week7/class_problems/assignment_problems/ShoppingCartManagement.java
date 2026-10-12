public class ShoppingCartManagement {
    static class Cart { private final double[] prices; private int count; private final String cartId; Cart(String cartId, int size) { this.cartId = cartId; prices = new double[size]; } void addItem(double price) { if (count < prices.length) prices[count++] = price; } double getTotal() { double total = 0; for (int i = 0; i < count; i++) total += prices[i]; return total; } int getItemCount() { return count; } }
    public static void main(String[] args) { Cart cart = new Cart("CART-5", 20); cart.addItem(250); cart.addItem(99); cart.addItem(151); System.out.println("Total: " + cart.getTotal()); System.out.println("Item count: " + cart.getItemCount()); }
}
