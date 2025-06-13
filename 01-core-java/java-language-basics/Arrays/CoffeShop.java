import java.util.Arrays;

public class CoffeShop {

    public static void main(String[] args) {

        // 1. Declare and initialize an array
        String[] coffeeMenu = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappuccino", "Freddo", "Lungo"
        };

        // 2. print the full menu using a for loop
        for (String coffeeItem : coffeeMenu) {
            System.out.println(coffeeItem);
        }

        System.out.println();

        // 3. copy part of the menu
        String[] featuredMenu = new String[5];

        System.arraycopy(coffeeMenu, 0, featuredMenu, 0, 5);

        // print the featuredMenu array
        for (String coffeeItem : featuredMenu) {
            System.out.println(coffeeItem);
        }


        System.out.println();

        // 4. copy last 3 coffee names in a new array and print
        String[] onSale = Arrays.copyOfRange(coffeeMenu, 7, 10);

        for (String coffeeItem : onSale) {
            System.out.println(coffeeItem);
        }

        System.out.println();

        // 5. sort the menu alphabetically
        Arrays.sort(coffeeMenu);
        System.out.println("Sorted Menu: " + Arrays.toString(coffeeMenu));

        System.out.println();

        // 6. Search for a coffee
        System.out.println("Cappuccino can be found at index: " + Arrays.binarySearch(coffeeMenu, "Cappuccino"));

        System.out.println();

        // 7. multidimensional array
        String[][] menuDetails = {
                {"Espresso", "Latte", "Mocha"},
                {"Small", "Medium", "Large"}
        };

        System.out.println("Menu Combinations: ");
        for (String coffeeType : menuDetails[0]) {
            for (String coffeeSize : menuDetails[1]) {
                System.out.println(coffeeType + " " + coffeeSize);
            }
        }




    }
}
