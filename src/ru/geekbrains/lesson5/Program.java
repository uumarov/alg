package ru.geekbrains.lesson5;

public class Program {
    public static void main(String[] args) {
        System.out.println(productRec(7, 1));
    }

    //5. Даны два целых неотрицательных числа a и b. Без использования операции умножения,
    //найти произведение числа a и b.
    //a * b = (a + a + ... + a) b раз =
    //f(a, b) = f(a, b - 1) + a

    public static int productRec(int a, int b) {
        if (b == 0) {
            return 0;
        }
        else if (b == 1) {
            return a;
        }
        else {
            return productRec(a, b - 1) + a;
        }
    }

    public static int product(int a, int b) {
        int sum = 0;
        if (b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b > 0) {
            sum += a;
            b--;
        }
        return sum;
    }

    //4. Дано натуральное число n. Найати сумму цифр числа n.
    //f(n) - сумма цифр числа n
    //f(n) = f(n / 10) + n % 10;
    //f(5845) = (5 + 8 + 4) + 5 = f(584) + 5
    public static int digitSumRec(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return digitSumRec(n / 10) + n % 10;
        }
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    //3. Дано натуральное число n. Найти n-ое треугольное число
    //t(n) = [1 + 2 + ... + (n - 1)] + n = t(n - 1) + n

    public static int triangleRec(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return triangleRec(n - 1) + n;
        }
    }

    public static int triangle(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    //2. Дано натуральное число n. Найти n! = [1 * 2 * ... * (n - 1)] * n = (n - 1)! * n
    //f(n) - факториал числа n;
    //f(n) = f(n - 1) * n

    public static long factRec(int n) {
        if (n < 2) {
            return 1;
        }
        else {
            return factRec(n - 1) * n;
        }
    }

    public static long fact(int n) {
        long product = 1;
        while (n > 0) {
            product *= n;
            n--;
        }
        return product;
    }

    //1. Дано натуральное число n. Найти n=ый член последовательности Фибоначчи
    //f(0) = 0, f(1) = 1, f(2) = 1, f(n) = f(n - 1) + f(n - 2)
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
    //Леонардо Фибоначчи
    //f(n)/f(n - 1) = phi = 1.618

    public static long phiboRec(int n) {
        System.out.print(n + ", ");
        if (n < 3) {
            return 1;
        }
        else {
            return phiboRec(n - 1) + phiboRec(n - 2);
        }
    }

    public static long phibo(int n) {
        long current = 1;
        int current_index = 1;
        long previous = 0;
        while (current_index < n) {
            long next = current + previous;
            previous = current;
            current = next;
            current_index++;
        }
        return current;
    }
}
