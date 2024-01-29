package herancaPolimorfismo.entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        // Mudança de String para StringBuilder:
        StringBuilder stb = new StringBuilder();
        stb.append(getName());
        stb.append( " $ ").append(String.format("%.2f", totalPrice()));
        stb.append( " (Customs fee: $ " ).append(String.format("%.2f", customsFee)).append(")");
        return stb.toString();
    }
}
