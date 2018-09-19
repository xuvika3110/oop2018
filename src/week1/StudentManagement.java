package week1;

public class StudentManagement {
    Student students[] = new Student[100];

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup()==s2.getGroup();
    }

    void studentsByGroup() {
        // TODO:
        int i=0;
        int n = student.length;
        for(i=0;student[i] != null;i++)
        {
            if(this.student[i].getGroup().equals("INT 22041"))
            {
                System.out.println(this.student[i].getInfo());
            }
            else if(this.student[i].getGroup().equals("INT 22042"))
            {
                System.out.println(this.student[i].getInfo());
            }
    }

    void removeStudent(String id) {
        // TODO:
        for(int i=0;i<students.length;i++){
            if(students[i].getId().equals(id))
            {
                for ( int b = i; b < students.length-1;b++)
				students[b] = students[b+1];
				students[students.length-1] = new Student();
			}
		}
        
    }

    public static void main(String[] args) {
        // TODO:
        Student hocSinh1 = new Student();
        hocSinh1.setGroup("INT 22041");
        Student hocSinh2 = new Student();
        hocSinh2.setGroup("INT 22041");
        Student hocSinh3= new Student();
        hocSinh2.setGroup("INT 22042);
        
    }
}
