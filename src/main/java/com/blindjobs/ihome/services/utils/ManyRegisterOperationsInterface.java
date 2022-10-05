package com.blindjobs.ihome.services.utils;

import com.blindjobs.ihome.dto.OperationData;

import java.util.Set;
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
public interface ManyRegisterOperationsInterface<T> extends UniqueRegisterOperationsInterface<T> {

    /**
     * CREATE many object (if object not exists) or UPDATE the existing objects
     */
    OperationData<?> upsertRegisters(Set<T> value) throws Exception;

    /**
     * Sets true in tag isDeleted in many object of table
     */
    OperationData<UUID> softDeleteRegisters(Set<T> value) throws Exception;

    /**
     * Find Matches Register in Database
     */
    OperationData<?> findManyMatchRegisters(Set<UUID> id, Set<String> name, Set<String> uniqueKey, Boolean isDeleted) throws Exception;

}
