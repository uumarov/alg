package ru.geekbrains.lesson3;

public class Expression {
    private String expr;

    public Expression(String expr) {
        this.expr = expr;
    }

    public boolean checkBrackets() {
        //(a + 4) * ([b - 7] / {a - 5 * (a - 2)})
        // }
        // 4 * (2 + 3) - инфиксная
        //* + 2 3 4 - префиксная запись (Польская нотация)
        //4 2 3 + * - постфиксная запись (обратная польская нотация)
        //20
        //(2 + 3) * (4 - 2)
        //   1    3    2
        //      *
        //   +     -
        // 2   3  4  2
        //ЛПК
        //КЛП
        //2 3 + 4 2 - *
        //10
        //* + 2 3 - 4 2


        MyArrayStack<Character> stack = new MyArrayStack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Error in " + i + " position");
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(' ||
                        ch == ']' && top != '[' ||
                        ch == '}' && top != '{') {
                    System.out.println("Error in " + i + " position");
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: brackets doesn't match.");
            return false;
        }
        return true;
    }
}
