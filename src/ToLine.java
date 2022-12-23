import java.util.ArrayList;
import java.util.Collection;

public class ToLine {
    int [][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int [] resize(){
        Collection<Integer> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                list.add(data[i][j]);
            }
        }
        Object[] obj = list.toArray();
        int [] result = new int[obj.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) obj[i];
        }
        return result;
    }

}
