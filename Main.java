/**
 * Project 02. This call creates an object of the Board class and call it and append message
               to the text area. * 
 * @author     Fouad Nazir Ahmad    Saleemi *
 * @version    11.0.6 , 27/05/2020                 
 */
package projecttwo;

import java.awt.Color;


public class Main {
    public static void main(String[] args)
    {
        Board board = new Board(); /*Creates the object of the board class**/
        board.messages.setText("To decide the First Turn.\n "
                + "Human Player will Role Dice first and Computer Player Roll Dice Second.\n"
                + " After this, press decider button.\n Please start now!!!!"); /*Append message to the texrt area**/
        
    }
}
