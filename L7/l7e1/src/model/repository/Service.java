package model.repository;

public class Service {
    private static final Service service= new Service();
    private Service(){}
    public static Service getInstance(){return service;}

    public void gettingNet(Entity userHalf, int choice) throws  Exception{
        try (repo repo1 =new repo()){

            Entity pastUser = repo1.select(userHalf);
            Entity newUser = new Entity().setUserName(userHalf.getUserName()).setPassword(userHalf.getPassword());

            switch (choice){
                case 1 :
                    newUser.setBill(pastUser.getBill()+1000);
                    newUser.setInternetVolume(pastUser.getInternetVolume()+2);
                    repo1.update(newUser);
                    repo1.commit();
                    break;

                case 2:
                    newUser.setBill(pastUser.getBill()+2000);
                    newUser.setInternetVolume(pastUser.getInternetVolume()+4);
                    repo1.update(newUser);
                    repo1.commit();
                    repo1.close();
                    break;

                case 3:
                    newUser.setBill(pastUser.getBill()+5000);
                    newUser.setInternetVolume(pastUser.getInternetVolume()+10);
                    repo1.update(newUser);
                    repo1.commit();
                    repo1.close();
                    break;

                case 4:
                    newUser.setBill(pastUser.getBill()+10000);
                    newUser.setInternetVolume(pastUser.getInternetVolume()+25);
                    repo1.update(newUser);
                    repo1.commit();
                    repo1.close();
                    break;

                default:

            }

        }
    }

    public Entity showUser(Entity scndEmpty) throws  Exception{

        try(repo repo1 = new repo()){
           return repo1.select(scndEmpty);
            }




    }




}
