package td7_agency;
import td7_agency.*;
import java.util.List;

public class RentalAgnecyMain {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Vehicule someVehicule = new Vehicule("Timo", "Leon", 1920, 100);
        agency.addVehicule(someVehicule);
        try{
            agency.removeVehicule(someVehicule);
            System.out.println("vehicule removed");
        }
        catch(UnknownVehiculeException e){
            System.out.println("vehicule not found");
        }
        RentalAgency a = new RentalAgency();
        Vehicule V1 = new Vehicule("Timo", "Leon", 1920, 100);
        List<Vehicule> l1 = a.select(new FilterPriceMax(50));
        
    }
    
}
