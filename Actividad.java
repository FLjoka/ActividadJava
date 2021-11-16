package ejercicioJava;

import javax.swing.JOptionPane;

public class Actividad {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		System.out.println(nombre);
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
		System.out.println(apellido);
		String edad = JOptionPane.showInputDialog("Ingrese su edad");
		System.out.println(edad);
		String hobbie = JOptionPane.showInputDialog("Ingrese un hobbie");
		System.out.println(hobbie);
		String editorCodigo = JOptionPane.showInputDialog("Ingrese su editor de codigo preferido");
		System.out.println(editorCodigo);
		String sistemaOperativo = JOptionPane.showInputDialog("Ingrese sistema operativo que utiliza");
		System.out.println(sistemaOperativo);
	}
  
}
