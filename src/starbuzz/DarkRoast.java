package starbuzz;

public class DarkRoast extends Beverage {

    //menambah objek temp dari Beverage untuk menambah harga dari beverage tambahan dan harga beverage ini
    private Beverage temp;

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    //  Pak, terdapat penambahan cosntructor dengan parameter Beverage untuk menambah deskripsi dari beverage dan tambahannya
    public DarkRoast(Beverage beverage){
        if (beverage.getDescription().equalsIgnoreCase("Dark Roast Coffee"))
            this.description = "Double Dark Roast Coffee";
        else
            this.description = beverage.getDescription() + " Dark Roast Coffee";

        temp = beverage;
    }

    /*
        penambahan exception handling untuk harga awal beveraga dan tambahannya
    */
    public double cost() {
        try {
            return 0.99 + temp.cost();
        } catch (Exception any) {
            return 0.99;
        }
    }
}
