package com.blindjobs.ihome.restendpoints;

import com.blindjobs.ihome.database.models.Apartamento;
import com.blindjobs.ihome.dto.OperationData;
import com.blindjobs.ihome.dto.SingleItemPayload;
import com.blindjobs.ihome.services.ApartamentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@Tag(name = "Apartamento", description = "Endpoint responsavel por Cadatrar e Gerenciar as Apartamentos")
public class ApartamentoRestEndpoint {

    private final ApartamentoService casaService;

    public ApartamentoRestEndpoint(ApartamentoService casaService) {
        this.casaService = casaService;
    }

    @Operation(summary = "Cria ou atualiza os valores da Apartamento")
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "Apartamento criada ou Atualizada com Sucesso",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = OperationData.class))
    ))
    @PostMapping(value = "api/v1/apartamento", produces = "application/json", consumes = "application/json")
    public ResponseEntity<OperationData<?>> upsertApartamento(@RequestBody SingleItemPayload<Apartamento> payload) throws Exception {
        return new ResponseEntity<>(casaService.upsertRegister(payload.getData()), HttpStatus.OK);
    }

    @Operation(summary = "Obtem todos os Valores das Apartamentos", description = "This method is only allowed for debug")
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "Obteve todos os Registros",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = OperationData.class))
    ))
    @GetMapping(value = "api/v1/apartamento/all", produces = "application/json")
    public ResponseEntity<OperationData<?>> getAllApartamento() {
        return new ResponseEntity<>(casaService.findAllRegister(), HttpStatus.OK);
    }

}
