package com.curso.clase2.cajero;

import java.util.Date;

public class Cuenta {
    private long idTransaccion;
    private String tipoTransacción;
    private Double importeTransaccion;
    private Date fechaTransaccion;

    private Double totalCuenta;


    //Getters y setters
    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getTipoTransacción() {
        return tipoTransacción;
    }

    public void setTipoTransacción(String tipoTransacción) {
        this.tipoTransacción = tipoTransacción;
    }

    public Double getImporteTransaccion() {
        return importeTransaccion;
    }

    public void setImporteTransaccion(Double importeTransaccion) {
        this.importeTransaccion = importeTransaccion;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public Double getTotalCuenta() {
        return totalCuenta;
    }

    public void setTotalCuenta(Double totalCuenta) {
        this.totalCuenta = totalCuenta;
    }


    //Constructores
    public Cuenta(long idTransaccion, String tipoTransacción, Double importeTransaccion, Date fechaTransaccion, Double totalCuenta) {
        this.idTransaccion = idTransaccion;
        this.tipoTransacción = tipoTransacción;
        this.importeTransaccion = importeTransaccion;
        this.fechaTransaccion = fechaTransaccion;
        this.totalCuenta = totalCuenta;
    }

    public Cuenta() {
    }
}
