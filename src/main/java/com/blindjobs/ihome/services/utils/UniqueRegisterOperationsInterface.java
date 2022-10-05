package com.blindjobs.ihome.services.utils;

import com.blindjobs.ihome.dto.OperationData;

import java.util.UUID;

public interface UniqueRegisterOperationsInterface<T> {

    /**
     * CREATE one object (if object not exists) or UPDATE the existing object
     */
    OperationData<?> upsertRegister(T value) throws Exception;

    /**
     * Sets true in tag isDeleted in specify object of table
     */
    OperationData<UUID> softDeleteRegister(UUID value) throws Exception;

    /**
     * Update one register in Database
     */
    OperationData<?> updateRegister(T value) throws Exception;

    /**
     * Create one Register in Database
     */
    OperationData<?> createRegister(T value) throws Exception;

    /**
     * Find Matches Register in Database
     */
    OperationData<?> findRegister(UUID id, String name, String uniqueKey, Boolean isDeleted) throws Exception;

    /**
     * Find all Register in Database
     */
    OperationData<?> findAllRegister() throws Exception;

}
