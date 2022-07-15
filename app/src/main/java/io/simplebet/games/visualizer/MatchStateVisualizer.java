package io.simplebet.games.visualizer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MatchStateVisualizer {

    private final List<WeakReference<AnalyticsSender>> senders = new ArrayList<>();

    static private final MatchStateVisualizer instance = new MatchStateVisualizer();

    public static MatchStateVisualizer getInstance() {
        return instance;
    }

    public static void sendAnalytics(String event, Map<String, String> params) {

        List<WeakReference<AnalyticsSender>> senders = getInstance().senders;
        for (int i = 0; i < senders.size(); i++) {
            WeakReference<AnalyticsSender> ref = senders.get(i);
            AnalyticsSender analyticsSender = ref.get();
            if (analyticsSender == null) {
                senders.remove(ref);
                i--;
            } else {
                analyticsSender.sendAnalytics(event, params);
            }
        }
    }

    public void addSender(AnalyticsSender sender){
        senders.add(new WeakReference<>(sender));
    }

    public void removeSender(AnalyticsSender sender){
        senders.remove(new WeakReference<>(sender));
    }
}
