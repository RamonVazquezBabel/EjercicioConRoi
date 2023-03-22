package com.example.ejercicioConRoi.persistance.database.mappers;

import com.example.ejercicioConRoi.models.Direccion;
import com.example.ejercicioConRoi.models.Profesion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
@Mapper
public interface ProfesionMapper {
    @Insert("INSERT INTO PROFESION (DESCRIPCION) VALUES (#{descripcion})")
    @Options(useGeneratedKeys = true, keyProperty = "profesionId", keyColumn="PROFESION_ID")
    void insertProfesion(Profesion profesion);
}
