package services;

//entity imports
import entities.Product;

//class java import
import java.util.ArrayList;


public class Stock {
    //arraylist of entiti product
    private ArrayList<Product> products;

    //constructor
    public Stock() {
        this.products = new ArrayList<>();
    }


    //methods
    public void addProduct(Product product) {
        if (product == null) {
            return;
        }
        //valida se o produto criado possui nome igual se sim barra se nao aceita aadicao
        for (Product item : products) {
            if( item.getName().equalsIgnoreCase(product.getName())) {
                return;
            }
        }
        products.add(product);
    }
    //compara se nome -- null dep valida se item  name - name enviado pelo input
    public Product findProduct(String name) {
        if (name == null) {
            return null;
        }
        for (Product item : products) {
            if( item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    //remove o produto
    public void removeProduct(String name) {
        //delcara produto produto = product name do metodo anterior, remocao de produto ocorre com o item inteiro nao em quantidade.
        Product product = findProduct(name);

        //remocao de produto
        if (product != null) {
            products.remove(product);
        }

    }
    //calcular o total
    public double calcTotalStockValue() {
        double total =0;
        //detecta a arraylist e calcula o value stock com base em items. ou seja numero de items
        for (Product items : products) {
            total += items.calcValueStock();
        }
        return  total;
    }

    public Product mostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }
        Product mostExpensive = products.get(0);

        for (Product items : products) {
            //pega o preco dos items compara com a variavel do produto 0 e atualiza
            if (items.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = items; //atualiza o mais caro
            }
        }
        return mostExpensive;
    }


}
