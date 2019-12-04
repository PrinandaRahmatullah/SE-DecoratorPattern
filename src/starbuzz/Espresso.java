package starbuzz;

public class Espresso extends Beverage {

    //  menambah objek temp dari Beverage untuk menambah harga dari beverage tambahan dan harga beverage ini
    private Beverage temp;

    public Espresso() {
        description = "Espresso";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    Espresso(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("Espresso"))
            this.description = "Double Espresso ";
        else
            this.description = beverage.getDescription() + " Espresso";

        temp = beverage;
    }

    /*
        penambahan exception handling untuk harga awal beveraga dan tambahannya
     */
    public double cost() {
        try {
            return 1.99 + temp.cost();
        } catch (Exception any){
            return 1.99;
        }
    }



}
