package com.andrewsnelgrove;

import java.util.ArrayList;

public class SudokuGrid
{
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
    public SudokuGrid()
    {
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


    public void addAnswer(int squareID, int answer)
    {
        //TOP ROW
        //BOX 0
        if (squareID == 0){
            theSudokuGrid.get(0).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 1){
            theSudokuGrid.get(0).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 2){
            theSudokuGrid.get(0).getSmallSquare(2).changeAnswer(answer);
        }
        //BOX 1
        else if (squareID == 3){
            theSudokuGrid.get(1).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 4){
            theSudokuGrid.get(1).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 5){
            theSudokuGrid.get(1).getSmallSquare(2).changeAnswer(answer);
        }
        //BOX 2
        else if (squareID == 6){
            theSudokuGrid.get(2).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 7){
            theSudokuGrid.get(2).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 6){
            theSudokuGrid.get(2).getSmallSquare(0).changeAnswer(answer);
        }

    }


    public ... getBox() 

    public boolean isSudokuGridFull()
    {
        for (i = 0; i < 9; i++)
        {
            if (theSudokuGrid.get(i).isFull() == false)
            {
                return false;
            }

        }
        return true;
    }


    public boolean numberIsInRowAnswer(int row, int number)
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

}