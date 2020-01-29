package com.javaSudokuSolverPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//TODO Write documentation.
public class SudokuSolverGUI extends JFrame {
    /*---------------------------------------FIELDS-------------------------------------------*/
            private Container mainPane;
            private JMenuBar menuBar;
            private JMenu menu;
            private JMenuItem newPuzzle;
            private JMenuItem quit;
            boolean puzzleIsSolved;
            private JTextArea unsolvedPuzzle;
            private JTextArea solvedPuzzle;
            private JButton solveButton;
            private JButton[] buttonArray;
            private SudokuGrid logicGrid = new SudokuGrid();
            private JOptionPane answerOptionPane;
            private JLabel answerOptionPaneLabel;

    /*------------------------------------CONSTRUCTOR-------------------------------------------*/
            public SudokuSolverGUI() {
                super();
                mainPane = getContentPane();
                mainPane.setLayout(new BorderLayout());
                setTitle("Sudoku Solver");
                setSize(900, 600);
                setResizable(false);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                solveButton = new JButton("Solve!");
                unsolvedPuzzle = new JTextArea(9, 9);
                solvedPuzzle = new JTextArea(9, 9);
                puzzleIsSolved = false;
                buttonArray = new JButton[81];

                initializeMenuBar();
                initializeSolveButton();
                initializeSudokuAreas();

                setVisible(true);


            }
    /*------------------------------------METHODS-------------------------------------------*/

            private void initializeMenuBar() {
                menuBar = new JMenuBar();
                menu = new JMenu("File");

                newPuzzle = new JMenuItem("New Puzzle");
                newPuzzle.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        resetBoard();
                    }
                });

                quit = new JMenuItem("Quit");
                quit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                menu.add(newPuzzle);
                menu.add(quit);
                menuBar.add(menu);
                setJMenuBar(menuBar);

            }

            private void initializeSolveButton() {
                solveButton.addActionListener(e -> solveSudokuPuzzle());
                mainPane.add(solveButton, BorderLayout.SOUTH);
            }

            private void solveSudokuPuzzle(){
                linkGUIToLogic();
                logicGrid.solveGrid();
                displaySolvedPuzzle();
            }

            private void displaySolvedPuzzle(){
                String solvedAnswerGrid = logicGrid.getStringAnswerGrid();
                System.out.print(solvedAnswerGrid);
                answerOptionPaneLabel = new JLabel(solvedAnswerGrid);
                answerOptionPane = new JOptionPane();
                answerOptionPane.showMessageDialog(new JFrame(), solvedAnswerGrid, "The answer is...", JOptionPane.PLAIN_MESSAGE);//newJFrame ok?//TODO note this.
                //answerOptionPane.add(answerOptionPaneLabel);
                //answerOptionPane.setVisible(true);
            }

            private void initializeSudokuAreas() {
                JPanel topPanel = new JPanel();
                JPanel leftPanel = new JPanel();
                JPanel rightPanel = new JPanel();

                JTextArea introTextArea = new JTextArea(30, 60);
                introTextArea.setText("Welcome to the Sudoku Solver! This program will solve unfinished sudoku puzzles. To begin, use the buttons by clicking " +
                        "on them to increase the values  " +
                        "on the right side to input your unfinished puzzle (once your reach 9 it will go back to 0)." +
                        " When ready, click the Solve! button. Your solved puzzle will be " +
                        "on the left grid. ");
                introTextArea.setLineWrap(true);


                topPanel.add(introTextArea);
                mainPane.add(topPanel, BorderLayout.NORTH);
                topPanel.setPreferredSize(new Dimension(800, 100));

                initializeSudokuGUIGrid();


            }

            private void initializeSudokuGUIGrid() {
                JPanel inputGrid = new JPanel();
                inputGrid.setLayout(new GridLayout(9,9));
                inputGrid.setPreferredSize(new Dimension(30,30));



                for (int i = 0; i <= 80; i++) {
                    JButton button = new JButton();
                    button.setText("0");
                    //button.setSize(10, 10);
                    button.addActionListener( e -> incrementButtonValue(button));
                    buttonArray[i] = button;
                    inputGrid.add(buttonArray[i]);
                }

                mainPane.add(inputGrid, BorderLayout.CENTER);


            }


            private void incrementButtonValue(JButton button) {
                int currentValue = Integer.parseInt(button.getText());
                if (currentValue < 9) {
                    currentValue += 1;
                }
                else{
                    currentValue = 0;
                }
                String currentValueString = String.valueOf(currentValue);
                button.setText(currentValueString);
            }

//TODO Finish this.
            private void resetBoard() {
                puzzleIsSolved = false;
                logicGrid = new SudokuGrid();
                initializeSudokuGUIGrid();
                //mainPane.add();
                //FINISH
            }

            private void linkGUIToLogic(){
                for (int i = 0; i <=80; i++) {
                    int value = Integer.parseInt(buttonArray[i].getText());
                    if (value != 0){
                        logicGrid.changeAns(i, value);
                    }
                }
            }

            private void resetGrid(){
                logicGrid = new SudokuGrid();

            }

//TODO Make display popup with answer once solved.


        }


