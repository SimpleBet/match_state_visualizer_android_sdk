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
     *
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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getEnvironment() {
        return environment;
    }

    public String toUrlParams() {
        String teams = "";
        if (!this.teams.isEmpty()) {
            teams = "teams=" + this.teams.get(0) + ',' + this.teams.get(1);
        }
        return "api_key=" + apiKey
                + "&teams=" + teams
                + "&start_time=" + startTime;
    }

    public String toUrl() {
        String url;
        url = "https://matchviz" + environment + ".simplebet.io/";
        if (environment.equals(Environment.DEV)) {
            url = "http://10.0.2.2:8080/";
        }
        return url + "?" + toUrlParams();
    }

    public String getAPIKey() {
        return apiKey;
    }
}
