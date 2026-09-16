public class Car {

    private double buyPrice;
    private double sellPrice;
    private String brandName;
    private String model;
    private String isNew;
    private int yearOfLaunch;

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public int getYearOfLaunch() {
        return yearOfLaunch;
    }

    public void setYearOfLaunch(int yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }

    public void informations() {

        System.out.println("\n=== INFORMACOES DO VEICULO ===");

        System.out.println("Marca: " + brandName);
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + yearOfLaunch);
        System.out.println("Novo: " + isNew);
        System.out.println("Preco de compra: " + buyPrice);
        System.out.println("Preco de venda: " + sellPrice);
    }

}
