package com.senarecom.sinacom.persistence.mapper;

import com.senarecom.sinacom.domain.FormM03;
import com.senarecom.sinacom.persistence.entity.FormularioM03;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ParametricProductPresentationMapper.class})
public interface FormM03Mapper {
    @Mappings({
            @Mapping(source = "idFormularioM03", target = "formM03Id"),
            @Mapping(source = "codigo", target = "code"),
            @Mapping(source = "numeroFacturaComercial", target = "comercialInvoiceNumber"),
            @Mapping(source = "certificadoAnalisis", target = "analysisCertificate"),
            @Mapping(source = "fechaFacturaComercial", target = "commercialInvoiceDate"),
            @Mapping(source = "fechaExportacion", target = "exportDate"),
            @Mapping(source = "razonSocialComprador", target = "buyerSocialReason"),
            @Mapping(source = "valorFobDolares", target = "valueFobDollars"),
            @Mapping(source = "idPresentacionProducto", target = "productPresentationId"),
            @Mapping(source = "pesoBrutoHumedoKilogramos", target = "grossWetWeightKilograms"),
            @Mapping(source = "taraKilogramos", target = "taraKilograms"),
            @Mapping(source = "pesoNetoHumedoKilogramos", target = "wetNetWeightKilograms"),
            @Mapping(source = "humedadPorcentaje", target = "humidityPercentage"),
            @Mapping(source = "mermaPorcentaje", target = "decreasePercentage"),
            @Mapping(source = "mermaKilogramos", target = "decreaseKilograms"),
            @Mapping(source = "pesoNetoSecoKilogramos", target = "netDryWeightKilograms"),
            @Mapping(source = "numeroLote", target = "lotNumber"),
            @Mapping(source = "totalValorBrutoVentaDolares", target = "totalGrossValueSaleDollars"),
            @Mapping(source = "totalValorBrutoVentaBolivianos", target = "totalGrossValueSaleBolivianos"),
            @Mapping(source = "gastoRealizacionPorcentaje", target = "expenditureRealizationPercentage"),
            @Mapping(source = "valorNetoVentaBolivianos", target = "netValueSaleBolivianos"),
            @Mapping(source = "costoComercializacionPorcentaje", target = "costMarketingPercentage"),
            @Mapping(source = "totalDeduccionesInstitucionalesBolivianos", target = "totalInstitutionalDeductionsBolivians"),
            @Mapping(source = "liquidoPagableBolivianos", target = "liquidPayableBolivianos"),
            @Mapping(source = "parametricaPresentacionProducto", target = "parametricProductPresentation"),
            @Mapping(source = "activo", target = "active")
    })
    FormM03 toFormM03(FormularioM03 formularioM03);
    List<FormM03> toFormM03s(List<FormularioM03> formularioM03s);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "usuarioRegistro", ignore = true),
        @Mapping(target = "fechaRegistro", ignore = true)
    })
    FormularioM03 toFormularioM03(FormM03 formM03);
}
