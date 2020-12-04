package com.forttiori.planetsfilter.Client;

import com.forttiori.planetsfilter.Response.PlanetInfoResponse;
import com.forttiori.planetsfilter.Response.ResultResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "starwarsapi", url = "${api.starwars}")
public interface PlanetsClient {

    @RequestMapping(method = RequestMethod.GET, value = "/planets/")
    public ResultResponse getAllPlanets(@RequestParam("page") Integer page);

    @RequestMapping(method = RequestMethod.GET, value = "/planets/{id}/")
    public PlanetInfoResponse getPlanetsById(@PathVariable Integer id);

}
