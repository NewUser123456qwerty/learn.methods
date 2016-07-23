// Класс Advice, который расширяет (extends) Though
public class Advice extends Though {
    // Писать @Override необязательно с пятой версии (Java или JDK)
    @Override
    // Но желательно
    public void message() {
        // Переопределение метода
        // Теперь он выводит sout "Advice.message"

        System.out.println("Advice.message");
        // Вызываем super метод, который мы переопределили выше
        super.message();
    }
}
