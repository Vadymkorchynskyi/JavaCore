package chapter03;
// срок действия переменной
public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x<3; x++) {
            int y = -1;// переменная у инициализируется при каждом вхождении в блок кода
            System.out.println("у равно " + y); // здесь всегда будет выводиться -1
            y = 100;
            System.out.println("у теперь равно: " + y);

        }
    }
}
