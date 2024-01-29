package herancaPolimorfismo.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        StringBuilder stb = new StringBuilder();
        stb.append(getName());
        stb.append(" (used) $ ").append(String.format("%.2f", getPrice()));
        stb.append(" (Manufacture date: ")
                .append(manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .append(")");
        return stb.toString();
    }

}
