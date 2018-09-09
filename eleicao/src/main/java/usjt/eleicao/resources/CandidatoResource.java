package usjt.eleicao.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import usjt.eleicao.modelo.Candidato;
import usjt.eleicao.repository.ICandidatoRepository;
@Api(value="API eleição")
@RestController
@RequestMapping("/eleicao")
public class CandidatoResource {
	@Autowired
	private ICandidatoRepository cr;
	
	@ApiOperation(value="Retorna a lista de candidatos")
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Candidato> listaCandidatos() { //retorna no corpo do body
        Iterable<Candidato> listaCandidatos = cr.findAll();
        return listaCandidatos;
	}
	@ApiOperation(value="Cadastra um candidato")
	@PostMapping()
	public Candidato cadastraCandidato(@RequestBody Candidato candidato){
		return cr.save(candidato);
	}
	@ApiOperation(value="Exclui um candidato")
	@DeleteMapping()
	public Candidato deleteLivro (@RequestBody Candidato candidato){
		cr.delete(candidato);
		return candidato;
	}
}
