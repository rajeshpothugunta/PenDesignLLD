import Model.Refil;
import Pens.GelPen;

public class Client {
    public static void main(String[] args) {

        GelPen gelPen=PenFactory.createGelPen()
                .setcanChangeRefil(true)
                .setRefil(new Refil())
                .build();
    }
}
