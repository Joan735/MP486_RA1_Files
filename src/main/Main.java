package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	/**
	 * Leer un fichero y mostrarlo por consola
	 * */
	public static void leerFichero(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String miLinea = br.readLine();
		while(miLinea != null) {
			System.out.println(miLinea);
			miLinea = br.readLine();
		}
		fr.close();
		br.close();	
	}
	/**
	 * Escribir un fichero en un array 5 objetos de la clase productos.
	 * */
	public static void escribirFichero(File f) throws IOException {
		//Se puede escribir en el fichero.
		FileWriter fw = new FileWriter(f,true);
		PrintWriter pw = new PrintWriter(fw);
		Scanner sc = new Scanner(System.in);
		ArrayList<Producto> productos = new ArrayList<>();
		for(int i=0; i<5; i++) {
			System.out.println("Mi iteración: "+i);
			System.out.print("Introduzca Nombre del producto: ");
			String nombreProducto = sc.next();
			System.out.print("Introduzca Precio del producto: ");
			float precio = sc.nextFloat();
			System.out.print("Introduzca Descripción del producto: ");
			String desc = sc.next();
			System.out.print("Introduzca la disponibilidad del producto: ");
			boolean disponibilidad = sc.nextBoolean();
			//Añado elementos al array
			productos.add(new Producto(precio,nombreProducto,desc, disponibilidad));
			//Escribo en el fichero la información de cada producto
			pw.append(productos.get(i).toString());
		}
		pw.close();
		fw.close();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+File.separator+"resources/prueba.txt");
		File newFolder = new File("resources");
		//Comprobmos si existe el directorio y si no lo creamos
		if(!newFolder.exists()){
			newFolder.mkdir();
		}
		//Ahora comprobamos si existe el archivo
		if(!f.exists()) {
			f.createNewFile();
		}
		
		if(f.canRead()) {
			leerFichero(f);
			System.out.println("");
			if(f.canWrite()) {
				escribirFichero(f);
			}else {
				System.out.println("NO SE PUEDE ESCRIBIR EN EL ARCHIVO");
			}
		}else {
			System.out.println("NO SE PUEDE LEER EN EL ARCHIVO");
		}
		
		
	}

}
