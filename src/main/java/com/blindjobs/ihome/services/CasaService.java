package com.blindjobs.ihome.services;

import com.blindjobs.ihome.database.models.Casa;
import com.blindjobs.ihome.database.repositories.CasaRepository;
import com.blindjobs.ihome.dto.OperationData;
import com.blindjobs.ihome.dto.exceptions.NotFoundException;
import com.blindjobs.ihome.services.utils.UniqueRegisterOperationsInterface;
import com.blindjobs.ihome.services.utils.UtilsValidation;
import org.apache.commons.lang3.NotImplementedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.HashSet;
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
@Service
public class CasaService implements UniqueRegisterOperationsInterface<Casa> {

    private static final Logger logger = LoggerFactory.getLogger(CasaService.class);
    private final CasaRepository casaRepository;

    public CasaService(CasaRepository casaRepository) {
        this.casaRepository = casaRepository;
    }

    @Override
    public OperationData<?> upsertRegister(Casa value) throws Exception {
        logger.info("Upsert Register...");
        if (UtilsValidation.isNull(value)) {
            throw new NotFoundException("Casa can't be null");
        }

        Casa casaSaved = null;

        // Get the user in the database (if exists) and copy its values to the received user (value)
        if (!UtilsValidation.isNull(value.getId())) {
            Casa existentUser = casaRepository.findById(value.getId()).orElse(null);
            if (!UtilsValidation.isNull(existentUser)) {
                BeanUtils.copyProperties(value, existentUser);
                casaSaved = casaRepository.save(existentUser);
            }
        } else {
            casaSaved = casaRepository.save(value);
        }


        logger.info("Finished Upsert Register...");
        return new OperationData<>(casaSaved);
    }

    @Override
    public OperationData<UUID> softDeleteRegister(UUID value) throws Exception {
        throw new NotImplementedException("method \"softDeleteRegister\" in UserService not Implemented. Check upsert");
    }

    @Override
    public OperationData<?> updateRegister(Casa value) {
        throw new NotImplementedException("method \"updateRegister\" in UserService not Implemented. Check upsert");
    }

    @Override
    public OperationData<?> createRegister(Casa value) {
        throw new NotImplementedException("method \"createRegister\" in UserService not Implemented. Check upsert");
    }

    @Override
    public OperationData<?> findRegister(UUID id, String name, String uniqueKey, Boolean isDeleted) throws Exception {
        throw new NotImplementedException("method \"findRegister\" in UserService not Implemented. Check upsert");
    }

    @Override
    public OperationData<?> findAllRegister() {
        return new OperationData<>(new HashSet<>(casaRepository.findAll()), null);
    }

}