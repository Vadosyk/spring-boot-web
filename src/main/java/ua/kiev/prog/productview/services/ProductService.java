package ua.kiev.prog.productview.services;

import ua.kiev.prog.productview.models.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
