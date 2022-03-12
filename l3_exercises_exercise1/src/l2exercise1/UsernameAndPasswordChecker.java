package l2exercise1;

public class UsernameAndPasswordChecker {
    String username1="sara",password1="gold22",studentName1="sara farkoosh";
    String username2,password2,studentName2;
    public  UsernameAndPasswordChecker(String studentName2,String username2,String password2){
     this.username2 =username2;
     this.password2 =password2;
     this.studentName2=studentName2;
    }
    public UsernameAndPasswordChecker(){};

    public void check () throws  UsernameOrPasswordException{
        if(!(username1.endsWith(username2)&&password1.equals(password2)&&studentName1.equals(studentName2)))
        throw new UsernameOrPasswordException("entered studentname or username or password wrong .");
    }
}
