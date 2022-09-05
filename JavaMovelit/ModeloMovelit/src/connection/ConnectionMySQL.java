package connection;

public class ConnectionMySQL {
public static Connection creatConnectionMySQL() throws Exception {
	
	//Carregar a classe pelo JVM
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Criar a conexão com o banco
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Movelit?user=root&password=")
			return connection;
}
public static void main(String [] args) throws Exception {
	
	
	//Recuperar a conexão com o banco
	Connection on = createConnectionMySQL ();
	
	// Teste de conexão
	if (con != null) {
		System.out.println (con + "\n****Conexão bem sucedida");
		con.close ();
	}
}
