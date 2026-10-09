package barbara;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sonda sonda01 = new Sonda("Abraxis", -1, 2000, "Azul");
        Foguete foguete01 = new Foguete("Typhoeus", 109, 2004, 10);
        Hangar hangar01 = new Hangar("Yotar", 5);

        Engenheiro hambugui = new Engenheiro("Hambugui", "0123");
        hambugui.inspecionar(sonda01);

        hangar01.adicionarNave(foguete01);
        hangar01.adicionarNave(sonda01);

        AgenciaEspacial agenciaEspacial01 = new AgenciaEspacial("Sushi", "SS", "Murilo");

        agenciaEspacial01.adicionarHangar(hangar01);

        System.out.printf("A sonda está estacionada no hangar: %s que está na agência Espacial: %s\n", sonda01.getHangar().getNome(), sonda01.getHangar().getAgenciaEspacial().getNome());

    }
}