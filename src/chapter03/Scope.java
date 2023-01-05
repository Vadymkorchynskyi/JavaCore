package chapter03;
// демонстрация области действия
public class Scope {
    public static void main(String[] args) {
        int x; // эта переменная доступна всему классу
        x = 10;
        if (x == 10) { //начало новой области действия
            int y = 20; // доступна только этому блоку кода
            System.out.println(x + " " + y);
            x = y*2;
        }
       // System.out.println(x + " " + y); // как видим здесь У уже недоступна
    }
}
