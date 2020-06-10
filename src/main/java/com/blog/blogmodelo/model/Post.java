package com.blog.blogmodelo.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="POST")
public class Post {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@NotBlank
private String titulo;

@NotBlank
private String autor;


@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
private LocalDate data;

@NotBlank
@Lob
private String texto;


@ManyToOne
@JoinColumn(name="user_id")
@NotBlank(message = "O campo não pode ser vázio ou nulo")
private Post post_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Post getPost_id() {
		return post_id;
	}

	public void setPost_id(Post post_id) {
		this.post_id = post_id;
	}
}
