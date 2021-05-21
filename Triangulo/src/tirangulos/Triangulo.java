package tirangulos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Generador de triangulos
 * @author usuario
 * @version 1.0
 */
public class Triangulo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Polygon poly; //atributo para almacenar el polígono
	int xPoly[]; //vector de coordenadas X
    int yPoly[]; //vector de coordenadas Y
    Color Fondo; //Color de fondo del polígono
    Color Linea; //Color de línea
    int holabuenas;
    //Constructor por parámetro para construir un triángulo dadas
    //las 3 coordenadas X y las 3 coordenadas Y
    public Triangulo(int x[], int y[]) {
		xPoly=new int[3];
		yPoly=new int[3];
		xPoly=x;
		yPoly=y;
		Fondo=Color.cyan;
		Linea=Color.black;//Establece colores por defecto
		poly = new Polygon(xPoly, yPoly, xPoly.length);
	}
	//Constructor por parámetro para construir un triángulo dadas
    //las 3 coordenadas X y las 3 coordenadas Y y con colores específicos
    public Triangulo(int x[], int y[],Color F, Color L) {
		xPoly=new int[3];
		yPoly=new int[3];
		xPoly=x;
		yPoly=y;
		Fondo=F;
		Linea=L;
		poly = new Polygon(xPoly, yPoly, xPoly.length);
	}
	//Método para pintar el componente
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Linea);
		g.drawPolygon(poly);
		g.setColor(Fondo);
		g.fillPolygon(xPoly,yPoly,3);
	}
	//Método al que hay que llamar para el que Triángulo sea dibujado en un JFrame (Ventana)
	public void Dibujar() {
			JFrame miForm = new JFrame();
			miForm.setSize(1280,720);
			miForm.setResizable(false);
	        miForm.setVisible(true);
	        miForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            miForm.add(this);
	        
	}
	//Método main
	public static void main(String args[]) {
		Triangulo a=new Triangulo(new int[] {0,0,400}, new int[] {0,400,400});
		a.Dibujar();
	}
}
