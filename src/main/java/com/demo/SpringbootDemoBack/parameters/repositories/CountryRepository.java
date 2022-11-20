package com.demo.SpringbootDemoBack.parameters.repositories;

import com.demo.SpringbootDemoBack.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
