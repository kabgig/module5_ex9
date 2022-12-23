public class ToTable {

    private int[] data;
    private int x;
    private int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int counter = 0;
        int[][] arr2 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr2[i][j] = data[counter++];
            }
        }
        return arr2;
    }

    new ToLine()
//commit2

}
