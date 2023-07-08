import java.util.function.*;

public class Main  {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("-Задание 1-");
        Printable task1 = (num) -> System.out.println("Вывод: " + num );
        task1.print(5);
        // Задание 2
        System.out.println("-Задание 2-");
        Predicate<String> isNull = s -> s == null;
        String s1 = "";
        String s2 = null;
        System.out.println(s1 + " is null? - " + isNull.test(s1));
        System.out.println(s2 + " is null? - " + isNull.test(s2));
        // Задание 3
        System.out.println("-Задание 3-");
        Predicate<String> isEmpty = s -> s.length() == 0;
        String s3 = "Hello";
        System.out.println(s1 + " is empty? - " + isEmpty.test(s1));
        System.out.println(s3 + " is empty? - " + isEmpty.test(s3));
        // Задание 4
        System.out.println("-Задание 4-");
        Predicate<String> isNotNull = s -> s != null;
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(s1 + " is empty or null? - " + !isNotNull.and(isNotEmpty).test(s1));
        System.out.println(s2 + " is empty or null? - " + !isNotNull.and(isNotEmpty).test(s2));
        System.out.println(s3 + " is empty or null? - " + !isNotNull.and(isNotEmpty).test(s3));
        // Задание 5
        System.out.println("-Задание 5-");
        Predicate<String> startJ = s -> s.startsWith("J");
        Predicate<String> startN = s -> s.startsWith("N");
        Predicate<String> endA = s -> s.endsWith("A");
        String s5 = "JAVA";
        String s6 = "NaVi";
        System.out.println(s5 + " start with J or N, end A ? - " + startJ.or(startN).and(endA).test(s5));
        System.out.println(s6 + " start with J or N, end A ? - " + startJ.or(startN).and(endA).test(s6));
        // Задание 6
        System.out.println("-Задание 6-");
        HeavyBox box1 = new HeavyBox(11.21);
        Consumer<HeavyBox> ship = box -> System.out.println("Отгрузили ящик с весом " + box.getMass() + " кг.");
        Consumer<HeavyBox> send = box -> System.out.println("Отправили ящик с весом " + box.getMass() + " кг.");
        ship.andThen(send).accept(box1);
        // Задание 7
        System.out.println("-Задание 7-");
        int num1 = 8;
        int num2 = -19;
        int num3 = 0;
        Function<Integer,String> positionOfNumber = num -> {
            if (num > 0) {
                return "Положительное число";
            } else if (num < 0) {
                return "Отрицательное число";
            } else
                return "Ноль";
        };
        System.out.println(num1 + " это - " + positionOfNumber.apply(num1));
        System.out.println(num2 + " это - " + positionOfNumber.apply(num2));
        System.out.println(num3 + " это - " + positionOfNumber.apply(num3));
        // Задание 8
        System.out.println("-Задание 8-");
        Supplier<Integer> random = () -> (int) (Math.random() * 10);
        System.out.println("Случайное число № 1 " + random.get());
        System.out.println("Случайное число № 2 " + random.get());
        System.out.println("Случайное число № 3 " + random.get());
        System.out.println("Случайное число № 4 " + random.get());
        System.out.println("Случайное число № 5 " + random.get());
        // Задание 9
        System.out.println("-Задание 9-");
        Printable task9 = System.out::println;
        task9.print(5);
    }
}