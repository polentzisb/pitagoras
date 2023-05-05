public class Pitagoras {
    public double calcularHipotenusa(int catetoA, int catetoB) {
        double hipotenusa;
        hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
        return hipotenusa;
    }
}