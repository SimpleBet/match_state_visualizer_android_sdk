package io.simplebet.games.visualizer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import org.json.JSONObject;

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
        JSONObject paramsAsJson = new JSONObject(params);
        webView.evaluateJavascript("postMessage('{'analytics':{'event':'" + event + "', 'params':" + paramsAsJson.toString() + "}}'", null);
    }

    public void setMatchConfiguration(MatchVisualizerConfiguration configuration) {
        webView.loadUrl(configuration.toUrl());
    }

    public void refresh() {
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
