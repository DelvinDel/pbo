
package absen;



public class Data {
    private String nama;
    private int nim;
    
    private int absen;
    

    public Data(String nama, int nim, int absen){
 	this.nama = nama;
 	this.nim = nim;
 	
        this.absen = absen;

 
    }
    


    public void display(){
        System.out.println("");        
        System.out.println("Name: " +getNama());
        System.out.println("NIM: " +getNim());

        System.out.println("Nilai: " +getAbsen());
        if (getAbsen()== 1){System.out.println(" Murid masuk");
        }
        else {System.out.println("Murid tidak masuk");
        }
    }
    
    public void absen(){
    if (getAbsen()== 1){System.out.println(" Murid masuk");
    }
else {System.out.println("Murid tidak masuk");
}}


    public String getNama() {
        return nama;
    }
    public int getNim() {
        return nim;
    }

    
    public int getAbsen(){
        return absen;}


    public void setName(String nama) {
        this.nama = nama;
    }
    public void setHeight(int nim) {
        this.nim = nim;
    }

    
    public void setAbsen(int absen) {
        this.absen = absen;
    }

}
