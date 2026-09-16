package model;

public class Product {
    private String name;
    private double price;
    private Integer quantity;

    //construtor
    public Product(String name, double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public double stock() {
        return quantity * price;
    }

    public void addOnStock(Integer addProduct) {
        quantity += addProduct;
    }
    public void removeOnStock(Integer removeProduct) {
        quantity -= removeProduct;
    }

    public void showProductInfo() {
        System.out.println("Informacoes do produto cadastrado");
        System.out.println("Produto: " + name);
        System.out.println("Preco: " + price);
        System.out.println("Estoque: " + quantity);
    }

}

