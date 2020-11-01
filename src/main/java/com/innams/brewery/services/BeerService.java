package com.innams.brewery.services;

import java.util.UUID;
import com.innams.brewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(
            UUID beerId,
            BeerDto beerDto
    );

    void deleteBeer(UUID beerId);
}
