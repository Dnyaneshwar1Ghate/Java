public class NumPattern4 {
    /*\
    1 
    21
    321
    4321 
     
     */
    public static void main(String[] args) {
        
        for (int i = 01; i <5; i++) {
            for (int j = i; j > 0; j--) {

                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
