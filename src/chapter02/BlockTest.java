package chapter02;

/* Демонстрация применения блока кода
   расширение java автоматически присваивается в этом IDE */
public class BlockTest {
    public static void main(String[] args) {
        int x,y;
        y=20;

        //адресатом этого оператора служит блок кода
        for (x=0; x<10; x++){
            System.out.println("Значение х: " + x);
            System.out.println("Значение у: " + y);
            y=y-2;

        }
    }
}
