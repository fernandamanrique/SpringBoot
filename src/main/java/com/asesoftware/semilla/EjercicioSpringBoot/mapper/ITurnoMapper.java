package com.asesoftware.semilla.EjercicioSpringBoot.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.TurnoDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;

@Mapper(componentModel = "spring")
public interface ITurnoMapper {
	
	@Mappings({@Mapping(source = "id_turno",target = "identificador_turno"),
	           @Mapping(source = "id_servicio",target = "identificador_servicio")
	
	})
	public TurnoDTO entityToDto(TurnoEntity turnoEntity);
	
	@Mappings({@Mapping(source = "identificador_turno",target = "id_turno"),
		       @Mapping(source = "identificador_servicio",target = "id_servicio")
	   
	})
	public TurnoEntity dtoToEntity(TurnoDTO turnoDTO);
	
	public List<TurnoDTO> listentityToDto(List<TurnoEntity> turnoEntity);
	
	public List<TurnoEntity> listdtoToEntity(List<TurnoDTO> turnoDTOs);
	

}
