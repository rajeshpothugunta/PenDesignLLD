package Model;

import Constants.Colour;
import Constants.PenType;

public abstract class Pen {
    private String name;
    private String company;
    private int price;
    private PenType type;

    public abstract void write();

    public abstract Colour getColour();

    public Pen(PenType penType){
        this.type=penType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PenType getType() {
        return type;
    }

    public void setType(PenType type) {
        this.type = type;
    }

    public static interface RefilPen {
        Refil getRefil();

        boolean canChangeRefil();

        void changeRefil(Refil newRefil);
    }
}
