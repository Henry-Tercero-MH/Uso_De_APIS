package consumirappchucknorris;

import consumirappchucknorris.ChuckNorrisAPI;
import consumirappchucknorris.ChuckNorrisJoke;
import javax.swing.JOptionPane;
import ejemplo_multiidioma.frmPrincipal;
import java.util.Locale;
import java.util.ResourceBundle;
import ejemplo_multiidioma.frmPrincipal;
public class Main {
    public static void main(String[] args) {
      
frmPrincipal nu = new frmPrincipal();
       
        try {
                while (true) 
                {
                 ChuckNorrisAPIParse chuckNorrisAPIParse = new ChuckNorrisAPIParse();
            String jsonResponse = ChuckNorrisAPI.getRandomJoke();
            ChuckNorrisJoke chuckNorrisJoke = chuckNorrisAPIParse.parseJoke(jsonResponse);
            //obtenemos una cadena con el chiste
            String mensaje = chuckNorrisJoke.getValue();
                    System.out.println(mensaje);
 JOptionPane.showMessageDialog(null, chuckNorrisJoke.getValue());
//           frmPrincipal idioma = new frmPrincipal();
//           idioma.cambiarIdioma(chuckNorrisJoke.getValue());

      frmPrincipal.main(args);
                Thread.sleep(1000);
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
            
       
        } else {
 JOptionPane.showMessageDialog(null, ".:Bye:.");
                 break;
        }
    }

                //System.out.println("Broma de Chuck Norris: " + chuckNorrisJoke.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
 
}
