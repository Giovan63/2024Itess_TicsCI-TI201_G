
package ci.u1serie;

/**
 *ITESS
 * Enero-junio
 * calculo integral
 * series
 * fecha 16-02-24
 */
public class SerieAdd {
    private int iIni;
    private int iend;
    private int n;
    private int i[];
    private int f[];
    private int total;
//constructor 
    public SerieAdd(int iIni, int iend) {
        this.iIni = iIni;
        this.iend = iend;
        
        n = iend - iIni +1;
        i = new int [n];
        f = new int [n];
    }
    public void compute(){
        int index = 0;
        for (int i = iIni; i <= iend; i++){
        this.i[index] = i;
        f[index] = i*i + 1;
        total += f[index];
        index++;
    }
    }
    public void print(){
        System.out.println("index | i | f ");
       
        for (int index = 0; index < n; index++)
            System.out.println( index + " | " + i[index] " | " + f[index]);
            System.out.println("Totsl:" + total);
    }
}
