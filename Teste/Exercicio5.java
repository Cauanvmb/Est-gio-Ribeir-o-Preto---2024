public class Exercicio5 {
    public static void main(String[] args) {
        String stringOriginal = "fatec";

        String stringInvertida = inverterString(stringOriginal);
        System.out.println(stringOriginal);
        System.out.println(stringInvertida);
    }

    public static String inverterString(String string) {
        char[] caracteres = string.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}