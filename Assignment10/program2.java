public class program2{
    public static void main(String[] args) {
        int number = 100;
        double value = 25.5;
        char letter = 'A';
        boolean status = true;
        Integer intObj = number;
        Double doubleObj = value;
        Character charObj = letter;
        Boolean boolObj = status;
        System.out.println("After Autoboxing:");
        System.out.println("Integer object = " + intObj);
        System.out.println("Double object = " + doubleObj);
        System.out.println("Character object = " + charObj);
        System.out.println("Boolean object = " + boolObj);
    }
}