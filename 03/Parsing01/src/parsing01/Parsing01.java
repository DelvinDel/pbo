package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        int shirt = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        double totalTax = shirt * tax;
        System.out.println("total tax: "+totalTax);
        
        
        //Try to parse taxRate as an int
        //int tax2 = Integer.parseInt(taxRate);
        //Try to parse gibberish as an int
        //int gibberish2 = Integer.parseInt(gibberish);
    }
    
}
