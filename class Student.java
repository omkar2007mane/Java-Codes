class Student{
    int id;
    String name;
    String dept;
    Student(int id,String name,String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    void displayCommondetails(){
        if (id<0){
            System.out.println("Invalid ID");
        }
        else{
            System.out.println("Student ID:"+id);
        }
        System.out.println("Student Name:"+name);
        System.out.println("Department:"+dept);
    }
}
class UnderGraduate extends Student{
    int sem;
    double cgpa;
    UnderGraduate(int id,String name,String dept,int sem,double cgpa){
        super(id,name,dept);
        this.sem=sem;
        this.cgpa=cgpa;
    }
    void displayUnderGraduatedetails(){
        displayCommondetails();
        if (sem<1||sem>8){
            System.out.println("Invalid Semester");
        }
        else{
            System.out.println("Semester:"+sem);
        }
        if (cgpa<0||cgpa>10){
            System.out.println("Invalid CGPA");
        }
        else{
            System.out.println("CGPA:"+cgpa);
        }
    }
}
class PostGraduate extends Student{
    String spl;
    String rt;
    PostGraduate(int id,String name,String dept,String spl,String rt ){
        super(id,name,dept);
        this.spl=spl;
        this.rt=rt;
    }
    void displayPostGraduatedetails(){
        displayCommondetails();
        System.out.println("Specializatio:"+spl);
        System.out.println("Research Type:"+rt);
    }
}
public class Main{
    public static void main(String[]args){
        UnderGraduate ug = new UnderGraduate(101,"Ravi","CSE",5,8.75);
        System.out.println("Undergraduate Details:");
        ug.displayUnderGraduatedetails();
        System.out.println();
        
        PostGraduate pg=new PostGraduate(201,"Anita","ECE","AI","Computer Vision");
        System.out.println("Postgraduate Details:");
        pg.displayPostGraduatedetails();
        System.out.println();
         
        UnderGraduate stu=new UnderGraduate(102,"Kiran","ISE",3,8.23);
        System.out.println("Student Details:");
        stu.displayUnderGraduatedetails();
        System.out.println();
           
        UnderGraduate sd=new UnderGraduate(0,"","",7,9.10);
        System.out.println("UG Specific Details:");
        sd.displayUnderGraduatedetails();
        System.out.println();
             
        PostGraduate sdd=new PostGraduate(0,"","","Data Science","NLP");
        System.out.println("PG Specific Details");
        sdd.displayPostGraduatedetails();
        System.out.println();
               
        Student id=new Student(-10,"Rahul","CSE");
        id.displayCommondetails();
        System.out.println();
         
        UnderGraduate sem=new UnderGraduate(0,"","",10,0);
        sem.displayUnderGraduatedetails();
        System.out.println();
          
        UnderGraduate cgpa=new UnderGraduate(0,"","", 5,11.5);
        cgpa.displayUnderGraduatedetails();
        System.out.println();
         
        PostGraduate rt=new PostGraduate(0,"","","","");
        rt.displayPostGraduatedetails();
        System.out.println();
    }
}