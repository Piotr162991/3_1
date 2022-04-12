import java.io.IOException;
import java.util.Scanner;


class Main {
  public static void main(String[] args) 
  {
      Scanner scan = new Scanner(System.in);
         System.out.println("co chesz zrobic:");
    int pkt = scan.nextInt();
    
    
    switch(pkt)
    {
      case 1:
        {
        try {

Service1 s = new Service1();
      var students = s.getStudents();
      for(Student current : students)
        {
        System.out.println(current.ToString());
      }
          }
          catch (IOException e){}     
    break;
        }
      case 2:
        {
          try{
                Service1 s = new Service1();
            scan.nextLine();
        String name = scan.nextLine();
   int age = scan.nextInt();
            scan.nextLine();
            String surname = scan.nextLine();
            
      s.addStudent(new Student(name, age, surname));
            }
          catch (IOException e){} 
           break; 
        }
  }
}
}