package com.crick.apis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
@Table(name = "crick_matches")
public class Match
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int match_id;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String ballingTeam;

    private String ballingTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;

    private Date date = new Date();

    public Match(int match_id, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore, String ballingTeam, String ballingTeamScore, String liveText, String matchLink, String textComplete, MatchStatus status, Date date) {
        this.match_id = match_id;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.ballingTeam = ballingTeam;
        this.ballingTeamScore = ballingTeamScore;
        this.liveText = liveText;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }
    public Match(){
    }

    //set the match status acc to textComplete
    public void setMatchStatus(){
        if (textComplete.isBlank()){
            this.status = MatchStatus.LIVE;
        }
        else {
            this.status = MatchStatus.COMPLETED;
        }
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBallingTeam() {
        return ballingTeam;
    }

    public void setBallingTeam(String ballingTeam) {
        this.ballingTeam = ballingTeam;
    }

    public String getBallingTeamScore() {
        return ballingTeamScore;
    }

    public void setBallingTeamScore(String ballingTeamScore) {
        this.ballingTeamScore = ballingTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
