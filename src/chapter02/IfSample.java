package chapter02;

/* Продемонстрировать применение условноо оператора if
   Присвоить исходному файлу имя IfSample.java */
public class IfSample {
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=20;

        if (x<y) System.out.println("x меньше у");

        x=x*2;
        if (x==y) System.out.println("x теперь равно у");

        x=x*2;
        if (x>y) System.out.println("x теперь больше у");

        // Этот оператор не будет ничего выводить
        if (x==y)
        System.out.println("Вы не увидите этого");

    }
}
