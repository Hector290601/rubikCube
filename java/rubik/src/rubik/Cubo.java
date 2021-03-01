/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubik;

/**
 *
 * @author hector
 */
public class Cubo {
    int[][] caras = new int [6][9];
    public Cubo(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 9; j++){
                caras[i][j] = i;
            }
        }
    }
    @Override
    public String toString(){
        int c = 0, d = 0;
        for(int i = 0; i < 6; i++){
            d = 0;
            for(int j = 0; j < 9; j++){
                c = caras[i][j];
                if(d == 3){
                    System.out.println();
                    d = 0;
                }
                d += 1;
                switch(c){
                    case 0:     //Naranja
                        System.out.print("N ");
                    break;
                    case 1:     //Verde
                        System.out.print("V ");
                    break;
                    case 2:     //Rojo
                        System.out.print("R ");
                    break;
                    case 3:     //Azul
                        System.out.print("A ");
                    break;
                    case 4:     //Blanco
                        System.out.print("B ");
                    break;
                    case 5:     //Amarillo
                        System.out.print("Y ");
                    break;
                }
            }
            System.out.println();
        }
        return "";
    }
}
