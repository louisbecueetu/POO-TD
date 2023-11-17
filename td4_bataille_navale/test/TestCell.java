import java.beans.Transient;

public class TestCell {
    @Test
    public void testCAnShotAndMissed(){
        Cell cell = new Cell(){
            assert(cell.shot()=Answer.MISSED);
        }
    }

    @Test
    public void ShotTestHit(){
        Cell c = new Cell();
        Ship s = new Ship(2);
        c.setShip(s);
        assertEquals(Answer.HIT, c.shot());
    }

    @Test
    public void testSecondShotIsMissed(){
        Cell c = new Cell();
        Ship s = new Ship(2);
        c.setShip(s);
        c.shot();
        assertEquals(c.shot(),Answer.MISSED);
    }

    @Test
    public void testShootInLimits(){

    }

    @Test 
    public void ShootOffLimits(){
        assert Throws(InvalidShootExceotion.class, ())
    }

    @Test 
    public void testShootIsHIT(){
        
    }
}
