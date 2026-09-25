public class program3{
    public static void main(String[] args) {
        Integer intObj = 100;
        Double doubleObj = 25.5;
        Character charObj = 'A';
        Boolean boolObj = true;
        int number = intObj;
        double value = doubleObj;
        char letter = charObj;
        boolean status = boolObj;
        System.out.println("After Unboxing:");
        System.out.println("int value = " + number);
        System.out.println("double value = " + value);
        System.out.println("char value = " + letter);
        System.out.println("boolean value = " + status);
    }
}