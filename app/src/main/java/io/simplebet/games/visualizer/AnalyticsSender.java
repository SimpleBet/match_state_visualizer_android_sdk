package io.simplebet.games.visualizer;

import java.util.Map;

public interface AnalyticsSender {

    void sendAnalytics(String event, Map<String, String> params);
}
