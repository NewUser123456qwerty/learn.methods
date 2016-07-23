/*
Hello! This source code is Russian language!
Автор NewUser123456qwerty не несёт никакой ответственности
Он только учится программировать
На момент написания программы было 23 июля 2016 года, 12 часов, 06 минут
23.07.2016
12:06
Программа на языке Java
Изучаю курс по Java, вот url: http://www.fandroid.info/6-kurs-metody-v-java/
Создано с помощью IntelliJ IDEA Community Edition 2016.2
*/

// Класс (class) Main должен находиться в Main.java
public class Main {
    /*
    Начало работы программы
    Можно просто набрать "psvm" и нажать Enter
    String[] args - похоже массив строк с аргументами, мы это не прошли
    */
    public static void main(String[] args) {
        // Изучаем перегрузку (overloading) методов
        System.out.println(sum(5, 3));
        System.out.println(sum(5.3, 3.4));

        // Домашнее задание
        Student s = new Student();
        s.setFirstName("Carl");
        s.setMiddleName("CJ");
        s.setLastName("Johnson");
        String fullName = s.getFullName();
        System.out.println(fullName);
        // Кстати, какую игру я вспомнил? Пишите в комментариях

        // Изучаем переопределение (overriding) методов
        Advice a = new Advice();
        a.message();
    }

    /*
    Метод доступен откуда угодно, так как public
    Метод принадлежит классу Main, а не экземпляру, так как static
    Метод не возвращает ничего, так как void
    Метод имеет идентификатор foo
    И это метод, не принимающий ничего, а не переменная или константа, так как ()
    */
    public static void foo() {
        // Тело метода
    }

    // Для сложения целых чисел int
    public static int sum(int a, int b) {
        int x;
        x = a + b;
        return x;
    }

    // Для сложения числе с плавающей точкой (хотя в России используется запятая) double
    public static double sum(double a, double b) {
        double x;
        x = a + b;
        return x;
    }
}
