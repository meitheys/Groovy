package engine;

import java.util.Random;

class CalcEngine {

    static Random random = new Random();

    //Values initializing at random values
    private static int a = random.nextInt(100);
    private static int b = random.nextInt(100);
    private static int x = random.nextInt(100);
    private static int y = random.nextInt(100);
    private static int z = random.nextInt(100);

    //Simple Sum
    public static int Sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(a + " + " + b + " = " + Sum(a, b));
    }
}