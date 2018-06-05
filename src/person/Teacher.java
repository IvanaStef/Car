
package person;


public class Teacher extends Person {
    
    private String mainSubject;
    private int yearOfWork;
    
    public String getMainSubject() {
        return mainSubject;
    }
    
    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
     public int getYearOfWork() {
         return yearOfWork;
     }
     
     public void setYearOfWork(int yearOfWork) {
         this.yearOfWork = yearOfWork;
     }
     
     public Teacher(String name, String surname, String jmbg) {
        super(name, surname, jmbg);
        
    }
     
     public Teacher(String name, String surname, String jmbg, String indexNumber, int currentYear, String mainSubject, int yearOfWork) {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.yearOfWork = yearOfWork;
        
   }
     
    @Override
     public void showData() {
         
         System.out.println("Main subject: " + getMainSubject());
        System.out.println("YearOfWork: " + getYearOfWork());
        super.showData();
        
     }
}
