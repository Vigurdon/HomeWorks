public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWoods();
        checkSumSign();
        Color();
        compareNumbers();
    }

    static void compareNumbers(){
        int a = 232, b = 567;
        if (a>=b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    static void Color(){
        int value = 124;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 100)
            System.out.println("Зеленый");
        else
            System.out.println("Желтый");
    }

    static void checkSumSign(){
        int a = 12, b =-321;
        if(a+b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    static void printThreeWoods(){
        System.out.println("Orange \nBanana \nApple");
    }
}

