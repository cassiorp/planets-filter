package com.forttiori.planetsfilter.Controller;

import com.forttiori.planetsfilter.Service.PlanetsService;
import com.forttiori.planetsfilter.Response.PlanetInfoResponse;
import com.forttiori.planetsfilter.Response.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/planets")
@RequiredArgsConstructor
public class PlanetsController {

    private final PlanetsService planetsService;

    @GetMapping
    public ResultResponse getAllPlanets(@RequestParam(value = "page", required = false) Integer page){
        return this.planetsService.getAllPlanets(page);
    }

    @GetMapping(value = "/all")
    public ResultResponse getAllPlanetsWithoutPagination(){
        return this.planetsService.getAllPlanetsWithoutPagination();
    }

    @GetMapping(value = "/{id}")
    public PlanetInfoResponse getPlanetsById(@PathVariable Integer id){
        return this.planetsService.getPlanetsById(id);
    }

}
