package chapter03;
// эту прогу нельзя скомпилировать
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
           // int bar = 2; // создается новая область действия но переменная bar
                            // уже определена!
        }
    }
}
