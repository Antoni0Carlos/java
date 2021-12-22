public class TestarCarro{
    public static void main(String args[]) {
        carro c1 = new Carro();
        carro c2 = new Carro();

        c1.motor = '2.0';
        c1.cor = 'Prata';
        c1.marca = 'Citroen';

        c1.motor = '1.6';
        c1.cor = 'vermelho';
        c1.marca = 'Frod';
    }
}