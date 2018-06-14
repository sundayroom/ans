public class Rational {
    int numerator;
    int denominator;
    public Rational(int numerator,int  denominaor) throws  ArithmeticException{
        if(denominaor==0){
            throw new ArithmeticException("分母为零");
            }
        if(denominaor<0){
            numerator=-numerator;
            denominaor=-denominaor;
        }

        int commonDivisor = ouli(numerator, denominator);
        this.denominator=denominaor/commonDivisor;
        this.numerator=numerator/commonDivisor;
    }
    public int  ouli(int a,int b){
        if (a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        while(a%b!=0){
            int r=a/b;
            a=b;
            b=r;

        }
        return b;
    }
public Rational times(Rational b){
        return new Rational(numerator*b.numerator,denominator*b.denominator);
}
public Rational devide(Rational b ){
        return new Rational(numerator/b.numerator,denominator/b.denominator);
}

}
