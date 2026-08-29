

public class Product_Inventory_CSV_Parser {

    static void parseProduct(String data) {

        String[] fields = data.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid format");
            return;
        }

        String product = fields[0];
        String sku = fields[1];
        String quantity = fields[2];

        System.out.println("Product: " + product
                + " | SKU: " + sku
                + " | Qty: " + quantity);
    }

    public static void main(String[] args) {

        parseProduct("Wireless Mouse,WM-2201,150");
        parseProduct("Keyboard,KB-1001");
    }
}