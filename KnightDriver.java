/**
 * Villafranca, Rikki Lee
 * COP-3252
 * Assignment 3
 * 1/26/23
 */


 import javax.swing.JOptionPane;



// *******************************************************
// * Public Class KnightDriver: Main driver that will    *
// * dislay Dialog Box in oder to get the Knight's five  *
// * attributes and dislay the stars using the Knight    *
// * and Stars Public Classes.                           *
// *******************************************************

 public class KnightDriver {
 
     public static void main(String[] args) {

// *******************************************************
// * Pop up dialog using JOptionPane from javax.swing.   *
// * For integer, I used Interger.parseInt to convert    *
// * string to int and displays Knight attributes.       *
// *******************************************************

        Knight userKnight = new Knight();
        Stars userStars = new Stars();

        String name = JOptionPane.showInputDialog("Enter your knight's name:", JOptionPane.QUESTION_MESSAGE);
        userKnight.setName(name);

        String health = JOptionPane.showInputDialog("Enter your knight's health:", JOptionPane.QUESTION_MESSAGE);
        userKnight.setHealth(Integer.parseInt(health));

        String battles = JOptionPane.showInputDialog("Enter your knight's battles:", JOptionPane.QUESTION_MESSAGE);
        userKnight.setBattles(Integer.parseInt(battles));

        String age = JOptionPane.showInputDialog("Enter your knight's age:", JOptionPane.QUESTION_MESSAGE);
        userKnight.setAge(Integer.parseInt(age));

        String gold = JOptionPane.showInputDialog("Enter your knight's gold:", JOptionPane.QUESTION_MESSAGE);
        userKnight.setGold(Integer.parseInt(gold));


        System.out.println("Knight Name: " + userKnight.getName());
        System.out.println("Knight Health: " + userKnight.getHealth());
        System.out.println("Knight Name: " + userKnight.getBattles());
        System.out.println("Knight Name: " + userKnight.getAge());
        System.out.println("Knight Name: " + userKnight.getGold());
        System.out.println();


// *******************************************************
// * Displays the Stars output using Stars public class. *
// * Uses a for loop in order to display star output     *
// * from user input of row and column.                  *
// *******************************************************

        String Row = JOptionPane.showInputDialog("Enter the number of rows:", JOptionPane.QUESTION_MESSAGE);
        userStars.setRow(Integer.parseInt(Row));

        String Col = JOptionPane.showInputDialog("Enter the number of columns:", JOptionPane.QUESTION_MESSAGE);
        userStars.setColumn(Integer.parseInt(Col));

        for (int i = 0; i < userStars.getRow(); i++) {
            for (int j = 0; j < userStars.getColumn(); j++) {
                System.out.print("* ");
            }

            System.out.println();
            if (i%2 == 0) {
                System.out.print(" ");
            }

        }

     }
 
 }
 