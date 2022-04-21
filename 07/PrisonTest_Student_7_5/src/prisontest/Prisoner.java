package prisontest;

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
public Cell cell;


 
    
    //Constructor
    public Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
    }
    

public class Cell{

private String name;
private boolean isOpen;

public void setName(String name){
    this.name = name;}

public void setIsOpen(boolean isOpen){
this.isOpen = isOpen;}


public void display(boolean b){
        System.out.println("Name: " +name);
}


}




