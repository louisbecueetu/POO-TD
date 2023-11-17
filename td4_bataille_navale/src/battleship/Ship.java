package battleship;

public class Ship{
    /*number of life point */
    int lifePoints;

    /**
     * 
     * @param length
     */
    public Ship(int length){
        this.lifePoints = length;
    }

    /**
     * 
     * @return the life points
     */
    public int getLifePoints(){
        return this.lifePoints;
    }

    /**
     * 
     * @return
     */
    public boolean hasBeenSunk(){
        return true;
    }

    /**
     * 
     */
    public void beenHitting(){

    }

    /**
     * Returns a string representation of the object.
     */
    public String toString(){
        return " ";
    }
}