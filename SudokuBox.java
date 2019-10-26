package com.andrewsnelgrove;

import java.util.ArrayList;

public class SudokuBox
{
    //Fields

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

    //Initalizer
    public SudokuBox(int rowStartInclu, int colStartInclud, int sudokuBoxNumber)
    {
        this.square_0 = new SmallestSudokuSquare(   rowStartInclu,          colStartInclud,      sudokuBoxNumber);
        this.square_1 = new SmallestSudokuSquare(   rowStartInclu,         (colStartInclud+1),   sudokuBoxNumber);
        this.square_2 = new SmallestSudokuSquare(   rowStartInclu,         (colStartInclud+2),   sudokuBoxNumber);
        square_3 = new SmallestSudokuSquare( (rowStartInclu+1),        colStartInclud,      sudokuBoxNumber);
        square_4 = new SmallestSudokuSquare( (rowStartInclu+1),       (colStartInclud+1),   sudokuBoxNumber);
        square_5 = new SmallestSudokuSquare( (rowStartInclu+1),       (colStartInclud+2),   sudokuBoxNumber);
        square_6 = new SmallestSudokuSquare( (rowStartInclu+2),        colStartInclud,      sudokuBoxNumber);
        square_7 = new SmallestSudokuSquare( (rowStartInclu+2),       (colStartInclud+1),   sudokuBoxNumber);
        square_8 = new SmallestSudokuSquare( (rowStartInclu+2),       (colStartInclud+2),   sudokuBoxNumber);

        sudokuBox = new ArrayList<SmallestSudokuSquare>();

        sudokuBox.add(square_0);
        sudokuBox.add(square_1);
        sudokuBox.add(square_2);
        sudokuBox.add(square_3);
        sudokuBox.add(square_4);
        sudokuBox.add(square_5);
        sudokuBox.add(square_6);
        sudokuBox.add(square_7);
        sudokuBox.add(square_8);
    }

    //Methods

    public SmallestSudokuSquare getSmallSquare(int squareNumber)
    {
        return sudokuBox.get(squareNumber);
    }


    public boolean isFull()
    {
        for (i = 0; i < sudokuBox.size(); i++)
        {
            if (sudokuBox.get(i).getAns() == -1) //Check this call here is this right?
            {
                return false;
            }
        }
        return true;
    }



}