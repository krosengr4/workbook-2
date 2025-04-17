package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {

        // Create new instance of Scanner
        Scanner myScanner = new Scanner(System.in);

        // Use scanner to get user input
        System.out.println("Please input a game score formatted \"Home:Visitor|homeScore:visitorScore\": ");
        String score = myScanner.nextLine();

        score = score.trim();

        // Split user input string at the "|" character to separate teams from score and assign variables
        String[] parts = score.split("\\|");
        String teams = parts[0];
        String gameScore = parts[1];

        // Split user input string at the ":" to separate home and away and assign variables
        String[] teamParts = teams.split(":");
        String[] scoreParts = gameScore.split(":");
        String homeTeam = teamParts[0];
        String awayTeam = teamParts[1];

        // Parse the home and away scores to compare them
        int homeScore = Integer.parseInt(scoreParts[0]);
        int awayScore = Integer.parseInt(scoreParts[1]);

        // Compare home and away scores to determine and print the results
        if(homeScore > awayScore){
            System.out.println("Winner: " + homeTeam + "\n with a score of: " + homeScore);
        } else if(awayScore > homeScore) {
            System.out.println("Winner: " + awayTeam + "\n with a score of: " + awayScore);
        } else {
            System.out.println("The game resulted in a tie.");
        }

    }

}
