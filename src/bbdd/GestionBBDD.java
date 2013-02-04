package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class GestionBBDD {
	
	public static Statement sentencia = null;
	
	public static boolean conectar(Connection conexion, Statement sentencia) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost","root","");
			sentencia = conexion.createStatement();
			return true;
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.\nExcepción: " + e.getLocalizedMessage());
			return false;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.\nExcepción: " + e.getLocalizedMessage());
			return false;
		}
	}
	
	public static void desconectar(Connection conexion, Statement sentencia) {
		try {
			sentencia.close();
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo desconectar de la base de datos.\nExcepción: " + e.getLocalizedMessage());
		}
	}
	
	@SuppressWarnings("null")
	public static void Crear() {
		Connection conexion = null;
		Statement sentencia = null;
		
		if(conectar(conexion, sentencia)) {
			try {
				sentencia.execute("CREATE DATABASE prueba");
				
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
				sentencia = conexion.createStatement();
				String tablaPiezas =
					"CREATE TABLE piezas (" +
						"codigo VARCHAR(6) NOT NULL PRIMARY KEY, " +
						"nombre  VARCHAR(20) NOT NULL, " +
						"precio FLOAT NOT NULL, " +
						"descripcion TEXT" +
					")";
				
				String tablaProveedores =
					"CREATE TABLE proveedores (" +
						"codigo VARCHAR(6) NOT NULL PRIMARY KEY, " +
						"nombre  VARCHAR(20) NOT NULL, " +
						"apellido VARCHAR(30)NOT NULL, " +
						"direccion VARCHAR(40) NOT NULL" +
					")";
				
				String tablaProyectos =
					"CREATE TABLE proyectos (" +
						"codigo VARCHAR(6) NOT NULL PRIMARY KEY,"+
						"nombre  VARCHAR(40) NOT NULL, "+
						"ciudad VARCHAR(40)"+
					")";
				
				String tablaGestion =
					"CREATE TABLE gestion (" +
						"codProveedor VARCHAR(6), " + 
						"codPieza VARCHAR(6) NOT NULL, "+ 
						"codProyecto VARCHAR(6) NOT NULL, "+ 
						"cantidad FLOAT, "+
						"PRIMARY KEY (codProveedor, codPieza, codProyecto), " +
						"FOREIGN KEY (codProveedor) REFERENCES proveedores(codigo), " +
						"FOREIGN KEY (codPieza) REFERENCES piezas(codigo)," +
						"FOREIGN KEY (codProyecto) REFERENCES proyectos(codigo)"+
					")"; 
				
				sentencia.execute(tablaGestion);
				sentencia.execute(tablaPiezas);
				sentencia.execute(tablaProveedores);
				sentencia.execute(tablaProyectos);
				
				JOptionPane.showMessageDialog(null, "Base de datos creada correctamente.");
			} 
			catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "La base de datos ya existe.\nExcepción: " + e.getSQLState());
			}
			
			desconectar(conexion, sentencia);
		}
	}
	
	@SuppressWarnings("null")
	public static void Borrar() {
		Connection conexion = null;
		Statement sentencia = null;
		
		if(conectar(conexion, sentencia)) {
			try {
				String borrarBBDD = "DROP DATABASE prueba";
				sentencia.execute(borrarBBDD);
				JOptionPane.showMessageDialog(null, "La base de datos se ha eliminado correctamente.");
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "La base de datos no existe.\nExcepción: " + e.getSQLState());
			}
			
			desconectar(conexion, sentencia);
		}
	}
}