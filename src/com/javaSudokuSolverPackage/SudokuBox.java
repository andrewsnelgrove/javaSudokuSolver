package com.javaSudokuSolverPackage;

import java.util.ArrayList;

/**
 * This class describes one square or "box" of 9 small sudoku squares in a sudoku grid. A sudoku box would be ordered
 * on a sudoku grid starting at 0 in the top left corner, then 1 for the top middle row, then 2 for the top right corner,
 * then 3 for the left side of the middle row, etc., up to 8 inclusive for the last one in the bottom right corner.
 * It uses objects of the SmallestSudokuSquare class. Methods include returning a particular small square object in the box,
 * and a method to check if the entire box is filled with squares that each have an answer filled in already.
 *
 * @author Andrew Snelgrove
 * @version Jan 22 2020
 */

public class SudokuBox
{
    /*---------------------------------------FIELDS-------------------------------------------*/
    /**
     * These declare the instances variables for the class. These are each of the nine smallest sudoku squares that make
     * up the box. Top row has squares numbered 0, 1, 2 left to right, middle row squares numbered 3, 4, 5 left to right,
     * etc. sudokuBox is an ArrayList that holds all of the nine small squares.
     */
    private SmallestSudokuSquare square_0;
    private SmallestSudokuSquare square_1;
    private SmallestSudokuSquare square_2;
    private SmallestSudokuSquare square_3;
    private SmallestSudokuSquare square_4;
    private SmallestSudokuSquare square_5;
    private SmallestSudokuSquare square_6;
    private SmallestSudokuSquare square_7;
    private SmallestSudokuSquare square_8;

    private ArrayList<SmallestSudokuSquare> sudokuBox;

    /*------------------------------------CONSTRUCTOR-------------------------------------------*/

    /**
     * This is the constructor for the class. It sets up one square box of 9 small sudoku square objects
     * found in the sudoku grid, according to the following parameters.
     *
     * @param rowStartInclu: This is an integer number from 0 to 8 inclusive that represents the row in the sudoku grid that
     *                    corresponds to the top right small square found in the sudoku box on the grid. Rows are
     *                    numbered from 0 to 8 starting from the top to the bottom of the sudoku grid.
     * @param colStartInclud: This is an integer number from 0 to 8 inclusive that represents the column in the sudoku grid that
     *      *              corresponds to the top right small square found in the sudoku box on the grid. Columns are
     *      *              numbered from 0 to 8 starting from the left to the right of the sudoku grid.
     * @param sudokuBoxNumber: This is an integer number from 0 to 8 inclusive that represents the square box number that
     *                       the small square on the sudoku grid will belong to. On the sudoku grid, the sudoku boxes are number
     *                       from 0 to 8, reading each box from left to right, starting at the top of the sudoku grid.
     */
    public SudokuBox(int rowStartInclu, int colStartInclud, int sudokuBoxNumber)
    {
        this.square_0 = new SmallestSudokuSquare(   rowStartInclu,          colStartInclud,      sudokuBoxNumber);
        this.square_1 = new SmallestSudokuSquare(   rowStartInclu,         (colStartInclud+1),   sudokuBoxNumber);
        this.square_2 = new SmallestSudokuSquare(   rowStartInclu,         (colStartInclud+2),   sudokuBoxNumber);
        this.square_3 = new SmallestSudokuSquare( (rowStartInclu+1),        colStartInclud,      sudokuBoxNumber);
        this.square_4 = new SmallestSudokuSquare( (rowStartInclu+1),       (colStartInclud+1),   sudokuBoxNumber);
        this.square_5 = new SmallestSudokuSquare( (rowStartInclu+1),       (colStartInclud+2),   sudokuBoxNumber);
        this.square_6 = new SmallestSudokuSquare( (rowStartInclu+2),        colStartInclud,      sudokuBoxNumber);
        this.square_7 = new SmallestSudokuSquare( (rowStartInclu+2),       (colStartInclud+1),   sudokuBoxNumber);
        this.square_8 = new SmallestSudokuSquare( (rowStartInclu+2),       (colStartInclud+2),   sudokuBoxNumber);

        this.sudokuBox = new ArrayList<SmallestSudokuSquare>();

        this.sudokuBox.add(square_0);
        this.sudokuBox.add(square_1);
        this.sudokuBox.add(square_2);
        this.sudokuBox.add(square_3);
        this.sudokuBox.add(square_4);
        this.sudokuBox.add(square_5);
        this.sudokuBox.add(square_6);
        this.sudokuBox.add(square_7);
        this.sudokuBox.add(square_8);
    }

    /*------------------------------------METHODS-------------------------------------------*/

    /**
     * This method accepts a square number for a small square inside the sudoku box, and returns the small square object
     * that has that number.
     *
     * @param squareNumber: An integer from 0 to 8 inclusive that corresponds to the number of the small square in the sudoku box
     *                    object. Small squares in each sudoku box on the grid are numbered from 0 to 8, reading from left
     *                    to right, top to bottom.
     * @return A SmallestSudokuSquare object that has that square number.
     */

    public SmallestSudokuSquare getSmallSquare(int squareNumber)
    {
        return sudokuBox.get(squareNumber);
    }

    /**
     * This method checks if the given sudoku box object is full or not, meaning that every square in the box has a
     * valid written answer to it (not -1, which means no answer is written to it).
     *
     * @return true if the sudoku box is full, false if it is not.
     */

    public boolean isFull()
    {
        for (SmallestSudokuSquare squareToCheck : sudokuBox)
        {
            if (squareToCheck.getAnswer() == -1)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * This method checks if the given integer number is in this sudoku box as a written answer in the box's
     * squares.
     * @param numberToCheck: The integer number to check if it is in this sudoku box.
     * @return true if numberToCheck is written as an answer for a square in the sudoku box, false if not.
     */

    public boolean isNumberInBox(int numberToCheck) {
        for (SmallestSudokuSquare smallSquare : this.sudokuBox) {
            if (smallSquare.getAnswer() == numberToCheck) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method checks if the given integer number is listed as a possible answer already in any of the squares
     * in this sudoku box.
     *
     * @param numberToCheck: An integer number
     * @return True if numberToCheck is written already as a possible answer in any of the squares in this sudoku box,
     * false if not.
     */

    public boolean isNumInBoxPossibility(int numberToCheck) {
        ArrayList<Integer> possAnsList;
        for (SmallestSudokuSquare smallSquare : this.sudokuBox) {
            possAnsList = smallSquare.getPossibleAnswers();
            if (possAnsList.size() != 0) {
                for (int k = 0; k < possAnsList.size(); k++){
                    if (possAnsList.get(k) == numberToCheck) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * This method checks if the given integer number is listed ONLY ONCE in any of the possible answers for any
     * square in this sudoku box.
     * @param numberToCheck: An integer number.
     * @return: True if numberToCheck is listed ONLY ONCE in any of the possible answers for any square in this
     * sudoku box, False if not.
     */

    public boolean isNumUniqueInBoxPossibilities(int numberToCheck){
        ArrayList<Integer> possAnsList;
        int numberFrequency = 0;
        for (SmallestSudokuSquare smallSquare : this.sudokuBox) {
            possAnsList = smallSquare.getPossibleAnswers();
            if (possAnsList.size() != 0) {
                for (int k = 0; k < possAnsList.size(); k++){
                    if (possAnsList.get(k) == numberToCheck) {
                        numberFrequency += 1;
                    }
                }
            }
        }
        if (numberFrequency == 1){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * This method checks if all the squares in this sudoku box has a written answer.
     * @return True if all the squares in this sudoku box has a written answer, False if not.
     */

    public boolean isWholeBoxSolved(){
        int filledCount = 0;
        for (SmallestSudokuSquare smallSquare : this.sudokuBox){
            if (smallSquare.getAnswer() != -1){
                filledCount += 1;
            }
        }
        if (filledCount == 9){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method removes a given integer in every square's possible answer list in the sudoku box, if it exists
     * in the square's possible answer list.
     * @param possibilityToRemove: An integer number.
     */

    public void removePossibilityFromBox(int possibilityToRemove){
        for (SmallestSudokuSquare smallSquare : this.sudokuBox){
            smallSquare.removePossibleAnswer(possibilityToRemove);
        }
    }


}