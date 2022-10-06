package estudedanca2.model.vo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.persistence.EnumType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "turma")
@Getter @Setter @AllArgsConstructor
public class Turma {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private StatusTurma status;
	
	private String turno;
	
	@ManyToMany
	private Professor professor;
	
	@OneToMany(mappedBy = "turma")
	private List<Estudante> estudantes;
}
