package final1718sem2q4;


public class LinearEquation {
    private int a,b,c,d,e,f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public boolean isSolvable(){
        if(a*d-b*c!=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double computeX(){
        double x=0;
        x=(e*d-b*f)/(a*d-b*c);
        return x;
    }
    public double computeY(){
        double y=0;
        y=(a*f-e*c)/(a*d-b*c);
        return y;
    }
    
    public String toString() {
        return "LinearEquation:\n" + a+"x "+b+"y = "+4+"\n"+c+"x "
                +d+"y = "+f+"\n"+"x = "+computeX()+"; y = "+computeY();
    }
    
}
