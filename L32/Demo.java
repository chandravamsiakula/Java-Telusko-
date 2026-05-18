class Student{

    
    
    int rno;
    String name;
    int marks;
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.rno = 3;
        s1.name = "Chandu";
        s2.rno = 86;
        s2.name = "Vyshu";
        s3.rno = 1;
        s3.name = "Puji";
        Student studentDetails[] = new Student[3];
        studentDetails[0] = s1;
        studentDetails[1] = s2;
        studentDetails[2] = s3;


        for(int i=0;i<studentDetails.length;i++){
            System.out.println(studentDetails[i].name+" : "+studentDetails[i].rno);
        }
        


    }
}
