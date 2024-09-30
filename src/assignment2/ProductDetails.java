package assignment2;

public class ProductDetails {
    int product_id;
    String product_name;
    double product_price;

    public ProductDetails(int product_id, String product_name, double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    void display(){
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Price: " + product_price);
    }

    public static void main(String[] args) {
        ProductDetails[] product = new ProductDetails[5];
        product[0] = new ProductDetails(1, "lenovo", 100000.0);
        product[1] = new ProductDetails(2, "Dell", 200000.0);
        product[2] = new ProductDetails(3, "apple", 500000.0);
        product[3] = new ProductDetails(4, "HP", 450000.0);
        product[4] = new ProductDetails(5, "samsung", 550000.0);

        for (ProductDetails prod : product) {
            prod.display();
            System.out.println();
        }
    }
}

