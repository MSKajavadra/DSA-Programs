//07-02-2023
public class prog4 {
    public static void main(String[] args) {
        Student1[] s=new Student1[5];
        s[0]=new Student1(101,"ABC",98,55,94,85,96);
        s[1]=new Student1(102,"DEF",95,94,75,73,45);
        s[2]=new Student1(103,"XYZ",99,96,48,64,84);
        s[3]=new Student1(104,"PQR",85,76,45,68,94);
        s[4]=new Student1(105,"WWW",95,99,75,96,96);


        System.out.println("All Details:");
        for (int i=0;i< s.length;i++){
            s[i].dispStudDetails();
        }

        System.out.println("\nTop-3 Students:");
        Student1[] ans=getTop3Student(s);
        for(int i=0;i<ans.length;i++){
            ans[i].dispStudDetails();
        }
    }
    public static Student1[] getTop3Student(Student1[] s){
        Student1[] ans=new Student1[3];
        int max1=0,max2=1,max3=2;

        if(s[max1].getPer() < s[max2].getPer()){
            int temp=max1;
            max1=max2;
            max2=temp;
        }
        if(s[max2].getPer() < s[max3].getPer()){
            int temp=max2;
            max2=max3;
            max3=temp;
        }
        if(s[max1].getPer() < s[max3].getPer()){
            int temp=max1;
            max1=max3;
            max3=temp;
        }

        for(int i=3;i<s.length;i++){
            if(s[i].getPer() > s[max1].getPer()){
                max3=max2;
                max2=max1;
                max1=i;
            } else if (s[i].getPer() > s[max2].getPer()) {
                max3=max2;
                max2=i;
            }else if(s[i].getPer() > s[max3].getPer()){
                max3=i;
            }
        }

        ans[0]=s[max1];
        ans[1]=s[max2];
        ans[2]=s[max3];
        return ans;
    }
}

class Student1{
    private int rollNo;
    private String name;
    private int marks1,marks2,marks3,marks4,marks5;
    private int per;

    public Student1(int rollNo, String name, int marks1, int marks2, int marks3, int marks4, int marks5) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.marks5 = marks5;
        per=(marks1+marks2+marks3+marks4+marks5)/5;
    }

    public int getPer() {
        return per;
    }

    public void dispStudDetails(){
        System.out.println(rollNo + " " + name + " " + per);
    }
}
