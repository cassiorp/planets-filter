package com.forttiori.planetsfilter.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse {

    private List<PlanetInfoResponse> results = new ArrayList<>();

    public void setResults(List<PlanetInfoResponse> results) {
        this.results.addAll(results);
    }

}
