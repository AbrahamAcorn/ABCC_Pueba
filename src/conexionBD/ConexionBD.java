package conexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexionBD {
	private Connection conexion;
	private Statement stm;
	
	private PreparedStatement pstm; //Para el proyecto final, evital SQL injection
	
	ResultSet rs = null;
	
	public ConexionBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/BD_Escuela?useTimezone=true&serverTimezone=UTC";
			conexion = DriverManager.getConnection(url, "root", "pepe");
			
			System.out.println("Conexion establecida");
			
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontro el controlador");
			// TODO: handle exception
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println("No se pudo conectar al servidor");
		}finally {
			//CODIGO QUE SIEMPRE SE EJECUTA
			//CIERRE DE LA CONEXION AL A BD
		}//finally
		
	}//constructor
	
	public void cerrarConexion() {
		try {
			stm.close();
			conexion.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//metodos que ejecuten las operaciones ABCC (DDL, DML & SQL)
	//Metodo para DDL & DML
	//Metodo para SQL
	public boolean ejecutarInstruccion(String sql) {
		try {
			stm = conexion.createStatement();
			return stm.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo ejecutar la instruccion SQL");
			return false;
		}
	}
	//Metodo para consultas SQL
	public ResultSet ejecutarConsultaRegistros(String sql) {
		
		
		try {
			stm = conexion.createStatement();
			rs = stm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo ejecutar la consulta SQL");
		}
		return rs;
	}
	
		//new ConexionBD();
	
	
}//class conexionBD
