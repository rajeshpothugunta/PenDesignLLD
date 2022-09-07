package Pens;

import Constants.Colour;
import Constants.PenType;
import Model.Pen;
import Model.Refil;

public class GelPen extends Pen implements Pen.RefilPen {
    private Refil refil;
    private boolean canChangeRefil = false;
    private GelPen() {
        super(PenType.GELL);
    }


    @Override
    public void write() {

    }
    public static class Builder{
        private Refil refil;
        private boolean canChangeRefil = false;

        public Builder setRefil(Refil refil){
            this.refil=refil;
            return this;
        }

        public Builder setcanChangeRefil(boolean value){
            this.canChangeRefil=value;
            return this;
        }
        public GelPen build(){
            GelPen gelPen = new GelPen();
            gelPen.refil=this.refil;
            gelPen.canChangeRefil=this.canChangeRefil;
            return gelPen;
        }

    }



    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public Refil getRefil() {
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
