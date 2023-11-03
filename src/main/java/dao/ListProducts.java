package dao;

import models.Product;

public class ListProducts implements ProductsDao {

    private List<Product> products;


    public ListProducts(){
        insert(new Product("flux capacitor"), 100.99));
    }
    public List<Product> all() {
        return this.product;
    }

    @Override
    public void insert(Product product) {

    }
}
