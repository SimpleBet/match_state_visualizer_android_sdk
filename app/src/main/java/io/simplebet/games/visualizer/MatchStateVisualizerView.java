package io.simplebet.games.visualizer;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import java.util.Map;

public class MatchStateVisualizerView extends LinearLayout {

    private WebView webView;

    private final AnalyticsSender analyticsSender = this::sendEvent;

    public MatchStateVisualizerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public MatchStateVisualizerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MatchStateVisualizerView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        addView(webView = new WebView(context),
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
    }

    private void sendEvent(String event, Map<String, String> params) {
        StringBuilder paramsAsJson = new StringBuilder("{");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            paramsAsJson.append("'").append(k).append("'").append(v).append("'");
        }
        paramsAsJson.append("}");
        webView.evaluateJavascript("postMessage('{'analytics':{'event':'" + event + "', 'params':" + paramsAsJson + "}}'", null);
    }

    public void setMatchConfiguration(MatchVisualizerConfiguration configuration) {
        webView.loadUrl("https://matchviz.staging.simplebet.io/?" +
                "dev_features=auth_bypass" +
                "&proxy=thawing-eyrie-36823.herokuapp.com/proxy/match_visualizer" +
                "&route=/visualizer/nfl/61ceac92-6b2b-46b6-95e1-1f6f0bcad89d" +
                "&" +  configuration.toUrlParams());
    }

    public void refresh(){
        webView.reload();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MatchStateVisualizer.getInstance().addSender(
                analyticsSender);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MatchStateVisualizer.getInstance().removeSender(
                analyticsSender);
    }


    //    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        if( MeasureSpec.EXACTLY == MeasureSpec.getMode(heightMeasureSpec) ){
//            setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.getSize(widthMeasureSpec));
//        } else if( MeasureSpec.EXACTLY == MeasureSpec.getMode(heightMeasureSpec) ){
//
//        } else {
//
//        }
//    }

}
