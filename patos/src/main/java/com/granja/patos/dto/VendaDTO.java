package com.granja.patos.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class VendaDTO {
    private Long clienteId;
    private Long vendedorId;
    private List<Long> patosIds;
}
