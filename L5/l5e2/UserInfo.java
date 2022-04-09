package l5e2;

public class UserInfo {

   private String name;
   private String classDay;

   private static  UserInfo user;

    private UserInfo() {
    }

    public static UserInfo getInstance(){
        if(user==null) {
            user= new UserInfo();
        }
        return  user;
    }

    public void printContent(){
        System.out.println("name: "+name+"  class day: "+classDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassDay() {
        return classDay;
    }

    public void setClassDay(String classDay) {
        this.classDay = classDay;
    }
}
