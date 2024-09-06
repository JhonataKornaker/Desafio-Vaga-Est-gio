import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestaoUm {
    public static void main(String[] args) {
        int numFibonacci;
        List<Integer> arrayFibonacci = new ArrayList<>();

        Scanner e = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o Fibonacci");
        numFibonacci = e.nextInt();

        System.out.println("A sequencia de Fibonacci do numero " + numFibonacci + " é: ");
        for(int i=0; i<=numFibonacci; i++) {
            arrayFibonacci.add(calcularFibonacci(i));
            System.out.println(calcularFibonacci(i));
        }

        System.out.println("");

        System.out.println(verificaNum(arrayFibonacci, numFibonacci));

        e.close();
    }
    public static int calcularFibonacci (int num) {
        if(num <= 1) {
            return num;
        }
        return calcularFibonacci(num - 1) + calcularFibonacci(num - 2);
    }
    public static String verificaNum(List numList, int num) {
        boolean value = numList.contains(num);
        if(value) {
            return "O numero " + num + " faz parte da sequencia Fibonacci";
        }
        return "O numero " + num + " NAO faz parte da sequencia Fibonacci";
    }
}