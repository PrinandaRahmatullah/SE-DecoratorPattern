package starbuzz;

public class Decaf extends Beverage {

    //  menambah harga tambahan untuk menyimpan harga sementara
    private double costAdd;

    Decaf() {
        description = "Decaf Coffee";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    Decaf(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("Decaf Coffee"))
            this.description = "Double Decaf Coffee";
        else
            this.description = beverage.getDescription() + " Decaf Coffee";

        this.costAdd = beverage.cost();
    }

    // Penambahan method accessor getCostAdd
    private double getCostAdd(){
        return this.costAdd;
    }

    // Penambahan exception handling untuk harga awal beveraga dan tambahannya
    public double cost() {
        try {
            return 1.05 + getCostAdd();
        } catch (Exception any) {
            return 1.05;
        }
    }
}
