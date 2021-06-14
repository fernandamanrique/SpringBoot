package com.asesoftware.semilla.EjercicioSpringBoot.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ComerciosDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.ServiciosDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.controller.dto.TurnoDTO;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.ComerciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.ServiciosEntity;
import com.asesoftware.semilla.EjercicioSpringBoot.entity.TurnoEntity;


@Mapper(componentModel = "spring")
public interface IComerciosMapper {
	
	@Mappings({@Mapping(source = "id_comercio", target = "identificador_comercio"),
		       @Mapping(source = "nom_comercio", target = "nombre_comercio")
              })
	public ComerciosDTO entityToDto(ComerciosEntity comercioEntity);
	
	@Mappings({@Mapping(source = "identificador_comercio" ,target = "id_comercio"),
		       @Mapping(source = "nombre_comercio" ,target = "nom_comercio")
	})	
	public ComerciosEntity dtoToEntity(ComerciosDTO comerciodto);
	
	//Mapping Servicios
	@Mappings({@Mapping(source = "id_servicio",target = "identificador_servicio"),
        @Mapping(source = "id_comercio",target = "identificador_comercio"),
        @Mapping(source = "nom_servicio",target = "nombre_servicio")

     })
	public ServiciosDTO entityToDto(ServiciosEntity servicioEntity);

	@Mappings({@Mapping(source = "identificador_servicio",target = "id_servicio"),
        @Mapping(source = "identificador_comercio",target = "id_comercio"),
        @Mapping(source = "nombre_servicio",target = "nom_servicio")	
	})
	public ServiciosEntity dtoToEntity(ServiciosDTO servicioDTO);
	
	//mapping Turno
		@Mappings({@Mapping(source = "id_turno",target = "identificador_turno"),
	        @Mapping(source = "id_servicio",target = "identificador_servicio")

		})
		public TurnoDTO entityToDto(TurnoEntity turnoEntity);

		@Mappings({@Mapping(source = "identificador_turno",target = "id_turno"),
		       @Mapping(source = "identificador_servicio",target = "id_servicio")

		})
		public TurnoEntity dtoToEntity(TurnoDTO turnoDTO);
	
	public List<ComerciosDTO>  listentityToDto(List<ComerciosEntity> comerciosEntity);
	public List<ComerciosEntity>  listdtoToEntity(List<ComerciosDTO> comerciosDTOs);
}
