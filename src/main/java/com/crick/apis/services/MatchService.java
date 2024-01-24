package com.crick.apis.services;


import com.crick.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<Match> getLiveMatchScores();

    List<List<String>> getCWC2023PointTable();

    //get all matches
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatches();

    //get cwc point table

    List<Map<String,String>> getPointTable();

}
