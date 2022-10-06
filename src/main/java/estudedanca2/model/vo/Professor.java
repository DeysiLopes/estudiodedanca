package estudedanca2.model.vo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "professor")
@Getter @Setter @AllArgsConstructor
public class Professor extends Pessoa{

	@ManyToMany(mappedBy = "professor")
	private List<Turma> turmas;

}
