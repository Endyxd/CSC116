public class Grid {
    private int rows;
    private int cols;
    private Symbol[][] panels; // = new Symbol[rows] [cols];
    public Grid(int rows, int cols) {
        //stuff
        /*for(int i = 0; i < panels.length; i++){
           for(int j = 0; j < panels[0].length; j++){
              panels[i][j] = null;
           }
        }*/
        if ((rows < 1)) {
            throw new IllegalArgumentException("Invalid rows/cols");
        }
        if ((cols < 1)) {
            throw new IllegalArgumentException("Invalid rows/cols");
        }
        this.rows = rows;
        this.cols = cols;
        panels = new Symbol[rows][cols];

    }
    public int getRows() {
        return this.rows;
    }
    public int getCols() {
        return this.cols;
    }
    public void setSymbol(int row, int col, Symbol symbol) {
        if (symbol == null) {
            throw new NullPointerException("Null symbol");
        }
        if ((row < 0) || (row >= this.rows)) {
            throw new IllegalArgumentException("Invalid row");
        }
        if ((col < 0) || (col >= this.cols)) {
            throw new IllegalArgumentException("Invalid col");
        }
        panels[row][col] = symbol;

    }
    public Symbol getSymbol(int row, int col) {
        if ((row < 0) || (row >= this.rows)) {
            throw new IllegalArgumentException("Invalid row");
        }
        if ((col < 0) || (col >= this.cols)) {
            throw new IllegalArgumentException("Invalid col");
        }
        return panels[row][col];

    }
    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0) {
                    output += panels[i][j].getName();
                } else {
                    output += " " + panels[i][j].getName();
                }

            }
            output += "\n";
        }
        return output;
    }

}