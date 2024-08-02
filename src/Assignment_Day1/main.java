package Assignment_Day1;

   class Student {
    private int st_id;
    private String name;
    private int age;
    private char grade;

       public int getSt_id() {
           return st_id;
       }
       public void setSt_id(int st_id) {
           this.st_id = st_id;
       }
       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public int getAge() {
           return age;
       }

       public void setAge(int age) {
           this.age = age;
       }

       public char getGrade() {
           return grade;
       }

       public void setGrade(char grade) {
           this.grade = grade;
       }
   }

public class main{
    public static void main(String[] args) {
        Student s = new Student();
        s.setSt_id(20);
        System.out.println(s.getSt_id());
        s.setName("Mohan");
        System.out.println(s.getName());
        s.setAge(42);
        System.out.println(s.getAge());
        s.setGrade('A');
        System.out.println(s.getGrade());
    }
}
