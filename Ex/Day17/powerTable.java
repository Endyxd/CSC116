public class powerTable {

    public static void main(String[] args) {

        int[][] powerTable = new int[10][8];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                powerTable[i][j] = (int) Math.pow((i + 1), j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%d ", powerTable[i][j]);
            }
            System.out.println("");
        }
        double[] avg = new double [10];
        int sum = 0;
        for(int i = 0; i < 1; i ++){
            for(int j=0; j<8; j++){
                sum += powerTable[i][j];
            }
            avg[i] = sum/powerTable[i].length;
        }
    }
}