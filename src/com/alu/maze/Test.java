package com.alu.maze;

import java.util.Scanner;

/**
 * @author alu
 * @date 2021/2/1 15:19
 */
public class Test {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        char[][] maze = {
                {'#','#','#','#','#','#'},
                {'#','@','.','&','#'},
                {'#','#',' ','#','#'}
        };
        Scanner sc = new Scanner(System.in);
        printArr(maze);
        while(true){
            String c = sc.nextLine();
            switch (c){
                case "w":
                    maze[x][y] = '.';
                    maze[--x][y] = '@';
                    printArr(maze);
                    break;
                case "s":
                    maze[x][y] = '.';
                    maze[++x][y] = '@';
                    printArr(maze);
                    break;
                case "a":

                    maze[x][y] = '.';
                    maze[x][--y] = '@';
                    printArr(maze);
                    break;
                case "d":
                    maze[x][y] = '.';
                    maze[x][++y] = '@';
                    printArr(maze);
                    break;
                default:
                    System.out.println("输入有误：请重新输入");
                    break;
            }
        }
    }
    public static void printArr(char[][] c){
        for (int i = 0;i < c.length;i++){
            for (int j = 0;j < c[i].length;j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
