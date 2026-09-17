public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("***Numeros Impares***");
        int contador = 1;
        while (contador <= 20){
            if (contador %2 != 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
