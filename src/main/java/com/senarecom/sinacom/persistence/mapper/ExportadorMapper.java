package com.senarecom.sinacom.persistence.mapper;

import com.senarecom.sinacom.domain.Exporter;
import com.senarecom.sinacom.persistence.entity.Exportador;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ExportadorMapper {
    @Mappings({
            @Mapping(source = "idExportador", target = "exporterId"),
            @Mapping(source = "numeroNim", target = "nimNumber"),
            @Mapping(source = "numeroNit", target = "nitNumber"),
            @Mapping(source = "razonSocial", target = "businessName"),
            @Mapping(source = "numeroRuex", target = "ruexNumber")
    })
    Exporter toExporter(Exportador exportador);

    @InheritInverseConfiguration
    @Mapping(target = "formularioM03s", ignore = true)
    Exportador toExportador(Exporter exporter);
}
