package chapter03;
// Демонстрируем применение значений типа Boolean
public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно: " + b);
        b = true;
        System.out.println("b равно: " + b);

        // значение типа boolean может управлять оператором  if

        if (b) System.out.println("Этот код выполняется");
        b = false;
        if (b) System.out.println("Этот код НЕ выполняется");

        // результат сравнения

        System.out.println("10 больше 9 равно: " + (10>9));
    }
}

