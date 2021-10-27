package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class HoraDoSistema {

 
    public static void main(String[] args) {
       Date relogio = new Date();
        System.out.println("A horado sistema é");
        System.out.println(relogio.toString());
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayLanguage());
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println(d.width + "x"+d.height);
        
       
    }
    
}
