package com.TicTacToe;

public class Main {

    public static void main(String[] args){

        Field game = new Field();
        int counter = 0;
        game.createField();
        System.out.println("для окончания игры введите q");

        do{
            if(counter%2 == 0){
                System.out.println("Ведите координаты для x: ");
                if(game.setCell('x')){
                    counter++;
                }
                game.showField();
                if(game.checkWin()){
                    break;
                }
            }
            else{
                System.out.println("Ведите координаты для o: ");
                if(game.setCell('o')){
                    counter++;
                }
                game.showField();
                if(game.checkWin()){
                    break;
                }
            }
        }
        while(game.cleanCell());

        System.out.println("Game Over");
        System.out.println("Game Over");
    }
}

