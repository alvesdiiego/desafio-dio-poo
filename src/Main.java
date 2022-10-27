import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Bla Bla Bla Java");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Angular");
		curso2.setDescricao("Bla Bla Bla Angular");
		curso2.setCargaHoraria(5);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("Curso Spring");
		curso3.setDescricao("Bla Bla Bla Spring");
		curso3.setCargaHoraria(5);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Fullstack");
		mentoria.setDescricao("Bla Bla Bla Mentoria");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Developer");
		bootcamp.setDescricao("Bla Bla Bla Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devDiego = new Dev();
		devDiego.setNome("Diego");
		devDiego.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Diego:" + devDiego.getConteudosInscritos());
		devDiego.progredir();
		devDiego.progredir();
		System.out.println("Conteúdos Inscritos Diego:" + devDiego.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Diego:" + devDiego.getConteudosConcluidos());
		System.out.println("XP:" + devDiego.calcularTotalXp());
		
		System.out.println("|----||----||----||----|");
		
		Dev devFlor = new Dev();
		devFlor.setNome("Flor");
		devFlor.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Flor:" + devFlor.getConteudosInscritos());
		devFlor.progredir();
		
		System.out.println("Conteúdos Inscritos Flor:" + devFlor.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Flor:" + devFlor.getConteudosConcluidos());
		System.out.println("XP:" + devFlor.calcularTotalXp());
		
	}
}
