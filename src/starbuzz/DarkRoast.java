package starbuzz;

public class DarkRoast extends Beverage {

    ///  menambah harga tambahan untuk menyimpan harga sementara
    private double costAdd;

    DarkRoast() {
        description = "Dark Roast Coffee";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    DarkRoast(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("Dark Roast Coffee"))
            this.description = "Double Dark Roast Coffee";
        else
            this.description = beverage.getDescription() + " Dark Roast Coffee";

        this.costAdd = beverage.cost();
    }

    // Penambahan method accessor getCostAdd
    private double getCostAdd(){
        return this.costAdd;
    }

    // Penambahan exception handling untuk harga awal beveraga dan tambahannya
    public double cost() {
        try {
            return 0.99 + getCostAdd();
        } catch (Exception any) {
            return 0.99;
        }
    }


}
