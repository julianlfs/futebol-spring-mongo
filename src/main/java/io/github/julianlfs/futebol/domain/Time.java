package io.github.julianlfs.futebol.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@Document(collection = "times")
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private LocalDate dataFundacao;

	private CorUniforme corUniformePrincipal;

	private CorUniforme corUniformeSecundaria;
}
