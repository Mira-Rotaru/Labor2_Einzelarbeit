package MVC_Student;

public class Student {
    private String StudentName;
    private String StudentId;
    private int StudentYear;

    public String getName(){
        return StudentName;
    }
    public void setName(String name){
        this.StudentName = name;
    }
    public String getId(){
        return StudentId;
    }
    public void setId(String id){
        this.StudentId = id;
    }
    public int getYear(){
        return StudentYear;
    }
    public void setYear(int year){
        this.StudentYear = year;
    }
}

