package dev.antoniogiordano.drools_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Data
@AllArgsConstructor
@ToString
public class MyValue{
    String value;
    List<String> metadata;
}
