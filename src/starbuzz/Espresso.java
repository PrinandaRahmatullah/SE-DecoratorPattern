package starbuzz;

public class Espresso extends Beverage {

    //  menambah harga tambahan untuk menyimpan harga sementara
    private double costAdd;

    Espresso() {
        description = "Espresso";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    Espresso(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("Espresso"))
            this.description = "Double Espresso ";
        else
            this.description = beverage.getDescription() + " Espresso";

        this.costAdd = beverage.cost();
    }

    // Penambahan method accessor getCostAdd
    private double getCostAdd(){
        return this.costAdd;
    }

    // Penambahan exception handling untuk harga awal beveraga dan tambahannya
    public double cost() {
        try {
            return 1.99 + getCostAdd();
        } catch (Exception any){
            return 1.99;
        }
    }



}
