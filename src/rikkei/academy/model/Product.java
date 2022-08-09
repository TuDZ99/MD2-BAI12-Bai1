package rikkei.academy.model;

public class Product implements Comparable<Product>{
    private int id;
    private  String name;
    private int price;

    public Product(int id, int i, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.price-o.price;
    }
}
