package battleship;
import util.Position;

public class Sea {
    private int dx;
    private int dy;
    private Cell[][] sea;

    public Sea (int row, int col){
        this.dx = col;
        this.dy = row;
        this.sea = new Cell[row][col];
        for (int i=0; i < this.sea.length; i++){
            for (int j=0; i < this.sea[0].length; j++){
                this.sea[i][j] = new Cell();
            }
        }
    }

    /**
     * 
     * @param s
     * @param p
     */
    public void addShip(Ship s, Position p){

    }

    /**
     * Shoot somewhere in the sea
     * @param p position to shoot
     * @return Answer of the shoot
     * @throws InvalidShootException if positon out of sea
     */
    public Answer shoot(battleship.util.Position p) throws InvalidShootException{
        if ((p.getX()<0)||(p.getY()<0)||(p.getX()>=this.dx)||(p.getY()>=this.dy)){
            throw new InvalidShootExceotion();
        }
        return this.sea[p.getX()][p.getY()].shot();
    }

}