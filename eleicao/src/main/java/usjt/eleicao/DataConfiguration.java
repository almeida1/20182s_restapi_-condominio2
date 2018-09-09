package usjt.eleicao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import usjt.eleicao.repository.CandidatoRepository;
import usjt.eleicao.repository.ICandidatoRepository;

@Configuration
public class DataConfiguration {
	@Bean
	public ICandidatoRepository candidatoRepository() {
		return new CandidatoRepository();
	}

}
