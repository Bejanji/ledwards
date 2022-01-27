public class Main {
    public static void main(String[] args) {
        Cock a = new Cock(1);
        Cock b = new Cock(2);
        System.out.println("Cocks in the code: " + a.getCocks());
        assert(a.getCocks() == b.getCocks());
        System.out.println("Average cock length: " + Cock.getAverage());
        System.out.println(a);
        System.out.println(b);
    }
}

class Cock {

    private int length;
    private static int cockCount = 0;
    private static int average;

    public Cock(int length) {
        this.length = length;
        Cock.cockCount++;
        Cock.average += length;
    }

    public int getCocks() {
        return cockCount;
    }

    public double getLength() {
        return length;
    }

    public static double getAverage() {
        return (double)average / (double)cockCount;
    }

    public String toString() {
        return "Cock(length = " + length + ")";
    }

}