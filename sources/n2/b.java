package n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: AudioBecomingNoisyManager */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f20137a;

    /* renamed from: b  reason: collision with root package name */
    private final a f20138b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f20139c;

    /* compiled from: AudioBecomingNoisyManager */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C0216b f20140a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f20141b;

        public a(Handler handler, C0216b bVar) {
            this.f20141b = handler;
            this.f20140a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f20141b.post(this);
            }
        }

        public void run() {
            if (b.this.f20139c) {
                this.f20140a.p();
            }
        }
    }

    /* renamed from: n2.b$b  reason: collision with other inner class name */
    /* compiled from: AudioBecomingNoisyManager */
    public interface C0216b {
        void p();
    }

    public b(Context context, Handler handler, C0216b bVar) {
        this.f20137a = context.getApplicationContext();
        this.f20138b = new a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f20139c) {
            this.f20137a.registerReceiver(this.f20138b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f20139c = true;
        } else if (!z10 && this.f20139c) {
            this.f20137a.unregisterReceiver(this.f20138b);
            this.f20139c = false;
        }
    }
}
