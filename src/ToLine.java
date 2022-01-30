public class ToLine {
    int[][] data;
    ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int arraySize = data.length * data[0].length;
        int arrayCounter=0;
        int[] retArray = new int[arraySize];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j<data[0].length; j++) {
                retArray[arrayCounter++] = data[i][j];
            }
        }
        return retArray;
    }
}
