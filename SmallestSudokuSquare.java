import java.util.ArrayList

class SmallestSudokuSquare
{
    //Fields
    private int rowNumber;
    private int columnNumber;
    private int blockNumber;
    private int answer;
    private ArrayList<int> possibleAnswers;

    //Initializer
    public SmallestSudokuSquare(int row, int column)
    {
        gridIdentifier = -1;
        rowNumber = row;
        columnNumber = column;
        blockNumber = -1;
        answer = -1;
        possibleAnswers = new ArrayList<int>();
    }

    //Methods

    //ACCESSORS
    public int getBlockNumber()
    {
        return BlockNumber;
    }

    public int getSmallSquareAns()
    {
        return answer;
    }

    public ArrayList<int> getPossibleAnswers()
    {
        return possibleAnswers;
    }

    //Manipulators



    public void changeBlockNumber(int newBlockNumber)
    {
        blockNumber = newBlockNumber;
    }

    public void changeAnswer(int newAnswer)
    {
        answer = newAnswer;
    }
    public void addPossibleAnswer(int newPossibleAnswer)
    {
        possibleAnswers.add(newPossibleAnswer);
    }

    public void removePossibleAnswer(int possibilityToRemove)
    {
        for (i = 0; i < possibleAnswers.size(); i++)
          {
            if (possibilityToRemove == possibleAnswers.get(i))
            {
                possibleAnswers.remove(i)
            }
          }
    }

}
