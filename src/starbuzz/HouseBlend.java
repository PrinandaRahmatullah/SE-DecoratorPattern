package starbuzz;

public class HouseBlend extends Beverage {

    //  menambah harga tambahan untuk menyimpan harga sementara
    private double costAdd;

    HouseBlend() {
        description = "House Blend Coffee";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    HouseBlend(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("House Blend Coffee"))
            this.description = "Double House Blend Coffee";
        else
            this.description = beverage.getDescription() + " House Blend Coffee";

        this.costAdd = beverage.cost();
    }

    // Penambahan method accessor getCostAdd
    private double getCostAdd(){
        return this.costAdd;
    }

    // Penambahan exception handling untuk harga awal beveraga dan tambahannya
    public double cost() {
        try {
            return 0.89 + getCostAdd();
        } catch (Exception any) {
            return 0.89;
        }
    }
}
