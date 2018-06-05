
import loops.Loops;
import person.Person;
import person.Student;
import person.Teacher;


public class Main {

    
    public static void main(String[] args) {
//        
//        Car myCar = new Car();
//        myCar.printAttributes();
//       
//        
//        
//        
//        Car companyCar = new Car(150, 30, 2000, false, "EFG-456", 'B', 3500, 60000);
//        companyCar.changeModel("Fiat");
//        companyCar.ChangeMaxFuel(150);
//        companyCar.fuelUp();
//        companyCar.changeConsumption(10);
//        
//        companyCar.printMainAttributes();
//        companyCar.travel(10);
//        companyCar.printMainAttributes();
//        
//        Car audi = new Car();
//        audi.changeModel("Audi");
//        audi.fuelUp();
//        audi.changeConsumption(20);
//        
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//        
//     
//        
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//        
//        Car testAuto = new Car();
//        testAuto.printMainAttributes();
//        testAuto.getIn(2);
//        testAuto.printMainAttributes();
//        
//        testAuto.getIn(4);
//        testAuto.printMainAttributes();
//        testAuto.getIn(2);
//        testAuto.printMainAttributes();
//        
//        testAuto.getOut(3);
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.printMainAttributes();
        
        
        
        
        
    
   
                      
        
  

//    WHILE loop
//      Loops testLoop = new Loops();
//      Loops.testWhileLoop();
//      
//      Loops.testDoWhileLoop();
//      Loops.testForLoop();
//      Loops.testDoubleForLoop();
//      Loops.testMultiplicationTable();
      
     Person p1 = new Person();
     p1.showData();
     p1.setName("Jovan");
     p1.setSurname("Petrovic");
     p1.setJmbg("0205987888456");
     
     Person p2 = new Person("Aca", "Cosic", "1111112223456");
     p2.showData();
     
     Student studentJovan = new Student("Jovan", "Jovanovic", "7898888256365");
     studentJovan.setCurrentYear(4);
     studentJovan.setIndexNumber("oas-456");
     studentJovan.showData();
    
    Student studentMarija = new Student("Marija", "Petrovic", "457974", "oas-123", 2);
    studentMarija.showData();
    
    Teacher teacherAna = new Teacher("Ana", "Sokic", "478444");
    teacherAna.setYearOfWork(7);
    teacherAna.setMainSubject("matematika");
    teacherAna.showData();
    
    Teacher teacherOlja = new Teacher("Olja", "Jovic", "1254", "oas-888", 2, "srpski", 8);
    teacherAna.showData();

    }
}
     
    

