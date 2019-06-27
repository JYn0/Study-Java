package frame;

public class Sql {
	public static String insertUser = "INSERT INTO T_USER VALUES (?,?,?)";
	public static String deleteUser = "DELETE FROM T_USER WHERE ID =?";
	public static String upadateUser = "UPDATE T_USER SET PWD=?,NAME=? WHERE ID=?";
	public static String selectUser = "SELECT * FROM T_USER WHERE ID=?";
	public static String selectAllUser = "SELECT * FROM T_USER";
}
