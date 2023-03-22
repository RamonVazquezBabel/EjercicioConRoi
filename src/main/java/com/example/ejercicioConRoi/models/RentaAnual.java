package com.example.ejercicioConRoi.models;

import java.util.Date;

public class RentaAnual {
    private int rentaId;
    private Persona persona;
    private Profesion profesion;
    private int anyo;
    private int importe;
    private int isCuentaPropia;
    private String IAE;
    private String cifEmpleador;
    private Date fechaInicioEmpleo;

    public RentaAnual(Persona persona, Profesion profesion, int anyo, int importe, int isCuentaPropia, String IAE, String cifEmpleador, Date fechaInicioEmpleo) {
        this.persona = persona;
        this.profesion = profesion;
        this.anyo = anyo;
        this.importe = importe;
        this.isCuentaPropia = isCuentaPropia;
        this.IAE = IAE;
        this.cifEmpleador = cifEmpleador;
        this.fechaInicioEmpleo = fechaInicioEmpleo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Profesion getProfesion() {
        return profesion;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int isCuentaPropia() {
        return isCuentaPropia;
    }

    public void setCuentaPropia(int cuentaPropia) {
        isCuentaPropia = cuentaPropia;
    }

    public String getIAE() {
        return IAE;
    }

    public void setIAE(String IAE) {
        this.IAE = IAE;
    }

    public String getCifEmpleador() {
        return cifEmpleador;
    }

    public void setCifEmpleador(String cifEmpleador) {
        this.cifEmpleador = cifEmpleador;
    }

    public Date getFechaInicioEmpleo() {
        return fechaInicioEmpleo;
    }

    public void setFechaInicioEmpleo(Date fechaInicioEmpleo) {
        this.fechaInicioEmpleo = fechaInicioEmpleo;
    }
}
