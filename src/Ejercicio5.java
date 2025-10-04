public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al conversor de Euros a pesetas");
        System.out.println("      1 EURO ------->166.386");
        System.out.println();
        double pesetasValor = 1000000, convertido, pesetas=166.386;

        convertido = pesetasValor/pesetas;

        System.out.printf("La cantidad convertida de pesetas a euros son:  %f euros", convertido);
    }
}
