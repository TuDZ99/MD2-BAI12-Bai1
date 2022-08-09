package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1, 50 ,"Oishi"));
        productList.add(new Product(2, 80 ,"Lavie"));
        productList.add(new Product(3, 100 ,"Orion"));
        productList.add(new Product(4, 10 ,"royal Tea"));
    }

    @Override
    public  List<Product> sortByPrice() {
        Collections.sort(productList);
        return productList;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

}
