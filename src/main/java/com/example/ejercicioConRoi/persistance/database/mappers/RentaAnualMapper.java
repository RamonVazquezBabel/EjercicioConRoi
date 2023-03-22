package com.example.ejercicioConRoi.persistance.database.mappers;

import com.example.ejercicioConRoi.models.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
@Mapper
public interface RentaAnualMapper {
    @Insert("INSERT INTO RENTA_ANUAL (PERSONA_ID, PROFESION_ID, ANIO, IMPORTE, IS_CUENTA_PROPIA, IAE, CIF_EMPLEADOR, FECHA_INICIO_EMPLEO) VALUES (#{persona.personaId}, #{profesion.profesionId}, #{anyo}, #{importe}, #{isCuentaPropia}, #{IAE}, #{cifEmpleador}, #{fechaInicioEmpleo, jdbcType=DATE})")
    @Options(useGeneratedKeys = true, keyProperty = "rentaId", keyColumn="RENTA_ID")
    void insertPersona(Persona persona);
}
