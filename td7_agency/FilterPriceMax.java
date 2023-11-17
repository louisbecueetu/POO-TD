package td7_agency;

public class FilterPriceMax implements Filter {
    private int price;
    
    public FilterPriceMax(int price){
        this.price = price;
    }

    public boolean isValid(Vehicule v){
        return v.getDailyRentalPrice() < this.price;
    }
    
}
