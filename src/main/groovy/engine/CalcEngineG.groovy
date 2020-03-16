package engine

class CalcEngineG {

    static Random random = new Random();

    //Values initializing at random values
    private static def a = random.nextInt(100);
    private static def b = random.nextInt(100);
    private static def x = random.nextInt(100);
    private static def y = random.nextInt(100);
    private static def z = random.nextInt(100);

    //Simple Sum
    static int Sum(int a, int b){
        return a+b;
    }

    static void main(){
        println(a + " + " + b + Sum(a,b))
    }
}
