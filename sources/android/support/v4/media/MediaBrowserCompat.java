package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    static final boolean f448b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a  reason: collision with root package name */
    private final d f449a;

    private static class CustomActionResultReceiver extends e.b {
        /* access modifiers changed from: protected */
        public void a(int i10, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends e.b {
        /* access modifiers changed from: protected */
        public void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.u(bundle);
            }
            if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    private static class SearchResultReceiver extends e.b {
        /* access modifiers changed from: protected */
        public void a(int i10, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.u(bundle);
            }
            if (i10 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    private static class a {
        static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    private static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<i> f452a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<Messenger> f453b;

        b(i iVar) {
            this.f452a = new WeakReference<>(iVar);
        }

        /* access modifiers changed from: package-private */
        public void a(Messenger messenger) {
            this.f453b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f453b;
            if (weakReference != null && weakReference.get() != null && this.f452a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                i iVar = (i) this.f452a.get();
                Messenger messenger = (Messenger) this.f453b.get();
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.a(bundle);
                        iVar.a(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i10 == 2) {
                        iVar.e(messenger);
                    } else if (i10 != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.a(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.a(bundle3);
                        iVar.b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        iVar.e(messenger);
                    }
                }
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final MediaBrowser.ConnectionCallback f454a;

        /* renamed from: b  reason: collision with root package name */
        b f455b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            public void onConnected() {
                b bVar = c.this.f455b;
                if (bVar != null) {
                    bVar.onConnected();
                }
                c.this.a();
            }

            public void onConnectionFailed() {
                b bVar = c.this.f455b;
                if (bVar != null) {
                    bVar.f();
                }
                c.this.b();
            }

            public void onConnectionSuspended() {
                b bVar = c.this.f455b;
                if (bVar != null) {
                    bVar.c();
                }
                c.this.c();
            }
        }

        interface b {
            void c();

            void f();

            void onConnected();
        }

        public c() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f454a = new a();
            } else {
                this.f454a = null;
            }
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void d(b bVar) {
            this.f455b = bVar;
        }
    }

    interface d {
        void d();

        void disconnect();

        MediaSessionCompat.Token getSessionToken();
    }

    static class e implements d, i, c.b {

        /* renamed from: a  reason: collision with root package name */
        final Context f457a;

        /* renamed from: b  reason: collision with root package name */
        protected final MediaBrowser f458b;

        /* renamed from: c  reason: collision with root package name */
        protected final Bundle f459c;

        /* renamed from: d  reason: collision with root package name */
        protected final b f460d = new b(this);

        /* renamed from: e  reason: collision with root package name */
        private final androidx.collection.a<String, k> f461e = new androidx.collection.a<>();

        /* renamed from: f  reason: collision with root package name */
        protected int f462f;

        /* renamed from: g  reason: collision with root package name */
        protected j f463g;

        /* renamed from: h  reason: collision with root package name */
        protected Messenger f464h;

        /* renamed from: i  reason: collision with root package name */
        private MediaSessionCompat.Token f465i;

        /* renamed from: j  reason: collision with root package name */
        private Bundle f466j;

        e(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            Bundle bundle2;
            this.f457a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f459c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.d(this);
            this.f458b = new MediaBrowser(context, componentName, cVar.f454a, bundle2);
        }

        public void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        public void b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f464h == messenger) {
                k kVar = this.f461e.get(str);
                if (kVar != null) {
                    l a10 = kVar.a(bundle);
                    if (a10 == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a10.c(str);
                            return;
                        }
                        this.f466j = bundle2;
                        a10.a(str, list);
                        this.f466j = null;
                    } else if (list == null) {
                        a10.d(str, bundle);
                    } else {
                        this.f466j = bundle2;
                        a10.b(str, list, bundle);
                        this.f466j = null;
                    }
                } else if (MediaBrowserCompat.f448b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        public void c() {
            this.f463g = null;
            this.f464h = null;
            this.f465i = null;
            this.f460d.a((Messenger) null);
        }

        public void d() {
            this.f458b.connect();
        }

        public void disconnect() {
            Messenger messenger;
            j jVar = this.f463g;
            if (!(jVar == null || (messenger = this.f464h) == null)) {
                try {
                    jVar.f(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f458b.disconnect();
        }

        public void e(Messenger messenger) {
        }

        public void f() {
        }

        public MediaSessionCompat.Token getSessionToken() {
            if (this.f465i == null) {
                this.f465i = MediaSessionCompat.Token.b(this.f458b.getSessionToken());
            }
            return this.f465i;
        }

        public void onConnected() {
            try {
                Bundle extras = this.f458b.getExtras();
                if (extras != null) {
                    this.f462f = extras.getInt("extra_service_version", 0);
                    IBinder a10 = androidx.core.app.f.a(extras, "extra_messenger");
                    if (a10 != null) {
                        this.f463g = new j(a10, this.f459c);
                        Messenger messenger = new Messenger(this.f460d);
                        this.f464h = messenger;
                        this.f460d.a(messenger);
                        try {
                            this.f463g.d(this.f457a, this.f464h);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    android.support.v4.media.session.b M0 = b.a.M0(androidx.core.app.f.a(extras, "extra_session_binder"));
                    if (M0 != null) {
                        this.f465i = MediaSessionCompat.Token.c(this.f458b.getSessionToken(), M0);
                    }
                }
            } catch (IllegalStateException e10) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e10);
            }
        }
    }

    static class f extends e {
        f(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    static class h implements d, i {

        /* renamed from: a  reason: collision with root package name */
        final Context f467a;

        /* renamed from: b  reason: collision with root package name */
        final ComponentName f468b;

        /* renamed from: c  reason: collision with root package name */
        final c f469c;

        /* renamed from: d  reason: collision with root package name */
        final Bundle f470d;

        /* renamed from: e  reason: collision with root package name */
        final b f471e = new b(this);

        /* renamed from: f  reason: collision with root package name */
        private final androidx.collection.a<String, k> f472f = new androidx.collection.a<>();

        /* renamed from: g  reason: collision with root package name */
        int f473g = 1;

        /* renamed from: h  reason: collision with root package name */
        c f474h;

        /* renamed from: i  reason: collision with root package name */
        j f475i;

        /* renamed from: j  reason: collision with root package name */
        Messenger f476j;

        /* renamed from: k  reason: collision with root package name */
        private String f477k;

        /* renamed from: l  reason: collision with root package name */
        private MediaSessionCompat.Token f478l;

        /* renamed from: m  reason: collision with root package name */
        private Bundle f479m;

        /* renamed from: n  reason: collision with root package name */
        private Bundle f480n;

        class a implements Runnable {
            a() {
            }

            public void run() {
                h hVar = h.this;
                if (hVar.f473g != 0) {
                    hVar.f473g = 2;
                    if (MediaBrowserCompat.f448b && hVar.f474h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + h.this.f474h);
                    } else if (hVar.f475i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + h.this.f475i);
                    } else if (hVar.f476j == null) {
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(h.this.f468b);
                        h hVar2 = h.this;
                        hVar2.f474h = new c();
                        boolean z10 = false;
                        try {
                            h hVar3 = h.this;
                            z10 = hVar3.f467a.bindService(intent, hVar3.f474h, 1);
                        } catch (Exception unused) {
                            Log.e("MediaBrowserCompat", "Failed binding to service " + h.this.f468b);
                        }
                        if (!z10) {
                            h.this.f();
                            h.this.f469c.b();
                        }
                        if (MediaBrowserCompat.f448b) {
                            Log.d("MediaBrowserCompat", "connect...");
                            h.this.c();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + h.this.f476j);
                    }
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                h hVar = h.this;
                Messenger messenger = hVar.f476j;
                if (messenger != null) {
                    try {
                        hVar.f475i.c(messenger);
                    } catch (RemoteException unused) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + h.this.f468b);
                    }
                }
                h hVar2 = h.this;
                int i10 = hVar2.f473g;
                hVar2.f();
                if (i10 != 0) {
                    h.this.f473g = i10;
                }
                if (MediaBrowserCompat.f448b) {
                    Log.d("MediaBrowserCompat", "disconnect...");
                    h.this.c();
                }
            }
        }

        private class c implements ServiceConnection {

            class a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ComponentName f484a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ IBinder f485b;

                a(ComponentName componentName, IBinder iBinder) {
                    this.f484a = componentName;
                    this.f485b = iBinder;
                }

                public void run() {
                    boolean z10 = MediaBrowserCompat.f448b;
                    if (z10) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.f484a + " binder=" + this.f485b);
                        h.this.c();
                    }
                    if (c.this.a("onServiceConnected")) {
                        h hVar = h.this;
                        hVar.f475i = new j(this.f485b, hVar.f470d);
                        h.this.f476j = new Messenger(h.this.f471e);
                        h hVar2 = h.this;
                        hVar2.f471e.a(hVar2.f476j);
                        h.this.f473g = 2;
                        if (z10) {
                            try {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                h.this.c();
                            } catch (RemoteException unused) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + h.this.f468b);
                                if (MediaBrowserCompat.f448b) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    h.this.c();
                                    return;
                                }
                                return;
                            }
                        }
                        h hVar3 = h.this;
                        hVar3.f475i.b(hVar3.f467a, hVar3.f476j);
                    }
                }
            }

            class b implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ComponentName f487a;

                b(ComponentName componentName) {
                    this.f487a = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f448b) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.f487a + " this=" + this + " mServiceConnection=" + h.this.f474h);
                        h.this.c();
                    }
                    if (c.this.a("onServiceDisconnected")) {
                        h hVar = h.this;
                        hVar.f475i = null;
                        hVar.f476j = null;
                        hVar.f471e.a((Messenger) null);
                        h hVar2 = h.this;
                        hVar2.f473g = 4;
                        hVar2.f469c.c();
                    }
                }
            }

            c() {
            }

            private void b(Runnable runnable) {
                if (Thread.currentThread() == h.this.f471e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    h.this.f471e.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean a(String str) {
                int i10;
                h hVar = h.this;
                if (hVar.f474h == this && (i10 = hVar.f473g) != 0 && i10 != 1) {
                    return true;
                }
                int i11 = hVar.f473g;
                if (i11 == 0 || i11 == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + h.this.f468b + " with mServiceConnection=" + h.this.f474h + " this=" + this);
                return false;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public h(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (cVar != null) {
                this.f467a = context;
                this.f468b = componentName;
                this.f469c = cVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f470d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        private static String g(int i10) {
            if (i10 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i10 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i10 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i10 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i10 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i10;
        }

        private boolean i(Messenger messenger, String str) {
            int i10;
            if (this.f476j == messenger && (i10 = this.f473g) != 0 && i10 != 1) {
                return true;
            }
            int i11 = this.f473g;
            if (i11 == 0 || i11 == 1) {
                return false;
            }
            Log.i("MediaBrowserCompat", str + " for " + this.f468b + " with mCallbacksMessenger=" + this.f476j + " this=" + this);
            return false;
        }

        public void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (i(messenger, "onConnect")) {
                if (this.f473g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + g(this.f473g) + "... ignoring");
                    return;
                }
                this.f477k = str;
                this.f478l = token;
                this.f479m = bundle;
                this.f473g = 3;
                if (MediaBrowserCompat.f448b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    c();
                }
                this.f469c.a();
                try {
                    for (Map.Entry next : this.f472f.entrySet()) {
                        String str2 = (String) next.getKey();
                        k kVar = (k) next.getValue();
                        List<l> b10 = kVar.b();
                        List<Bundle> c10 = kVar.c();
                        for (int i10 = 0; i10 < b10.size(); i10++) {
                            this.f475i.a(str2, b10.get(i10).f494b, c10.get(i10), this.f476j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        public void b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (i(messenger, "onLoadChildren")) {
                boolean z10 = MediaBrowserCompat.f448b;
                if (z10) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f468b + " id=" + str);
                }
                k kVar = this.f472f.get(str);
                if (kVar != null) {
                    l a10 = kVar.a(bundle);
                    if (a10 == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a10.c(str);
                            return;
                        }
                        this.f480n = bundle2;
                        a10.a(str, list);
                        this.f480n = null;
                    } else if (list == null) {
                        a10.d(str, bundle);
                    } else {
                        this.f480n = bundle2;
                        a10.b(str, list, bundle);
                        this.f480n = null;
                    }
                } else if (z10) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f468b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f469c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f470d);
            Log.d("MediaBrowserCompat", "  mState=" + g(this.f473g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f474h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f475i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f476j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f477k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f478l);
        }

        public void d() {
            int i10 = this.f473g;
            if (i10 == 0 || i10 == 1) {
                this.f473g = 2;
                this.f471e.post(new a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + g(this.f473g) + ")");
        }

        public void disconnect() {
            this.f473g = 0;
            this.f471e.post(new b());
        }

        public void e(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f468b);
            if (i(messenger, "onConnectFailed")) {
                if (this.f473g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + g(this.f473g) + "... ignoring");
                    return;
                }
                f();
                this.f469c.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void f() {
            c cVar = this.f474h;
            if (cVar != null) {
                this.f467a.unbindService(cVar);
            }
            this.f473g = 1;
            this.f474h = null;
            this.f475i = null;
            this.f476j = null;
            this.f471e.a((Messenger) null);
            this.f477k = null;
            this.f478l = null;
        }

        public MediaSessionCompat.Token getSessionToken() {
            if (h()) {
                return this.f478l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f473g + ")");
        }

        public boolean h() {
            return this.f473g == 3;
        }
    }

    interface i {
        void a(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void b(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);

        void e(Messenger messenger);
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        private Messenger f489a;

        /* renamed from: b  reason: collision with root package name */
        private Bundle f490b;

        public j(IBinder iBinder, Bundle bundle) {
            this.f489a = new Messenger(iBinder);
            this.f490b = bundle;
        }

        private void e(int i10, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f489a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            androidx.core.app.f.b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            e(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f490b);
            e(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void c(Messenger messenger) throws RemoteException {
            e(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        public void d(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f490b);
            e(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void f(Messenger messenger) throws RemoteException {
            e(7, (Bundle) null, messenger);
        }
    }

    private static class k {

        /* renamed from: a  reason: collision with root package name */
        private final List<l> f491a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<Bundle> f492b = new ArrayList();

        public l a(Bundle bundle) {
            for (int i10 = 0; i10 < this.f492b.size(); i10++) {
                if (androidx.media.c.a(this.f492b.get(i10), bundle)) {
                    return this.f491a.get(i10);
                }
            }
            return null;
        }

        public List<l> b() {
            return this.f491a;
        }

        public List<Bundle> c() {
            return this.f492b;
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        final MediaBrowser.SubscriptionCallback f493a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f494b = new Binder();

        /* renamed from: c  reason: collision with root package name */
        WeakReference<k> f495c;

        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            /* access modifiers changed from: package-private */
            public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i10 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i10 == -1 && i11 == -1) {
                    return list;
                }
                int i12 = i11 * i10;
                int i13 = i12 + i11;
                if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i13 > list.size()) {
                    i13 = list.size();
                }
                return list.subList(i12, i13);
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<k> weakReference = l.this.f495c;
                k kVar = weakReference == null ? null : (k) weakReference.get();
                if (kVar == null) {
                    l.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b10 = MediaItem.b(list);
                List<l> b11 = kVar.b();
                List<Bundle> c10 = kVar.c();
                for (int i10 = 0; i10 < b11.size(); i10++) {
                    Bundle bundle = c10.get(i10);
                    if (bundle == null) {
                        l.this.a(str, b10);
                    } else {
                        l.this.b(str, a(b10, bundle), bundle);
                    }
                }
            }

            public void onError(String str) {
                l.this.c(str);
            }
        }

        private class b extends a {
            b() {
                super();
            }

            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                l.this.b(str, MediaItem.b(list), bundle);
            }

            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                l.this.d(str, bundle);
            }
        }

        public l() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                this.f493a = new b();
            } else if (i10 >= 21) {
                this.f493a = new a();
            } else {
                this.f493a = null;
            }
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f449a = new g(context, componentName, cVar, bundle);
        } else if (i10 >= 23) {
            this.f449a = new f(context, componentName, cVar, bundle);
        } else if (i10 >= 21) {
            this.f449a = new e(context, componentName, cVar, bundle);
        } else {
            this.f449a = new h(context, componentName, cVar, bundle);
        }
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f449a.d();
    }

    public void b() {
        this.f449a.disconnect();
    }

    public MediaSessionCompat.Token c() {
        return this.f449a.getSessionToken();
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f450a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaDescriptionCompat f451b;

        class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.i())) {
                this.f450a = i10;
                this.f451b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem)), a.b(mediaItem));
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a10 : list) {
                arrayList.add(a(a10));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f450a + ", mDescription=" + this.f451b + '}';
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f450a);
            this.f451b.writeToParcel(parcel, i10);
        }

        MediaItem(Parcel parcel) {
            this.f450a = parcel.readInt();
            this.f451b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
