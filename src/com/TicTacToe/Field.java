package com.TicTacToe;

public class Field {

    private static final int FIELD_SIZE = 3;

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public void createField() {

        for(int i = 0; i<FIELD_SIZE; i++){
            for(int j = 0; j<FIELD_SIZE; j++){
                field[i][j] = ' ';
            }
        }
    }

    public void showField(){

        for(int i = 0; i<FIELD_SIZE; i++){
            for(int j = 0; j<FIELD_SIZE; j++){
                System.out.print("[" + field[i][j] + "]");
            }
            System.out.println();
        }
    }

    public boolean cleanCell(){

        for(int i = 0; i<FIELD_SIZE; i++){
            for(int j = 0; j<FIELD_SIZE; j++){
                if (field[i][j] == ' ') {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean setCell(char c){

        GetCoordinate coordinate = new GetCoordinate();
        coordinate.readKey();
        int x = coordinate.getX();
        int y = coordinate.getY();

        if(x < FIELD_SIZE && y < FIELD_SIZE){
            if(field[x][y] == ' '){
                field[x][y] = c;
                return true;
            }
            else{
                System.out.println("Клетка уже занята");
                return false;
            }
        }
        else{
            System.out.println("Введенные координаты выходят за размеры поля");
            return false;
        }
    }

    public boolean checkWin(){
        int counter = 0;
        for(int i = FIELD_SIZE-1; i > 0; i--){
            counter = 0;
            for(int j = FIELD_SIZE-1; j > 0 ; j--){
                if(field[i][j] != ' ' && field[i][j] == field[i][j-1]){
                    counter++;
                    System.out.println(counter);
                    if(counter == FIELD_SIZE-1){
                        return true;
                    }
                }
            }
/*

            if((field[i][FIELD_SIZE-3] != ' ' && field[i][FIELD_SIZE-3] == field[i][FIELD_SIZE-2]
                    && field[i][FIELD_SIZE-2] == field[i][FIELD_SIZE-1]) ||
               (field[FIELD_SIZE-3][i] != ' ' && field[FIELD_SIZE-3][i] == field[FIELD_SIZE-2][i]
                    && field[FIELD_SIZE-2][i] == field[FIELD_SIZE-1][i]) ||
               (field[0][0] != ' ' && field[0][0] == field[1][1] && field[1][1] == field[2][2]) ||
               (field[2][0] != ' ' && field[2][0] == field[1][1] && field[1][1] == field[0][2])){
            return true;
            }
*/
        }
        return false;
    }
}
