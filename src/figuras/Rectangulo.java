package figuras;

public class Rectangulo extends Figura {

    private double l1;
    private double l2;

    public Rectangulo(double l1, double l2){
        this.l1=l1;
        this.l2=l2;
    }

    public double getLado1() {
        return l1;
    }

    public void setLado1(double l1) {
        this.l1 = l1;
    }

    public double getLado2() {
        return l2;
    }

    public void setLado2(double l2) {
        this.l2 = l2;
    }

	@Override
	public double area() {
		// TODO Auto-generated method stub
        double area;
        area = l1*l2;
        return area;
	}

}