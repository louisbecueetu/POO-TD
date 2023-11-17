package TD6_Images.test;

public class ImageTest{
    
    @Test 
    public void stateIsCorrrectAtCreation(){
        Image img = new Image (200, 250);
        assertEquals(img.getWidth(), 200);
        assertEquals(img.getHeight(), 255);
        Pixel blanc = newPixel(GrayColor.WHITE);
        for(int x=0; x<getWidth(); x++){
            for(int y=0; y<getHeight(); y++){
                assertTrue(img.getPixel(x,y).equals(blanc))
            }}
    }

    @Test
    public void testChangeColorPixel()throws Exception{
        // change la couleur d'un pixel et verifie le changement
    }

    @Test
    public void testUnknowPixelException(){
        // assertThrows(UnknowPixelException.class, ()-> [...])
    }

    @Test 
    public void testFillRectangl(){

    }

    @Test 
    public void testFillRectanglWithInvalidCoordinate(){

    }

}
