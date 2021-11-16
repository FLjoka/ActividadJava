package ejercicioJava;

import javax.swing.JOptionPane;

public class Actividad {
	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
		String edad = JOptionPane.showInputDialog("Ingrese su edad");
		String hobbie = JOptionPane.showInputDialog("Ingrese un hobbie");
		String editorCodigo = JOptionPane.showInputDialog("Ingrese su editor de codigo preferido");
		String sistemaOperativo = JOptionPane.showInputDialog("Ingrese sistema operativo que utiliza");
		
		
		System.out.println("*************************************");
		System.out.println("******* Bienvenido al sistema *******");
		System.out.println("*************************************");
		System.out.println("Los datos ingresados son:");
		
		System.out.println("#"+nombre);
		System.out.println("#"+apellido);
		System.out.println("#"+edad);
		System.out.println("#"+hobbie);
		System.out.println("#"+editorCodigo);
		System.out.println("#"+sistemaOperativo);
	}
  
}
