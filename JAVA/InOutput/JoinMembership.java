package JAVA.InOutput;

// Question : Joonha wants to join the membership
// but he was surprised to see ID [joonas] already exist.
// Joona express his shock with ??!.
// Make program to show Joonhas feeling. (BAEKJOON 10926)
// Input : In the first line, an ID that already exists on the site
// where Junha is trying to join is given.
// The ID consists of only lowercase alphabetic characters,
// and the length does not exceed 50 characters.
// Output : Output a subsequent surprise on the first line.
// Surprise is indicated by attaching ??! after the ID.

import java.util.Scanner;

public class JoinMembership {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String joonas;

        joonas = scanner.next();

        System.out.println(joonas + "??!");
        scanner.close();
    }
    
}