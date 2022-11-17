public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass!");
        System.out.println("Primitive Data Types: String ");
        System.out.println();
        //String
        //The String is a datatype in Java, which is NOT a primitive type. It's actually a Class,
        //but it enjoys a bit of favoritism in Java to make it easier to use than a regular class.

        //Previous Data Types Covered
        /*
        1. byte
        2. short
        3. int
        4. long
        5. float
        6. double
        7. char
        8. boolean
        */

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9";
        System.out.println("myString is equal to unicode char: " + myString);

        String numberString = "250.55";
        numberString = numberString +  "49.95";
        System.out.printf(numberString);

    }
}