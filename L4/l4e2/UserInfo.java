package l4e2;

public class UserInfo<t> implements Cloneable {
    private t name;
    private  t school;
    private t classNumber;

    @Override
    public Object clone() throws  CloneNotSupportedException {

        return super.clone();
    }

    public t getName() {
        return name;
    }

    public t getSchool() {
        return school;
    }

    public t getClassNumber() {
        return classNumber;
    }

    public void setName(t name) {
        this.name = name;
    }

    public void setSchool(t school) {
        this.school = school;
    }

    public void setClassNumber(t classNumber) {
        this.classNumber = classNumber;
    }

    public void printResult (){
        System.out.println("name :"+ name +"     school: "+ school+"     class number: "+classNumber);
    }




    }


