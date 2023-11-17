package td7_agency;
import td7_agency.*;
import java.util.*;

public class RentalAgency {
    private List <Vehicule> all;
    private Vehicule[] all;
    
    public RentalAgency(){
        this.all = new ArrayList<Vehicule>();
    }
    
    /* Q2 */
    public void addVehicule(Vehicule v){
        this.all.add(v);
    }

    /* Q3 */
    public void display(){
        for(Vehicule v : this.all){
            System.out.println(v);
        }
    }

    public void displayV2(){
        Intenter<Vehicule> it = this.all.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    /* Q4 */
    public void removeVehicule(Vehicule v)throws UnknownVehiculeException{
        if(!this.all.contains(v)){
            throw new UnknownVehiculeException();
        }
        this.all.remove(v);
    }

    /* Q6 */
    public List<Vehicule> selectByMaxPrice100(){
        List<Vehicule> res = new ArrayList<Vehicule>();
        for (Vehicule v : this.all){
            if(v.getDailyRentalPrice() < 100){
                res.add(v);
            }
        }
        return res;
    }

    /* Q7 */
    public List<Vehicule> selectByBrandTimoleon(){
        List<Vehicule> res = new ArrayList<Vehicule>();
        for (Vehicule v : this.all){
            if(v.getBrand().equals("Timoleon")){
                res.add(v);
            }
        }
        return res;
    }    

    /* Q8 */
    /* on utilie une interface pour factoriser le code des 2 fonctions précédentes */
    public List<Vehicule> select(Filter filter){
        List<Vehicule> res = new ArrayList<Vehicule>();
        for (Vehicule v : this.all){
            if(filter.isValid(v)){
                res.add(v);
            }
        }
        return res;
    }
}
