package Feign.com.feignEnabledBackEnd;

import Feign.com.server.SpaceStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StatusController {

    @Autowired
    private SpaceStationClient spaceStationClient;

    @GetMapping("/status")
    public SpaceStation status() {
        SpaceStation spaceStation = spaceStationClient.findSpaceStation(new Random().nextInt());
        System.out.println("spaceStation = " + spaceStation);
        return spaceStation;
    }

}
