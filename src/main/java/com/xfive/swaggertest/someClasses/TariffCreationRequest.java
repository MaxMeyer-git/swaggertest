package com.xfive.swaggertest.someClasses;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
//import com.x5.bigdata.bdsp.portal.dto.product.ProductTreeLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

@ApiModel
@Getter
public class TariffCreationRequest {

    @ApiModelProperty(value = "Название тарифа", required = true)
    @NotBlank
    private final String name;

    @ApiModelProperty(value = "Идентификаторы доступных типов отчётов", required = true)
    @NotEmpty
    private final Set<UUID> reportTypeIds;


    @ApiModelProperty(value = "lkklв", required = true)
    @NotEmpty
    Set<TarifFunctionalities> authorizations;

//    @ApiModelProperty(value = "Узлы дерева продуктов, доступне в рамках тарифа", required = true)
//    @NotEmpty
//    private final Collection<ProductTreePlainNodeDto> nodes;

//    @JsonIgnore
//    @AssertTrue(message = "Должны быть переданны узлы уровня UI4")
//    private final boolean onlyUi4IsPassed;
//
//    @JsonIgnore

    @ApiModelProperty(value = "флаг генерации отчетов только в рамках ТС \"Перекресток\"", required = true)
//    @JsonIgnore
    private final boolean buildForFormatXOnly;

    @JsonCreator
    public TariffCreationRequest(@JsonProperty("name") String name,
                                 @JsonProperty("reportTypeIds") Set<UUID> reportTypeIds,
                                 @JsonProperty("authorizations") Set<TarifFunctionalities> authorizations,
//                                 @JsonProperty("nodes") Collection<ProductTreePlainNodeDto> nodes,
                                 @JsonProperty("buildForFormatXOnly") boolean flag
                                 ) {
        this.name = name;
        this.reportTypeIds = reportTypeIds;
        this.authorizations = authorizations;
//        this.nodes = nodes;
        this.buildForFormatXOnly = flag;
        System.out.println(flag);
//        this.onlyUi4IsPassed = nodes.stream().allMatch(n -> n.getLevel() == ProductTreeLevel.Ui4);

    }


    @Override
    public String toString() {
        return "TariffCreationRequest{" +
                "name='" + name + '\'' +
//                ", reportTypeIds=" + reportTypeIds +
                ", authorizations=" + authorizations +
                ", buildForFormatXOnly=" + buildForFormatXOnly +
                '}';
    }
}
