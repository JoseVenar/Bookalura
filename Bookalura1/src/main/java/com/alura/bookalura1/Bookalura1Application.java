package com.alura.bookalura1;

import com.alura.bookalura1.main.Main;
import com.alura.bookalura1.repository.AuthorRepository;
import com.alura.bookalura1.repository.LibroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bookalura1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Bookalura1Application.class, args);
	}

	@Autowired
	private LibroRepository repository;
	@Autowired
	private AuthorRepository authorRepository;
	public void run(String[] args) {
		Main principal = new Main(repository,authorRepository);
		principal.showMenu();
	}
}
