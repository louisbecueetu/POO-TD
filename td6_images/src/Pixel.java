package TD6_Images.src;

import TD6_Images.src.color.GrayColor;

public class Pixel {
    private GrayColor color;

    public Pixel(GrayColor color){
        this.color = color;
    }

    public Pixel(int level){
        this.color = new GrayColor(level);
    }

    public GrayColor getColor(){
        return this.color;
    }
    
    public void setColor(GrayColor other){
        this.color = other;
    }

    public int colorLevelDifference(Pixel other){
        return Math.abs(this.color.getGrayLevel()-other.color.getGrayLevel());
    } 

    public boolean equals(Object o){
        if(!(o instanceof Pixel)){
            return false;
        }
        Pixel other = (Pixel) o;
        return this.color.equals(other.color);
    }
}
