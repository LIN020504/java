import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] a = new long[10];
        double[] x = new double[18];
        for (int i = 1; i <10; i += 1) {
            Arrays.fill(a, 2*i);
        }
        for(int i=0;i<18;i++){
            x[i] = (double)(-12.0 +Math.random()*(14.0 -(-12.0)));
        }
        double[][] n= new double [10][18];
        for (int i = 0; i < 10; i++) {
            for(int j=0;j<18;j++){
                if(a[i]==4) {
                    n[i][j] = 2 / (Math.atan(Math.exp(Math.abs(x[j]))));
                    continue;
                }
                if(a[i]== 2 || a[i]== 6 || a[i]== 8 || a[i]== 16 || a[i]== 18){
                    n[i][j] = Math.sin((0.5)*Math.pow(x[j]/(x[j]+1),2));
                    continue;
                }
                if(a[i]!=2 || a[1]!=4||a[i]!=6||a[i]!=8||a[i]!=16||a[i]!=18){
                    n[i][j]= Math.sin(Math.pow(Math.pow(Math.pow(x[j],x[j]/2),2)+1/0.25,2));
                }
            }
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<18;j++){
                System.out.printf("%8.5f",n[i][j]);
            }
            System.out.println("");
        }
    }
}