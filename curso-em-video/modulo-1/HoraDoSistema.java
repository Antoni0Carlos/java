import java.util.Date;

import javax.sound.sampled.SourceDataLine;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
}