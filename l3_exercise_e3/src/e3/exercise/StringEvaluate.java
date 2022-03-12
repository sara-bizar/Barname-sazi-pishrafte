package e3.exercise;

public class StringEvaluate {
    boolean ex=false;
    public void numberFounder (String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)>='1'|| string.charAt(i)<=9){
                ex=true;
                break;
            }
        }}

    //method bellow's job is to find announce exception finding or printing size of the string
        public static void exceptionFinder(boolean ex,String string) throws NumberFoundInStringException {
            if(ex) {
                throw  new NumberFoundInStringException("Number found in string");
            }
            else
                System.out.println("the length of the string = "+ string.length());
        }
    }





