public class Moeda {
    private String nome;
    private float valor;
    private float buyValue;

    public void setBuyValue(float buyValue) {
        this.buyValue = buyValue; // 'this' diferencia o atributo do parâmetro
    }

    public float getBuyValue() {
        return buyValue;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void calcMoeda() {
        float conversionTotals = (valor % buyValue);
        System.out.println("O total de " + nome + " que voce vai receber e de: " + conversionTotals);
    }
}