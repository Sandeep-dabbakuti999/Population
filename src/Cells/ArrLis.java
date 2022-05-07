package Cells;
public class ArrLis {
    static boolean[][] box = new boolean[40][40];
    public void create() {
        for (int i = 0; i <= 39; i++) {
            for ( int j = 0; j <= 39; j++) {
                box[i][j]= false;
            }
        }
    }

}
