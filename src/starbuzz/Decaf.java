package starbuzz;

public class Decaf extends Beverage {

    //menambah objek temp dari Beverage untuk menambah harga dari beverage tambahan dan harga beverage ini
    private Beverage temp;

    public Decaf() {
        description = "Decaf Coffee";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    public Decaf(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("Decaf Coffee"))
            this.description = "Double Decaf Coffee";
        else
            this.description = beverage.getDescription() + " Decaf Coffee";

        temp = beverage;
    }

    /*
        penambahan exception handling untuk harga awal beveraga dan tambahannya
    */
    public double cost() {
        try {
            return 1.05 + temp.cost();
        } catch (Exception any) {
            return 1.05;
        }
    }
}
