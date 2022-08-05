package io.simplebet.games.visualizer;

import java.util.List;

public class MatchVisualizerConfiguration {

    private int width;

    private int height;

    private String environment = Environment.PROD;

    // API Key provided by SimpleBet
    private String apiKey;

    // The away and home teams abbreviations
    private List<String> teams;

    // The UTC Start time of the match
    private String startTime;

    /**
     * see {@link Environment}
     * @param environment
     * @return
     */
    MatchVisualizerConfiguration setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    MatchVisualizerConfiguration setWidth(int width) {
        this.width = width;
        return this;
    }

    MatchVisualizerConfiguration setHeight(int height) {
        this.height = height;
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
        return "api_key=" + apiKey
                + "&teams=" + teams.get(0) + "," + teams.get(1)
                + "&start_time=" + startTime;
    }

}
