package conect;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

//bd_clientes:
//    tb_cliente:
//        cli_id
//        cli_nome
//        cli_idade
//        cli_sexo
//        cli_tiposanguineo

public class conexao{
    public Connection Connection(){
        Connection con = null;
        try{
            String url="jdbc:mysql//localhost:3306//bd_clientes?user=root&password=";
            con = DriverManager.getConnection(url);
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Connection" + erro.getMessage());
        }
        return con;
    }
}