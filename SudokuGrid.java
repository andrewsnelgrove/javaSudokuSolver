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
        theSudokuGrid = new ArrayList<SudokuBox>();

        sudokuBox_0 = new SudokuBox(0, 0, 0);
        sudokuBox_1 = new SudokuBox(0, 3, 1);
        sudokuBox_2 = new SudokuBox(0, 6, 2);

        sudokuBox_3 = new SudokuBox(3, 0, 3);
        sudokuBox_4 = new SudokuBox(3, 3, 4);
        sudokuBox_5 = new SudokuBox(3, 6, 5);

        sudokuBox_6 = new SudokuBox(6, 0, 6);
        sudokuBox_7 = new SudokuBox(6, 3, 7);
        sudokuBox_8 = new SudokuBox(6, 6, 8);

        theSudokuGrid.add(sudokuBox_0);
        theSudokuGrid.add(sudokuBox_1);
        theSudokuGrid.add(sudokuBox_2);
        theSudokuGrid.add(sudokuBox_3);
        theSudokuGrid.add(sudokuBox_4);
        theSudokuGrid.add(sudokuBox_5);
        theSudokuGrid.add(sudokuBox_6);
        theSudokuGrid.add(sudokuBox_7);
        theSudokuGrid.add(sudokuBox_8);
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
        /*-----------------------------------BOX 0-------------------------------------*/
        /*----------------------------------Top Row------------------------------------*/
        if (squareID == 0) {
            theSudokuGrid.get(0).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 1) {
            theSudokuGrid.get(0).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 2) {
            theSudokuGrid.get(0).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 9) {
            theSudokuGrid.get(0).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 10) {
            theSudokuGrid.get(0).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 11) {
            theSudokuGrid.get(0).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 18) {
            theSudokuGrid.get(0).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 19) {
            theSudokuGrid.get(0).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 20) {
            theSudokuGrid.get(0).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 1
        //Top Row
        else if (squareID == 3) {
            theSudokuGrid.get(1).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 4) {
            theSudokuGrid.get(1).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 5) {
            theSudokuGrid.get(1).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row

        else if (squareID == 12) {
            theSudokuGrid.get(1).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 13) {
            theSudokuGrid.get(1).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 14) {
            theSudokuGrid.get(1).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 21) {
            theSudokuGrid.get(1).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 22) {
            theSudokuGrid.get(1).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 23) {
            theSudokuGrid.get(1).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 2
        //Top Row
        else if (squareID == 6) {
            theSudokuGrid.get(2).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 7) {
            theSudokuGrid.get(2).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 8) {
            theSudokuGrid.get(2).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 15) {
            theSudokuGrid.get(2).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 16) {
            theSudokuGrid.get(2).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 17) {
            theSudokuGrid.get(2).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 24) {
            theSudokuGrid.get(2).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 25) {
            theSudokuGrid.get(2).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 26) {
            theSudokuGrid.get(2).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 3
        //Top Row
        else if (squareID == 27) {
            theSudokuGrid.get(3).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 28) {
            theSudokuGrid.get(3).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 29) {
            theSudokuGrid.get(3).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 36) {
            theSudokuGrid.get(3).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 37) {
            theSudokuGrid.get(3).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 38) {
            theSudokuGrid.get(3).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 45) {
            theSudokuGrid.get(3).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 46) {
            theSudokuGrid.get(3).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 47) {
            theSudokuGrid.get(3).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 4
        //Top Row
        else if (squareID == 30) {
            theSudokuGrid.get(4).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 31) {
            theSudokuGrid.get(4).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 32) {
            theSudokuGrid.get(4).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 39) {
            theSudokuGrid.get(4).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 40) {
            theSudokuGrid.get(4).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 41) {
            theSudokuGrid.get(4).getSmallSquare(5).changeAnswer(answer);
        }
        //LAST STOPPED HERE
        else if (squareID == 48) {
            theSudokuGrid.get(4).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 49) {
            theSudokuGrid.get(4).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 50) {
            theSudokuGrid.get(4).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 5
        //Top Row
        else if (squareID == 33) {
            theSudokuGrid.get(5).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 34) {
            theSudokuGrid.get(5).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 35) {
            theSudokuGrid.get(5).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 42) {
            theSudokuGrid.get(5).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 43) {
            theSudokuGrid.get(5).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 44) {
            theSudokuGrid.get(5).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 51) {
            theSudokuGrid.get(5).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 52) {
            theSudokuGrid.get(5).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 53) {
            theSudokuGrid.get(5).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 6
        //Top Row
        else if (squareID == 54) {
            theSudokuGrid.get(6).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 55) {
            theSudokuGrid.get(6).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 56) {
            theSudokuGrid.get(6).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 63) {
            theSudokuGrid.get(6).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 64) {
            theSudokuGrid.get(6).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 65) {
            theSudokuGrid.get(6).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 72) {
            theSudokuGrid.get(6).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 73) {
            theSudokuGrid.get(6).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 74) {
            theSudokuGrid.get(6).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 7
        //Top Row
        else if (squareID == 57) {
            theSudokuGrid.get(7).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 58) {
            theSudokuGrid.get(7).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 59) {
            theSudokuGrid.get(7).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 66) {
            theSudokuGrid.get(7).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 67) {
            theSudokuGrid.get(7).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 68) {
            theSudokuGrid.get(7).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 75) {
            theSudokuGrid.get(7).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 76) {
            theSudokuGrid.get(7).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 77) {
            theSudokuGrid.get(7).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 8
        //Top Row
        else if (squareID == 60) {
            theSudokuGrid.get(8).getSmallSquare(0).changeAnswer(answer);
        } else if (squareID == 61) {
            theSudokuGrid.get(8).getSmallSquare(1).changeAnswer(answer);
        } else if (squareID == 62) {
            theSudokuGrid.get(8).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 69) {
            theSudokuGrid.get(8).getSmallSquare(3).changeAnswer(answer);
        } else if (squareID == 70) {
            theSudokuGrid.get(8).getSmallSquare(4).changeAnswer(answer);
        } else if (squareID == 71) {
            theSudokuGrid.get(8).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 78) {
            theSudokuGrid.get(8).getSmallSquare(6).changeAnswer(answer);
        } else if (squareID == 79) {
            theSudokuGrid.get(8).getSmallSquare(7).changeAnswer(answer);
        } else if (squareID == 80) {
            theSudokuGrid.get(8).getSmallSquare(8).changeAnswer(answer);
        }
    }


    /**
     * This function checks if the whole grid is filled with one answer for every square.
     *
     * @return true if whole grid is filled with one answer for every square, false if not.
     */
    public boolean isGridFull() {
        for (SudokuBox box : theSudokuGrid) {
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
        /*-----------------------------------BOX 0-------------------------------------*/
        /*----------------------------------Top Row------------------------------------*/
        if (squareID == 0) {
            return theSudokuGrid.get(0).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 1) {
            theSudokuGrid.get(0).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 2) {
            theSudokuGrid.get(0).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 9) {
            theSudokuGrid.get(0).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 10) {
            theSudokuGrid.get(0).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 11) {
            theSudokuGrid.get(0).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 18) {
            theSudokuGrid.get(0).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 19) {
            theSudokuGrid.get(0).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 20) {
            theSudokuGrid.get(0).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 1
        //Top Row
        else if (squareID == 3) {
            theSudokuGrid.get(1).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 4) {
            theSudokuGrid.get(1).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 5) {
            theSudokuGrid.get(1).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row

        else if (squareID == 12) {
            theSudokuGrid.get(1).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 13) {
            theSudokuGrid.get(1).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 14) {
            theSudokuGrid.get(1).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 21) {
            theSudokuGrid.get(1).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 22) {
            theSudokuGrid.get(1).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 23) {
            theSudokuGrid.get(1).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 2
        //Top Row
        else if (squareID == 6) {
            theSudokuGrid.get(2).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 7) {
            theSudokuGrid.get(2).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 8) {
            theSudokuGrid.get(2).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 15) { // CONTINUE FROM HERE!
            theSudokuGrid.get(2).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 16) {
            theSudokuGrid.get(2).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 17) {
            theSudokuGrid.get(2).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 24) {
            theSudokuGrid.get(2).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 25) {
            theSudokuGrid.get(2).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 26) {
            theSudokuGrid.get(2).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 3
        //Top Row
        else if (squareID == 27) {
            theSudokuGrid.get(3).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 28) {
            theSudokuGrid.get(3).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 29) {
            theSudokuGrid.get(3).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 36) {
            theSudokuGrid.get(3).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 37) {
            theSudokuGrid.get(3).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 38) {
            theSudokuGrid.get(3).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 45) {
            theSudokuGrid.get(3).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 46) {
            theSudokuGrid.get(3).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 47) {
            theSudokuGrid.get(3).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 4
        //Top Row
        else if (squareID == 30) {
            theSudokuGrid.get(4).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 31) {
            theSudokuGrid.get(4).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 32) {
            theSudokuGrid.get(4).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 39) {
            theSudokuGrid.get(4).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 40) {
            theSudokuGrid.get(4).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 41) {
            theSudokuGrid.get(4).getSmallSquare(5).getPossibleAnswers();
        }
        //LAST STOPPED HERE
        else if (squareID == 48) {
            theSudokuGrid.get(4).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 49) {
            theSudokuGrid.get(4).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 50) {
            theSudokuGrid.get(4).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 5
        //Top Row
        else if (squareID == 33) {
            theSudokuGrid.get(5).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 34) {
            theSudokuGrid.get(5).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 35) {
            theSudokuGrid.get(5).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 42) {
            theSudokuGrid.get(5).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 43) {
            theSudokuGrid.get(5).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 44) {
            theSudokuGrid.get(5).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 51) {
            theSudokuGrid.get(5).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 52) {
            theSudokuGrid.get(5).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 53) {
            theSudokuGrid.get(5).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 6
        //Top Row
        else if (squareID == 54) {
            theSudokuGrid.get(6).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 55) {
            theSudokuGrid.get(6).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 56) {
            theSudokuGrid.get(6).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 63) {
            theSudokuGrid.get(6).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 64) {
            theSudokuGrid.get(6).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 65) {
            theSudokuGrid.get(6).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 72) {
            theSudokuGrid.get(6).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 73) {
            theSudokuGrid.get(6).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 74) {
            theSudokuGrid.get(6).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 7
        //Top Row
        else if (squareID == 57) {
            theSudokuGrid.get(7).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 58) {
            theSudokuGrid.get(7).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 59) {
            theSudokuGrid.get(7).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 66) {
            theSudokuGrid.get(7).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 67) {
            theSudokuGrid.get(7).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 68) {
            theSudokuGrid.get(7).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 75) {
            theSudokuGrid.get(7).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 76) {
            theSudokuGrid.get(7).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 77) {
            theSudokuGrid.get(7).getSmallSquare(8).getPossibleAnswers();
        }
        //BOX 8
        //Top Row
        else if (squareID == 60) {
            theSudokuGrid.get(8).getSmallSquare(0).getPossibleAnswers();
        } else if (squareID == 61) {
            theSudokuGrid.get(8).getSmallSquare(1).getPossibleAnswers();
        } else if (squareID == 62) {
            theSudokuGrid.get(8).getSmallSquare(2).getPossibleAnswers();
        }
        //Mid Row
        else if (squareID == 69) {
            theSudokuGrid.get(8).getSmallSquare(3).getPossibleAnswers();
        } else if (squareID == 70) {
            theSudokuGrid.get(8).getSmallSquare(4).getPossibleAnswers();
        } else if (squareID == 71) {
            theSudokuGrid.get(8).getSmallSquare(5).getPossibleAnswers();
        }
        //Bottom Row
        else if (squareID == 78) {
            theSudokuGrid.get(8).getSmallSquare(6).getPossibleAnswers();
        } else if (squareID == 79) {
            theSudokuGrid.get(8).getSmallSquare(7).getPossibleAnswers();
        } else if (squareID == 80) {
            theSudokuGrid.get(8).getSmallSquare(8).getPossibleAnswers();
        }
    }

    

    public void addPossibilities(){

    }

    public void removePossibilities(){

    }
/*
    public boolean isNumInRowAns(int row, int number)
    {
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

    public boolean numberIsInColumnAnswer(int column, int number)

    public boolean numberIsInBoxAnswer(int boxNumber, int number)

    public boolean numberIsInRowPossibilities

    public boolean numberIsInColumnPossibilities

    public boolean numberIsInBoxPossibilities

    public ... getBox()
}
*/
}