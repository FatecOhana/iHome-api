package com.blindjobs.ihome.restendpoints;

import com.blindjobs.ihome.database.models.Casa;
import com.blindjobs.ihome.dto.OperationData;
import com.blindjobs.ihome.dto.SingleItemPayload;
import com.blindjobs.ihome.services.CasaService;
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
@Tag(name = "Casa", description = "Endpoint responsavel por Cadatrar e Gerenciar as Casas")
public class CasaRestEndpoint {

    private final CasaService casaService;

    public CasaRestEndpoint(CasaService casaService) {
        this.casaService = casaService;
    }

    @Operation(summary = "Cria ou atualiza os valores da Casa")
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "Casa criada ou Atualizada com Sucesso",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = OperationData.class))
    ))
    @PostMapping(value = "api/v1/casa", produces = "application/json", consumes = "application/json")
    public ResponseEntity<OperationData<?>> upsertCasa(@RequestBody SingleItemPayload<Casa> payload) throws Exception {
        return new ResponseEntity<>(casaService.upsertRegister(payload.getData()), HttpStatus.OK);
    }

    @Operation(summary = "Obtem todos os Valores das Casas", description = "This method is only allowed for debug")
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "Obteve todos os Registros",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = OperationData.class))
    ))
    @GetMapping(value = "api/v1/casa/all", produces = "application/json")
    public ResponseEntity<OperationData<?>> getAllCasa() {
        return new ResponseEntity<>(casaService.findAllRegister(), HttpStatus.OK);
    }

}
