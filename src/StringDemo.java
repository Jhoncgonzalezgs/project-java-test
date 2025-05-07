// --------------------------------------- Trabajar Con Cadenas ---------------------------------------
public class StringDemo {
    public static void main(String[] args){
        String greeting = "Hello";
        String name = "Alice";
        String messaje = greeting + ", " + name + "!";
        System.out.println(messaje);
        System.out.println("The length of the messaje is: " + messaje.length());
        System.out.println("The first character is: " + messaje.charAt(0));
        System.out.println("Uppercase messaje: " + messaje.toUpperCase());
        System.out.println("First five characters: " + messaje.substring(0, 5));
    }
}
