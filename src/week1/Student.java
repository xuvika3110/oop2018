package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(String i){
        id = i;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String g){
        group = g;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String e){
        email = e;
    }
    public String getEmail(){
        return email;
    }
    /**
     * Constructor 1
     */
    Student() {
        name = "Student";
        id = "000";
        group = "INT22044";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        name = n;
        id = sid;
        group = "INT22044";
        email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        return getName() + " " + getId() +" " + getEmail() + " " + getGroup();
    }
}
