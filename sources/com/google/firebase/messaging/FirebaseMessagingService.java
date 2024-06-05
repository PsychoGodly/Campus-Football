package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends h {

    /* renamed from: g  reason: collision with root package name */
    private static final Queue<String> f26725g = new ArrayDeque(10);

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f26725g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
            return true;
        }
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (k0.t(extras)) {
            k0 k0Var = new k0(extras);
            ExecutorService e10 = n.e();
            try {
                if (!new e(this, k0Var, e10).a()) {
                    e10.shutdown();
                    if (i0.B(intent)) {
                        i0.t(intent);
                    }
                } else {
                    return;
                }
            } finally {
                e10.shutdown();
            }
        }
        q(new p0(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void o(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            u(intent);
        }
    }

    private void u(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                p();
                return;
            case 1:
                i0.v(intent);
                m(intent);
                return;
            case 2:
                t(n(intent), new t0(intent.getStringExtra("error")));
                return;
            case 3:
                r(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    /* access modifiers changed from: protected */
    public Intent e(Intent intent) {
        return u0.b().c();
    }

    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            o(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            s(intent.getStringExtra("token"));
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    public void p() {
    }

    public void q(p0 p0Var) {
    }

    public void r(String str) {
    }

    public void s(String str) {
    }

    public void t(String str, Exception exc) {
    }
}
