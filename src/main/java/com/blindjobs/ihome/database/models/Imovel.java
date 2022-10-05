package com.blindjobs.ihome.database.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, columnDefinition = "uuid")
    private UUID id;

    @Schema(description = "Quantidade de Quartos de um Imovel", example = "3")
    private Integer quantidadeQuartos;

    @Schema(description = "Valor pago em um Imovel", example = "1500.00")
    private Double valor;

    @Schema(description = "Endereço de um Imovel", example = "Rua Rui Alvert, 123, São Paulo-SP")
    private String endereco;


    /**
     * Retorna uma String mapeada como um JSON como os dados da instância atual da Classe {@link Imovel}
     *
     * @return {@link String}
     */
    public String dadosImovel(String ur) {
        return String.format("{id: %s, quantidadeQuartos: %s, valor: %s, endereco: %s}", id, quantidadeQuartos,
                valor, endereco);
    }

}
