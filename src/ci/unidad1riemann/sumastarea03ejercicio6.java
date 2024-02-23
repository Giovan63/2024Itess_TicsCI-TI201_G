
package ci.unidad1riemann;


public class sumastarea03ejercicio6 extends SumasRiemann {

    public sumastarea03ejercicio6(double[] x, double[] w) {
        super(x, w);
    }
   @Override
    public double funcion (double x){
        return 3*Math.cos(0.5*x);
    } 
}
