package metodosnumericos;
import javax.swing.JOptionPane;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
/**
 *
 * @author jam2
 */


public class Funcion {
    private DJep j;
    private String f;

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }
    
    public Funcion(String f){
        j = new DJep();
        this.f = f;
        j.addStandardConstants();
        //agrega constantes estandares, pi, e, etc
        j.addStandardFunctions();
        //agrega funciones estandares cos(x), sin(x)
        j.addComplex();
        //por si existe algun numero complejo
        j.setAllowUndeclared(true);
        //permite variables no declarables
        j.setAllowAssignment(true);
        //permite asignaciones
        j.setImplicitMul(true);
        //regla de multiplicacion o para sustraccion y sumas
        j.addStandardDiffRules();
    }
    
    public Double Evaluar(double x) throws ParseException{
        Node re = null;
        String val="No";
        j.addVariable("x", x);
        try{
            re = j.parse(f);  //esta funcion parse es la que en si hace el proceso de la evaluacion de la expresion
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Función Incorrecta", "ERROR", 0);
        }
        val = (j.evaluate(re)).toString();
        return Double.parseDouble(val);
    }
    
    
    public String Derivada(){
        String derivada = "No";
        try{
            //coloca el nodo con una funcion preestablecida
            Node node = j.parse(f);
            //deriva la funcion con respecto a x
            Node diff = j.differentiate(node,"x");
            //Simplificamos la funcion con respecto a x
            Node simp = j.simplify(diff);
            //Convertimos el valor simplificado en un String
            derivada =j.toString(simp);
        }catch(ParseException e){ 
            JOptionPane.showMessageDialog(null, "Función Incorrecta!", "ERROR", 0);
        }
        return derivada;
    }
    
    public boolean isNum(String num){
        char []ar = num.toCharArray();
        for(int i = 0; i < ar.length; i++){
            if(Character.isLetter(ar[i]))
                return false;
        }
        return true;
    }
    
    public double Redondear(double numero,int digitos){
        int cifras=(int) Math.pow(10,digitos);
        return Math.rint(numero*cifras)/cifras;
    }
    
    public int iteraciones(){
        String m = JOptionPane.showInputDialog("Ingrese el número maximo de Iteraciones:");
        while (!isNum(m) && Integer.parseInt(m) < 1) {
            JOptionPane.showMessageDialog(null, "Opción Incorrecta!", "ERROR", 0);
            m = JOptionPane.showInputDialog("Ingrese el número maximo de Iteraciones:");
        }
        return Integer.parseInt(m);
    }
    
    public double tolerancia(){
        String m = JOptionPane.showInputDialog("Ingrese el número maximo de Tolerancia:");
        while (!isNum(m) && Double.parseDouble(m) < 0) {
            JOptionPane.showMessageDialog(null, "Opción Incorrecta!", "ERROR", 0);
            m = JOptionPane.showInputDialog("Ingrese el número maximo de Tolerancia:");
        }
        return Double.parseDouble(m);
    }
    
    public int menu(){
        String m = JOptionPane.showInputDialog("Que método de Paro desea utilizar:\n1.- Iteraciones"
                + "\n2.- Tolerancia\nSeleccione una Opción:");
        while (!isNum(m) && (Integer.parseInt(m) != 1 || Integer.parseInt(m) != 2)){
            JOptionPane.showMessageDialog(null, "Opción Incorrecta!", "ERROR", 0);
            m = JOptionPane.showInputDialog("Que método de Paro desea utilizar:\n1.- Iteraciones"
                + "\n2.- Tolerancia\nSeleccione una Opción:");
        }
        return Integer.parseInt(m);
    }
    
    public int decimales(){
        String d = JOptionPane.showInputDialog("Ingrese el número de decimales que desea:");
        while (!isNum(d) && Integer.parseInt(d) < 1) {
            JOptionPane.showMessageDialog(null, "Opción Incorrecta!", "ERROR", 0);
            d = JOptionPane.showInputDialog("Ingrese el número de decimales que desea:");
        }
        return Integer.parseInt(d);
    }
}
