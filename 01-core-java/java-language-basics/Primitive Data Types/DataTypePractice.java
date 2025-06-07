public class DataTypePractice {

    // declare fields for each of the 8 primitive data types + String
    static byte byteType;
    static short shortType;
    static int intType;
    static long longType;
    static float floatType;
    static double doubleType;
    static char charType;
    static boolean booleanType;
    static String stringType;

    public static void main(String[] args) {

        // print the default value of the declared fields
        System.out.println("Default values:");
        System.out.println("byte: " + byteType);
        System.out.println("short: " + shortType);
        System.out.println("int: " + intType);
        System.out.println("long: " + longType);
        System.out.println("float: " + floatType);
        System.out.println("double: " + doubleType);
        System.out.println("char: " + charType);
        System.out.println("boolean: " + booleanType);
        System.out.println("string: " + stringType);

        // declare local variables with literals
        int decimal = 1_000;
        int hex = 0x1a;
        int binary = 0b11010;
        float scientific = 1.23e2f;
        char c = 'C';
        String message = "SÍ Señor";

        System.out.println("Literals:");
        System.out.println("int (decimal): " + decimal);
        System.out.println("int (hex): " + hex);
        System.out.println("int (binary): " + binary);
        System.out.println("float (scientific): " + scientific);
        System.out.println("char: " + c);
        System.out.println("string: " + message);

        // use class literals
        printClassName(String.class);
        printClassName(int.class);
        printClassName(DataTypePractice.class);

    }

    // method to print class names
    static void printClassName(Class<?> cls){
        System.out.println("Class name: " + cls.getName());
    }

}
