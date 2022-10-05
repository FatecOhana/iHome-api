package com.blindjobs.ihome.dto;

import lombok.Data;

import java.util.List;

@Data
public class Payload<T> {
    private List<T> data;
}
