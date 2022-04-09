package l5e0;

public class CalcFactory {
    public Calculate chooser (char operator){
        if (operator == '+' )
            return new CalcPlus();
        else if(operator=='-')
            return new CalcMinus();
        else{
            System.out.println("unidentified operator");
            return null;}

    }
}
