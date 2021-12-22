import java.awt.Toolkit;

import javax.swing.plaf.DimensionUIResource;

public class Tela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        java.awt.Dimension d = tk.getScreenSize();
        System.out.println("Screen width =" + d.width);
        System.out.println("Screen width =" + d.height);
    }
}
