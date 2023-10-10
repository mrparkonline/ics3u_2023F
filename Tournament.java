/* 
Problem Description:

Each player in a tournament plays six games. 
There are no ties. 
The tournament director places the players in groups based on the results of games as follows: 
if a player wins 5 or 6 games, they are placed in Group 1; 
if a player wins 3 or 4 games, they are placed in Group 2; 
if a player wins 1 or 2 games, they are placed in Group 3; 
if a player does not win any games, they are eliminated from the tournament. 

Write a program to determine which group a player is placed in.

The program takes 6 inputs.Either W for Win or L for Loss.

The program should output the followings scenario
    Output 1 for being in group 1
    Output 2 for being in group 2
    Output 3 for being in group 3
    Output -1 for being eliminated
*/

import java.util.Scanner;

class Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable Initialization
        int win_counter = 0;

        // Game Result inputs
        System.out.println("Enter your game results:");
        String game1_result = sc.nextLine();
        String game2_result = sc.nextLine();
        String game3_result = sc.nextLine();
        String game4_result = sc.nextLine();
        String game5_result = sc.nextLine();
        String game6_result = sc.nextLine();

        if (game1_result.equals("W")) {
            win_counter++;
        }
        if (game2_result.equals("W")) {
            win_counter++;
        }
        if (game3_result.equals("W")) {
            win_counter++;
        }
        if (game4_result.equals("W")) {
            win_counter++;
        }
        if (game5_result.equals("W")) {
            win_counter++;
        }
        if (game6_result.equals("W")) {
            win_counter++;
        }
        // Game result placement
        if (win_counter > 4) {
            System.out.println("Group 1.");
        }
        else if (win_counter > 2) {
            System.out.println("Group 2.");
        }
        else if (win_counter > 0) {
            System.out.println("Group 3.");
        }
        else {
            System.out.println("Eliminated.");
        }
    }
}