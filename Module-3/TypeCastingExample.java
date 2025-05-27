public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 45.67;
        int i = (int) d;

        int j = 100;
        double dj = j;

        System.out.println("Double to int: " + i);
        System.out.println("Int to double: " + dj);
    }
}
