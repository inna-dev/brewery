package com.innams.brewery.services;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.innams.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getById(UUID beerId) {
        return BeerDto.builder()
                      .id(UUID.randomUUID())
                      .beerName("Karakale")
                      .beerStyle("Apple Blond")
                      .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                      .id(UUID.randomUUID())
                      .build();
    }

    @Override
    public void updateBeer(
            UUID beerId,
            BeerDto beerDto
    ) {
        //todo implements update service
    }

    @Override
    public void deleteBeer(UUID beerId) {
        //todo implements update service
        log.debug("deleting ... " + beerId.toString());
    }
}
