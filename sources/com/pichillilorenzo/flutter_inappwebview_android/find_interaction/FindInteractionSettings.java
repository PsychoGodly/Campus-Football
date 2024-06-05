package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import java.util.HashMap;
import java.util.Map;

public class FindInteractionSettings implements ISettings<FindInteractionController> {
    public static final String LOG_TAG = "FindInteractionSettings";

    public FindInteractionSettings parse(Map<String, Object> map) {
        return this;
    }

    public Map<String, Object> toMap() {
        return new HashMap();
    }

    public Map<String, Object> getRealSettings(FindInteractionController findInteractionController) {
        return toMap();
    }
}
