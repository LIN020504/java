import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] a = new long[10];
        double[] x = new double[18];
        for (int i = 1; i <10; i += 1) {//i+=1一般写为i++，或++i，需要注意此两者的区别
            Arrays.fill(a, 2*i);//方法体使用错误，需弄清楚Arrays.fill()方法的具体功能和用法
        }
        for(int i=0;i<18;i++){
            x[i] = (double)(-12.0 +Math.random()*(14.0 -(-12.0)));//冗余的显式转换
        }
        double[][] n= new double [10][18];
        for (int i = 0; i < 10; i++) {
            for(int j=0;j<18;j++){
                if(a[i]==4) {
                    n[i][j] = 2 / (Math.atan(Math.exp(Math.abs(x[j]))));
                    continue;//冗余的continue语句，该语句的作用是跳过当前代码块后续语句进入下一次判断，此处无后续语句无需跳过
                }
                if(a[i]== 2 || a[i]== 6 || a[i]== 8 || a[i]== 16 || a[i]== 18){
                    n[i][j] = Math.sin((0.5)*Math.pow(x[j]/(x[j]+1),2));
                    continue;//同 18 行
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
            System.out.println("");//无需额外使用双引号
        }
    }
}
