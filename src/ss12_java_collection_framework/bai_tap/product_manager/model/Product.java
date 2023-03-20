package ss12_java_collection_framework.bai_tap.product_manager.model;

public class Product {
    private int id;
    private String name;
    private float price;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + id +
                ", Tên sản phẩm: " + name +
                ", Giá sản phẩm: " + price + " VND";
    }
}
