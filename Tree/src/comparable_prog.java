import java.util.Arrays;

public class comparable_prog {
    public static void main(String[] args) {
        Student stud[]=new Student[4];
        stud[0]=new Student("maulik",1,15);
        stud[1]=new Student("arijit",2,22);
        stud[2]=new Student("yogi",3,23);
        stud[3]=new Student("raj",4,19);

        Arrays.sort(stud);
        for(Student s:stud){
            System.out.println(s.name);
        }
    }


}
class Student implements Comparable<Student>{
    String name;
    int rno;
    int age;

    public Student(String name, int rno, int age) {
        this.name = name;
        this.rno = rno;
        this.age = age;
    }
    
    public int compareTo(Student o) {
        if(this.name.charAt(0) < o.name.charAt(0))
            return -1;
        else if (this.name.charAt(0) > o.name.charAt(0))
            return 1;
        else
            return 0;
    }
}
