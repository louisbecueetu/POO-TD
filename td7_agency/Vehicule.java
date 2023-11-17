package td7_agency;
import java.util.Objects;


public class Vehicule {
    private String brand;
    private String model;
    private int productionYear;
    private double dailyRentalPrice;

    public Vehicule(String brand, String model, int productionYear, double dailyRentalPrice) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.dailyRentalPrice = dailyRentalPrice;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public double getDailyRentalPrice() {
        return this.dailyRentalPrice;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Vehicule)) {
            return false;
        }
        Vehicule other = (Vehicule) o;
        return Objects.equals(brand, other.brand)
                && Objects.equals(model, other.model)
                && productionYear == other.productionYear
                && Double.compare(dailyRentalPrice, other.dailyRentalPrice) == 0;
    }

    public String toString() {
        return "Vehicule{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", dailyRentalPrice=" + dailyRentalPrice +
                '}';
    }
}


    
        
