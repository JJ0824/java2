package Java0325;


public class Students {
 String Name;
 String Department;
 int StudentId;


    public Students() {
    }

    public Students(String name, String department, int studentId) {
        Name = name;
        Department = department;
        StudentId = studentId;
    }
    public String setName(){
        return Name;
    }
    public String setDepartment() {
        return Department;
    }
    public int setStudentId() {
        return StudentId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return Name+","+Department+","+StudentId;
    }
}