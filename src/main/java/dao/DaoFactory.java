package dao;

public class DaoFactory {

    private static ProductsDao productsDao;

    public static ProductsDao getProductsDao () {
        if (productsDao == null) {
            productsDao = new ListProducts();
        }
        return productsDao;
    }
}
