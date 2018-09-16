package week1;

public class StudentManagement{

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public  Student Student1[] = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        for(int j = 0; Student1[j] != null; j++)
            if(Student1[j].getGroup().equals("INT22041"))
                System.out.println(Student1[j].getInfo());
        for(int j = 0; Student1[j] != null ; j++)
            if(Student1[j].getGroup().equals("INT22042"))
                System.out.println(Student1[j].getInfo());
    }

    void removeStudent(String id) {
        int vitri = 0;
        while(!Student1[vitri].getId().equals(id)){
            vitri++;
        }
        for(int j = vitri ; Student1[j+1] != null ; j++){
          Student1[j] =  new Student(Student1[j+1]);
            vitri = j;
        }
        Student1[vitri] = null;

    }

    public static void main(String[] args) {
        Student me = new Student();
        me.setName("nguyen van dat");
        me.setGroup("INT22041");
        me.setId("17020676");
        me.setEmail("1702066@vnu.edu.vn");
        System.out.println(me.getInfo());

        Student st1 = new Student();
        Student st2 = new Student("nguyen thi b"," 1121900" ,"123231873@vnu.edu.vn");
        Student st3 = new Student(st2);

        System.out.println(st1.getInfo());
        System.out.println(st2.getInfo());
        System.out.println(st3.getInfo());

        StudentManagement SN = new StudentManagement();
        System.out.println(SN.sameGroup( st1 , st2));

        for(int j = 0 ; j < 10 ; j++){
            SN.Student1[j] = new Student();
            if( j % 2 == 0) {
                SN.Student1[j].setName("nguyen van a" + j);
                SN.Student1[j].setGroup("INT22041");
                SN.Student1[j].setId("1702067" + j);
            }
            else{
                SN.Student1[j].setName("nguyen thi b" + j);
                SN.Student1[j].setGroup("INT22042");
                SN.Student1[j].setId("1702067" + j);
            }

        }
        SN.studentsByGroup();

        SN.removeStudent("17020676");
    }
}
