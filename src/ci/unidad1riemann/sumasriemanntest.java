
package ci.unidad1riemann;


public class sumasriemanntest {
    public static void main (String [] args){
        sumasejemplounotest();
       // sumastarea03ejercicio6();
    }
    public static void sumasejemplounotest(){
        double x[] = {0.25, 1, 1.5, 1.75, 2.25, 3};  
        double w[] = {0.5, 1.25, 1.75, 2, 2.75};
        sumasEjemplo1 se1 = new sumasEjemplo1 (x,w);
        se1.calcular();
        se1.imprimir();
   }
    public static void sumastp03tarea(){
        double a = -1.0;
        double b = 2;
        int n = 1_000_000;
        double dx = (b - a)/n;
        double x[] = new double [n + 1];
        double w[] = new double [n];
        
        for (int i = 0; i < x.length; i++)
            x[i] = a + i*dx;
        
        for (int i = 0; i < w.length; i++)
            w[i] = x[i];
        
    }
    SumasRiemann sm = new SumasRiemann (x,w); 
    sm.calcular ();
    sm.imprimir();
    
    public static void sumastarea03ejercicio6(){
        double x[] = {-Math.PI, -0.5*Math.PI, -0.3333*Math.PI, 0.3333*Math.PI,
            7.0/12 * Math.PI, Math.PI};
        double w[] = {-2.0/3*Math.PI, -1.0/3*Math.PI, 0, 1.0/2*Math.PI,
            2.0/3*Math.PI};
        sumastarea03ejercicio6 stp = new sumastarea03ejercicio6 (x,w);
        stp.calcular();
        stp.imprimir();
        
        }
        }
    

