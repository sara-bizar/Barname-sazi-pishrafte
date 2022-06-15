package tempentity;

public class Main {
    public static void main(String[] args) {
        IN in= new IN();
        try {
            System.out.println("income ="+in.income());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
