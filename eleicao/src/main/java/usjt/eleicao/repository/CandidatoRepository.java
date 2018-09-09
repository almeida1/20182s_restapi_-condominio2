package usjt.eleicao.repository;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import usjt.eleicao.modelo.Candidato;


public class CandidatoRepository implements ICandidatoRepository {
	ArrayList<Candidato> list = new ArrayList<Candidato>();

	
	public Iterable<Candidato> findAll() {
		return list;
	}

	
	public Candidato save(@RequestBody Candidato candidato) {
		list.add(candidato);
		return candidato;
	}


	public void delete(Candidato candidato) {
		list.remove(candidato);
	
	}

}
