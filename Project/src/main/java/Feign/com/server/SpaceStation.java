package Feign.com.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceStation {

    private Integer stationId;
    private String name;
    private Integer people;
    private Integer diameter;

}
