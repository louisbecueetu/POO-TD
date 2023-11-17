package TD6_Images.src;

public interface ImageInterface {
    
    /**
     * return width of the image
     * @return width of the image
     */
   public int getWidth();

   /**
     * return height of the image
     * @return width of the image
     */
   public int getHeight();

   /**
    * get the pixel at coord (x,y) of the iamge. (0,0) is top left corner pixel.
    * @param x the horizontale coordinate
    * @param y the verticale coordinate
    * @return pixel at coord (x,y) of this image. (0.0) is top left corner pixel.
    * @exception UnknowPixelException if coord (x,y) is not valid for the image
    */
    public Pixel getPixel(int x, int y)throws UnknowPixelException;
    
}
