package figuras;

public abstract class Figura implements Comparable{

    public abstract double area();
    S@Override
	public int compareTo(Figura f, Rectangulo rectangulo) {
		double a=rectangulo.area();
	    if (rectangulo.area()>=f.area())
	        return 0;
	    else
	        return -1;
	}
}