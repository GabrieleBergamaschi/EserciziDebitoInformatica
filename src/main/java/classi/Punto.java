package classi;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punto getPuntoMedio(Punto p) {
        Punto puntoMedio = new Punto((x+p.getX())/2, (y+p.getY())/2);
        return puntoMedio;
    }

    public double getDistanza(Punto p) {
        double distanza;
        distanza = Math.sqrt((Math.pow(p.getX() - x, 2)) + Math.pow(p.getY() - y, 2));
        return distanza;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
