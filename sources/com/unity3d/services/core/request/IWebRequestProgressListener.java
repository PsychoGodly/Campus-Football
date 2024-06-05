package com.unity3d.services.core.request;

import java.util.List;
import java.util.Map;

public interface IWebRequestProgressListener {
    void onRequestProgress(String str, long j10, long j11);

    void onRequestStart(String str, long j10, int i10, Map<String, List<String>> map);
}
