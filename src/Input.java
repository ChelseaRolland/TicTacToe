import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input () {
        this.scan = new Scanner(System.in);
    }

    //get methods

    public String getString() {
        return this.scan.nextLine().trim();
    }

    public int getInt(int min, int max){
        int inputNum = Integer.parseInt(scan.nextLine().trim());
        if (inputNum >= min && inputNum <= max) {
            return inputNum;
        } else {
            System.out.printf("Please enter a number from %d - %d\n", min, max);
            getInt(min, max);
        }
        return inputNum;
    }

    public static void main(String[] args) {
        Input input = new Input();
        input.getInt(1,9);
    }
}
