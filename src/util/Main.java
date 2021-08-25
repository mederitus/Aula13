import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import service.DiretorService;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Diretor diretor = new Diretor(1,"Paulo","34277080987",8.000,2.000);
        DiretorService.save(diretor);
        diretor.setNome(diretor.getNome()+" Nome Atualizado...");
        DiretorService.update(diretor);
        DiretorRepository.findAll();
        DiretorRepository.findById(1);



    }
}
