package com.github.RobsonJSilva.countries.repositories;

import com.github.RobsonJSilva.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
