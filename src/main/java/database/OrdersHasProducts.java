package database;
// Generated Feb 5, 2018 1:12:41 PM by Hibernate Tools 3.6.0



/**
 * OrdersHasProducts generated by hbm2java
 */
public class OrdersHasProducts  implements java.io.Serializable {


     private Integer id;
     private ShoppingCart shoppingCart;
     private Orders orders;
     private Products products;
     private double price;
     private int quantity;

    public OrdersHasProducts() {
    }

	
    public OrdersHasProducts(Products products, double price, int quantity) {
        this.products = products;
        this.price = price;
        this.quantity = quantity;
    }
    public OrdersHasProducts(ShoppingCart shoppingCart, Orders orders, Products products, double price, int quantity) {
       this.shoppingCart = shoppingCart;
       this.orders = orders;
       this.products = products;
       this.price = price;
       this.quantity = quantity;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public ShoppingCart getShoppingCart() {
        return this.shoppingCart;
    }
    
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    public Orders getOrders() {
        return this.orders;
    }
    
    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    public Products getProducts() {
        return this.products;
    }
    
    public void setProducts(Products products) {
        this.products = products;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}


