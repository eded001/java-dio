package aulas.enums;

public class Enums {
    enum Level {
        LOW,
        MEDIUM,
        HIGH;
    }

    public static void main(String[] args) {
        Level levels = Level.LOW;

        switch(levels) {
            case LOW:
                System.out.println("low level");
                break;
            case MEDIUM:
                System.out.println("medium level");
                break;
            case HIGH:
                System.out.println("high level");
                break;
        }
    }
}