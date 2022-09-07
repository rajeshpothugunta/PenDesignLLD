package Pens;

public class Marker extends Pen implements RefilPen {
    public Marker() {
        super(PenType.MARKER);
    }

    @Override
    public void write() {

    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
