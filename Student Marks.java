class StudentMarks{
  void calculateTotal(int M1,int M2)
  {
    int total=M1+M2;
    System.out.println("Total of 2 Subjects:"+total);
  }
  void calculateTotal(int M1,int M2,int M3)
  {
    int total=M1+M2+M3;
    System.out.println("Total of 3 Subjects:"+total);
  }
  void calculateTotal(int M1,int M2,int M3,int M4)
  {
    int total=M1+M2+M3+M4;
    System.out.println("Total of 4 Subjects:"+total);
  }
}
public class Main{
  public static void main(String[]args){
    StudentMarks obj=new StudentMarks();
    obj.calculateTotal(85,90);
    obj.calculateTotal(70,97,86);
    obj.calculateTotal(67,89,93,76);
  }
}