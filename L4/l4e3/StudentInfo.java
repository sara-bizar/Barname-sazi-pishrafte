package l4e3;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo<t> {

    private String studentName;
    private  String studentNumber;
    private String fathersName;

    List<t> markList = new ArrayList<t>();

    public void markGetter(t mark){
       markList.add(mark);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
}
