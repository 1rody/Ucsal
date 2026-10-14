package entities;

public class Product {
    //variables
    private String name;
    private String description;
    private Integer quantity;
    private double price;

    //constructor
    public Product(String name, String description, Integer quantity, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    //methods

    public double calcValueStock() {
        double stockTotals = quantity * price;
        return stockTotals;
    }

    public String addQuantity(Integer addQTD) {
        if( addQTD > 0) {
            quantity += addQTD;
            return "Operacao realizada com sucesso.";
        } else {
            return "Operacao invalida.";
        }
    }

    public String removeQuantity(Integer removeQTD) {
        if( removeQTD > 0 && removeQTD <= quantity) {
            quantity -= removeQTD;
            return "Operacao realizada com sucesso.";
        } else {
            return "Operacao invalida.";
        }
    }

    @Override
    public String toString() {
        return "PRODUCT{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
