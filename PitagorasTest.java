public class PitagorasTest {
    public static void main(String[] args) {
        Pitagoras pitagoras = new Pitagoras();
        int catetoA = 5;
        int catetoB = 6;
        double hipotenusa = pitagoras.calcularHipotenusa(catetoA, catetoB);
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}