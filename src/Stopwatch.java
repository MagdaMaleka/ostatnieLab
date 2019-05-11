public class Stopwatch {
    private long startTime;

    public Stopwatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void reset(){
        this.startTime = System.currentTimeMillis();
    }

    public void show(){
        long stopTime = System.currentTimeMillis();
        System.out.println("Czas: " + (stopTime - startTime) + " ms");
    }
}
