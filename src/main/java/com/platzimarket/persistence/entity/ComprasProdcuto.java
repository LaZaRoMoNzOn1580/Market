package com.platzimarket.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name= "compras_productos")
public class ComprasProdcuto {
    @EmbeddedId
    private ComprasProdcutoPK id;

    private Integer cantidad;

    private BigDecimal total;

    private Boolean estado;

    public ComprasProdcutoPK getId() {
        return id;
    }

    public void setId(ComprasProdcutoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
