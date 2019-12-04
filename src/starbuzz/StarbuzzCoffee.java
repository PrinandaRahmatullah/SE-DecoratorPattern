package starbuzz;

import java.text.DecimalFormat;

public class StarbuzzCoffee {

    private static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {
//      MENU
        System.out.println("<---MENU--->");
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " $ " + houseBlend.cost());

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $ " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " $ " + darkRoast.cost());

        Beverage decaf = new Decaf();
        System.out.println(decaf.getDescription() + " $ " + decaf.cost());

        System.out.println("\n");

//      PESANAN
        Beverage beverage = new Espresso();
        beverage = new Espresso(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " --> $ " + df.format(beverage.cost()));

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Espresso(beverage1);
        beverage1 = new Milk(beverage1);
        beverage1 = new DarkRoast(beverage1);

        System.out.println(beverage1.getDescription() + " --> $ " + df.format(beverage1.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Decaf(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);

        System.out.println(beverage2.getDescription() + " --> $ " + df.format(beverage2.cost()));

        Beverage beverage3 = new Decaf();
        beverage3 = new Decaf(beverage3);

        System.out.println(beverage3.getDescription() + " --> $ " + df.format(beverage3.cost()));
    }
}
