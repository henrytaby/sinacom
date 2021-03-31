package com.senarecom.sinacom.persistence.mapper;

import com.senarecom.sinacom.domain.ParametricProductPresentation;
import com.senarecom.sinacom.persistence.entity.ParametricaPresentacionProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ParametricProductPresentationMapper {
    @Mappings({
            @Mapping(source = "idPresentacionProductoId", target = "productPresentationId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "activo", target = "active")
    })

    ParametricProductPresentation toParametricProductPresentation(ParametricaPresentacionProducto parametricaPresentacionProducto);

    @InheritInverseConfiguration
    @Mapping(target = "formularioM03s", ignore = true)
    ParametricaPresentacionProducto toParametricaPresentacionProducto(ParametricProductPresentation parametricProductPresentation);

}
