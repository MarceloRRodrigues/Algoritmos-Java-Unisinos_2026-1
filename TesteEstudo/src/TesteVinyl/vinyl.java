package TesteVinyl;

public class vinyl {
    String artist;
    String album_name;
    int units;

    vinyl() {   //construtor sem parametros, inicializa os atributos do objeto
        artist = "nada";
        album_name = "nenhum";
        units = 0;
    }

    void display_artist(){ //metodo sem parametros
        System.out.println(artist);
    }
    void set_artist(String artist){ //metodo com parametros
        this.artist = artist;
    }
    void display_album_name(){ //metodo sem parametros
        System.out.println(album_name);
    }
    void set_album_name(String album_name){ //metodo com parametros
        this.album_name = album_name;
    }
    void display_units(){ //metodo sem parametros
        System.out.println(units);
    }
    void set_units(int units){ //metodo com parametros
        this.units = units;
    }
}
