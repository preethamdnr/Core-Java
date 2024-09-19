class Student{
    String name;
    int rollno;
    int marks;  
}
public class Studentarray {
    public static void main(String args[]){
        Student s1= new Student();
        s1.name="Preetham";
        s1.rollno=82;
        s1.marks=100;

        Student s2= new Student();
        s2.name="Gowtham";
        s2.rollno=83;
        s2.marks=97;

        Student s3= new Student();
        s3.name="Chinni";
        s3.rollno=84;
        s3.marks=96;
        System.out.println(s3);

        Student school[] = new Student[3];
        school[0]=s1;
        school[1]=s2;
        school[2]=s3;
        for(int i=0;i<school.length;i++){
            System.out.println(school[i].name +":"+school[i].rollno);
        }
    }
   
}
