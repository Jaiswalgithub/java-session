package day5.inheritance;

public class SchoolManagement {
    public static void main(String args[]){
        Student student1 = new Student();
  //      student1.name = "Rabin";
        student1.setName("Aishwarya");
        student1.setAge("Eleven");
        student1.setRollNumber(7);
        System.out.println("Student1 Name:" +student1.getName());

        Teacher teacher1 = new Teacher();
 //       teacher1.name = "Taman";
        teacher1.setName("Taman");
        teacher1.setGender(Gender.MALE);
        teacher1.setSubject("JAVA");
        System.out.println("Teacher1 Subject:" +teacher1.getSubject());
    }

}
