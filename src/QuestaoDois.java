import java.util.Scanner;

public class QuestaoDois {

    public static void main(String[] args) {
        var palavra = "";
        var count = 0;

        Scanner e = new Scanner(System.in);
        palavra = e.nextLine().toLowerCase();
        var index = palavra.indexOf('a');

       while(index!= -1) {
           count++;
           index = palavra.indexOf('a', index+1);
       }

        System.out.println("A letra 'A' aparece " + count + " vezes");

        e.close();
    }
}
