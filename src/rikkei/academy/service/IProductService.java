package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    List<Product> sortByPrice();
    void save(Product product);
}
