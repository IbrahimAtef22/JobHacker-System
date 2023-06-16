import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    private int product_id;
    private String product_name;
    private String category;
    private double price;

    public Product() {
        System.out.println(withPrice(240.58));

    }

    public Product(int product_id, String product_name, String category, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.category = category;
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public static List<Product> addDummyData()
    {
        List<Product> products = new ArrayList<>();
        Collections.addAll(products,
                new Product(1, "omnis quod consequatur", "Games", 184.83),
                new Product(2, "vel libero suscipit", "Toys", 12.66),
                new Product(3, "non nemo iure", "Grocery", 498.02),
                new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80),
                new Product(5, "animi cum rem", "Games", 458.20),
                new Product(6, "dolorem porro debitis", "Toys", 146.52),
                new Product(7, "aspernatur rerum qui", "Books", 656.42),
                new Product(8, "deleniti earum et", "Baby", 41.46),
                new Product(9, "voluptas ut quidem", "Books", 697.57),
                new Product(10, "eos sed debitis", "Baby", 366.90),
                new Product(11, "laudantium sit nihil", "Toys", 95.50),
                new Product(12, "ut perferendis corporis", "Grocery", 302.19),
                new Product(13, "sint voluptatem ut", "Toys", 295.37),
                new Product(14, "quos sunt ipsam", "Grocery", 534.64),
                new Product(15, "qui illo error", "Baby", 623.58),
                new Product(16, "aut ex ducimus", "Books", 551.39),
                new Product(17, "accusamus repellendus minus", "Books", 240.58),
                new Product(18, "aut accusamus quia", "Baby", 881.38),
                new Product(19, "doloremque incidunt sed", "Games", 988.49),
                new Product(20, "libero omnis velit", "Baby", 177.61),
                new Product(21, "consectetur cupiditate sunt", "Toys", 95.46),
                new Product(22, "itaque ea qui", "Baby", 677.78),
                new Product(23, "non et nulla", "Grocery", 70.49),
                new Product(24, "veniam consequatur et", "Books", 893.44),
                new Product(25, "magnam adipisci voluptate", "Grocery", 366.13),
                new Product(26, "reiciendis consequuntur placeat", "Toys", 359.27),
                new Product(27, "dolores ipsum sit", "Toys", 786.99),
                new Product(28, "ut hic tempore", "Toys", 316.09),
                new Product(29, "quas quis deserunt", "Toys", 772.78),
                new Product(30, "excepturi nesciunt accusantium", "Toys", 911.46)
        );
        return products;
    }

    public Product withPrice(double price){
        List<Product> bookList = addDummyData().stream()
                .filter(p -> p.category.equals("Books"))
                .collect(Collectors.toList());

        Stream<Product> result = bookList.stream().filter(p -> p.getPrice() == price);


        if (result != null){
            return result.findFirst().get();
        }else {
            this.setPrice(price);
            return new Product(this.getProduct_id(), this.getProduct_name(), this.getCategory(), this.getPrice());
        }

    }
    public static void main(String[] args) {
        // Obtain a list of products belongs to category “Books”
        System.out.println("****** Products List belongs to category 'Books' ******");
        List<Product> bookList = addDummyData().stream()
                .filter(p -> p.category.equals("Books"))
                .collect(Collectors.toList());
        for(Product product : bookList){
            System.out.println(product);
        }
        System.out.println();

        // Obtain a list of products belongs to category “Books” with price > 100
        System.out.println("****** Products List belongs to category 'Books' with price > 100 ******");
        List<Product> bookListWithSpecificPrice = addDummyData().stream()
                .filter(p -> p.category.equals("Books") && p.price > 100)
                .collect(Collectors.toList());
        for(Product product : bookListWithSpecificPrice){
            System.out.println(product);
        }
        System.out.println();

        // Obtain a list of product with category = “Toys” and then apply 10% discount
        System.out.println("****** Products List belongs to category 'Toys' applying 10% discount ******");
        List<Product> ToysListApplyingDiscount = addDummyData().stream()
                .filter(p -> p.category.equals("Toys"))
                .collect(Collectors.toList());

        for(Product product : ToysListApplyingDiscount){
            product.price = product.getPrice() - .10 * product.getPrice();
            System.out.println(product);
        }
        System.out.println();

        // Get the cheapest products of “Books” category
        System.out.println("Get the cheapest products of “Books” category");
        new Product();




    }
}
