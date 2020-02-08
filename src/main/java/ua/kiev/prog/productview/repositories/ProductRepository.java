package ua.kiev.prog.productview.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.kiev.prog.productview.models.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {
}
