package l5e1;

public class UserInfo {

    private String userName;
    private String name;
    private String password;
    private int age;
    private String homeAddress;
    private String phoneNumber;
    private String education;

    public UserInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserInfo setName(String name) {
        this.name = name;
        return this;
    }

    public UserInfo setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserInfo setAge(int age) {
        this.age = age;
        return this;
    }

    public UserInfo setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public UserInfo setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserInfo setEducation(String education) {
        this.education = education;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public  void resultPrint (){
        System.out.println("username: "+userName+"   name: "+name+"  password: "+password+"    age: "+age+"\nhome address: "+homeAddress+" phone number: "+phoneNumber+"    education: "+education);
    }
}
