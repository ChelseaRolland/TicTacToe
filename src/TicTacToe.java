import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char [][] gameBoard = {
                {' ', '|', ' ', '|', ' ' },
                {'-', '*', '-', '*', '-' },
                {' ', '|', ' ', '|', ' ' },
                {'-', '*', '-', '*', '-' },
                {' ', '|', ' ', '|', ' ' }
        };

        printGameBoard(gameBoard);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your placement number 1 - 9: ");
        int position = scan.nextInt();
        System.out.println(position);

        switch(position) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][0] = 'X';
                break;
            case 3:
                gameBoard[0][0] = 'X';
                break;
            case 4:
                gameBoard[0][0] = 'X';
                break;
            case 5:
                gameBoard[0][0] = 'X';
                break;
            case 6:
                gameBoard[0][0] = 'X';
                break;
            case 7:
                gameBoard[0][0] = 'X';
                break;
            case 8:
                gameBoard[0][0] = 'X';
                break;
            case 9:
                gameBoard[0][0] = 'X';
                break;
            default:
                System.out.println("Please enter a number 1 - 9: ");
                break;
        }
    }


    public static void printGameBoard(char [][] gameBoard){
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
