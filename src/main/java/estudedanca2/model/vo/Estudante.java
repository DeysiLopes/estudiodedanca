package estudedanca2.model.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "estudante")
@Getter @Setter @AllArgsConstructor
public class Estudante extends Pessoa{
	
	@OneToMany(mappedBy = "estudante")
	private List<Turma> turmas;

}
