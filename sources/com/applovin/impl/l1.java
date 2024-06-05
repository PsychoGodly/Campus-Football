package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

final class l1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9124a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9125b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f9126c;

    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f9127a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f9128b;

        public a(Handler handler, b bVar) {
            this.f9128b = handler;
            this.f9127a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f9128b.post(this);
            }
        }

        public void run() {
            if (l1.this.f9126c) {
                this.f9127a.c();
            }
        }
    }

    public interface b {
        void c();
    }

    public l1(Context context, Handler handler, b bVar) {
        this.f9124a = context.getApplicationContext();
        this.f9125b = new a(handler, bVar);
    }

    public void a(boolean z10) {
        if (z10 && !this.f9126c) {
            this.f9124a.registerReceiver(this.f9125b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f9126c = true;
        } else if (!z10 && this.f9126c) {
            this.f9124a.unregisterReceiver(this.f9125b);
            this.f9126c = false;
        }
    }
}
