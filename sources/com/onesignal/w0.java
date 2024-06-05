package com.onesignal;

import com.onesignal.k3;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: OSDynamicTriggerTimer */
class w0 {
    static void a(TimerTask timerTask, String str, long j10) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, "scheduleTrigger: " + str + " delay: " + j10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("trigger_timer:");
        sb2.append(str);
        new Timer(sb2.toString()).schedule(timerTask, j10);
    }
}
