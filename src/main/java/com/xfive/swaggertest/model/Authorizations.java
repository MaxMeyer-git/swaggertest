package com.xfive.swaggertest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xfive.swaggertest.model.Functionality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@ApiModel
@Getter
@Embeddable

public class Authorizations {

    @ApiModelProperty(value = "report Type Id", required = true)
    @NotBlank
    private UUID reportTypeId;


    @ApiModelProperty(value = "ui4 code", required = true)
    @NotEmpty
    private  Collection<String> productCategoriesCods;

    @ApiModelProperty(value = "Список Functions", required = true)
    @NotEmpty
    private List<Functionality> functions;


    public Authorizations(@JsonProperty("reportTypeIds") UUID reportTypeId,
                          @JsonProperty("ui4 code") Collection<String> productCategoriesCods,
                          @JsonProperty("Functionality List") List<Functionality> functions) {
        this.reportTypeId = reportTypeId;
        this.productCategoriesCods = productCategoriesCods;
        this.functions = functions;
    }
}
