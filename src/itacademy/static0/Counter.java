package itacademy.static0;

public class Counter {
    private static int numOfCalls;

    public Counter(int numOfCalls){
        Counter.numOfCalls = numOfCalls;
    }
    public Counter(){
    }

    public static void setNumOfCalls(int numOfCalls) {
        Counter.numOfCalls = numOfCalls;
    }

    public static int getNumberCalls() {
        return numOfCalls;
    }


    @Override
    public String toString() {
        return "counter of calls: " + numOfCalls;
    }

    public static void increment() {
        numOfCalls++;
    }

    public static void factorial(){
        int numOfCalls1 = numOfCalls;
        int factorial = numOfCalls1 + numOfCalls;
        System.out.println(factorial);
    }
}
