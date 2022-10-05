package com.blindjobs.ihome.database.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Apartamento extends Imovel {

    @Schema(description = "Informa o Valor do Condominio do Apartamento", example = "1056.58")
    private Double valorCondominio;

    /**
     * Retorna uma String mapeada como um JSON como os dados da instância atual da Classe {@link Casa}
     *
     * @return {@link String}
     */
    public String dadosImovel(String ur) {
        return String.format("{id: %s, quantidadeQuartos: %s, valor: %s, endereco: %s, valorCondominio: %s}",
                super.getId(), super.getQuantidadeQuartos(), super.getValor(), super.getEndereco(), valorCondominio);
    }

}
