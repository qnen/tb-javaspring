package br.com.gbrecci.gbgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gbrecci.gbgerenciadortarefas.models.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{
	
}
