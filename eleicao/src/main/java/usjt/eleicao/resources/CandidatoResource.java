package usjt.eleicao.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import usjt.eleicao.modelo.Candidato;
import usjt.eleicao.repository.ICandidatoRepository;

@RestController
@RequestMapping("/candidato")
public class CandidatoResource {
	@Autowired
	private ICandidatoRepository cr;
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Candidato> listaCandidatos() { //retorna no corpo do body
        Iterable<Candidato> listaCandidatos = cr.findAll();
        return listaCandidatos;
	}
	@PostMapping()
	public Candidato cadastraCandidato(@RequestBody Candidato candidato){
		return cr.save(candidato);
	}
	@DeleteMapping()
	public Candidato deleteLivro (@RequestBody Candidato candidato){
		cr.delete(candidato);
		return candidato;
	}
}
