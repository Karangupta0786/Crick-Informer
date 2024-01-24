package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
//    match fetch by providing the teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);
}
