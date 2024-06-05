package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.List;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TopicsReceiver.kt */
public final class TopicsReceiver implements OutcomeReceiver<GetTopicsResponse, Exception> {
    private final IEventSender eventSender;

    public TopicsReceiver(IEventSender iEventSender) {
        m.e(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public final JSONObject formatTopic(Topic topic) {
        m.e(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", topic.getTaxonomyVersion());
        jSONObject.put("modelVersion", topic.getModelVersion());
        jSONObject.put("topicId", topic.getTopicId());
        return jSONObject;
    }

    public void onError(Exception exc) {
        m.e(exc, "error");
        DeviceLog.debug("GetTopics exception: " + exc);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, exc.toString());
    }

    public void onResult(GetTopicsResponse getTopicsResponse) {
        m.e(getTopicsResponse, "result");
        JSONArray jSONArray = new JSONArray();
        List<Topic> topics = getTopicsResponse.getTopics();
        m.d(topics, "result.topics");
        for (Topic topic : topics) {
            m.d(topic, "it");
            jSONArray.put(formatTopic(topic));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String jSONArray2 = jSONArray.toString();
        m.d(jSONArray2, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, jSONArray2);
    }
}
