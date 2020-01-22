package com.xfive.swaggertest.serrtest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductTreePlainNodeId implements Serializable {

    @Column(name = "level")
    private String level;

    @Column(name = "code")
    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTreePlainNodeId that = (ProductTreePlainNodeId) o;
        return level.equals(that.level) &&
                code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, code);
    }
}
