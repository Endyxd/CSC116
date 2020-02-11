import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class WhackaMole {

    private Grid arrange;
    private int score;
    private int misses;
    private boolean testingMode;
    private Random numGen;
    private int nextRow;
    private int nextCol;

    public static final int ROWS = 5;

    public static final int COLS = 5;

    public static final String[][] SYMBOL_NAMES = {
        {
            "cat",
            "dog",
            "tiger",
            "frog",
            "cat"
        },
        {
            "tiger",
            "lion",
            "dog",
            "tiger",
            "frog"
        },
        {
            "cat",
            "frog",
            "mole",
            "dog",
            "lion"
        },
        {
            "lion",
            "dog",
            "tiger",
            "cat",
            "frog"
        },
        {
            "cat",
            "frog",
            "lion",
            "dog",
            "tiger"
        }
    };

    public static final int[][] SYMBOL_POINTS = {
        {
            10,
            15,
            30,
            20,
            10
        },
        {
            30,
            40,
            15,
            30,
            20
        },
        {
            10,
            20,
            50,
            15,
            40
        },
        {
            40,
            15,
            30,
            10,
            20
        },
        {
            10,
            20,
            40,
            15,
            30
        }
    };

    /**
     * This is the constructor of the class. This method must store the value of
     * testing in the instance variable that keeps track of whether the game is in
     * testing mode or not. It must also create a new Grid object. The Grid should
     * be filled with Symbols using the names and point values provided in the
     * SYMBOL_NAMES and SYMBOL_POINTS arrays above.
     * 
     * @param testing
     */
    public WhackaMole(boolean testing) {
        this.testingMode = testing;
        arrange = new Grid(ROWS, COLS);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                arrange.setSymbol(i, j, new Symbol(SYMBOL_NAMES[i][j], SYMBOL_POINTS[i][j]));
            }
        }
    }

    /**
     * This method returns the total score for the player.
     * 
     * @return score
     */
    public int getTotalScore() {
        return this.score;
    }

    /**
     * This method returns the number of misses made by the player.
     * 
     * @return misses
     */
    public int getNumberOfMisses() {
        return this.misses;
    }

    /**
     * This method returns the row of the next Symbol to be displayed.
     * 
     * @return next row
     */
    public int getNextRow() {
        return this.nextRow;
    }

    /**
     * This method returns the column of the next Symbol to be displayed.
     * 
     * @return next col
     */
    public int getNextCol() {
        return this.nextCol;
    }

    /**
     * This method returns the name of the Symbol at the given row and col in the
     * Grid, for example, “cat”. HINT: Use the appropriate Grid and Symbol class
     * methods Throw an IllegalArgumentException with the message “Invalid row” if
     * row is less than 0 or greater than or equal to the number of rows. Throw an
     * IllegalArgumentException with the message “Invalid col” if col is less than 0
     * or greater than or equal to the number of columns.
     * 
     * @param row
     * @param col
     * @return
     */
    public String getSymbolName(int row, int col) {
        if (row <= 0 || row >= ROWS) {

            throw new IllegalArgumentException("Invalid row");

        }

        if (col <= 0 || col >= COLS) {

            throw new IllegalArgumentException("Invalid col");

        }

        String animalName = getSymbolName(row, col);
        return animalName;
    }

    /***
     * This method returns the points for the Symbol at the given row and col in the
     * Grid. HINT: Use the appropriate Grid and Symbol class methods Throw an
     * IllegalArgumentException with the message “Invalid row” if row is less than 0
     * or greater than or equal to the number of rows. Throw an
     * IllegalArgumentException with the message “Invalid col” if col is less than 0
     * or greater than or equal to the number of columns.
     * 
     * @param row desired row
     * @param col desired col
     * @return int points of current symbol
     */
    public int getSymbolPoints(int row, int col) {
        if (row <= 0 || row >= ROWS) {

            throw new IllegalArgumentException("Invalid row");

        }

        if (col <= 0 || col >= COLS) {

            throw new IllegalArgumentException("Invalid col");

        }

        int sPoints = getSymbolPoints(row, col);
        return sPoints;

    }

    /**
     * This method returns true if the Symbol at the given row and col in the Grid
     * has been clicked on, false otherwise. HINT: Use the appropriate Grid and
     * Symbol class methods. Throw an IllegalArgumentException with the message
     * “Invalid row” if row is less than 0 or greater than or equal to the number of
     * rows. Throw an IllegalArgumentException with the message “Invalid col” if col
     * is less than 0 or greater than or equal to the number of columns.
     * 
     * @param row
     * @param col
     * @return
     */
    public boolean hasBeenClickedOn(int row, int col) {
        if (row <= 0 || row >= ROWS) {

            throw new IllegalArgumentException("Invalid row");

        }

        if (col <= 0 || col >= COLS) {

            throw new IllegalArgumentException("Invalid col");

        }
        boolean check = hasBeenClickedOn(row, col);
        return check;
    }

    /**
     * This method returns true if every Symbol in the grid has been clicked on
     *It returns false if the conditions aren't met 
     * 
     * @return boolean weather or not the game is over
     */
    public boolean isGameOver() {
        boolean gameOver = false;
        int c = 0;
        boolean clk = false;
        for (int i = 0; i <= ROWS; i++) {
            for (int j = 0; i <= COLS; i++) {
                clk = hasBeenClickedOn(i, j);
                if (clk == false) {
                    c++;
                }
            }
        }
        if (c == 0) {
            gameOver = true;
        }
        return gameOver;
    }

    /**
     * This method sets the row and column of the next Symbol to be displayed.
     */
    private void updateNextRowAndCol() {
        int row = this.nextRow;
        int col = this.nextCol;
        if (isGameOver()) {
            this.nextRow = -1;
            this.nextCol = -1;
        } else if (testingMode) {
            if (row == 4) {
                if (col == 4) {
                    this.nextRow = 0;
                    this.nextCol = 0;
                } else {
                    this.nextCol++;
                }
            } else {
                if (col == 4) {
                    this.nextRow++;
                    this.nextCol = 0;
                } else {
                    this.nextCol++;
                }
            }
        } else {
            while (1 > 0) {
                this.nextRow = numGen.nextInt(ROWS);
                this.nextCol = numGen.nextInt(COLS);
                if (arrange.getSymbol(nextRow, nextCol).hasBeenClickedOn()) {
                    continue;
                } else
                    break;
            }
        }
    }

    /**
     * If the Symbol in the given row and col has not been clicked on, this method
     * should set the Symbol to “has been clicked on”, update the total score with
     * the number of points for the Symbol, and call the updateNextRowAndCol()
     * method described above. Throw an IllegalArgumentException with the message
     * “Invalid row” if row is less than 0 or greater than or equal to the number of
     * rows. Throw an IllegalArgumentException with the message “Invalid col” if col
     * is less than 0 or greater than or equal to the number of columns.
     * 
     * @param row
     * @param col
     */
    public void clickOnSymbol(int row, int col) {
        if (row <= 0 || row >= ROWS) {

            throw new IllegalArgumentException("Invalid row");

        }

        if (col <= 0 || col >= COLS) {

            throw new IllegalArgumentException("Invalid col");

        }
    }

    /**
     * This method should add one to the number of misses and call the
     * updateNextRowAndCol() method described above.
     */
    public void addMiss() {
        this.misses++;
        updateNextRowAndCol();
    }

    /**
     * This method returns the Grid object. It will be used for testing/grading.
     * 
     * @return Grid
     */
    public Grid getGrid() {
        return this.arrange;
    }
}
