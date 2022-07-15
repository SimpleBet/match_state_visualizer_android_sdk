package io.simplebet.games.visualizer;

import java.util.List;

public class MatchVisualizerConfiguration {

    public static final String LEAGUE_NFL = "NFL";

    public static final String LEAGUE_CFB = "CFB";
    private int width;

    private int height;

    // API Key provided by SimpleBet
    private String apiKey;

    // Either NFL  | CFB
    private String league;

    // The away and home teams abbreviations
    private List<String> teams;

    // The UTC Start time of the match
    private String startTime;

    MatchVisualizerConfiguration setWidth(int width) {
        this.width = width;
        return this;
    }

    MatchVisualizerConfiguration setHeight(int height) {
        this.height = height;
        return this;
    }

    MatchVisualizerConfiguration setLeague(String league) {
        this.league = league;
        return this;
    }

    MatchVisualizerConfiguration setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    MatchVisualizerConfiguration setAPIKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    MatchVisualizerConfiguration setTeams(List<String> teams) {
        this.teams = teams;
        return this;
    }

    public String toUrlParams() {
        return "key=" + apiKey
                + "&league=" + league
                + "&teams=" + teams.get(0) + "," + teams.get(1)
                + "&start_time=" + startTime;
    }

}
