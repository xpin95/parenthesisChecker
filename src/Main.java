import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce some text");
        String text = sc.nextLine();

        System.out.println(checkParenthesis(getParenthesisFromList(stringToList(text))));


    }

    static private ArrayList<Character> stringToList(String text) {
        ArrayList<Character> characters = new ArrayList<Character>();
        for (int i = 0; i < text.length(); i++) {
            characters.add(text.charAt(i));
        }
        return characters;
    }

    static private ArrayList<Character> getParenthesisFromList(ArrayList<Character> characters) {
        ArrayList<Character> parenthesisList = new ArrayList<Character>();
        for (char elto : characters) {
            if (elto == '(' || elto == ')') parenthesisList.add(elto);
        }
        return parenthesisList;
    }

    static boolean checkParenthesis(ArrayList<Character> list) {
        int openParentheshis = 0;
        int closedParenthesis = 0;
        if (list.get(0) == '(' && list.get(list.size() - 1) == ')') {
            for (char elto : list) {
                if (elto == '(') openParentheshis++;
                else if (elto == ')') closedParenthesis++;
            }
            return openParentheshis == closedParenthesis;
        } else {
            return false;
        }

    }
}
