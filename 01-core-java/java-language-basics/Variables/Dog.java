public class Dog {

    // instance variable (each dog has its own name)
    String name;

    // class variable (shared by all dogs)
    static String species = "Canis lupus familiaris";

    // constructor
    public Dog(String name) {
        this.name = name;
    }

    // method with local variables
    public void bark() {
        // local variables used only in this method
        String sound = "woof";
        System.out.println(name + " says " + sound);
    }

    // method that uses a parameter
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public static void main(String[] args){
        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Max");

        d1.bark();
        d1.eat("chicken");

        d2.bark();
        d2.eat("beef");

        System.out.println("Species: " + Dog.species); //shared class variable
    }


}
