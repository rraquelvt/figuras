package figuras;

public class Circulo extends Figura{
    private double radio;

    public Circulo (double radio){

        this.radio= radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
        double area;
        area= 2*Math.PI*this.radio;
        return area;
    }
