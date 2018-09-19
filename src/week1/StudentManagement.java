package week1;

import java.rmi.StubNotFoundException;

public class StudentManagement{

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public  Student Student1[] = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    void studentsByGroup() {
        int soLop = 1;
        String[] tenLop = new String[100];
        tenLop[0] = Student1[0].getGroup();
        for(int j = 1; Student1[j] != null; j++) {
            int dem = 0;
            for (int i = 0; i < soLop; i++) {
                if (!tenLop[i].equals(Student1[j].getGroup())) dem++;
                else break;
            }
            if( dem == soLop){
                dem = 0;
                soLop++;
                tenLop[soLop-1] = Student1[j].getGroup();
            }
        }
        for(int i = 0; i < soLop; i++)
            for(int j = 0; Student1[j] != null ; j++)
                if(Student1[j].getGroup().equals(tenLop[i]))
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
        Student1[vitri+1] = null;

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
        SN.Student1[10] = new Student();
        SN.Student1[10].setName("nguyen van a" + 10);
        SN.Student1[10].setGroup("INT22045");
        SN.Student1[10].setId("1702067" + 10);
        SN.Student1[11] = new Student();
        SN.Student1[11].setName("nguyen van a" + 10);
        SN.Student1[11].setGroup("INT220459");
        SN.Student1[11].setId("1702067" + 10);
        SN.studentsByGroup();

        SN.removeStudent("17020676");

        System.out.println("");

        SN.studentsByGroup();
    }
}
