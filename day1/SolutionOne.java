package day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SolutionOne {
    public static void main(String[] args) throws IOException, Exception {
        int solution = 0;
        Scanner scanner = new Scanner(new File("day1/input.txt"));
        
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            solution += getFirstDigit(line) * 10 + getLastDigit(line);
        }

        scanner.close();
        System.out.println(solution);
    }

    public static int getFirstDigit(String line) throws Exception {
        for(char c: line.toCharArray()) {
            if(Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        throw new Exception();
    }

    public static int getLastDigit(String line) throws Exception {
        char[] array = line.toCharArray();
        for(int i = array.length - 1; i >= 0; i--) {
            char c = array[i];
            if(Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        throw new Exception();
    }
}