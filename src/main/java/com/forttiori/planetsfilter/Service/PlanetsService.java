package com.forttiori.planetsfilter.Service;


import com.forttiori.planetsfilter.Client.PlanetsClient;
import com.forttiori.planetsfilter.Exceptions.PageNotFoundExcepetion;
import com.forttiori.planetsfilter.Exceptions.PlanetNotFoundException;
import com.forttiori.planetsfilter.Response.PlanetInfoResponse;
import com.forttiori.planetsfilter.Response.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlanetsService {

    private final PlanetsClient planetsClient;

    public ResultResponse getAllPlanets(Integer page){
        try {
            return planetsClient.getAllPlanets(page);
        }catch (RuntimeException e){
            throw new PageNotFoundExcepetion("Pagina não encontrada!");
        }
    }

    public ResultResponse getAllPlanetsWithoutPagination(){
        ResultResponse resultResponse = new ResultResponse();
        for(int i = 1; i <= 6; i++){
            resultResponse.setResults(this.planetsClient.getAllPlanets(i).getResults());
        }
        return resultResponse;
    }

    public PlanetInfoResponse getPlanetsById(Integer id){
        try {
            return this.planetsClient.getPlanetsById(id);
        }catch (RuntimeException e){
            throw new PlanetNotFoundException("Planeta não encontrado!");
        }
    }

}
