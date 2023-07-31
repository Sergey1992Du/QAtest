public class Kub {
    double s;
    double v;

    public Kub(double edge) {
        this.v = Math.pow(edge, 3);
        this.s = Math.pow(edge, 2) * 6;
    }
}
