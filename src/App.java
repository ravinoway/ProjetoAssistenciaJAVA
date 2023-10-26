import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setNome("Bryan");
        u.setLogin("bryan");
        u.setSenha("1234");
        u.setEmail("bryan@gmail.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
