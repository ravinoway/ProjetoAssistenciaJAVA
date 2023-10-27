import DAO.UsuarioDAO;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setNome("Lucas");
        u.setLogin("lucas");
        u.setSenha("12345");
        u.setEmail("lucas@gmail.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
