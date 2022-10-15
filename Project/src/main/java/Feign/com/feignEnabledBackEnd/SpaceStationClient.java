package Feign.com.feignEnabledBackEnd;

import Feign.com.server.SpaceStation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "spaceStation", url = "localhost:9090")
public interface SpaceStationClient {

    @RequestMapping(value="/station/{stationId}", method = RequestMethod.GET)
    public SpaceStation findSpaceStation(@PathVariable Integer stationId);
}
