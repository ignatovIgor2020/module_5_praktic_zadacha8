import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToTable toTable = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] array = new int[3][2];
        array = toTable.resize();
        for (int i = 0; i<3; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] arr = a.resize();
        System.out.println(Arrays.toString(arr));
    }
}
