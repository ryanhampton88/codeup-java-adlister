package dao;
import java.util.*;

import models.Product;

public interface ProductsDao {
    List<Product> all();
    void insert(Product product);

}
