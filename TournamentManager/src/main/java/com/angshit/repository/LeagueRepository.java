package com.angshit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.angshit.domain.League;

@Repository
public interface LeagueRepository extends JpaRepository<League, Long>{

}
