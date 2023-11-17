package zoo;

public class Elephant implements Animals{
    private int poids;
    private int nblegs;
    private  boolean carnivorous;
    
    public Elephant (int poids){
        this.poids = poids;
        this.nblegs = 4;
        this.carnivorous = false;
    }

    public int getNbLegs(){
        return this.nblegs;
    }

    public boolean getCarnivorous(){
        return this.carnivorous;
    }
}