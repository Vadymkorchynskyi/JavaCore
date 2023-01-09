package chapter03;
// вычисляем среднее значение из массива
public class Average {
    public static void main(String[] args) {
    double nums[] = {2.34,4.65,1.77,4.67,2.39};
    double result = 0;
    int i = 1;
    for (i=0; i<5; i++){
        result = result + nums [i]; }
        System.out.println("среднее значение равно " + result/ 5);

    }

}
