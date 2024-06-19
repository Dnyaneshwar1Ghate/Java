public class NumPattern1 {

    /*
     * 0
     * 11
     * 222
     * 3333
     * 44444
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
