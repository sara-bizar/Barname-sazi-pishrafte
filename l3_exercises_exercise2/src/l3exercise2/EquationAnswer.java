package l3exercise2;

public class EquationAnswer {
    double a;
    double b;
    double c;
    double delta;
    boolean deltaSign;
    double answer1;
    double answer2;
    public EquationAnswer(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public  EquationAnswer(){}

    public double deltaCalculator (){
        delta = (b * b) - (4 * a * c);
        return delta;
    }

    public void deltaEvaluate () throws DeltaNegativeException{
        if (delta<0){
            throw new DeltaNegativeException("delta is negative so there is no answer ");
        }
        else
            deltaSign=true;
    }

    public void equationAnswer (){
       if(delta==0) {
           answer1 = (-1 * b) / (2 * a);
           System.out.println("one answer : "+answer1);
       }
       else if (delta>0){
           answer1 = ((-1 * b) + ( Math.sqrt(delta))) / (2 * a);
           answer2 = ((-1 * b) - ( Math.sqrt(delta))) / (2 * a);
           System.out.println("there are two answers : "+answer1+" and "+answer2);
       }
    }


}
