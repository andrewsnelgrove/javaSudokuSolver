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
        //BOX 0
        //Top Row
        if (squareID == 0){
            theSudokuGrid.get(0).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 1){
            theSudokuGrid.get(0).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 2){
            theSudokuGrid.get(0).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 9){
            theSudokuGrid.get(0).getSmallSquare(3).changeAnswer(answer);
        }
        else if (squareID == 10){
            theSudokuGrid.get(0).getSmallSquare(4).changeAnswer(answer);
        }
        else if (squareID == 11){
            theSudokuGrid.get(0).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 18){
            theSudokuGrid.get(0).getSmallSquare(6).changeAnswer(answer);
        }
        else if (squareID == 19){
            theSudokuGrid.get(0).getSmallSquare(7).changeAnswer(answer);
        }
        else if (squareID == 20){
            theSudokuGrid.get(0).getSmallSquare(8).changeAnswer(answer);
        }
        /** *********************/
        //BOX 1
        //Top Row
        else if (squareID == 3){
            theSudokuGrid.get(1).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 4){
            theSudokuGrid.get(1).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 5){
            theSudokuGrid.get(1).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row

        else if (squareID == 12){
            theSudokuGrid.get(1).getSmallSquare(3).changeAnswer(answer);
        }
        else if (squareID == 13){
            theSudokuGrid.get(1).getSmallSquare(4).changeAnswer(answer);
        }
        else if (squareID == 14){
            theSudokuGrid.get(1).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 21){
            theSudokuGrid.get(1).getSmallSquare(6).changeAnswer(answer);
        }
        else if (squareID == 22){
            theSudokuGrid.get(1).getSmallSquare(7).changeAnswer(answer);
        }
        else if (squareID == 23){
            theSudokuGrid.get(1).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 2
        //Top Row
        else if (squareID == 6){
            theSudokuGrid.get(2).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 7){
            theSudokuGrid.get(2).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 8){
            theSudokuGrid.get(2).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 15){
            theSudokuGrid.get(2).getSmallSquare(3).changeAnswer(answer);
        }
        else if (squareID == 16){
            theSudokuGrid.get(2).getSmallSquare(4).changeAnswer(answer);
        }
        else if (squareID == 17){
            theSudokuGrid.get(2).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 24){
            theSudokuGrid.get(2).getSmallSquare(6).changeAnswer(answer);
        }
        else if (squareID == 25){
            theSudokuGrid.get(2).getSmallSquare(7).changeAnswer(answer);
        }
        else if (squareID == 26){
            theSudokuGrid.get(2).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 3
        //Top Row
        else if (squareID == 27){
            theSudokuGrid.get(3).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 28){
            theSudokuGrid.get(3).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 29){
            theSudokuGrid.get(3).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 36){
            theSudokuGrid.get(3).getSmallSquare(3).changeAnswer(answer);
        }
        else if (squareID == 37){
            theSudokuGrid.get(3).getSmallSquare(4).changeAnswer(answer);
        }
        else if (squareID == 38){
            theSudokuGrid.get(3).getSmallSquare(5).changeAnswer(answer);
        }
        //Bottom Row
        else if (squareID == 45){
            theSudokuGrid.get(3).getSmallSquare(6).changeAnswer(answer);
        }
        else if (squareID == 46){
            theSudokuGrid.get(3).getSmallSquare(7).changeAnswer(answer);
        }
        else if (squareID == 47){
            theSudokuGrid.get(3).getSmallSquare(8).changeAnswer(answer);
        }
        //BOX 4
        //Top Row
        else if (squareID == 30){
            theSudokuGrid.get(4).getSmallSquare(0).changeAnswer(answer);
        }
        else if (squareID == 31){
            theSudokuGrid.get(4).getSmallSquare(1).changeAnswer(answer);
        }
        else if (squareID == 32){
            theSudokuGrid.get(4).getSmallSquare(2).changeAnswer(answer);
        }
        //Mid Row
        else if (squareID == 39){
            theSudokuGrid.get(4).getSmallSquare(3).changeAnswer(answer);
        }
        else if (squareID == 40){
            theSudokuGrid.get(4).getSmallSquare(4).changeAnswer(answer);
        }
        else if (squareID == 41){
            theSudokuGrid.get(4).getSmallSquare(5).changeAnswer(answer);
        }
        //LAST STOPPED HERE
        else if (squareID == 20){
            theSudokuGrid.get(0).getSmallSquare(8).changeAnswer(answer);
        }
        else if (squareID == 20){
            theSudokuGrid.get(0).getSmallSquare(8).changeAnswer(answer);
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