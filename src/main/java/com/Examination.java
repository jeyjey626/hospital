package com;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@Builder
public class Examination {
    private Integer day;
    private String doctorType;
    private Double lifePoints;
}
