package paquete1;
import java.sql.*;

public class Proyecto {

	public static void main(String[] args) {
		Conexion conexion=new Conexion("proyecto","root","");
		try {
		Statement st = conexion.conexion().createStatement();
		ResultSet rs = st.executeQuery("select * from empleado");
		while(rs.next()) {
			System.out.println(rs.getString("nombre"));
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			conexion.conexion().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

