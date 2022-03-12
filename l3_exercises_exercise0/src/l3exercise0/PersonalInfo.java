package l3exercise0;

public class PersonalInfo {
    public String name;
    public String age;
    public String family;
    public  PersonalInfo(String name,String age,String family){
        this.name=name;
        this.family=family;
        this.age=age;
    }
    public PersonalInfo(){}

    public void reiterativeChecking(PersonalInfo second) throws ReiterativeException {
      if (name.equals(second.name)&& age.equals(second.age)&& family.equals(second.family)) {
         throw  new ReiterativeException("reiterative user ! ");
      }
      else
          System.out.println("ok");

    }


}
