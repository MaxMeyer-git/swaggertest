package com.xfive.swaggertest.serrtest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@ApiModel
@Getter
public class Authorizations {

    @ApiModelProperty(value = "report Type Id", required = true)
    @NotBlank
    private UUID reportTypeId;


    @ApiModelProperty(value = "ui4 code", required = true)
    @NotEmpty
    private final Collection<String> productCategoriesCods;

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
