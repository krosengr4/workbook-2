package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please input a game score formatted \"Home:Visitor|homeScore:visitorScore\": ");
        String score = myScanner.nextLine();

        score = score.trim();

        String[] parts = score.split("\\|");
        String teams = parts[0];
        String gameScore = parts[1];

        String[] teamParts = teams.split(":");
        String[] scoreParts = gameScore.split(":");

        String homeTeam = teamParts[0];
        String awayTeam = teamParts[1];
        int homeScore = Integer.parseInt(scoreParts[0]);
        int awayScore = Integer.parseInt(scoreParts[1]);

        if(homeScore > awayScore){
            System.out.println("Winner: " + homeTeam + "\n with a score of: " + homeScore);
        } else if(awayScore > homeScore) {
            System.out.println("Winner: " + awayTeam + "\n with a score of: " + awayScore);
        } else {
            System.out.println("The game resulted in a tie.");
        }

    }

}
