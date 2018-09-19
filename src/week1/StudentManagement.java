package week1;

public class StudentManagement {
    Student students[] = new Student[100];

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        // TODO:
        int i = 0;
        int n = students.length;
        for (i = 0; students[i] != null; i++) {
            if (this.students[i].getGroup().equals("INT 22041")) {
                System.out.println(this.students[i].getInfo());
            } else if (this.students[i].getGroup().equals("INT 22042")) {
                System.out.println(this.students[i].getInfo());
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(id)) {
                for (int b = i; b < students.length - 1; b++)
                    students[b] = students[b + 1];
                    students[students.length - 1] = new Student();
            }
        }

    }

    public static void main(String[] args) {
        // TODO:
        Student sv1 = new Student();
        sv1.setGroup("INT 22041");
        sv1.setName("Đặng Mạnh Đức");
        sv1.setId("17020693");
        sv1.setEmail("duckhua861999@gmail.com");

        Student sv2 = new Student();
        sv2.setGroup("INT 22041");
        sv2.setName("Đặng Mạnh Đức A");
        sv2.setId("17020694");
        sv2.setEmail("duckhua861999a@gmail.com");
        Student sv3 = new Student();
        sv3.setName("Đặng Mạnh Đức B");
        sv3.setId("17020695");
        sv3.setEmail("duckhua861999b@gmail.com");
        sv3.setGroup("INT 22042");
        System.out.println(sv1.getInfo());
        System.out.println(sv2.getInfo());
        System.out.println(sv3.getInfo());
        StudentManagement xuvi = new StudentManagement();
        
        Student[] xuvika = new Student[100];

        xuvika = xuvi.students;
        for (int i= 0; i <100; i ++)
        {
            xuvika[i] = new Student();
        }
        System.out.println("Danh sach sinh vien sau khi xoa la :");
        xuvi.removeStudent("17020694");
        for (int i = 0; i < xuvi.students.length; i++) {
            if (xuvi.students[i].getName() != ("Student")) {
                System.out.println(xuvi.students[i].getInfo());

            }
        }
    }
}
