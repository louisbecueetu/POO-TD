package TD6_Images.src;

public class Image implements ImageInterface{
    private Pixel[][] pixels;

    public int getWidth(){
        return this.pixels.length;
    }

    public int getHeight(){
        return this.pixels[0].length;
    }

    public Pixle getPixel(int x, int y)throws UnkonwnPixelException{
        try{
            return this.pixels[x][y];
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw  UnkonwnPixelException()};
    }


}
