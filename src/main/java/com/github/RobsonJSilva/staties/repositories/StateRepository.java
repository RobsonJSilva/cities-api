package com.github.RobsonJSilva.staties.repositories;

import com.github.RobsonJSilva.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
