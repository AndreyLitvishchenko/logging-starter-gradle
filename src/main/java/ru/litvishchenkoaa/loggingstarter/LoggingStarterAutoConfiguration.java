package ru.litvishchenkoaa.loggingstarter;

public class LoggingStarterAutoConfiguration {

    public static void println(String input) {
        System.out.println("Выведено из gradle библиотеки" + input);
    }
}
