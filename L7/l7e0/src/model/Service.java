package model;

public class Service {
    private static final Service service= new Service();
    private Service(){}
    public static Service getInstance(){return service;}

    public void sign_up (UserEntity usernamePass) throws Exception {
        try(repo repo1 = new repo()){
            repo1.dbSign_up(usernamePass);
            System.out.println("sing-up successful .");
            repo1.commit();
        }

    }

    public void userEntry(UserEntity usernamePass) throws Exception{
        try(repo repo2 = new repo()) {
        boolean reaction= repo2.dbUserEntry(usernamePass);


            if (reaction) {
                System.out.println("user sign-in successful . \n welcome user " + usernamePass.getUserName());

            }
            else {
                System.out.println("user sign-in failed .\n wrong username or password . ");

            }

repo2.commit();
    }


}}
