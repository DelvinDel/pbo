
package prisionertest;


public class prisioner {
    public String name;
    public double height;
    public int sentence;

public prisioner(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
}
    public void setFields(String n, double h, int s){
        name = n;
        height = h;
        sentence = s;
}
    public void think(){
    System.out.println("I'll have my revenge.");
    }
}
