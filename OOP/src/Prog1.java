//07-02-2023
public class Prog1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStudDetails(3,"Maulik",86,76,57);
        s1.displayStudDetails();
        Student s2=new Student();
        s2.setStudDetails(5,"ABC",64,87,65);
        s2.displayStudDetails();
    }
}

class Student{
    private int rollNo;
    private String studName;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;
    public void setStudDetails(int rollNo,String studName,int mark1,int mark2,
                                int mark3){
        this.rollNo=rollNo;
        this.studName=studName;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        calculateTotal();
    }
    private void calculateTotal(){
        totalMarks = mark1+mark2+mark3;
    }
    public void displayStudDetails(){
        System.out.println(rollNo + " " + studName+ " " + totalMarks);
    }
}
