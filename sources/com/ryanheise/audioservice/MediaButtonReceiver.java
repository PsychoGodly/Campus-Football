package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;
import s0.a;

public class MediaButtonReceiver extends a {
    public void onReceive(Context context, Intent intent) {
        AudioService audioService;
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || (audioService = AudioService.D) == null) {
            super.onReceive(context, intent);
        } else {
            audioService.O();
        }
    }
}
