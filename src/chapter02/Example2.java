package chapter02;

/* Это еще один пример корткой программы
   Присвоить исходному файлу название Example.java  */
public class Example2 {
    public static void main(String[] args) {
        int num; // В этой строке объявляем переменную num

        num = 100; // здесь мы присваиваем значение 100 переменной num

        System.out.println("Это переменная num: " + num);

        num = num*2;

        System.out.print("Значение переменной num * 2 равно ");
        System.out.println(num);
    }

}
