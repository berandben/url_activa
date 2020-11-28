package miapp;

import java.io.File;

public class MiApp {

    public static void main(String[] args) {      

        System.out.println("Hola mundo");

        File directory = new File(".");

        try {
            System.out.println("Ruta canónica a la carpeta actual: "
                    + directory.getCanonicalPath());
            System.out.println("Ruta absoluta a la carpeta actual: "
                    + directory.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Exceptione is =" + e.getMessage());
        }

    }

}
