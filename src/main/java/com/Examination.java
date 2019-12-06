package com;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@Builder
public class Examination {
    private Integer day; //todo: do I need it?
    private String doctorType;
    private Double lifePoints;

}
