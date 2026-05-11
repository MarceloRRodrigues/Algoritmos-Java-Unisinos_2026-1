package TesteVinyl;

public class Teste_vynil {

    public static void main(String[] args) {
        vinyl lp = new vinyl();

        //Testando inicialização dos valores pelo construtor
        lp.display_artist();
        lp.display_album_name();
        lp.display_units();

        //atribuindo novos valores pelos métodos getters da classe vinyl
        lp.set_artist("ariana");
        lp.set_album_name("thank u next");
        lp.set_units(100);

        //mostrando valores com métodos getters da classe vinyl
        lp.display_artist();
        lp.display_album_name();
        lp.display_units();

    }
}
