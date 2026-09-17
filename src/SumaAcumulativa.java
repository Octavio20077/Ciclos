public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("***Suma Acumulativa***");
        final int MAXIMO= 5;
        int acumuladoresSuma = 0;

        //Interar los valores
        int numero = 1;
        while (numero <= MAXIMO){
            //realizar la suma acumulativa
            acumuladoresSuma += numero++;
        }
        System.out.println("Suma de los primeros " + MAXIMO + " Numeros: " + acumuladoresSuma);
    }
}
