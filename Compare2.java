import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "Student [age="+age+", name="+name+"]";
    }
    public int compareTo(Student that){
        if(this.age>that.age)
        {
            return 1;
        }
        else{ 
            return-1;
        }
    }
}
public class Compare2 {
    public static void main(String[] args) {
        // Comparator<Integer>com= new Comparator<Integer>() 
        // {
        //     public int compare(Integer i, Integer j){
        //         if(i%10>j%10){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };
        List<Student> stud = new ArrayList<>();
        stud.add(new Student(24, "Preetham"));
        stud.add(new Student(24, "Srichand"));
        stud.add(new Student(24, "Samritha"));
        stud.add(new Student(29, "Gowtham"));
        stud.add(new Student(29, "JayaAkka"));

        Collections.sort(stud);
        System.out.println(stud);
    }
}
