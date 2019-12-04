package starbuzz;

public class HouseBlend extends Beverage {

    //  menambah objek temp dari Beverage untuk menambah harga dari beverage tambahan dan harga beverage ini
    private Beverage temp;

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    public HouseBlend(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("House Blend Coffee"))
            this.description = "Double House Blend Coffee";
        else
            this.description = beverage.getDescription() + " House Blend Coffee";

        temp = beverage;
    }

    /*
        penambahan exception handling untuk harga awal beveraga dan tambahannya
     */
    public double cost() {
        try {
            return 0.89 + temp.cost();
        } catch (Exception any) {
            return 0.89;
        }
    }
}
