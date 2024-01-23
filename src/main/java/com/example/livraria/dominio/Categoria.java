package com.example.livraria.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {
	
	private Integer id;
	private String nome;
	private String descrincao;
	
	private List<Livro> livros= new ArrayList<>();

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(Integer id, String nome, String descrincao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrincao = descrincao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrincao() {
		return descrincao;
	}

	public void setDescrincao(String descrincao) {
		this.descrincao = descrincao;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}

	
	
	

}
