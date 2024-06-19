public class NumPattern5 {
/*
      
0  
0 1 1
0 1 2 2 1
0 1 2 3 3 2 1
0 1 2 3 4 4 3 2 1
*/
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j +" ");

            }
            
            for (int k = i-1; k >0 ; k--) {
                
                System.out.print(k +" ");
            }
            System.out.println(" ");
            
        }
    }
}
