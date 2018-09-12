package week1;

public class Student {
    private String name,id,group,email;

    // TODO: khai báo các thuộc tính cho Student
    public String getName(){return name;}   public void setName(){this.name=name;}
    public String getId(){return id;}       public void setId(){this.id=id;}
    public String getGroup(){return group;}   public void setName(){this.group=group;}
    public String getEmail(){return email;}   public void setName(){this.email=email;}
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {

        // TODO Auto-generated constructor stub
    }

    /**
     * Constructor 2
     * @param  n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
