package com.TicTacToe;

import java.util.Scanner;

public class GetCoordinate {

    int x = 0;
    int y = 0;

    public void readKey(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            x = sc.nextInt();
            y = sc.nextInt();

        }
        else{
            System.out.println("Quit");
            System.exit(0);
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
