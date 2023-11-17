package battleship;

public class Cell {
    private Ship ship;
    private boolean shot;
    
    /**
     * 
     * @return
     */
    public Cell(){

    }

    /**
     * 
     * @return
     */
    public Ship getShip(){
        return this.ship;
    }
        
    /**
     * 
     * @return
     */
    public Void setShip(Ship ship){

    }

    /**
     * 
     * @return
     */
    public boolean hasBeenShot(){

    }

    /**
     * 
     * @return
     */
    public Answer shot (){
        if ((this.shot)||(this.ship == null)){
            this.shot =true;
            return Answer.MISSED;
        }
        if ((this.ship.lifePoints-1)==0){
            this.ship.beenHitting();
            this.shot= true;
            return Answer.SUNK;
        }
        else{
            this.ship.beenHitting();
            this.shot = true;
            return Answer.HIT;
        }
}
}
