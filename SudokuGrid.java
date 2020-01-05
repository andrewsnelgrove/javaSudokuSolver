package com.javaSudokuSolverPackage;

import java.util.*;


public class SudokuGrid {
    //Fields
    private static final Set<Integer> column0 = new HashSet<Integer>(Arrays.asList(0,  9, 18, 27, 36, 45, 54, 63, 72));
    private static final Set<Integer> column1 = new HashSet<Integer>(Arrays.asList(1, 10, 19, 28, 37, 46, 55, 64, 73));
    private static final Set<Integer> column2 = new HashSet<Integer>(Arrays.asList(2, 11, 20, 29, 38, 47, 56, 65, 74));
    private static final Set<Integer> column3 = new HashSet<Integer>(Arrays.asList(3, 12, 21, 30, 39, 48, 57, 66, 75));
    private static final Set<Integer> column4 = new HashSet<Integer>(Arrays.asList(4, 13, 22, 31, 40, 49, 58, 67, 76));
    private static final Set<Integer> column5 = new HashSet<Integer>(Arrays.asList(5, 14, 23, 32, 41, 50, 59, 68, 77));
    private static final Set<Integer> column6 = new HashSet<Integer>(Arrays.asList(6, 15, 24, 33, 42, 51, 60, 69, 78));
    private static final Set<Integer> column7 = new HashSet<Integer>(Arrays.asList(7, 16, 25, 34, 43, 52, 61, 70, 79));
    private static final Set<Integer> column8 = new HashSet<Integer>(Arrays.asList(8, 17, 26, 35, 44, 53, 62, 71, 80));


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

    public String getStringAnswerGrid() {
        int ansToDisplay;
        String answerGridToDisplay = "";

        int counter = 0;

        for (int i = 0; i <= 80; i++) {
            if (counter == 9) {
                answerGridToDisplay += System.lineSeparator();
                counter = 0;
            }
            ansToDisplay = navToSquare(i).getAnswer();

            answerGridToDisplay += ("   " + String.valueOf(ansToDisplay) + "   ");

            counter += 1;


        }
        return answerGridToDisplay;
    }

    public void printPossibilitiesGrid() {
        //int[] possArrayToPrint = new int[];

        int counter = 0;

        for (int i = 0; i <= 80; i++) {
            if (counter == 9) {
                System.out.println();
                counter = 0;
            }
           // possArrayToPrint = navToSquare(i).getPossibleAnswers().toArray();

            System.out.print("   " + Arrays.toString( navToSquare(i).getPossibleAnswers().toArray() )  + "   ");

            counter += 1;


        }
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
    private SmallestSudokuSquare navToSquare(int squareID) {
        /*-----------------------------------BOX 0-------------------------------------*/
        /*----------------------------------Top Row------------------------------------*/

        if (squareID == 0 || squareID == 1 || squareID == 2) {
            return theSudokuGrid.get(0).getSmallSquare(squareID);
        }
        //Mid Row
        else if (squareID == 9 || squareID == 10 || squareID == 11) {
            return theSudokuGrid.get(0).getSmallSquare(squareID - 6);
        }
        //Bottom Row
        else if (squareID == 18 || squareID == 19 || squareID == 20) {
            return theSudokuGrid.get(0).getSmallSquare(squareID - 12);
        }
        //BOX 1
        //Top Row
        else if (squareID == 3 || squareID == 4 || squareID == 5) {
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
            return theSudokuGrid.get(2).getSmallSquare(squareID - 12);
        }
        //Bottom Row
        else if (squareID == 24 || squareID == 25 || squareID == 26) {
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
        else /*if (squareID == 78 || squareID == 79 || squareID = 80)*/
            { //Is this else ok?//TODO Note this.
            return theSudokuGrid.get(8).getSmallSquare(squareID - 72);//TODO OFF BY ONE! WAS 73 now 72.
        }

    }//TODO Added this later because of else {.



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
        else { return 72; } //Ok for last?

    }

    /**
     * This function returns the column number that the squareID belongs.
     * @param squareID: An integer between 0 and 80 inclusive that represents the ID of the small square on a Sudoku grid.
     * @return An integer representing the column number between 0 and 8 inclusive that the small square with the squareID belongs to
     *         in a sudoku grid.
     */
    private int mapSquareIDtoColumn(int squareID){
        if (column0.contains(squareID)){ return 0; }
        else if (column1.contains(squareID)){ return 1; }
        else if (column2.contains(squareID)){ return 2; }
        else if (column3.contains(squareID)){ return 3; }
        else if (column4.contains(squareID)){ return 4; }
        else if (column5.contains(squareID)){ return 5; }
        else if (column6.contains(squareID)){ return 6; }
        else if (column7.contains(squareID)){ return 7; }
        else { return 8; } //Ok for return?
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
        else {return 8;} //Ok for last?
        
    }

    /**

     */

    private int mapColumnStartToSquareID(int columnNumber){
        return columnNumber;
    }



    private boolean isNumInRow(int numberToCheck, int rowToCheck) {
        int squareID = mapRowStartToSquareID(rowToCheck);

        for (int column = 0; column <= 8; column++) {
            if (numberToCheck == navToSquare(squareID).getAnswer()) {
                return true;
            } else {
                squareID += 1;
            }
        }
        return false;
    }

    private boolean isNumInRowPossibility(int numberToCheck, int rowToCheck){
        int squareID = mapRowStartToSquareID(rowToCheck);
        ArrayList<Integer> possAnsList;

        for (int column = 0; column <= 8; column++) {
            possAnsList = navToSquare(squareID).getPossibleAnswers();
            if (possAnsList.size() != 0 ) {
                for (int k = 0; k < possAnsList.size(); k++) {
                    if (numberToCheck == possAnsList.get(k)) {
                        return true;
                        }
                    }
                }
            squareID += 1;
                }
        return false; //Check this.
                

    }

    /**
     *
     * @param numberToCheck
     * @param rowToCheck
     * @return
     */
    private boolean isNumUniqueInRowPossibilities(int numberToCheck, int rowToCheck){
        int squareID = mapRowStartToSquareID(rowToCheck);
        ArrayList<Integer> possAnsList;
        int numberFrequency = 0;

        for (int column = 0; column <= 8; column++) {
            possAnsList = navToSquare(squareID).getPossibleAnswers();
            if (possAnsList.size() != 0 ) {
                for (int k = 0; k < possAnsList.size(); k++) {
                    if (numberToCheck == possAnsList.get(k)) {
                        numberFrequency += 1;
                    }
                }
            }
            squareID += 1;
        }
        if (numberFrequency == 1){
            return true;
        }
        else {
            return false; //Check this.
        }

    }

    private boolean isNumUniqueONLYInRowPossibilities(int numberToCheck, int rowToCheck, int columnToCheck, int boxToCheck){
        if ( (isNumUniqueInRowPossibilities(numberToCheck, rowToCheck) == true )
                && (isNumUniqueInColumnPossibilities(numberToCheck,columnToCheck) == false)
                && (mapBoxNumberToSudokuBox(boxToCheck).isNumUniqueInBoxPossibilities(numberToCheck) == false)
        ) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isNumInCol(int numberToCheck, int columnToCheck) {
        int squareID = mapColumnStartToSquareID(columnToCheck);

        for (int row = 0; row <= 8; row++) {
            if ( numberToCheck == navToSquare(squareID).getAnswer() ) {
                return true;
            } else {
                squareID += 9; //We are going down the column, so it's plus 9 every time.
            }
        }
        return false;
    }

    private boolean isNumInColPossibility(int numberToCheck, int columnToCheck) {
        int squareID = mapColumnStartToSquareID(columnToCheck);
        ArrayList<Integer> possAnsList;

        for (int row = 0; row <=8; row++){
            possAnsList = navToSquare(squareID).getPossibleAnswers();
            if (possAnsList.size() != 0) {
                for (int k = 0; k < possAnsList.size(); k++){
                    if (numberToCheck == possAnsList.get(k)){
                        return true;
                    }
                }
            }
            squareID += 9; //We are going down the column, so it's plus 9 every time.
        }
        return false;//Check this.
    }

    /**
     *
     * @param numberToCheck
     * @param columnToCheck
     * @return
     */
    private boolean isNumUniqueInColumnPossibilities(int numberToCheck, int columnToCheck){
        int squareID = mapColumnStartToSquareID(columnToCheck);
        ArrayList<Integer> possAnsList;
        int numberFrequency = 0;
        for (int row = 0; row <=8; row++){
            possAnsList = navToSquare(squareID).getPossibleAnswers();
            if (possAnsList.size() != 0) {
                for (int k = 0; k < possAnsList.size(); k++){
                    if (numberToCheck == possAnsList.get(k)){
                        numberFrequency += 1;
                    }
                }
            }
            squareID += 9; //We are going down the column, so it's plus 9 every time.
        }
        if (numberFrequency == 1){
            return true;
        }
        else{
            return false;//Check this.
        }
    }


    public void resetGrid(){

    }

    /**
     * This function takes a box number in the sudoku grid and returns the actual SudokuBox object for that box number.
     * @param boxNumber: An integer number between 0 and 1 inclusive that represents the box number in a sudoku grid. From top to bottom, left to right, the
     *                 sudoku boxes are numbered 0, 1, 2, ... etc.
     * @return: A SudokuBox object represented by the box number.
     */
    private SudokuBox mapBoxNumberToSudokuBox(int boxNumber){
        if (boxNumber == 0) {return this.sudokuBox_0;}
        else if (boxNumber == 1) {return this.sudokuBox_1;}
        else if (boxNumber == 2) {return this.sudokuBox_2;}
        else if (boxNumber == 3) {return this.sudokuBox_3;}
        else if (boxNumber == 4) {return this.sudokuBox_4;}
        else if (boxNumber == 5) {return this.sudokuBox_5;}
        else if (boxNumber == 6) {return this.sudokuBox_6;}
        else if (boxNumber == 7) {return this.sudokuBox_7;}
        else {return this.sudokuBox_8;}//Ok for last one?
    }

    /**
     *
     * @param squareID
     * @param answerToAdd
     */
    private void changeAnswerAndNarrowGridPossibilities(int squareID, int answerToAdd){
        navToSquare(squareID).changeAnswer(answerToAdd);
        /*TODO There's something wrong here with squareID's 78 and 71. Their possible answers are in the same location,
           TODO but it should not be the case when squareID is 71 and answerToAdd is 3.

         */
        navToSquare(squareID).clearPossibleAnswers();
        //Now remove the possibility from row, clomun, and box that this square belongs to.
        removePossibilityFromRowWithSquareID(answerToAdd, squareID);
        removePossibilityFromColWithSquareID(answerToAdd, squareID);
        mapBoxNumberToSudokuBox(navToSquare(squareID).getBoxNumber()).removePossibilityFromBox(answerToAdd);
    }
///
    private void removePossibilityFromColWithSquareID(int possibilityToRemove, int squareID){
        int squareIDColStart = mapColumnStartToSquareID(mapSquareIDtoColumn(squareID));
        int limit = squareIDColStart + 72;
        for (int i = squareIDColStart; i <= limit; i += 9){
            navToSquare(i).removePossibleAnswer(possibilityToRemove);
        }
    }

    private void removePossibilityFromRowWithSquareID(int possibilityToRemove, int squareID){
        int squareIDRowStart = mapRowStartToSquareID(mapSquareIDtoRowNumber(squareID));
        int limit = squareIDRowStart + 8;
        for (int i = squareIDRowStart; i <= limit; i++){
            navToSquare(i).removePossibleAnswer(possibilityToRemove);
        }
    }

    public void solveGrid() {

        //First, make all the possibilities for every small square in the grid for the first time.

        //Write the possibilties for every square row by row.
        //First check, what answers are in the row, what answers are in the column, and what answers are in the box. Do
        //not write duplicates.

        for (int squareID = 0; squareID <= 80; squareID++) { //For every square in the grid...
            if (navToSquare(squareID).getAnswer() == -1) { //If the answer is the square is empty (equals -1)...
                TreeSet<Integer> setOfPossibilities = new TreeSet<Integer>(); //Make an empty set for all possible answers of the small square.
                //If we add to this set, it will help prevent duplicate values being added
                //to it.

                for (int number = 1; number <= 9; number++) {//For every number 1 to 9 inclusive...
                    //Check row
                    int rowNumber = mapSquareIDtoRowNumber(squareID);//Get the row number from the squareID.
                    if (isNumInRow(number, rowNumber) == false) {//If the number is not an answer in the row...
                        //Check column
                        int colNumber = mapSquareIDtoColumn(squareID);//Get the column number from the squareID.
                        if (isNumInCol(number, colNumber) == false) {//If the number is not an answer in the column...
                            //Check box
                            int boxNumber = navToSquare(squareID).getBoxNumber(); //Get box number of the square with the current squareID.
                            SudokuBox boxToAnalyze = mapBoxNumberToSudokuBox(boxNumber);//Get the SudokuBox object that is represented by the box number.
                            if (boxToAnalyze.isNumberInBox(number) == false) {//If the number is not an answer in the SudokuBox object...
                                setOfPossibilities.add(number);//Add the number to the current set of possibilities for this square.
                                //As this is a set, it will not add duplicates if one already
                                //exists in the set.

                            }
                        }
                    }
                }
                //After you have obtained all the possibilities for this current square...
                ArrayList<Integer> newList = new ArrayList<Integer>();//Make a new empty ArrayList.
                Iterator it = setOfPossibilities.iterator();//Use the Iterator on the setOfPossibilities set.
                while (it.hasNext()) {//While there is a next item in the setOfPossibilities set...
                    Integer possAnswer = (Integer) it.next();//Get that integer possibility.
                    if (setOfPossibilities.size() == 1) {//If the size of the setOfPossibilities is 1...
                        navToSquare(squareID).changeAnswer(possAnswer);//Make the integer possibility the answer for that small square.
                        navToSquare(squareID).clearPossibleAnswers();//Clear all of the possible answers for that square.
                    } else {//If the size of the setOfPossibilities is not equal to 1...
                        newList.add(possAnswer);//Add the integer possibility to the new ArrayList.
                    }
                }
                if (setOfPossibilities.size() != 1) {//If the size of the setOfPossibilities does not equal 1...
                    navToSquare(squareID).replacePossibleAnswerList(newList);//Replace the square's listOfPossibilities with the new ArrayList.
                }
            }
        }

        while (isGridFull() == false) {//While the sudoku grid still has empty squares...

            //For a possibility in a square, if number is unique in the row (there is only one of them, and thus would be in
                // the current square), then it goes in the current square.
            for (int squareID = 0; squareID <= 80; squareID++) {

                for (int i = 0; i < navToSquare(squareID).getPossibleAnswers().size(); i++) {
                    int possibilityExamining = navToSquare(squareID).getPossibleAnswers().get(i);
                    int rowToCheck = mapSquareIDtoRowNumber(squareID);
                    int columnToCheck = mapSquareIDtoColumn(squareID);
                    int boxNumberToCheck = navToSquare(squareID).getBoxNumber();
                    SudokuBox boxToAnalyze = mapBoxNumberToSudokuBox(boxNumberToCheck);

                    if (isNumUniqueInRowPossibilities(possibilityExamining, rowToCheck) == true){
                        changeAnswerAndNarrowGridPossibilities(squareID, possibilityExamining);
                    }
                    else{
                        if (isNumUniqueInColumnPossibilities(possibilityExamining, columnToCheck) == true){
                            changeAnswerAndNarrowGridPossibilities(squareID,possibilityExamining);
                        }
                        else{
                            if (boxToAnalyze.isNumUniqueInBoxPossibilities(possibilityExamining) == true){
                                changeAnswerAndNarrowGridPossibilities(squareID, possibilityExamining);
                            }
                        }
                    }
                }
            }
        }
    }
}










