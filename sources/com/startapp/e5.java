package com.startapp;

import java.util.Map;

/* compiled from: Sta */
public interface e5 {
    void close();

    void createCalendarEvent(String str);

    void expand(String str);

    boolean open(String str);

    void playVideo(String str);

    void resize();

    void setExpandProperties(Map<String, String> map);

    void setOrientationProperties(Map<String, String> map);

    void setResizeProperties(Map<String, String> map);

    void storePicture(String str);

    void useCustomClose(String str);
}
