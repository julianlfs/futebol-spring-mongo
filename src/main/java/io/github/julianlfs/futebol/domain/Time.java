package io.github.julianlfs.futebol.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private LocalDate dataFundacao;

	private CorUniforme corUniformePrincipal;

	private CorUniforme corUniformeSecundaria;
}
