package TD6_Images.src.color;

public class GrayColor{
    private final int grayLevel;
    private double alpha;

    public static final GrayColor WHITE = new GrayColor(255);
    public static final GrayColor BLACK = new GrayColor(0);

    public GrayColor(int level){
        this.grayLevel = level;
        this.alpha = 1;
    }
    
    public int getGrayLevel(){
        return this.grayLevel;
    }

    public double getAlpha(){
        return this.alpha;
    }

    public void setAlpha(double a){
        this.alpha = a;
    }

    public boolean equals(Object o){
        if (!(o instanceof GrayColor)){
            return false;
        }
        GrayColor other = (GrayColor) o;
        return this.grayLevel == other.grayLevel && this.alpha == other.alpha;
    }
}