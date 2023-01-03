public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека больше или равен 18 то  он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать».");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("скорость превышена");
        }
        if (speed <= 60) {
            System.out.println("превышения скорости нет");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 30;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + "то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно на работу");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + "  то он может кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int сapacity = 102;
        int seatsCount = 60;
        int otherCount = сapacity - seatsCount;// стоячие места
        int seatsUsed = 50;
        int otherUsed = 41;
        if (seatsUsed < seatsCount) {
            System.out.println("Есть ещё " + (seatsCount - seatsUsed) + " сидячие места");
        }
        else  {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть ещё " + (otherCount - otherUsed) + " стоячих мест");
        }
        else  {
            System.out.println("Стоячих мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two){
            System.out.println("Число " + one + " больше всех");
        }
        else if (two>three){
            System.out.println("Число " + two + " больше всех");
        }
        else {
            System.out.println("Число " + three + " больше всех ");
        }
    }
}





