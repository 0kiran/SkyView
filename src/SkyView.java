public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned){
        view = new double[numRows][numCols];
        int numscanned = 0;
        for(int i = 0; i < numRows; i++){
            if(i%2==0){
                for(int j = 0; j < view[0].length; j++){
                    view[i][j] = scanned[numscanned];
                    numscanned++;
                }
            }
            else {
                for(int j = view[0].length-1; j > 0; j--){
                    view[i][j] = scanned[numscanned];
                    numscanned++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double total = 0;
        int count = 0;
        for(int i = startRow; i < endRow; i++){
            for(int j = startCol; j < endCol; j++){
                total += view[i][j];
                count++;
            }
        }
        return total/(count);
    }

    @Override
    public String toString() {
        String total = "";
        for(int i = 0; i < view.length; i++){
            for(int j = 0; j < view[0].length; j++){
                total += view[i][j]+" ";
            }
            total += "\n";
        }
        return total;
    }
}
