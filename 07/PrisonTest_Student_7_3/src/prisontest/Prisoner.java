package prisontest;

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
   public Prisoner(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    public void setFields(String n, double h, int s){
        name = n;
        height = h;
        sentence = s; 
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }   
}
