package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.f;
import androidx.media.AudioAttributesCompat;
import androidx.media.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class MediaControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    private final b f526a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaSessionCompat.Token f527b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<a, Boolean> f528c = new ConcurrentHashMap<>();

    static class MediaControllerImplApi21 implements b {

        /* renamed from: a  reason: collision with root package name */
        protected final MediaController f529a;

        /* renamed from: b  reason: collision with root package name */
        final Object f530b = new Object();

        /* renamed from: c  reason: collision with root package name */
        private final List<a> f531c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private HashMap<a, a> f532d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        final MediaSessionCompat.Token f533e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a  reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f534a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f534a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f534a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f530b) {
                        mediaControllerImplApi21.f533e.h(b.a.M0(f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f533e.i(i1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.e();
                    }
                }
            }
        }

        private static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            public void A0(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            public void G0() throws RemoteException {
                throw new AssertionError();
            }

            public void J0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void R(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void V(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            public void z1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f533e = token;
            this.f529a = new MediaController(context, (MediaSession.Token) token.g());
            if (token.d() == null) {
                f();
            }
        }

        private void f() {
            g("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        static void h(Activity activity, MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.c().g()) : null);
        }

        public final void a(a aVar) {
            this.f529a.unregisterCallback(aVar.f535a);
            synchronized (this.f530b) {
                if (this.f533e.d() != null) {
                    try {
                        a remove = this.f532d.remove(aVar);
                        if (remove != null) {
                            aVar.f537c = null;
                            this.f533e.d().e0(remove);
                        }
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                    }
                } else {
                    this.f531c.remove(aVar);
                }
            }
        }

        public boolean b(KeyEvent keyEvent) {
            return this.f529a.dispatchMediaButtonEvent(keyEvent);
        }

        public PendingIntent c() {
            return this.f529a.getSessionActivity();
        }

        public final void d(a aVar, Handler handler) {
            this.f529a.registerCallback(aVar.f535a, handler);
            synchronized (this.f530b) {
                if (this.f533e.d() != null) {
                    a aVar2 = new a(aVar);
                    this.f532d.put(aVar, aVar2);
                    aVar.f537c = aVar2;
                    try {
                        this.f533e.d().r(aVar2);
                        aVar.m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    aVar.f537c = null;
                    this.f531c.add(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            if (this.f533e.d() != null) {
                for (a next : this.f531c) {
                    a aVar = new a(next);
                    this.f532d.put(next, aVar);
                    next.f537c = aVar;
                    try {
                        this.f533e.d().r(aVar);
                        next.m(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                }
                this.f531c.clear();
            }
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f529a.sendCommand(str, bundle, resultReceiver);
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        final MediaController.Callback f535a;

        /* renamed from: b  reason: collision with root package name */
        b f536b;

        /* renamed from: c  reason: collision with root package name */
        a f537c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        private static class C0005a extends MediaController.Callback {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f538a;

            C0005a(a aVar) {
                this.f538a = new WeakReference<>(aVar);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = (a) this.f538a.get();
                if (aVar != null) {
                    aVar.a(new e(playbackInfo.getPlaybackType(), AudioAttributesCompat.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = (a) this.f538a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = (a) this.f538a.get();
                if (aVar != null) {
                    aVar.d(MediaMetadataCompat.b(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = (a) this.f538a.get();
                if (aVar != null && aVar.f537c == null) {
                    aVar.e(PlaybackStateCompat.a(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = (a) this.f538a.get();
                if (aVar != null) {
                    aVar.f(MediaSessionCompat.QueueItem.b(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = (a) this.f538a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            public void onSessionDestroyed() {
                a aVar = (a) this.f538a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = (a) this.f538a.get();
                if (aVar == null) {
                    return;
                }
                if (aVar.f537c == null || Build.VERSION.SDK_INT >= 23) {
                    aVar.j(str, bundle);
                }
            }
        }

        private class b extends Handler {

            /* renamed from: a  reason: collision with root package name */
            boolean f539a = false;

            b(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f539a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.a(data);
                            a.this.j((String) message.obj, data);
                            return;
                        case 2:
                            a.this.e((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.d((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            a.this.a((e) message.obj);
                            return;
                        case 5:
                            a.this.f((List) message.obj);
                            return;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.a(bundle);
                            a.this.c(bundle);
                            return;
                        case 8:
                            a.this.i();
                            return;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            a.this.l(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            a.this.k();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        private static class c extends a.C0007a {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f541a;

            c(a aVar) {
                this.f541a = new WeakReference<>(aVar);
            }

            public void A0(CharSequence charSequence) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(6, charSequence, (Bundle) null);
                }
            }

            public void G0() throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(8, (Object) null, (Bundle) null);
                }
            }

            public void J0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            public void Q() throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(13, (Object) null, (Bundle) null);
                }
            }

            public void R(Bundle bundle) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(7, bundle, (Bundle) null);
                }
            }

            public void V(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(5, list, (Bundle) null);
                }
            }

            public void V0(int i10) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i10), (Bundle) null);
                }
            }

            public void m0(boolean z10) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z10), (Bundle) null);
                }
            }

            public void p(int i10) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i10), (Bundle) null);
                }
            }

            public void v1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(2, playbackStateCompat, (Bundle) null);
                }
            }

            public void w1(String str, Bundle bundle) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            public void y0(boolean z10) throws RemoteException {
            }

            public void z1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                a aVar = (a) this.f541a.get();
                if (aVar != null) {
                    aVar.m(4, parcelableVolumeInfo != null ? new e(parcelableVolumeInfo.f619a, parcelableVolumeInfo.f620b, parcelableVolumeInfo.f621c, parcelableVolumeInfo.f622d, parcelableVolumeInfo.f623f) : null, (Bundle) null);
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f535a = new C0005a(this);
                return;
            }
            this.f535a = null;
            this.f537c = new c(this);
        }

        public void a(e eVar) {
        }

        public void b(boolean z10) {
        }

        public void binderDied() {
            m(8, (Object) null, (Bundle) null);
        }

        public void c(Bundle bundle) {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
        }

        public void f(List<MediaSessionCompat.QueueItem> list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int i10) {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int i10) {
        }

        /* access modifiers changed from: package-private */
        public void m(int i10, Object obj, Bundle bundle) {
            b bVar = this.f536b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i10, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* access modifiers changed from: package-private */
        public void n(Handler handler) {
            if (handler == null) {
                b bVar = this.f536b;
                if (bVar != null) {
                    bVar.f539a = false;
                    bVar.removeCallbacksAndMessages((Object) null);
                    this.f536b = null;
                    return;
                }
                return;
            }
            b bVar2 = new b(handler.getLooper());
            this.f536b = bVar2;
            bVar2.f539a = true;
        }
    }

    interface b {
        void a(a aVar);

        boolean b(KeyEvent keyEvent);

        PendingIntent c();

        void d(a aVar, Handler handler);
    }

    static class c extends MediaControllerImplApi21 {
        c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private b f542a;

        d(MediaSessionCompat.Token token) {
            this.f542a = b.a.M0((IBinder) token.g());
        }

        public void a(a aVar) {
            if (aVar != null) {
                try {
                    this.f542a.e0(aVar.f537c);
                    this.f542a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public boolean b(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f542a.x0(keyEvent);
                    return false;
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e10);
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        public PendingIntent c() {
            try {
                return this.f542a.F();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e10);
                return null;
            }
        }

        public void d(a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f542a.asBinder().linkToDeath(aVar, 0);
                    this.f542a.r(aVar.f537c);
                    aVar.m(13, (Object) null, (Bundle) null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    aVar.m(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f543a;

        /* renamed from: b  reason: collision with root package name */
        private final AudioAttributesCompat f544b;

        /* renamed from: c  reason: collision with root package name */
        private final int f545c;

        /* renamed from: d  reason: collision with root package name */
        private final int f546d;

        /* renamed from: e  reason: collision with root package name */
        private final int f547e;

        e(int i10, int i11, int i12, int i13, int i14) {
            this(i10, new AudioAttributesCompat.a().d(i11).a(), i12, i13, i14);
        }

        e(int i10, AudioAttributesCompat audioAttributesCompat, int i11, int i12, int i13) {
            this.f543a = i10;
            this.f544b = audioAttributesCompat;
            this.f545c = i11;
            this.f546d = i12;
            this.f547e = i13;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token c10 = mediaSessionCompat.c();
            this.f527b = c10;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                this.f526a = new c(context, c10);
            } else if (i10 >= 21) {
                this.f526a = new MediaControllerImplApi21(context, c10);
            } else {
                this.f526a = new d(c10);
            }
        } else {
            throw new IllegalArgumentException("session must not be null");
        }
    }

    public static void f(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(i.media_controller_compat_view_tag, mediaControllerCompat);
        if (Build.VERSION.SDK_INT >= 21) {
            MediaControllerImplApi21.h(activity, mediaControllerCompat);
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f526a.b(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public PendingIntent b() {
        return this.f526a.c();
    }

    public MediaSessionCompat.Token c() {
        return this.f527b;
    }

    public void d(a aVar) {
        e(aVar, (Handler) null);
    }

    public void e(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f528c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.n(handler);
            this.f526a.d(aVar, handler);
        }
    }

    public void g(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f528c.remove(aVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
        } else {
            try {
                this.f526a.a(aVar);
            } finally {
                aVar.n((Handler) null);
            }
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f527b = token;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f526a = new MediaControllerImplApi21(context, token);
            } else {
                this.f526a = new d(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }
}
