package com.xfive.swaggertest.serrtest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@ApiModel
@Getter
@Setter
@Entity
@NoArgsConstructor

public class TariffCreationRequest {

    @Id
    @GeneratedValue
    private UUID uuid;

    @ApiModelProperty(value = "Название тарифа", required = true)
    @NotBlank
    private  String name;

    @ApiModelProperty(value = "Дата начала действия тарифа", required = true)
    @NotBlank
    private  Date startDate;

    @ApiModelProperty(value = "Дата окончания действия тарифа", required = true)
    @NotBlank
    private  Date endDate;

    @ApiModelProperty(value = "Список разрешений пользователя", required = true)
    @NotEmpty
    private  List<Authorizations> authorizations;
//    @ApiModelProperty(value = "Идентификаторы доступных типов отчётов", required = true)
//    @NotEmpty
//    private final Set<UUID> reportTypeIds;

//    @ApiModelProperty(value = "Узлы дерева продуктов, доступне в рамках тарифа", required = true)
//    @NotEmpty
//    private final Collection<ProductTreePlainNodeDto> nodes;

//    @JsonIgnore
//    @AssertTrue(message = "Должны быть переданны узлы уровня UI4")
//    private final boolean onlyUi4IsPassed;
    @ApiModelProperty(value = "флаг генерации отчетов только в рамках ТС \"Перекресток\"", required = false)
    @JsonIgnore
    private  boolean buildForFormatXOnly;

//    @JsonCreator
//    public TariffCreationRequest(@JsonProperty("name") String name,
//                                 @JsonProperty("startDate") Date startDate,
//                                 @JsonProperty("startDate") Date endDate,
//                                 @JsonProperty("authorizations") List<Authorizations> authorizations,
////                                 @JsonProperty("reportTypeIds") Set<UUID> reportTypeIds,
////                                 @JsonProperty("nodes") Collection<ProductTreePlainNodeDto> nodes,
//                                 @JsonProperty("buildForFormatXOnly") boolean flag
//                                 ) {
//        this.name = name;
//        this.startDate=startDate;
//        this.endDate=endDate;
////        this.reportTypeIds = reportTypeIds;
////        this.nodes = nodes;
//        this.buildForFormatXOnly = flag;
////        this.onlyUi4IsPassed = nods.stream().allMatch(n -> n.getLevel() == ProductTreeLevel.Ui4);
//        this.authorizations = authorizations;
//    }


}
