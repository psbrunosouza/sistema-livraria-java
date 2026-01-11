import menus.PrincipalMenu;
import models.Biblioteca;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        try {
            PrincipalMenu.exibir(biblioteca);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
