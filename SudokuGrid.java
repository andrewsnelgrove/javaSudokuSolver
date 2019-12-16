package com.andrewsnelgrove;

import java.util.ArrayList;

public class SudokuGrid {
    //Fields
    private ArrayList<SudokuBox> theSudokuGrid;

    private SudokuBox sudokuBox_0;
    private SudokuBox sudokuBox_1;
    private SudokuBox sudokuBox_2;
    private SudokuBox sudokuBox_3;
    private SudokuBox sudokuBox_4;
    private SudokuBox sudokuBox_5;
    private SudokuBox sudokuBox_6;
    private SudokuBox sudokuBox_7;
    private SudokuBox sudokuBox_8;

    //Initializer
    public SudokuGrid() {
        this.theSudokuGrid = new ArrayList<SudokuBox>();

        this.sudokuBox_0 = new SudokuBox(0, 0, 0);
        this.sudokuBox_1 = new SudokuBox(0, 3, 1);
        this.sudokuBox_2 = new SudokuBox(0, 6, 2);

        this.sudokuBox_3 = new SudokuBox(3, 0, 3);
        this.sudokuBox_4 = new SudokuBox(3, 3, 4);
        this.sudokuBox_5 = new SudokuBox(3, 6, 5);

        this.sudokuBox_6 = new SudokuBox(6, 0, 6);
        this.sudokuBox_7 = new SudokuBox(6, 3, 7);
        this.sudokuBox_8 = new SudokuBox(6, 6, 8);

        this.theSudokuGrid.add(this.sudokuBox_0);
        this.theSudokuGrid.add(this.sudokuBox_1);
        this.theSudokuGrid.add(this.sudokuBox_2);
        this.theSudokuGrid.add(this.sudokuBox_3);
        this.theSudokuGrid.add(this.sudokuBox_4);
        this.theSudokuGrid.add(this.sudokuBox_5);
        this.theSudokuGrid.add(this.sudokuBox_6);
        this.theSudokuGrid.add(this.sudokuBox_7);
        this.theSudokuGrid.add(this.sudokuBox_8);
    }
    //Methods

    /**
     * This function takes a square ID and answer for the square, and changes the current answer of the square to the
     * given answer.
     *
     * @param squareID: An integer between 0 and 80 inclusive that represents the number of the small squares on the
     *                  sudoku grid. The numbering starts at 0 in the top leftmost square on the grid, then counts left
     *                  to the end of the row, then down the next row, etc., until one hits the bottom rightmost square
     *                  on the grid.
     * @param answer:   An integer between 1 and 9 inclusive that represents the one answer for a small square on the
     *                  sudoku grid.
     */
    public void changeAns(int squareID, int answer) {
        navToSquare(squareID).changeAnswer(answer);
    }

    /**
     * This function checks if the whole grid is filled with one answer for every square.
     *
     * @return true if whole grid is filled with one answer for every square, false if not.
     */
    public boolean isGridFull() {
        for (SudokuBox box : this.theSudokuGrid) {
            if (box.isFull() == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * This function returns the answer possibilities currently written for a small square.
     *
     * @param squareID: An integer between 0 and 80 inclusive that represents the number of the small squares on the
     *                sudoku grid. The numbering starts at 0 in the top leftmost square on the grid, then counts left
     *                to the end of the row, then down the next row, etc., until one hits the bottom rightmost square
     *                on the grid.
     * @return: An arraylist of Integer types of the current written possibilities for the small square with the
     *          squareID.
     */

    public ArrayList<Integer> getPossibilities(int squareID){
        return navToSquare(squareID).getPossibleAnswers();
    }

    /**
     * This function prints to the terminal the current solved sudoku grid.
     */
    public void printAnswersGrid(){
        int ansToPrint;

        int counter = 0;

        for (int i = 0; i <= 80; i++){
            if (counter == 9){
                System.out.println();
                counter = 0;
            }
            ansToPrint = navToSquare(i).getAnswer();

            System.out.print( "   " + String.valueOf(ansToPrint) + "   " );

            counter += 1;

        }


    }

    public void printPossibilitiesGrid(){


    }

    /**
     * This method saves code length by navigating to the square and returning that square.
     *
     * @param squareID: An integer between 0 and 80 inclusive that represents the number of the small squares on the
     *                       sudoku grid. The numbering starts at 0 in the top leftmost square on the grid, then counts left
     *                       to the end of the row, then down the next row, etc., until one hits the bottom rightmost square
     *                       on the grid.
     * @return Returns the square object found at that squareID in the sudoku grid. **CHECK**
     */
    private SmallestSudokuSquare navToSquare(int squareID){
        /*-----------------------------------BOX 0-------------------------------------*/
        /*----------------------------------Top Row------------------------------------*/

        if (squareID == 0 || squareID == 1 || squareID == 2 ) {
            return theSudokuGrid.get(0).getSmallSquare( squareID );
        }
        //Mid Row
        else if (squareID == 9 || squareID == 10 || squareID == 11 ) {
            return theSudokuGrid.get(0).getSmallSquare( squareID - 6 );
        }
        //Bottom Row
        else if (squareID == 18 || squareID == 19 || squareID == 20) {
            return theSudokuGrid.get(0).getSmallSquare(squareID - 12 );
        }
        //BOX 1
        //Top Row
        else if (squareID == 3 || squareID == 4 || squareID == 5 ) {
            return theSudokuGrid.get(1).getSmallSquare(squareID - 3);
        }

        //Mid Row

        else if (squareID == 12 || squareID == 13 || squareID == 14) {
            return theSudokuGrid.get(1).getSmallSquare(squareID - 9);
        }
        //Bottom Row
        else if (squareID == 21 || squareID == 22 || squareID == 23) {
            return theSudokuGrid.get(1).getSmallSquare(squareID - 15);
        }
        //BOX 2
        //Top Row
        else if (squareID == 6 || squareID == 7 || squareID == 8) {
            return theSudokuGrid.get(2).getSmallSquare(squareID - 6);
        }
        //Mid Row
        else if (squareID == 15 || squareID == 16 || squareID == 17) {
            return theSudokuGrid.get(2).getSmallSquare(squareID - 12 );
        }
        //Bottom Row
        else if (squareID == 24 || squareID == 25 || squareID == 26 ) {
            return theSudokuGrid.get(2).getSmallSquare(squareID - 18);
        }
        //BOX 3
        //Top Row
        else if (squareID == 27 || squareID == 28 || squareID == 29) {
            return theSudokuGrid.get(3).getSmallSquare(squareID - 27);
        }
        //Mid Row
        else if (squareID == 36 || squareID == 37 || squareID == 38) {
            return theSudokuGrid.get(3).getSmallSquare(squareID - 33);
        }
        //Bottom Row
        else if (squareID == 45 || squareID == 46 || squareID == 47) {
            return theSudokuGrid.get(3).getSmallSquare(squareID - 39);
        }
        //BOX 4
        //Top Row
        else if (squareID == 30 || squareID == 31 || squareID == 32) {
            return theSudokuGrid.get(4).getSmallSquare(squareID - 30);
        }
        //Mid Row
        else if (squareID == 39 || squareID == 40 || squareID == 41) {
            return theSudokuGrid.get(4).getSmallSquare(squareID - 36);
        }
        //LAST STOPPED HERE
        else if (squareID == 48 || squareID == 49 || squareID == 50) {
            return theSudokuGrid.get(4).getSmallSquare(squareID - 42);
        }
        //BOX 5
        //Top Row
        else if (squareID == 33 || squareID == 34 || squareID == 35) {
            return theSudokuGrid.get(5).getSmallSquare(squareID - 33);
        }
        //Mid Row
        else if (squareID == 42 || squareID == 43 || squareID == 44) {
            return theSudokuGrid.get(5).getSmallSquare(squareID - 39);
        }
        //Bottom Row
        else if (squareID == 51 || squareID == 52 || squareID == 53) {
            return theSudokuGrid.get(5).getSmallSquare(squareID - 45);
        }
        //BOX 6
        //Top Row
        else if (squareID == 54 || squareID == 55 || squareID == 56) {
            return theSudokuGrid.get(6).getSmallSquare(squareID - 54);
        }
        //Mid Row
        else if (squareID == 63 || squareID == 64 || squareID == 65) {
            return theSudokuGrid.get(6).getSmallSquare(squareID - 60);
        }
        //Bottom Row
        else if (squareID == 72 || squareID == 73 || squareID == 74) {
            return theSudokuGrid.get(6).getSmallSquare(squareID - 66);
        }
        //BOX 7
        //Top Row
        else if (squareID == 57 || squareID == 58 || squareID == 59) {
            return theSudokuGrid.get(7).getSmallSquare(squareID - 57);
        }
        //Mid Row
        else if (squareID == 66 || squareID == 67 || squareID == 68) {
            return theSudokuGrid.get(7).getSmallSquare(squareID - 63);
        }
        //Bottom Row
        else if (squareID == 75 || squareID == 76 || squareID == 77) {
            return theSudokuGrid.get(7).getSmallSquare(squareID - 69);
        }
        //BOX 8
        //Top Row
        else if (squareID == 60 || squareID == 61 || squareID == 62) {
            return theSudokuGrid.get(8).getSmallSquare(squareID - 60);
        }
        //Mid Row
        else if (squareID == 69 || squareID == 70 || squareID == 71) {
            return theSudokuGrid.get(8).getSmallSquare(squareID - 66);
        }
        //Bottom Row
        else //if (squareID == 78 || squareID == 79 || squareID == 80) {
            return theSudokuGrid.get(8).getSmallSquare(squareID - 73);
        }



    public void addPossibilities(int squareID, int possAns){
            navToSquare(squareID).addPossibleAnswer(possAns);
        }





    /**
     * This method removes the
     * @param squareID
     * @param possToRemove
     */
    public void removePossibilities(int squareID, int possToRemove){
        navToSquare(squareID).removePossibleAnswer(possToRemove);
    }


    //SOLVING THE PUZZLE METHODS

    public void solveSudokuPuzzle(){


    }

    private int mapRowStartToSquareID(int rowNumber){

        if (rowNumber == 0) { return 0; }
        else if (rowNumber == 1) { return 9; }
        else if (rowNumber == 2) { return 18; }
        else if (rowNumber == 3) { return 27; }
        else if (rowNumber == 4) { return 36; }
        else if (rowNumber == 5) { return 45; }
        else if (rowNumber == 6) { return 54; }
        else if (rowNumber == 7) { return 63; }
        else if (rowNumber == 8) { return 72; }

    }

    /**
     * This function converts a squareID in the sudoku grid to the row number of the grid.
     * @param squareID: An integer between 0 and 80 inclusive that represents a small square of the
     *                sudoku grid.
     * @return An integer between 0 and 8 inclusive that represents the row number on the sudoku grid
     *         where the small square with the squareID is located.
     */

    private int mapSquareIDtoRowNumber(int squareID){
        if      (squareID >= 0 && squareID <= 8){ return 0; }
        else if (squareID >= 9 && squareID <= 17) { return 1; }
        else if (squareID >= 18 && squareID <= 26) { return 2; }
        else if (squareID >= 27 && squareID <= 35) {return 3;}
        else if (squareID >= 36 && squareID <= 44) {return 4;}
        else if (squareID >= 45 && squareID <= 53) {return 5;}
        else if (squareID >= 54 && squareID <= 62) {return 6;}
        else if (squareID >= 63 && squareID <= 71) {return 7;}
        else if (squareID >= 72 && squareID <= 80) {return 8;}
        
    }

    private int mapColumnStartToSquareID(int columnNumber){
        return columnNumber;
    }



    private boolean isNumInRow(int numberToCheck, int rowToCheck) {
        int squareID = mapRowStartToSquareID(rowToCheck);

        for (int column = 0; column <= 8; column++) {
            if (numberToCheck == navToSquare(squareID).getAnswer()) {
                return True;
            } else {
                squareID += 1;
            }
            return False;
        }
    }

    private boolean isNumInRowPossibility(int numberToCheck, int rowToCheck){
        int squareID = mapRowStartToSquareID(rowToCheck);
        ArrayList<Integer> possAnsList;

        for (int column = 0; column <= 8; column++) {
            possAnsList = navToSquare(squareID).getPossibleAnswers();
            if (possAnsList.size() != 0 ) {
                for (int k = 0; k < possAnsList.size(); k++) {
                    if (numberToCheck == possAnsList.get(k)) {
                        return True;
                        }
                    }
                }
            squareID += 1;
                }
        return False; //Check this.
                

            }

    private boolean isNumInCol(int numberToCheck, int columnToCheck) {
        int squareID = mapColumnStartToSquareID(columnToCheck);

        for (int row = 0; row <= 8; row++) {
            if ( numberToCheck == navToSquare(squareID).getAnswer() ) {
                return True;
            } else {
                squareID += 9; //We are going down the column, so it's plus 9 every time.
            }
            return False;
        }
    }

    private boolean isNumInColPossibility(int numberToCheck, int columnToCheck) {
        int squareID = mapColumnStartToSquareID(columnToCheck);
        ArrayList<Integer> possAnsList;

        for (int row = 0; row <=8; row++){
            possAnsList = navToSquare(squareID).getPossibleAnswers();
            if (possAnsList.size() != 0) {
                for (int k = 0; k < possAnsList.size(); k++){
                    if (numberToCheck == possAnsList.get(k)){
                        return True;
                    }
                }
            }
            squareID += 9; //We are going down the column, so it's plus 9 every time.
        }
        return False;//Check this.
    }

///
    public void solveGrid(){

        //First, make all the possibilities for every small square in the grid for the first time.

        //Write the possibilties for every square row by row.
        //First check, what answers are in the row, what answers are in the column, and what answers are in the box. Do
        //not write duplicates.

        for (int squareNumber = 0; squareNumber <= 80; squareNumber++) { //For every square in the grid...
            ArrayList<Integer> rowAnswers = ArrayList<Integer>(); //make an empty row answer list...
            ArrayList<Integer> columnAnswers = ArrayList<Integer>();//make an empty column answer list...
            ArrayList<Integer> boxAnswers = ArrayList<Integer>();//make an empty box answer list...

            //First get row answers
            for (int numberToCheck = 1; numberToCheck <= 9; numberToCheck++){ //For every potential answer (1 - 9)
                if (navToSquare(squareNumber).getAnswer() == numb)//See if that number is in the row of the square

            }
        }







        //Then, if any possibility in any square is 1, then that is the answer for that square. Write it as
        //that square's answer. (When you write an answer to a square, make sure you eliminate it from the
        //row, column and box possibilities for every small square.) Then, recheck if any possibility in the square is one.
        //IF NOT:
        //Then see if there is a unique number in the possibility for row, column, and box. If yes, then that is the answer
        //for that square. Use the function to write the answer to the grid and eliminating it from the other possibilities.

        boolean box0Solved = False;
        boolean box1Solved = False;
        boolean box2Solved = False;
        boolean box3Solved = False;
        boolean box4Solved = False;
        boolean box5Solved = False;
        boolean box6Solved = False;
        boolean box7Solved = False;
        boolean box8Solved = False;
        //FINISH

        


    }

     //END CLASS CLOSING
    }











/*

    public boolean isNumInRowAns(int row, int number)
    {
        if (row == 0) {
            for (int i = 0; i <= 8; i++) {
                int answer = navToSquare(i).getAnswer();
                if (number == answer) {
                    return True;
                }
            }
        }
        if (row = 1) {
            for (int i = 9; i <= 17; i++) {
                int answer = navToSquare(i).getAnswer();
                if (number == answer) {
                    return True;
                }
            }
        }


        return False;

*/


        /*
        if (row < 3)
        {
            if
            (
                    (theSudokuGrid.get(0).getSmallSquare(0).getAns() == number)
                            || (theSudokuGrid.get(0).getSmallSquare(1).getAns() == number)
                            || (theSudokuGrid.get(0).getSmallSquare(2).getAns() == number)
            )
                return true
        }

        else if ( (row >=3) && (row < 6) )
        {
            if
            (
                    (theSudokuGrid.get(0).getSmallSquare(0).getAns() == number) || (theSudokuGrid.get(0).getSmallSquare(1).getAns() == number) || (theSudokuGrid.get(0).getSmallSquare(2).getAns() == number)
            )
                return true
        }

        else if ( (row >=6) && (row < 9) )
        {

        }
    }
/*
    public boolean numberIsInColumnAnswer(int column, int number)

    public boolean numberIsInBoxAnswer(int boxNumber, int number)

    public boolean numberIsInRowPossibilities

    public boolean numberIsInColumnPossibilities

    public boolean numberIsInBoxPossibilities

    public ... getBox()
}
*/
}