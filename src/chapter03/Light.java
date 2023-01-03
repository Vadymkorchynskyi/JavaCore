package chapter03;
// Вычисляем расстояние, проходимое светом
// Используем переменную типа Long
public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // Приблизительная скорость света (миль в секунду)
        lightspeed = 186000;
        days = 1000; //  указать количество дней
        seconds = days * 24*60*60; // преобразовали в секунды

        distance = lightspeed * seconds; // вычисляем расстояние

        System.out.print("За " + days);
        System.out.println(" дней свет пройдет около ");
        System.out.println(distance + " миль ");





    }
}
