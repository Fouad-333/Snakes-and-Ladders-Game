/**
 * Project 02. This class extends JFrame. It has 30 buttons that form a grid layout.
               and 07 buttons for options. It contains two panels.One for grid layout
               and the other for options and messages. It contains inner classes that implements ActionListener
               for buttons including options. The (awt) and (swing) libraries are used
               in this class which mainly includes JPanel, JButton, JTextArea, JLabel and Color.
               This class is the GUI presentation of the project 02. * 
 * @author     Fouad Nazir Ahmad    Saleemi *
 * @version    11.0.6 , 27/05/2020                 
 */

package projecttwo;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.orange;
import static java.awt.Color.white;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class Board extends JFrame {

    JPanel panelOne = new JPanel(); /**It creates Panel for grid layout.**/
    JPanel panelTwo = new JPanel(); /**It creates Panel for options.**/
    JLabel label = new JLabel("Messages"); /**It creates label of messages.**/
    JTextArea messages = new JTextArea(5,25); /**It creates test area for messages with width and height.**/
    Color color = orange; /**It stores orange color.**/
    Color whiteColor = white; /**It stores orange color.**/
   
  
    Random randomNumber = new Random(); /**It stores random number.**/
    int humanPlayerDiceRoll; /**Initializing variable to store dice value of Human Player.**/
    int previousHumanPlayerDiceRollValue =0; /**Initializing variable to store previous dice value of Human Player.**/
    int computerPlayerDiceRoll; /**Initializing variable to store dice value of Computer Player.**/
    int previousComputerPlayerDiceRollValue =0; /**Initializing variable to store previous dice value of Computer Player.**/
    int count = 0; /**Initializing variable to store value when turn is to determined.**/
    int startCount = 0; /**Initializing variable to store value when  turn was determined.**/
    
    int humanPlayerCounter = 0; /**Initializing variable to store value that determine it is human player turn or not.**/
    int computerPlayerCounter = 0; /**Initializing variable to store value that determine it is computer player turn or not.**/
    
    
    /**Creating buttons and assigning the names.**/
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4 [Ladder GoTo 14]");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonTen = new JButton("10");
    JButton buttonEleven = new JButton("11");
    JButton buttonTwelve = new JButton("12 [Ladder GoTo 22]");
    JButton buttonThirteen = new JButton("13");
    JButton buttonFourteen = new JButton("14");
    JButton buttonFifteen = new JButton("15");
    JButton buttonSixteen = new JButton("16 [Snake GoTo 5]");
    JButton buttonSeventeen = new JButton("17");
    JButton buttonEighteen = new JButton("18");
    JButton buttonNinteen = new JButton("19");
    JButton buttonTwenty = new JButton("20 [Snake GoTo 7]");
    JButton buttonTwentyOne = new JButton("21");
    JButton buttonTwentyTwo = new JButton("22");
    JButton buttonTwentThree = new JButton("23");
    JButton buttonTwentyFour = new JButton("24");
    JButton buttonTwentyFive = new JButton("25");
    JButton buttonTwentySix = new JButton("26");
    JButton buttonTwentySeven = new JButton("27");
    JButton buttonTwentyEight = new JButton("28");
    JButton buttonTwentyNine = new JButton("29");
    JButton buttonThirty = new JButton("30");
    
    JButton humanPlayer = new JButton("Make Move "); /**Button to make move for Human Player**/
    JButton humanPlayerDice = new JButton("Human Player Roll Dice"); /**Button for Human Player to roll dice**/
    JButton computerPlayerDice = new JButton("Computer Player Roll Dice"); /**Button for Computer Player to roll dice**/
    JButton decider = new JButton("Decider");  /**Button to decide first turn.*/
    
    JButton playerOne = new JButton("Human Player "); /**Button representing Human Player*/
    JButton playerTwo= new JButton("Computer Player"); /**Button representing Computer Player*/
    
    JButton restart= new JButton("Restart"); /**Button to restart the game*/
    
    
    
    
   
    public Board() /**Calling constructor to initialize frame, panel, buttons, labels, etc**/
        {

            super("Snakes and Ladders"); /**Assigning name of the frame*/
            getContentPane().setBackground(Color.WHITE); /**Setting background color*/
            setSize(1600,800); /**Setting size*/
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true); /**Setting visibility*/


            playerOne.setPreferredSize(new Dimension(150,100)); /**Setting human player button size*/
            playerTwo.setPreferredSize(new Dimension(150,100)); /**Setting computer player button size*/

            humanPlayer.addActionListener(new humanPlayerButton()); /**Adding human player button to its ActionListener*/
            humanPlayerDice.addActionListener(new humanPlayerDicerRollButton()); /**Adding human player dice roll button to its ActionListener*/
            computerPlayerDice.addActionListener(new computerPlayerDicerRollButton()); /**Adding computer player button to its ActionListener*/
            decider.addActionListener(new decideFirstTurn()); /**Adding decider button to its ActionListener*/
            restart.addActionListener(new restartGame()); /**Adding restart button to its ActionListener*/

            panelOne.setLayout(new GridLayout(6,5, 1,1)); /**Setting layout of the frame*/
            
            
            /**Adding 30 buttons to the first panel and setting their color*/
            panelOne.add(buttonThirty ).setBackground(Color.white);
            panelOne.add(buttonTwentyNine ).setBackground(Color.white);
            panelOne.add(buttonTwentyEight  ).setBackground(Color.white);
            panelOne.add(buttonTwentySeven  ).setBackground(Color.white);
            panelOne.add(buttonTwentySix  ).setBackground(Color.white);
            panelOne.add(buttonTwentyFive  ).setBackground(Color.white);
            panelOne.add(buttonTwentyFour  ).setBackground(Color.white);
            panelOne.add(buttonTwentThree  ).setBackground(Color.white);
            panelOne.add(buttonTwentyTwo  ).setBackground(Color.CYAN);
            panelOne.add(buttonTwentyOne  ).setBackground(Color.white);
            panelOne.add(buttonTwenty ).setBackground(Color.magenta);
            panelOne.add(buttonNinteen ).setBackground(Color.white);
            panelOne.add(buttonEighteen ).setBackground(Color.white);
            panelOne.add(buttonSeventeen ).setBackground(Color.white);
            panelOne.add(buttonSixteen ).setBackground(Color.LIGHT_GRAY);
            panelOne.add(buttonFifteen ).setBackground(Color.white);
            panelOne.add(buttonFourteen ).setBackground(Color.yellow);
            panelOne.add(buttonThirteen ).setBackground(Color.white);
            panelOne.add(buttonTwelve   ).setBackground(Color.cyan);
            panelOne.add(buttonEleven   ).setBackground(Color.white);
            panelOne.add(buttonTen  ).setBackground(Color.white);
            panelOne.add(buttonNine  ).setBackground(Color.white);
            panelOne.add(buttonEight  ).setBackground(Color.white);
            panelOne.add(buttonSeven  ).setBackground(Color.magenta);
            panelOne.add(buttonSix  ).setBackground(Color.white);
            panelOne.add(buttonOne  ).setBackground(Color.white);
            panelOne.add(buttonTwo).setBackground(Color.white);
            panelOne.add(buttonThree  ).setBackground(Color.white);
            panelOne.add(buttonFour  ).setBackground(Color.yellow);
            panelOne.add(buttonFive  ).setBackground(Color.LIGHT_GRAY);


            /**Adding human player computer player, decider,label, message, human player roll dice,
               computer player roll dice and restart buttons to the panel two*/
            panelTwo.add(playerOne  ).setBackground(Color.white);
            panelTwo.add(humanPlayerDice  ).setBackground(Color.white);
            panelTwo.add(humanPlayer).setBackground(Color.white);
            panelTwo.add(decider  ).setBackground(Color.GREEN);
            panelTwo.add(label  );
            panelTwo.add(messages  );
            panelTwo.add(computerPlayerDice  ).setBackground(Color.white);
            panelTwo.add(playerTwo  ).setBackground(Color.white);
            panelTwo.add(restart  ).setBackground(Color.red);

            
            add(panelOne,BorderLayout.CENTER); /**Adding panel one to the center of the frame*/
            add(panelTwo,BorderLayout.SOUTH); /**Adding panel two to the south of the frame*/
    }

   
    public class restartGame implements ActionListener /**AcionListener for the restart button*/
        {
            @Override
            public void actionPerformed(ActionEvent event) /**Calling actionPerformed method*/
                { 
                    Main.main(new String[0]); /**Calling main method*/
                }
            
        }
    
    public class decideFirstTurn implements ActionListener /**AcionListener for the decider button*/
        {
            @Override
            public void actionPerformed(ActionEvent event) /**Calling actionPerformed method*/
                {
                    
                    if(humanPlayerDiceRoll > computerPlayerDiceRoll) /**Condition to check whether human player dice roll value is bigger than computer player*/
                        {
                            messages.setText(" Human Player has the First Turn.\n Please Roll Dice!!!" );  
                            playerOne.setBackground(Color.ORANGE);
                            humanPlayer.setBackground(Color.orange);
                            humanPlayerDice.setBackground(Color.orange);
                            previousHumanPlayerDiceRollValue = 0;
                            count = 1;
                            startCount = 1;
                            humanPlayerCounter = 1;
                            
                        }
                    else if (humanPlayerDiceRoll < computerPlayerDiceRoll) /**Condition to check whether human player dice roll value is lesser than computer player*/
                        {
                            messages.setText(" Computer Player has the First Turn.\n Please Roll Dice!!!" ); 
                            playerTwo.setBackground(Color.PINK);
                            computerPlayerDice.setBackground(Color.pink);
                            previousHumanPlayerDiceRollValue = 0;
                            count = 1;
                            startCount = 1;
                            computerPlayerCounter = 1;
                        } 
                    else if (humanPlayerDiceRoll == computerPlayerDiceRoll) /**Condition to check whether human player dice roll value is equal to computer player*/
                        {
                            messages.setText("Both got same values. Please repeat the process again!!!!" ); 
                        } 
                }
        }
    
   
    
    public boolean checkSimilarDiceValue(int humanPlayerDiceRoll, int computerPlayerDiceRoll ) /**To check that the dice roll values of both players are equal or not. @param. It takes dice roll values as integer value*/
        {
            boolean value = false;
            if(humanPlayerDiceRoll == computerPlayerDiceRoll) /**Condition to check whether human player dice roll value is equal to computer player*/
                {
                    value = true; /**Assign true*/
                }
            return value; /**@retun. It returns boolean value*/
        }
    
    
    public class humanPlayerDicerRollButton implements ActionListener /**AcionListener for human player roll dice button*/
        {
            @Override
            public void actionPerformed(ActionEvent event) /**Calling actionPerformed method*/
                {
                    if(startCount == 0) /**Condition to check start counter*/
                    {
                        if (!(computerPlayerDiceRoll == 6 && count > 0 )) /**Condition to check dice value of computer player and count*/
                            {
                                humanPlayerDiceRoll = randomNumber.nextInt(6) + 1; /**Generating random number*/
                                String hvalue = String.valueOf(humanPlayerDiceRoll); /**Assigning and converting integer into string*/
                                if(startCount > 0) /**Condition to check start counter is grater than 0*/
                                { 
                                    messages.setText("Human Player Dice Value is " + hvalue +"\n Make a move!!!"); /**Appending message to the text area*/
                                }
                                else 
                                {
                                    messages.setText("Human Player Dice Value is " + hvalue); /**Appending message to the text area*/
                                }
                            }
                        
                        if (humanPlayerDiceRoll == 6 && count > 0)/**Condition to check dice value of human player is 6 and count is greater than 0*/
                            {
                                messages.setText("Human Player you got a six.\n Take another turn after making the first move!!! "); /**Appending message to the text area*/
                            }
                    }
                    
                    else if(!(humanPlayerCounter == 0)) /**Condition to check dice value of human player counter is not 0*/
                    {
                        if (!(computerPlayerDiceRoll == 6 && count > 0 )) /**Condition to check dice value of computer player is 6 and count is greater than 0*/
                            {
                                humanPlayerDiceRoll = randomNumber.nextInt(6) + 1; /**Generating random number*/
                                String hvalue = String.valueOf(humanPlayerDiceRoll); /**Assigning and converting integer into string*/
                                if(startCount > 0){ messages.setText("Human Player Dice Value is " + hvalue +"\n Make a move!!!");} /**Appending message to the text area*/
                                else {messages.setText("Human Player Dice Value is " + hvalue);} /**Appending message to the text area*/
                            }
                        
                        if (humanPlayerDiceRoll == 6 && count > 0) /**Condition to check dice value of human player is 6 and count is greater than 0*/
                            {
                                messages.setText("Human Player you got a six.\n Take another turn after making the first move!!! "); /**Appending message to the text area*/
                            }
                    }
                   
            }
        }
    
    
   public class computerPlayerDicerRollButton implements ActionListener /**AcionListener for computer player roll dice button*/
        {
            @Override
            public void actionPerformed(ActionEvent event) /**Calling actionPerformed method*/
                {
                    if(startCount == 0) /**Condition to check start counter is equal to 0*/
                    {
                        computerPlayerDiceRoll = randomNumber.nextInt(6) + 1; /**Generating random number*/
                        String cvalue = String.valueOf(computerPlayerDiceRoll); /**Assigning and converting integer into string*/
                        messages.setText("Computer Player Dice Value is " + cvalue); /**Appending message to the text area*/
                    }
                    
                    else if(!(computerPlayerCounter == 0)) /**Condition to check computer player counter is or not equal to 0*/
                    {
                        if (!(humanPlayerDiceRoll == 6 && count > 0 )) /**Condition to check dice value of human player is not 6 and count is greater than 0*/
                            {
                                computerPlayerDiceRoll = randomNumber.nextInt(6) + 1; /**Generating random number*/
                                String cvalue = String.valueOf(computerPlayerDiceRoll); /**Assigning and converting integer into string*/
                                messages.setText("Computer Player Dice Value is " + cvalue+"\n It has made the move!!!"); /**Appending message to the text area*/


                                if (computerPlayerDiceRoll == 6 && count > 0) /**Condition to check dice value of human player is 6 and count is greater than 0*/
                                    {
                                        messages.setText("Computer Player you got a six.\n Take another turn after making the first move!!! "); /**Appending message to the text area*/

                                    }
                                
                                if(count > 0 ) /**Condition to check count is greater than 0*/
                                    {
                                        int temporaryHolder = previousComputerPlayerDiceRollValue; /**Assigning previous computer player dice value.*/
                                        int finalComputerPlayerdiceValue = temporaryHolder + computerPlayerDiceRoll; /**Assigning sum of the previous computer player dice value and current computer player dice value.*/

                                        if(!(finalComputerPlayerdiceValue > 30))  /**Condition to check that final computer player value is not greater than 30*/
                                            {
                                                previousComputerPlayerDiceRollValue = finalComputerPlayerdiceValue; /**Assigning current computer player dice value to previous one.*/
                                            }
                                        
                                 
                                     /** Checking the final computer player dice value with switch. In every case, it checks that computer player counter is
                                     grater than 0. If yes, then it changes color of the current and previous buttons and make computer counter 0 and human counter 1. Otherwise append
                                      message to the text area**/

                                switch(finalComputerPlayerdiceValue)
                                    {
                                         
                                        case 1:
                                            if(computerPlayerCounter > 0)
                                                {
                                                    buttonOne.setBackground(Color.pink);
                                                    computerPlayerCounter = 0;
                                                    humanPlayerCounter = 1;
                                                }
                                            else
                                                {
                                                     messages.setText("It is Human Player turn!!!!!");
                                                }
                                            break;

                                        case 2:
                                             if(computerPlayerCounter > 0)
                                                {
                                                    buttonOne.setBackground(whiteColor);
                                                    buttonTwo.setBackground(Color.pink);
                                                    computerPlayerCounter = 0;
                                                    humanPlayerCounter = 1;
                                                }
                                            else
                                                {
                                                    messages.setText("It is Human Player turn!!!!!");
                                                }
                                            break;
                                        
                                        case 3:
                                            if(computerPlayerCounter > 0)
                                                {
                                                    buttonOne.setBackground(whiteColor);
                                                    buttonTwo.setBackground(whiteColor);
                                                    buttonThree .setBackground(Color.pink);
                                                    computerPlayerCounter = 0;
                                                    humanPlayerCounter = 1;
                                                }
                                            else
                                                {
                                                    messages.setText("It is Human Player turn!!!!!");
                                                }
                                            break;
                                        
                                        case 4: /**It's a ladder to 14**/
                                            if(computerPlayerCounter > 0) 
                                                {
                                                   buttonOne.setBackground(whiteColor);
                                                   buttonTwo.setBackground(whiteColor);
                                                   buttonThree .setBackground(whiteColor);
                                                   previousComputerPlayerDiceRollValue = 14; /**Changing the previous computer dice value to 14**/
                                                   buttonFourteen .setBackground(Color.pink);
                                                   messages.setText("Congratulations Computer Player.\n You found a ladder and promoted to 14 number.");
                                                   playerOne.setBackground(Color.orange);
                                                   playerTwo.setBackground(Color.white);
                                                   humanPlayerDice.setBackground(Color.orange);
                                                   computerPlayerCounter = 0;
                                                   humanPlayerCounter = 1;
                                                }
                                                else
                                                    {
                                                        messages.setText("It is Human Player turn!!!!!");
                                                    }

                                            break;
                                        
                                        case 5:
                                             if(computerPlayerCounter > 0)
                                                {
                                                    buttonOne.setBackground(whiteColor);
                                                    buttonTwo.setBackground(whiteColor);
                                                    buttonThree .setBackground(whiteColor);
                                                    buttonFourteen .setBackground(Color.yellow);
                                                    buttonFive .setBackground(Color.pink);
                                                    computerPlayerCounter = 0;
                                                    humanPlayerCounter = 1;
                                                }
                                            else
                                                {
                                                   messages.setText("It is Human Player turn!!!!!");
                                                }

                                            break;
                                        
                                        case 6:
                                            if(computerPlayerCounter > 0)
                                                {
                                                     buttonOne.setBackground(whiteColor);
                                                     buttonTwo.setBackground(whiteColor);
                                                     buttonThree .setBackground(whiteColor);
                                                     buttonFourteen .setBackground(Color.yellow);
                                                     buttonFive .setBackground(Color.LIGHT_GRAY);
                                                     buttonSix .setBackground(Color.pink);
                                                     computerPlayerCounter = 0;
                                                     humanPlayerCounter = 1;
                                                }
                                            else
                                                {
                                                     messages.setText("It is Human Player turn!!!!!");
                                                }

                                            break;
                                        
                                        case 7:
                                            if(computerPlayerCounter > 0)
                                                {
                                                     buttonOne.setBackground(whiteColor);
                                                     buttonTwo.setBackground(whiteColor);
                                                     buttonThree .setBackground(whiteColor);
                                                     buttonFourteen .setBackground(Color.yellow);
                                                     buttonFive .setBackground(Color.LIGHT_GRAY);
                                                     buttonSix .setBackground(whiteColor);
                                                     buttonSeven .setBackground(Color.pink);
                                                     computerPlayerCounter = 0;
                                                     humanPlayerCounter = 1;
                                                }
                                            else
                                                {
                                                     messages.setText("It is Human Player turn!!!!!");
                                                }

                                            break;
                                        
                                        case 8:
                                            if(computerPlayerCounter > 0)
                                                {
                                                     buttonOne.setBackground(whiteColor);
                                                     buttonTwo.setBackground(whiteColor);
                                                     buttonThree .setBackground(whiteColor);
                                                     buttonFourteen .setBackground(Color.yellow);
                                                     buttonFive .setBackground(Color.LIGHT_GRAY);
                                                     buttonSix .setBackground(whiteColor);
                                                     buttonSeven .setBackground(Color.magenta);
                                                     buttonEight .setBackground(Color.pink);
                                                     computerPlayerCounter = 0;
                                                     humanPlayerCounter = 1;
                                                }
                                            else
                                                {
                                                     messages.setText("It is Human Player turn!!!!!");
                                                }

                                            break;
                                        case 9:
                                            if(computerPlayerCounter > 0)
                                                {
                                                  buttonOne.setBackground(whiteColor);
                                                buttonTwo.setBackground(whiteColor);
                                                buttonThree .setBackground(whiteColor);
                                                buttonFourteen .setBackground(Color.yellow);
                                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                                buttonSix .setBackground(whiteColor);
                                                buttonSeven .setBackground(Color.magenta);
                                                buttonEight .setBackground(whiteColor);
                                                buttonNine .setBackground(Color.pink);
                                                  computerPlayerCounter = 0;
                                                    humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                        case 10:
                                            if(computerPlayerCounter > 0)
                                            {
                                                    buttonOne.setBackground(whiteColor);
                                                  buttonTwo.setBackground(whiteColor);
                                                  buttonThree .setBackground(whiteColor);
                                                  buttonFourteen .setBackground(Color.yellow);
                                                  buttonFive .setBackground(Color.LIGHT_GRAY);
                                                  buttonSix .setBackground(whiteColor);
                                                  buttonSeven .setBackground(Color.magenta);
                                                  buttonEight .setBackground(whiteColor);
                                                  buttonNine .setBackground(whiteColor);
                                                  buttonTen .setBackground(Color.pink);
                                                    computerPlayerCounter = 0;
                                                      humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                        case 11:
                                            if(computerPlayerCounter > 0)
                                            {
                                                    buttonOne.setBackground(whiteColor);
                                                 buttonTwo.setBackground(whiteColor);
                                                 buttonThree .setBackground(whiteColor);
                                                 buttonFourteen .setBackground(Color.yellow);
                                                 buttonFive .setBackground(Color.LIGHT_GRAY);
                                                 buttonSix .setBackground(whiteColor);
                                                 buttonSeven .setBackground(Color.magenta);
                                                 buttonEight .setBackground(whiteColor);
                                                 buttonNine .setBackground(whiteColor);
                                                 buttonTen .setBackground(whiteColor);
                                                 buttonEleven .setBackground(Color.pink);
                                                   computerPlayerCounter = 0;
                                                     humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                            
                                        case 12: /**It's a ladder to 22**/
                                            if(computerPlayerCounter > 0)
                                            {
                                                 previousComputerPlayerDiceRollValue = 22; /**Changing the previous computer dice value to 22**/
                                                 buttonOne.setBackground(whiteColor);
                                                 buttonTwo.setBackground(whiteColor);
                                                 buttonThree .setBackground(whiteColor);
                                                 buttonFourteen .setBackground(Color.yellow);
                                                 buttonFive .setBackground(Color.LIGHT_GRAY);
                                                 buttonSix .setBackground(whiteColor);
                                                 buttonSeven .setBackground(Color.magenta);
                                                 buttonEight .setBackground(whiteColor);
                                                 buttonNine .setBackground(whiteColor);
                                                 buttonTen .setBackground(whiteColor);
                                                 buttonEleven .setBackground(whiteColor);
                                                 buttonTwentyTwo .setBackground(Color.pink);
                                                 messages.setText("Congratulations Computer Player.\n You found a ladder and promoted to 22 number.");
                                                 playerOne.setBackground(Color.orange);
                                                 playerTwo.setBackground(Color.white);
                                                 humanPlayerDice.setBackground(Color.orange);
                                                 computerPlayerCounter = 0;
                                                 humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;

                                        case 13:
                                            if(computerPlayerCounter > 0)
                                            {
                                                  buttonOne.setBackground(whiteColor);
                                                  buttonTwo.setBackground(whiteColor);
                                                  buttonThree .setBackground(whiteColor);
                                                  buttonFourteen .setBackground(Color.yellow);
                                                  buttonFive .setBackground(Color.LIGHT_GRAY);
                                                  buttonSix .setBackground(whiteColor);
                                                  buttonSeven .setBackground(Color.magenta);
                                                  buttonEight .setBackground(whiteColor);
                                                  buttonNine .setBackground(whiteColor);
                                                  buttonTen .setBackground(whiteColor);
                                                  buttonEleven .setBackground(whiteColor);
                                                  buttonTwentyTwo .setBackground(Color.cyan);
                                                  buttonThirteen .setBackground(Color.pink);
                                                  computerPlayerCounter = 0;
                                                  humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;

                                        case 14:
                                            if(computerPlayerCounter > 0)
                                            {
                                                   buttonOne.setBackground(whiteColor);
                                                   buttonTwo.setBackground(whiteColor);
                                                   buttonThree .setBackground(whiteColor);
                                                   buttonFourteen .setBackground(Color.yellow);
                                                   buttonFive .setBackground(Color.LIGHT_GRAY);
                                                   buttonSix .setBackground(whiteColor);
                                                   buttonSeven .setBackground(Color.magenta);
                                                   buttonEight .setBackground(whiteColor);
                                                   buttonNine .setBackground(whiteColor);
                                                   buttonTen .setBackground(whiteColor);
                                                   buttonEleven .setBackground(whiteColor);
                                                   buttonTwentyTwo .setBackground(Color.cyan);
                                                   buttonThirteen .setBackground(whiteColor);
                                                   buttonFourteen.setBackground(Color.pink);
                                                   computerPlayerCounter = 0;
                                                   humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                        case 15:
                                            if(computerPlayerCounter > 0)
                                            {
                                                   buttonOne.setBackground(whiteColor);
                                                   buttonTwo.setBackground(whiteColor);
                                                   buttonThree .setBackground(whiteColor);
                                                   buttonFourteen .setBackground(Color.yellow);
                                                   buttonFive .setBackground(Color.LIGHT_GRAY);
                                                   buttonSix .setBackground(whiteColor);
                                                   buttonSeven .setBackground(Color.magenta);
                                                   buttonEight .setBackground(whiteColor);
                                                   buttonNine .setBackground(whiteColor);
                                                   buttonTen .setBackground(whiteColor);
                                                   buttonEleven .setBackground(whiteColor);
                                                   buttonTwentyTwo .setBackground(Color.cyan);
                                                   buttonThirteen .setBackground(whiteColor);
                                                   buttonFourteen.setBackground(Color.yellow);
                                                   buttonFifteen   .setBackground(Color.pink);
                                                   computerPlayerCounter = 0;
                                                   humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                            
                                        case 16: /**It's a snake that take to 5**/
                                             if(computerPlayerCounter > 0)
                                            {
                                                    previousComputerPlayerDiceRollValue = 5;/**Changing the previous computer dice value to 5**/
                                                    buttonOne.setBackground(whiteColor);
                                                    buttonTwo.setBackground(whiteColor);
                                                    buttonThree .setBackground(whiteColor);
                                                    buttonFourteen .setBackground(Color.yellow);
                                                    buttonFive .setBackground(Color.LIGHT_GRAY);
                                                    buttonSix .setBackground(whiteColor);
                                                    buttonSeven .setBackground(Color.magenta);
                                                    buttonEight .setBackground(whiteColor);
                                                    buttonNine .setBackground(whiteColor);
                                                    buttonTen .setBackground(whiteColor);
                                                    buttonEleven .setBackground(whiteColor);
                                                    buttonTwentyTwo .setBackground(Color.cyan);
                                                    buttonThirteen .setBackground(whiteColor);

                                                    buttonFive .setBackground(Color.pink);

                                                    messages.setText("OOPS Computer Player.\n You found a snake and demoted to 5 number.");
                                                    playerOne.setBackground(Color.orange);
                                                    playerTwo.setBackground(Color.white);
                                                    humanPlayerDice.setBackground(Color.orange);
                                                    computerPlayerCounter = 0;
                                                    humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                        
                                        case 17:
                                             if(computerPlayerCounter > 0)
                                            {
                                                     buttonOne.setBackground(whiteColor);
                                                     buttonTwo.setBackground(whiteColor);
                                                     buttonThree .setBackground(whiteColor);
                                                     buttonFourteen .setBackground(Color.yellow);
                                                     buttonFive .setBackground(Color.LIGHT_GRAY);
                                                     buttonSix .setBackground(whiteColor);
                                                     buttonSeven .setBackground(Color.magenta);
                                                     buttonEight .setBackground(whiteColor);
                                                     buttonNine .setBackground(whiteColor);
                                                     buttonTen .setBackground(whiteColor);
                                                     buttonEleven .setBackground(whiteColor);
                                                     buttonTwentyTwo .setBackground(Color.cyan);
                                                     buttonThirteen .setBackground(whiteColor);

                                                     buttonFifteen  .setBackground(whiteColor);

                                                     buttonSeventeen .setBackground(Color.pink);
                                                     computerPlayerCounter = 0;
                                                     humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        case 18:
                                            if(computerPlayerCounter > 0)
                                            {
                                                 buttonOne.setBackground(whiteColor);
                                                 buttonTwo.setBackground(whiteColor);
                                                 buttonThree .setBackground(whiteColor);
                                                 buttonFourteen .setBackground(Color.yellow);
                                                 buttonFive .setBackground(Color.LIGHT_GRAY);
                                                 buttonSix .setBackground(whiteColor);
                                                 buttonSeven .setBackground(Color.magenta);
                                                 buttonEight .setBackground(whiteColor);
                                                 buttonNine .setBackground(whiteColor);
                                                 buttonTen .setBackground(whiteColor);
                                                 buttonEleven .setBackground(whiteColor);
                                                 buttonTwentyTwo .setBackground(Color.cyan);
                                                 buttonThirteen .setBackground(whiteColor);

                                                 buttonFifteen.setBackground(whiteColor);

                                                 buttonSeventeen.setBackground(whiteColor);
                                                 buttonEighteen.setBackground(Color.pink);
                                                 computerPlayerCounter = 0;
                                                 humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        
                                        case 19:
                                            if(computerPlayerCounter > 0)
                                            {
                                                  buttonOne.setBackground(whiteColor);
                                                  buttonTwo.setBackground(whiteColor);
                                                  buttonThree .setBackground(whiteColor);
                                                  buttonFourteen .setBackground(Color.yellow);
                                                  buttonFive .setBackground(Color.LIGHT_GRAY);
                                                  buttonSix .setBackground(whiteColor);
                                                  buttonSeven .setBackground(Color.magenta);
                                                  buttonEight .setBackground(whiteColor);
                                                  buttonNine .setBackground(whiteColor);
                                                  buttonTen .setBackground(whiteColor);
                                                  buttonEleven .setBackground(whiteColor);
                                                  buttonTwentyTwo .setBackground(Color.cyan);
                                                  buttonThirteen .setBackground(whiteColor);

                                                  buttonFifteen.setBackground(whiteColor);

                                                  buttonSeventeen.setBackground(whiteColor);
                                                  buttonEighteen.setBackground(whiteColor);
                                                  buttonNinteen.setBackground(Color.pink);
                                                  computerPlayerCounter = 0;
                                                  humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;


                                        case 20: /**It's a snake that take to 7**/
                                            if(computerPlayerCounter > 0)
                                            {
                                                  previousComputerPlayerDiceRollValue = 7; /**Changing the previous computer dice value to 7**/
                                                  buttonOne.setBackground(whiteColor);
                                                  buttonTwo.setBackground(whiteColor);
                                                  buttonThree .setBackground(whiteColor);
                                                  buttonFourteen .setBackground(Color.yellow);
                                                  buttonFive .setBackground(Color.LIGHT_GRAY);
                                                  buttonSix .setBackground(whiteColor);
                                                  buttonSeven .setBackground(Color.magenta);
                                                  buttonEight .setBackground(whiteColor);
                                                  buttonNine .setBackground(whiteColor);
                                                  buttonTen .setBackground(whiteColor);
                                                  buttonEleven .setBackground(whiteColor);
                                                  buttonTwentyTwo .setBackground(Color.cyan);
                                                  buttonThirteen .setBackground(whiteColor);

                                                  buttonFifteen   .setBackground(whiteColor);

                                                  buttonSeventeen  .setBackground(whiteColor);
                                                  buttonEighteen  .setBackground(whiteColor);
                                                  buttonNinteen  .setBackground(whiteColor);
                                                  buttonSeven .setBackground(Color.pink);
                                                  messages.setText("OOPS Computer Player.\n You found a snake and demoted to 7 number.");
                                                  playerOne.setBackground(Color.orange);
                                                  playerTwo.setBackground(Color.white);
                                                  humanPlayerDice.setBackground(Color.orange);
                                                  computerPlayerCounter = 0;
                                                  humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        case 21:
                                            if(computerPlayerCounter > 0)
                                            {
                                                 buttonOne.setBackground(whiteColor);
                                                 buttonTwo.setBackground(whiteColor);
                                                 buttonThree .setBackground(whiteColor);
                                                 buttonFourteen .setBackground(Color.yellow);
                                                 buttonFive .setBackground(Color.LIGHT_GRAY);
                                                 buttonSix .setBackground(whiteColor);
                                                 buttonSeven .setBackground(Color.magenta);
                                                 buttonEight .setBackground(whiteColor);
                                                 buttonNine .setBackground(whiteColor);
                                                 buttonTen .setBackground(whiteColor);
                                                 buttonEleven .setBackground(whiteColor);
                                                 buttonTwentyTwo .setBackground(Color.cyan);
                                                 buttonThirteen .setBackground(whiteColor);

                                                 buttonFifteen   .setBackground(whiteColor);

                                                 buttonSeventeen  .setBackground(whiteColor);
                                                 buttonEighteen  .setBackground(whiteColor);
                                                 buttonNinteen  .setBackground(whiteColor);

                                                 buttonTwentyOne  .setBackground(Color.pink);
                                                 computerPlayerCounter = 0;
                                                 humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        
                                        case 22:
                                            if(computerPlayerCounter > 0)
                                            {
                                                    buttonOne.setBackground(whiteColor);
                                                    buttonTwo.setBackground(whiteColor);
                                                    buttonThree .setBackground(whiteColor);
                                                    buttonFourteen .setBackground(Color.yellow);
                                                    buttonFive .setBackground(Color.LIGHT_GRAY);
                                                    buttonSix .setBackground(whiteColor);
                                                    buttonSeven .setBackground(Color.magenta);
                                                    buttonEight .setBackground(whiteColor);
                                                    buttonNine .setBackground(whiteColor);
                                                    buttonTen .setBackground(whiteColor);
                                                    buttonEleven .setBackground(whiteColor);
                                                    buttonTwentyTwo .setBackground(Color.cyan);
                                                    buttonThirteen .setBackground(whiteColor);

                                                    buttonFifteen   .setBackground(whiteColor);

                                                    buttonSeventeen  .setBackground(whiteColor);
                                                    buttonEighteen  .setBackground(whiteColor);
                                                    buttonNinteen  .setBackground(whiteColor);

                                                    buttonTwentyOne  .setBackground(whiteColor);
                                                    buttonTwentyTwo  .setBackground(Color.pink);
                                                    computerPlayerCounter = 0;
                                                    humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        
                                        case 23:
                                            if(computerPlayerCounter > 0)
                                            {
                                                buttonOne.setBackground(whiteColor);
                                                buttonTwo.setBackground(whiteColor);
                                                buttonThree .setBackground(whiteColor);
                                                buttonFourteen .setBackground(Color.yellow);
                                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                                buttonSix .setBackground(whiteColor);
                                                buttonSeven .setBackground(Color.magenta);
                                                buttonEight .setBackground(whiteColor);
                                                buttonNine .setBackground(whiteColor);
                                                buttonTen .setBackground(whiteColor);
                                                buttonEleven .setBackground(whiteColor);
                                                buttonTwentyTwo .setBackground(Color.cyan);
                                                buttonThirteen .setBackground(whiteColor);

                                                buttonFifteen   .setBackground(whiteColor);

                                                buttonSeventeen  .setBackground(whiteColor);
                                                buttonEighteen  .setBackground(whiteColor);
                                                buttonNinteen  .setBackground(whiteColor);

                                                buttonTwentyOne  .setBackground(whiteColor);

                                                buttonTwentThree  .setBackground(Color.pink);
                                                computerPlayerCounter = 0;
                                                humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        case 24:
                                            if(computerPlayerCounter > 0)
                                            {
                                                 buttonOne.setBackground(whiteColor);
                                                 buttonTwo.setBackground(whiteColor);
                                                 buttonThree .setBackground(whiteColor);
                                                 buttonFourteen .setBackground(Color.yellow);
                                                 buttonFive .setBackground(Color.LIGHT_GRAY);
                                                 buttonSix .setBackground(whiteColor);
                                                 buttonSeven .setBackground(Color.magenta);
                                                 buttonEight .setBackground(whiteColor);
                                                 buttonNine .setBackground(whiteColor);
                                                 buttonTen .setBackground(whiteColor);
                                                 buttonEleven .setBackground(whiteColor);
                                                 buttonTwentyTwo .setBackground(Color.cyan);
                                                 buttonThirteen .setBackground(whiteColor);

                                                 buttonFifteen   .setBackground(whiteColor);

                                                 buttonSeventeen  .setBackground(whiteColor);
                                                 buttonEighteen  .setBackground(whiteColor);
                                                 buttonNinteen  .setBackground(whiteColor);

                                                 buttonTwentyOne  .setBackground(whiteColor);

                                                 buttonTwentThree  .setBackground(whiteColor);
                                                 buttonTwentyFour  .setBackground(Color.pink);
                                                 computerPlayerCounter = 0;
                                                 humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;

                                        case 25:
                                            if(computerPlayerCounter > 0)
                                            {
                                                  buttonOne.setBackground(whiteColor);
                                                  buttonTwo.setBackground(whiteColor);
                                                  buttonThree .setBackground(whiteColor);
                                                  buttonFourteen .setBackground(Color.yellow);
                                                  buttonFive .setBackground(Color.LIGHT_GRAY);
                                                  buttonSix .setBackground(whiteColor);
                                                  buttonSeven .setBackground(Color.magenta);
                                                  buttonEight .setBackground(whiteColor);
                                                  buttonNine .setBackground(whiteColor);
                                                  buttonTen .setBackground(whiteColor);
                                                  buttonEleven .setBackground(whiteColor);
                                                  buttonTwentyTwo .setBackground(Color.cyan);
                                                  buttonThirteen .setBackground(whiteColor);

                                                  buttonFifteen   .setBackground(whiteColor);

                                                  buttonSeventeen  .setBackground(whiteColor);
                                                  buttonEighteen  .setBackground(whiteColor);
                                                  buttonNinteen  .setBackground(whiteColor);

                                                  buttonTwentyOne  .setBackground(whiteColor);

                                                  buttonTwentThree  .setBackground(whiteColor);
                                                  buttonTwentyFour  .setBackground(whiteColor);
                                                  buttonTwentyFive  .setBackground(Color.pink);
                                                  computerPlayerCounter = 0;
                                                  humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        case 26:
                                            if(computerPlayerCounter > 0)
                                            {
                                                buttonOne.setBackground(whiteColor);
                                                buttonTwo.setBackground(whiteColor);
                                                buttonThree .setBackground(whiteColor);
                                                buttonFourteen .setBackground(Color.yellow);
                                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                                buttonSix .setBackground(whiteColor);
                                                buttonSeven .setBackground(Color.magenta);
                                                buttonEight .setBackground(whiteColor);
                                                buttonNine .setBackground(whiteColor);
                                                buttonTen .setBackground(whiteColor);
                                                buttonEleven .setBackground(whiteColor);
                                                buttonTwentyTwo .setBackground(Color.cyan);
                                                buttonThirteen .setBackground(whiteColor);

                                                buttonFifteen   .setBackground(whiteColor);

                                                buttonSeventeen  .setBackground(whiteColor);
                                                buttonEighteen  .setBackground(whiteColor);
                                                buttonNinteen  .setBackground(whiteColor);

                                                buttonTwentyOne  .setBackground(whiteColor);

                                                buttonTwentThree  .setBackground(whiteColor);
                                                buttonTwentyFour  .setBackground(whiteColor);
                                                buttonTwentyFive  .setBackground(whiteColor);
                                                buttonTwentySix  .setBackground(Color.pink);
                                                computerPlayerCounter = 0;
                                                humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;
                                        case 27:
                                            if(computerPlayerCounter > 0)
                                            {
                                                buttonOne.setBackground(whiteColor);
                                                buttonTwo.setBackground(whiteColor);
                                                buttonThree .setBackground(whiteColor);
                                                buttonFourteen .setBackground(Color.yellow);
                                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                                buttonSix .setBackground(whiteColor);
                                                buttonSeven .setBackground(Color.magenta);
                                                buttonEight .setBackground(whiteColor);
                                                buttonNine .setBackground(whiteColor);
                                                buttonTen .setBackground(whiteColor);
                                                buttonEleven .setBackground(whiteColor);
                                                buttonTwentyTwo .setBackground(Color.cyan);
                                                buttonThirteen .setBackground(whiteColor);

                                                buttonFifteen   .setBackground(whiteColor);

                                                buttonSeventeen  .setBackground(whiteColor);
                                                buttonEighteen  .setBackground(whiteColor);
                                                buttonNinteen  .setBackground(whiteColor);

                                                buttonTwentyOne  .setBackground(whiteColor);

                                                buttonTwentThree  .setBackground(whiteColor);
                                                buttonTwentyFour  .setBackground(whiteColor);
                                                buttonTwentyFive  .setBackground(whiteColor);
                                                buttonTwentySix  .setBackground(whiteColor);
                                                buttonTwentySeven  .setBackground(Color.pink);
                                                computerPlayerCounter = 0;
                                                humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                        case 28:
                                            if(computerPlayerCounter > 0)
                                            {
                                                 buttonOne.setBackground(whiteColor);
                                                 buttonTwo.setBackground(whiteColor);
                                                 buttonThree .setBackground(whiteColor);
                                                 buttonFourteen .setBackground(Color.yellow);
                                                 buttonFive .setBackground(Color.LIGHT_GRAY);
                                                 buttonSix .setBackground(whiteColor);
                                                 buttonSeven .setBackground(Color.magenta);
                                                 buttonEight .setBackground(whiteColor);
                                                 buttonNine .setBackground(whiteColor);
                                                 buttonTen .setBackground(whiteColor);
                                                 buttonEleven .setBackground(whiteColor);
                                                 buttonTwentyTwo .setBackground(Color.cyan);
                                                 buttonThirteen .setBackground(whiteColor);

                                                 buttonFifteen   .setBackground(whiteColor);

                                                 buttonSeventeen  .setBackground(whiteColor);
                                                 buttonEighteen  .setBackground(whiteColor);
                                                 buttonNinteen  .setBackground(whiteColor);

                                                 buttonTwentyOne  .setBackground(whiteColor);

                                                 buttonTwentThree  .setBackground(whiteColor);
                                                 buttonTwentyFour  .setBackground(whiteColor);
                                                 buttonTwentyFive  .setBackground(whiteColor);
                                                 buttonTwentySix  .setBackground(whiteColor);
                                                 buttonTwentySeven  .setBackground(whiteColor);
                                                 buttonTwentyEight  .setBackground(Color.pink);
                                                 computerPlayerCounter = 0;
                                                 humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                        
                                        case 29:
                                            if(computerPlayerCounter > 0)
                                            {
                                                 buttonOne.setBackground(whiteColor);
                                                 buttonTwo.setBackground(whiteColor);
                                                 buttonThree .setBackground(whiteColor);
                                                 buttonFourteen .setBackground(Color.yellow);
                                                 buttonFive .setBackground(Color.LIGHT_GRAY);
                                                 buttonSix .setBackground(whiteColor);
                                                 buttonSeven .setBackground(Color.magenta);
                                                 buttonEight .setBackground(whiteColor);
                                                 buttonNine .setBackground(whiteColor);
                                                 buttonTen .setBackground(whiteColor);
                                                 buttonEleven .setBackground(whiteColor);
                                                 buttonTwentyTwo .setBackground(Color.cyan);
                                                 buttonThirteen .setBackground(whiteColor);

                                                 buttonFifteen   .setBackground(whiteColor);

                                                 buttonSeventeen  .setBackground(whiteColor);
                                                 buttonEighteen  .setBackground(whiteColor);
                                                 buttonNinteen  .setBackground(whiteColor);

                                                 buttonTwentyOne  .setBackground(whiteColor);

                                                 buttonTwentThree  .setBackground(whiteColor);
                                                 buttonTwentyFour  .setBackground(whiteColor);
                                                 buttonTwentyFive  .setBackground(whiteColor);
                                                 buttonTwentySix  .setBackground(whiteColor);
                                                 buttonTwentySeven  .setBackground(whiteColor);
                                                 buttonTwentyEight  .setBackground(whiteColor);
                                                 buttonTwentyNine  .setBackground(Color.pink);
                                                 computerPlayerCounter = 0;
                                                 humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                 messages.setText("It is Human Player turn!!!!!");
                                            }

                                            break;
                                       
                                        case 30:
                                            if(computerPlayerCounter > 0)
                                            {
                                                      buttonOne.setBackground(whiteColor);
                                                      buttonTwo.setBackground(whiteColor);
                                                      buttonThree .setBackground(whiteColor);
                                                      buttonFourteen .setBackground(Color.yellow);
                                                      buttonFive .setBackground(Color.LIGHT_GRAY);
                                                      buttonSix .setBackground(whiteColor);
                                                      buttonSeven .setBackground(Color.magenta);
                                                      buttonEight .setBackground(whiteColor);
                                                      buttonNine .setBackground(whiteColor);
                                                      buttonTen .setBackground(whiteColor);
                                                      buttonEleven .setBackground(whiteColor);
                                                      buttonTwentyTwo .setBackground(Color.cyan);
                                                      buttonThirteen .setBackground(whiteColor);

                                                      buttonFifteen   .setBackground(whiteColor);

                                                      buttonSeventeen  .setBackground(whiteColor);
                                                      buttonEighteen  .setBackground(whiteColor);
                                                      buttonNinteen  .setBackground(whiteColor);

                                                      buttonTwentyOne  .setBackground(whiteColor);

                                                      buttonTwentThree  .setBackground(whiteColor);
                                                      buttonTwentyFour  .setBackground(whiteColor);
                                                      buttonTwentyFive  .setBackground(whiteColor);
                                                      buttonTwentySix  .setBackground(whiteColor);
                                                      buttonTwentySeven  .setBackground(whiteColor);
                                                      buttonTwentyEight  .setBackground(whiteColor);
                                                      buttonTwentyNine  .setBackground(whiteColor);
                                                      buttonThirty  .setBackground(Color.pink);
                                                      messages.setText("Computer Player has won!!!!!");
                                                      computerPlayerCounter = 0;
                                                      humanPlayerCounter = 1;
                                            }
                                            else
                                            {
                                                messages.setText("It is Human Player turn!!!!!");
                                            }


                                            break;

                                    default: /**Calls when the computer dice value is is grater than 30**/
                                                messages.setText("Your number " + finalComputerPlayerdiceValue +  " is greater than 30.\n Can not make the move!!!");
                                                playerOne.setBackground(Color.orange);
                                                playerTwo.setBackground(Color.white);
                                                humanPlayerDice.setBackground(Color.orange);
                                                humanPlayer.setBackground(Color.orange);
                                                humanPlayerCounter = 1; /**Assigning value 1 to human player counter**/
                                                computerPlayerCounter = 0; /**Assigning value 0 to computer player counter**/

                                    }

                                   if(computerPlayerDiceRoll == 6 && finalComputerPlayerdiceValue < 30) /**Condition o check computer player dice value is 6 and final computer player value is less than 30**/
                                        {
                                            playerOne.setBackground(Color.white);/**Changing human player button color**/
                                            playerTwo.setBackground(Color.pink); /**Changing computer player button color**/
                                             messages.setText("Still Computer Player Turn!!!!"); 
                                            humanPlayerCounter = 0;
                                            computerPlayerCounter = 1;
                                            
                                        }
                                    else if(computerPlayerDiceRoll == 6 && finalComputerPlayerdiceValue >= 30)  /**Condition o check computer player dice value is 6 and final computer player value is greater than or equal to 30**/
                                        {
                                            playerOne.setBackground(Color.orange); /**Changing human player button color**/
                                            playerTwo.setBackground(Color.white); /**Changing computer player button color**/
                                            messages.setText("Human Player Turn!!!!");
                                            humanPlayerCounter = 1;
                                            computerPlayerCounter = 0;
                                            
                                        }
                                    else 
                                        {
                                            playerOne.setBackground(Color.orange);
                                            playerTwo.setBackground(Color.white);
                                            humanPlayerDice.setBackground(Color.orange);
                                            humanPlayer.setBackground(Color.orange);
                                            
                                        }

                            }
                    
                    
                   
                        }
                    
                    }
                }
        }
    
    public class humanPlayerButton implements ActionListener /**ActionListener of human player move button*/
        {
            @Override
            public void actionPerformed(ActionEvent event) /**Calling the actionPerformed method*/
                {
                    
                 if(!(humanPlayerCounter == 0)) /**Condition to check human player counter is equal to 0*/
                    {    
                        int temporaryHolder = previousHumanPlayerDiceRollValue; /**Assigning previous human player dice value.*/
                        int finalHumanPlayerdiceValue = temporaryHolder + humanPlayerDiceRoll; /**Assigning sum of the previous human player dice value and current human player dice value.*/
                        if(!(finalHumanPlayerdiceValue > 30)) /**Condition to check final human player counter is not greater than 30*/
                            {
                                previousHumanPlayerDiceRollValue = finalHumanPlayerdiceValue; /**Assigning current human player dice value to previous one.*/
                            }
                    
                        
                        /** Checking the final human player dice value with switch. In every case, it checks that human player counter is
                            grater than 0. If yes, then it changes color of the current and previous buttons and make computer counter 1 and human counter 0. Otherwise append
                              message to the text area**/
                       switch(finalHumanPlayerdiceValue)
                        {
                           
                        case 1:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            break;
                        
                        case 2:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                       
                        case 3:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        
                        case 4: /**It's a ladder to 14*/
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                previousHumanPlayerDiceRollValue = 14; /*Changing previous human player dice value to 14**/
                                buttonFourteen .setBackground(color);
                                messages.setText("Congratulations Human Player.\n You found a ladder and promoted to 14 number.");
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                           
                            break;
                        
                        case 5:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        
                        case 6:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        
                        case 7:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        
                        case 8:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        
                        case 9:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            
                            break;
                        
                        case 10:
                             if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                       
                        case 11:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                           
                            break;
                        
                        case 12: /**It's a ladder to 22*/
                             if(humanPlayerCounter > 0)
                            {
                                previousHumanPlayerDiceRollValue = 22; /*Changing previous human player dice value to 22**/
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(color);
                                messages.setText("Congratulations Human Player.\n You found a ladder and promoted to 22 number.");
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                            
                        case 13:
                              if(humanPlayerCounter > 0)
                            {
                               buttonOne.setBackground(whiteColor);
                               buttonTwo.setBackground(whiteColor);
                               buttonThree .setBackground(whiteColor);
                               buttonFourteen .setBackground(Color.yellow);
                               buttonFive .setBackground(Color.LIGHT_GRAY);
                               buttonSix .setBackground(whiteColor);
                               buttonSeven .setBackground(Color.magenta);
                               buttonEight .setBackground(whiteColor);
                               buttonNine .setBackground(whiteColor);
                               buttonTen .setBackground(whiteColor);
                               buttonEleven .setBackground(whiteColor);
                               buttonTwentyTwo .setBackground(Color.cyan);
                               buttonThirteen .setBackground(color);
                               humanPlayerCounter = 0;
                               computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        
                        case 14:
                            if(humanPlayerCounter > 0)
                            {
                               buttonOne.setBackground(whiteColor);
                               buttonTwo.setBackground(whiteColor);
                               buttonThree .setBackground(whiteColor);
                               buttonFourteen .setBackground(Color.yellow);
                               buttonFive .setBackground(Color.LIGHT_GRAY);
                               buttonSix .setBackground(whiteColor);
                               buttonSeven .setBackground(Color.magenta);
                               buttonEight .setBackground(whiteColor);
                               buttonNine .setBackground(whiteColor);
                               buttonTen .setBackground(whiteColor);
                               buttonEleven .setBackground(whiteColor);
                               buttonTwentyTwo .setBackground(Color.cyan);
                               buttonThirteen .setBackground(whiteColor);
                               buttonFourteen.setBackground(color);
                               humanPlayerCounter = 0;
                               computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                             
                            break;
                        case 15:
                            if(humanPlayerCounter > 0)
                            {
                               buttonOne.setBackground(whiteColor);
                               buttonTwo.setBackground(whiteColor);
                               buttonThree .setBackground(whiteColor);
                               buttonFourteen .setBackground(Color.yellow);
                               buttonFive .setBackground(Color.LIGHT_GRAY);
                               buttonSix .setBackground(whiteColor);
                               buttonSeven .setBackground(Color.magenta);
                               buttonEight .setBackground(whiteColor);
                               buttonNine .setBackground(whiteColor);
                               buttonTen .setBackground(whiteColor);
                               buttonEleven .setBackground(whiteColor);
                               buttonTwentyTwo .setBackground(Color.cyan);
                               buttonThirteen .setBackground(whiteColor);

                               buttonFifteen   .setBackground(color);
                               humanPlayerCounter = 0;
                               computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        case 16: /**It's a snake to 5*/
                            if(humanPlayerCounter > 0)
                            {
                                previousHumanPlayerDiceRollValue = 5; /*Changing previous human player dice value to 5**/
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);
                                buttonFive .setBackground(color);
                                messages.setText("OOPS Human Player.\n You found a snake and demoted to 5 number.");
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                           
                            break;
                        case 17:
                             if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                           
                            
                            break;
                        
                        case 18:
                               if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            
                            break;
                       
                        case 19:
                             if(humanPlayerCounter > 0)
                            {
                                  buttonOne.setBackground(whiteColor);
                                  buttonTwo.setBackground(whiteColor);
                                  buttonThree .setBackground(whiteColor);
                                  buttonFourteen .setBackground(Color.yellow);
                                  buttonFive .setBackground(Color.LIGHT_GRAY);
                                  buttonSix .setBackground(whiteColor);
                                  buttonSeven .setBackground(Color.magenta);
                                  buttonEight .setBackground(whiteColor);
                                  buttonNine .setBackground(whiteColor);
                                  buttonTen .setBackground(whiteColor);
                                  buttonEleven .setBackground(whiteColor);
                                  buttonTwentyTwo .setBackground(Color.cyan);
                                  buttonThirteen .setBackground(whiteColor);

                                  buttonFifteen   .setBackground(whiteColor);

                                  buttonSeventeen  .setBackground(whiteColor);
                                  buttonEighteen  .setBackground(whiteColor);
                                  buttonNinteen  .setBackground(color);
                                  humanPlayerCounter = 0;
                                  computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            
                            break;
                        
                        case 20: /**It's a ladder to 7*/
                            if(humanPlayerCounter > 0)
                            {
                                  previousHumanPlayerDiceRollValue = 7; /*Changing previous human player dice value to 7**/
                                  buttonOne.setBackground(whiteColor);
                                  buttonTwo.setBackground(whiteColor);
                                  buttonThree .setBackground(whiteColor);
                                  buttonFourteen .setBackground(Color.yellow);
                                  buttonFive .setBackground(Color.LIGHT_GRAY);
                                  buttonSix .setBackground(whiteColor);
                                  buttonSeven .setBackground(Color.magenta);
                                  buttonEight .setBackground(whiteColor);
                                  buttonNine .setBackground(whiteColor);
                                  buttonTen .setBackground(whiteColor);
                                  buttonEleven .setBackground(whiteColor);
                                  buttonTwentyTwo .setBackground(Color.cyan);
                                  buttonThirteen .setBackground(whiteColor);

                                  buttonFifteen   .setBackground(whiteColor);

                                  buttonSeventeen  .setBackground(whiteColor);
                                  buttonEighteen  .setBackground(whiteColor);
                                  buttonNinteen  .setBackground(whiteColor);
                                  buttonSeven .setBackground(color);
                                  messages.setText("OOPS Human Player.\n You found a snake and demoted to 7 number.");
                                  humanPlayerCounter = 0;
                                  computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            
                            
                            break;
                        case 21:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            
                            break;
                        case 22:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);
                                buttonTwentyTwo  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            
                            break;
                       
                        case 23:
                             if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                           
                            
                            break;
                        
                        case 24:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(whiteColor);
                                buttonTwentyFour  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            
                            
                            break;
                            
                        case 25:
                            
                              if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(whiteColor);
                                buttonTwentyFour  .setBackground(whiteColor);
                                buttonTwentyFive  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                       
                        case 26:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(whiteColor);
                                buttonTwentyFour  .setBackground(whiteColor);
                                buttonTwentyFive  .setBackground(whiteColor);
                                buttonTwentySix  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                             
                            
                            break;
                       
                        case 27:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(whiteColor);
                                buttonTwentyFour  .setBackground(whiteColor);
                                buttonTwentyFive  .setBackground(whiteColor);
                                buttonTwentySix  .setBackground(whiteColor);
                                buttonTwentySeven  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                            
                            break;
                        
                        case 28:
                             if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(whiteColor);
                                buttonTwentyFour  .setBackground(whiteColor);
                                buttonTwentyFive  .setBackground(whiteColor);
                                buttonTwentySix  .setBackground(whiteColor);
                                buttonTwentySeven  .setBackground(whiteColor);
                                buttonTwentyEight  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                             
                            break;
                       
                        case 29:
                            if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(whiteColor);
                                buttonTwentyFour  .setBackground(whiteColor);
                                buttonTwentyFive  .setBackground(whiteColor);
                                buttonTwentySix  .setBackground(whiteColor);
                                buttonTwentySeven  .setBackground(whiteColor);
                                buttonTwentyEight  .setBackground(whiteColor);
                                buttonTwentyNine  .setBackground(color);
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                             
                            break;
                       
                        case 30:
                             if(humanPlayerCounter > 0)
                            {
                                buttonOne.setBackground(whiteColor);
                                buttonTwo.setBackground(whiteColor);
                                buttonThree .setBackground(whiteColor);
                                buttonFourteen .setBackground(Color.yellow);
                                buttonFive .setBackground(Color.LIGHT_GRAY);
                                buttonSix .setBackground(whiteColor);
                                buttonSeven .setBackground(Color.magenta);
                                buttonEight .setBackground(whiteColor);
                                buttonNine .setBackground(whiteColor);
                                buttonTen .setBackground(whiteColor);
                                buttonEleven .setBackground(whiteColor);
                                buttonTwentyTwo .setBackground(Color.cyan);
                                buttonThirteen .setBackground(whiteColor);

                                buttonFifteen   .setBackground(whiteColor);

                                buttonSeventeen  .setBackground(whiteColor);
                                buttonEighteen  .setBackground(whiteColor);
                                buttonNinteen  .setBackground(whiteColor);

                                buttonTwentyOne  .setBackground(whiteColor);

                                buttonTwentThree  .setBackground(whiteColor);
                                buttonTwentyFour  .setBackground(whiteColor);
                                buttonTwentyFive  .setBackground(whiteColor);
                                buttonTwentySix  .setBackground(whiteColor);
                                buttonTwentySeven  .setBackground(whiteColor);
                                buttonTwentyEight  .setBackground(whiteColor);
                                buttonTwentyNine  .setBackground(whiteColor);
                                buttonThirty  .setBackground(color);
                                messages.setText("Human Player has won!!!!!");
                                humanPlayerCounter = 0;
                                computerPlayerCounter = 1;
                            }
                            else
                            {
                                messages.setText("It is Computer Player turn!!!!!");
                            }
                               
                            break;
                        
                        default:  /**Calls when the computer dice value is is grater than 30**/
                            messages.setText("Your number " + finalHumanPlayerdiceValue +  " is greater than 30.\n Can not make the move!!!");
                            playerOne.setBackground(Color.white);
                            playerTwo.setBackground(Color.pink);
                            computerPlayerDice.setBackground(Color.pink);
                            humanPlayerCounter = 0; /**Assigning value 1 to human player counter**/
                            computerPlayerCounter = 1;  /**Assigning value 0 to computer player counter**/
                        }
                  
                if(humanPlayerDiceRoll == 6 && finalHumanPlayerdiceValue < 30) /**Condition o check computer player dice value is 6 and final computer player value is less than 30**/
                    {
                        playerOne.setBackground(Color.orange); /**Changing human player button color**/
                        playerTwo.setBackground(Color.white); /**Changing computer player button color**/
                        messages.setText("Still Human Player Turn!!!!");
                        humanPlayerCounter = 1;
                        computerPlayerCounter = 0;
                    }
                
                else if(humanPlayerDiceRoll == 6 && finalHumanPlayerdiceValue >= 30) /**Condition o check computer player dice value is 6 and final computer player value is greater than or equal to 30**/
                    {
                        playerOne.setBackground(Color.white); /**Changing human player button color**/
                        playerTwo.setBackground(Color.pink); /**Changing computer player button color**/
                        messages.setText("Computer Player Turn!!!!");
                        humanPlayerCounter = 0;
                        computerPlayerCounter = 1;
                    }
                else 
                    {
                        playerOne.setBackground(Color.white);
                        playerTwo.setBackground(Color.pink);
                        computerPlayerDice.setBackground(Color.pink);

                    }
                
            }
        }
    
    }
    
   
}
