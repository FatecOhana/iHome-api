package com.blindjobs.ihome.dto;

import lombok.Data;

@Data
public class SingleItemPayload<T> {
    private T data;
}
