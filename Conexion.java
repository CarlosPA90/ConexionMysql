package paquete1;
import java.sql.*;


public class Conexion {
	
	public Conexion(String nombreBD, String usuario, String password) {
		this.nombreBD = nombreBD;
		this.usuario = usuario;
		this.password = password;
	}

	private String nombreBD = "proyecto";
	private String url = "jdbc:mysql://localhost:3306/"+nombreBD+"?useTimezone=true&serverTimezone=UTC";
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	private String usuario="root";
	private String password="";
	
	public Connection conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//instancia la clase
			conn = DriverManager.getConnection(url,usuario,password);
		} catch (ClassNotFoundException e) {
			System.out.println("Error carnal");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error compin");
			e.printStackTrace();
		}
		return conn;
	}
	public Conexion() {
		
	}
	public String getNombreBD() {
		return nombreBD;
	}
	public void setNombreBD(String nombreBD) {
		this.nombreBD = nombreBD;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Statement getSt() {
		return st;
	}
	public void setSt(Statement st) {
		this.st = st;
	}
	public ResultSet getRs() {
		return rs;
	}
	public void setRs(ResultSet rs) {
		this.rs = rs;
	}
}
