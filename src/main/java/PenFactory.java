import Pens.GelPen;

public class PenFactory {
    public static GelPen.Builder createGelPen(){
        return new GelPen.Builder();
    }
}
