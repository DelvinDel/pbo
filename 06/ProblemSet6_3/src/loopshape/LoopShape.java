package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
          //cek if i == 1  dan height sout* sebanyak j
        //* hanya di (if j == 0 dan width -1)
    for (int i=1;i<=height;i++){
        for(int j=0;j<width;j++){
            if (i == 1 || i == height){
                System.out.print("*"); continue; }
            if (j == 0 || j == width-1){   
                System.out.print("*");
                }    
                else System.out.print(" ");      
            }
        System.out.println();
        }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
      
    for (int i=1;i<=leg;i++){
        for(int j=0;j<i;j++){
            if (i == 1 || i == leg){
                System.out.print("*"); continue; }
            if (j == 0 || j == i-1){   
                System.out.print("*");
                }    
            else System.out.print(" ");      
            }
        System.out.println();
        }
      
    }

}



