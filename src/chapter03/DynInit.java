package chapter03;
// демонстируем динамическую инициализацию
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;
        // динамическая инициализация переменнной с

        double c = Math.sqrt(a*a + b*b);
        System.out.println("Гипоенуза равна: " + c);
    }
}
