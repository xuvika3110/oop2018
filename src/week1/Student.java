package week1;

public class Student {
    private String name,id,group,email;

    // TODO: khai báo các thuộc tính cho Student
    public String getName(){return name;}   public void setName(String name){this.name=name;}
    public String getId(){return id;}       public void setId(String id){this.id=id;}
    public String getGroup(){return group;}   public void setName(String group){this.group=group;}
    public String getEmail(){return email;}   public void setName(String email){this.email=email;}
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
         this.name = "Student";
        this.id = "111";
        this.email = "uet@vnu.edu.vn";
        this.group = "INT22041";

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
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "INT 22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        // TODO:
    }

    String getInfo() {
         return this.getName() + "\n" + this.getId() + "\n" + this.getGroup() + "\n" + this.getEmail();
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
