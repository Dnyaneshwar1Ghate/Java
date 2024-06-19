public class NumPattern9 {
    /*
1 2 3  
4 5 6
7 8 9
10 11 12
13 14 15
     */
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 3; j++) {
                count = count + 1;
                System.out.print(count+" ");
            }
            System.out.println(" ");
        }
    }
}
