package com.javaSudokuSolverPackage;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class describes each individual square on the Sudoku piece: 9 x 9. Accessor methods include getting the answer written
 * for the square, possible answers for the square, the block number for the square, and methods to edit the values for
 * answer, possible answers, and block number for the square.
 *
 * @author Andrew Snelgrove
 * @version Jan 5 2020
 */

public class SmallestSudokuSquare {
   /*---------------------------------------FIELDS-------------------------------------------*/

    private int rowNumber;
    private int columnNumber;
    private int boxNumber;
    private int answer;
    private ArrayList<Integer> possibleAnswers;


    /*------------------------------------CONSTRUCTOR-------------------------------------------*/

    public SmallestSudokuSquare(int row, int column, int boxNumber) {
        this.rowNumber = row;
        this.columnNumber = column;
        this.boxNumber = boxNumber;
        this.answer = -1;
        this.possibleAnswers = new ArrayList<Integer>();
    }

    /*------------------------------------ACCESSORS-------------------------------------------*/

    /**
     * This method returns an integer representing the block number from the whole
     * sudoku grid that the small square belongs to.
     *
     * @return An integer representing the block number that the small square belongs to.
     */
    public int getBoxNumber() {
        return this.boxNumber;
    }

    /**
     * This method returns the answer of the square.
     *
     * @return An integer that represents the answer in the square.
     * If the integer is -1, it means that there is no answer that has been added to the square.
     */

    public int getAnswer() {
        return this.answer;
    }

    /**
     * This method returns an array of integers of all of the current possible answers for that small square.
     *
     * @return An array of integers that represent the current possible answers written to the
     * square that that square could be.
     */

    public ArrayList<Integer> getPossibleAnswers() {
        return this.possibleAnswers;
    }

    /*------------------------------------MANIPULATORS-------------------------------------------*/

    /**
     * This function changes the block number of the square.
     *
     * @param newBoxNumber: An integer representing the box number.
     */

    public void changeBlockNumber(int newBoxNumber) {
        this.boxNumber = newBoxNumber;
    }

    /**
     * This function changes the answer of the square to the given answer.
     *
     * @param newAnswer: An integer between 1 and 9 inclusive.
     */

    public void changeAnswer(int newAnswer) {
        this.answer = newAnswer;
    }

    /**
     * This function adds a possible integer answer from 1 to 9 inclusive that could be
     * the actual answer of the square that solves the overall Sudoku puzzle.
     *
     * @param newPossibleAnswer: An integer between 1 to 9 inclusive.
     */

    public void addPossibleAnswer(int newPossibleAnswer) {
        this.possibleAnswers.add(newPossibleAnswer);
    }

    /**
     * This function removes a possible integer answer from the square's list of possible
     * integer answers that could solve the Sudoku puzzle.
     *
     * @param possibilityToRemove: An integer between 1 and 9 inclusive.
     */

    public void removePossibleAnswer(int possibilityToRemove) {

        Iterator it = this.possibleAnswers.iterator();
        while (it.hasNext()) {
            Integer possAnswer = (Integer) it.next();
            if (possibilityToRemove == possAnswer) {
                it.remove();
            }

        }

    }

    //NEW
    public void replacePossibleAnswerList(ArrayList<Integer> newList){
        this.possibleAnswers = newList;
    }
    //New
    public void clearPossibleAnswers(){
        this.possibleAnswers.clear();
    }


}
