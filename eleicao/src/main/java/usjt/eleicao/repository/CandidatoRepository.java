package usjt.eleicao.repository;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import usjt.eleicao.modelo.Candidato;

@RestController
@RequestMapping("/eleicao")
public class CandidatoRepository implements ICandidatoRepository {
	ArrayList<Candidato> list = new ArrayList<Candidato>();

	@GetMapping(produces = "application/json")
	public Iterable<Candidato> findAll() {
		if (list.size() == 0) {
			Candidato candidato = new Candidato();
			candidato.setCpf("1111");
			candidato.setApto("11");
			candidato.setNome("Jose da Silva");
			candidato.setPlataforma("teste");
			list.add(candidato);
		}

		
		return list;
	}

	@PostMapping
	public Candidato save(@RequestBody Candidato candidato) {
		list.add(candidato);
		return candidato;
	}

	@DeleteMapping
	public void delete(Candidato candidato) {
		list.remove(candidato);
	
	}

}
