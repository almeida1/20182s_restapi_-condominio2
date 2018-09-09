package usjt.eleicao.repository;


import usjt.eleicao.modelo.Candidato;

public interface ICandidatoRepository {

	Iterable<Candidato> findAll();

	Candidato save(Candidato candidato);

	void delete(Candidato candidato);

}

