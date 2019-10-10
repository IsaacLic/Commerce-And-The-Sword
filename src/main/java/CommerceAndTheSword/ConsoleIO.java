package CommerceAndTheSword;

import java.util.Scanner;

public class ConsoleIO implements IOController {

    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    @Override
    public void output(String string) {
        System.out.println(string);
    }

}
