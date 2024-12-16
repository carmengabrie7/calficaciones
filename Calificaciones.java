package calificaciones;

import javax.swing.JOptionPane;






public class Calificaciones {

    
    public static void main(String[] args) {
        // TODO code application logic here
       double p1, p2, p3, examenfinal, trabajofinal, promedio, calificacionfinal;
       
       JOptionPane.showMessageDialog(null, "Bienvenido al sistema de cálculo de calificaciones finales 🎓.");
       
       
       p1 = Double.parseDouble(JOptionPane.showInputDialog("Favor ingrese su primera calificación parcial🎀"));
       p2 = Double.parseDouble(JOptionPane.showInputDialog("Favor ingrese su segunda calificación parcial🎀"));
       p3 = Double.parseDouble(JOptionPane.showInputDialog("Favor ingrese su tercera califación parcial🎀"));
         
       examenfinal = Double.parseDouble(JOptionPane.showInputDialog("Favor ingrese su calificación del examen final"));
       trabajofinal = Double.parseDouble(JOptionPane.showInputDialog("Favor ingresar su calificación del trabajo final"));
       
        promedio = (p1 + p2 + p3)/3;
        
        calificacionfinal = (promedio*0.55) + (examenfinal * 0.30) + (trabajofinal * 0.15);
        
        JOptionPane.showMessageDialog(null, "La calificación final es 💫: " + calificacionfinal);
        
                
                
    }
    
}
