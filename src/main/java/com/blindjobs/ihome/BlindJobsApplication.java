package com.blindjobs.ihome;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TRABALHO IMOBILIARIA (POO): DADOS DOS INTEGRANTES
 *
 * @author KAROLYNE COELHO DE LIMA
 * @author GABRIELA SILVA DE FARIAS BETINI
 * @author KELVEN BENTO FONTES
 * @author VICENZO GIOVANI CARRA LIMA
 * @author GUILHERME PERES LINS DA PALMA
 * @author DOUGLAS WALLACE RODRIGUES JUNIOR
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "API Blind Jobs - Contratação as Cegas",
        version = "0.01",
        contact = @Contact(name = "BlindJobs", url = "https://github.com/FatecOhana"),
        description = "API usada para as Operações Server-Side. Tais como: Gerenciamento, Autenticação e Autorização, " +
                "Validações Internas e Operações no Banco de Dados"
))
public class BlindJobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlindJobsApplication.class, args);
	}

}
