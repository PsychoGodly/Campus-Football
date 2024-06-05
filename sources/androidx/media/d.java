package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat */
public abstract class d extends Service {

    /* renamed from: i  reason: collision with root package name */
    static final boolean f4020i = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a  reason: collision with root package name */
    private g f4021a;

    /* renamed from: b  reason: collision with root package name */
    final f f4022b = new f("android.media.session.MediaController", -1, -1, (Bundle) null, (p) null);

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<f> f4023c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    final androidx.collection.a<IBinder, f> f4024d = new androidx.collection.a<>();

    /* renamed from: f  reason: collision with root package name */
    f f4025f;

    /* renamed from: g  reason: collision with root package name */
    final r f4026g = new r();

    /* renamed from: h  reason: collision with root package name */
    MediaSessionCompat.Token f4027h;

    /* compiled from: MediaBrowserServiceCompat */
    class a extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f4028f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f4029g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Bundle f4030h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Bundle f4031i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f4028f = fVar;
            this.f4029g = str;
            this.f4030h = bundle;
            this.f4031i = bundle2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(List<MediaBrowserCompat.MediaItem> list) {
            if (d.this.f4024d.get(this.f4028f.f4046f.asBinder()) == this.f4028f) {
                if ((b() & 1) != 0) {
                    list = d.this.b(list, this.f4030h);
                }
                try {
                    this.f4028f.f4046f.a(this.f4029g, list, this.f4030h, this.f4031i);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f4029g + " package=" + this.f4028f.f4041a);
                }
            } else if (d.f4020i) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f4028f.f4041a + " id=" + this.f4029g);
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class b extends m<MediaBrowserCompat.MediaItem> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e.b f4033f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj, e.b bVar) {
            super(obj);
            this.f4033f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(MediaBrowserCompat.MediaItem mediaItem) {
            if ((b() & 2) != 0) {
                this.f4033f.b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f4033f.b(0, bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class c extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e.b f4035f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Object obj, e.b bVar) {
            super(obj);
            this.f4035f = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(List<MediaBrowserCompat.MediaItem> list) {
            if ((b() & 4) != 0 || list == null) {
                this.f4035f.b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f4035f.b(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$d  reason: collision with other inner class name */
    /* compiled from: MediaBrowserServiceCompat */
    class C0066d extends m<Bundle> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e.b f4037f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0066d(Object obj, e.b bVar) {
            super(obj);
            this.f4037f = bVar;
        }

        /* access modifiers changed from: package-private */
        public void d(Bundle bundle) {
            this.f4037f.b(-1, bundle);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void e(Bundle bundle) {
            this.f4037f.b(0, bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    public static final class e {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f4039a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f4040b;

        public e(String str, Bundle bundle) {
            if (str != null) {
                this.f4039a = str;
                this.f4040b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }

        public Bundle c() {
            return this.f4040b;
        }

        public String d() {
            return this.f4039a;
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private class f implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final String f4041a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4042b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4043c;

        /* renamed from: d  reason: collision with root package name */
        public final e f4044d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f4045e;

        /* renamed from: f  reason: collision with root package name */
        public final p f4046f;

        /* renamed from: g  reason: collision with root package name */
        public final HashMap<String, List<androidx.core.util.d<IBinder, Bundle>>> f4047g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public e f4048h;

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {
            a() {
            }

            public void run() {
                f fVar = f.this;
                d.this.f4024d.remove(fVar.f4046f.asBinder());
            }
        }

        f(String str, int i10, int i11, Bundle bundle, p pVar) {
            this.f4041a = str;
            this.f4042b = i10;
            this.f4043c = i11;
            this.f4044d = new e(str, i10, i11);
            this.f4045e = bundle;
            this.f4046f = pVar;
        }

        public void binderDied() {
            d.this.f4026g.post(new a());
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    interface g {
        void a(String str, Bundle bundle);

        void b(MediaSessionCompat.Token token);

        IBinder onBind(Intent intent);

        void onCreate();
    }

    /* compiled from: MediaBrowserServiceCompat */
    class h implements g {

        /* renamed from: a  reason: collision with root package name */
        final List<Bundle> f4051a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        MediaBrowserService f4052b;

        /* renamed from: c  reason: collision with root package name */
        Messenger f4053c;

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f4055a;

            a(MediaSessionCompat.Token token) {
                this.f4055a = token;
            }

            public void run() {
                h.this.h(this.f4055a);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n f4057f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Object obj, n nVar) {
                super(obj);
                this.f4057f = nVar;
            }

            public void a() {
                this.f4057f.a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void e(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f4057f.c(arrayList);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f4059a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f4060b;

            c(String str, Bundle bundle) {
                this.f4059a = str;
                this.f4060b = bundle;
            }

            public void run() {
                for (IBinder iBinder : d.this.f4024d.keySet()) {
                    androidx.collection.a<IBinder, f> aVar = d.this.f4024d;
                    h.this.d(aVar.get(iBinder), this.f4059a, this.f4060b);
                }
            }
        }

        /* renamed from: androidx.media.d$h$d  reason: collision with other inner class name */
        /* compiled from: MediaBrowserServiceCompat */
        class C0067d extends MediaBrowserService {
            C0067d(Context context) {
                attachBaseContext(context);
            }

            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i10, Bundle bundle) {
                Bundle bundle2;
                MediaSessionCompat.a(bundle);
                h hVar = h.this;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                e f10 = hVar.f(str, i10, bundle2);
                if (f10 == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(f10.f4039a, f10.f4040b);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.g(str, new n(result));
            }
        }

        h() {
        }

        public void a(String str, Bundle bundle) {
            e(str, bundle);
            c(str, bundle);
        }

        public void b(MediaSessionCompat.Token token) {
            d.this.f4026g.a(new a(token));
        }

        /* access modifiers changed from: package-private */
        public void c(String str, Bundle bundle) {
            d.this.f4026g.post(new c(str, bundle));
        }

        /* access modifiers changed from: package-private */
        public void d(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.d> list = fVar.f4047g.get(str);
            if (list != null) {
                for (androidx.core.util.d dVar : list) {
                    if (c.b(bundle, (Bundle) dVar.f3081b)) {
                        d.this.n(str, fVar, (Bundle) dVar.f3081b, bundle);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(String str, Bundle bundle) {
            this.f4052b.notifyChildrenChanged(str);
        }

        public e f(String str, int i10, Bundle bundle) {
            int i11;
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i11 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.f4053c = new Messenger(d.this.f4026g);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                androidx.core.app.f.b(bundle2, "extra_messenger", this.f4053c.getBinder());
                MediaSessionCompat.Token token = d.this.f4027h;
                if (token != null) {
                    android.support.v4.media.session.b d10 = token.d();
                    if (d10 == null) {
                        iBinder = null;
                    } else {
                        iBinder = d10.asBinder();
                    }
                    androidx.core.app.f.b(bundle2, "extra_session_binder", iBinder);
                } else {
                    this.f4051a.add(bundle2);
                }
                int i12 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i11 = i12;
            }
            f fVar = new f(str, i11, i10, bundle, (p) null);
            d dVar = d.this;
            dVar.f4025f = fVar;
            e f10 = dVar.f(str, i10, bundle);
            d dVar2 = d.this;
            dVar2.f4025f = null;
            if (f10 == null) {
                return null;
            }
            if (this.f4053c != null) {
                dVar2.f4023c.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = f10.c();
            } else if (f10.c() != null) {
                bundle2.putAll(f10.c());
            }
            return new e(f10.d(), bundle2);
        }

        public void g(String str, n<List<Parcel>> nVar) {
            b bVar = new b(str, nVar);
            d dVar = d.this;
            dVar.f4025f = dVar.f4022b;
            dVar.g(str, bVar);
            d.this.f4025f = null;
        }

        /* access modifiers changed from: package-private */
        public void h(MediaSessionCompat.Token token) {
            if (!this.f4051a.isEmpty()) {
                android.support.v4.media.session.b d10 = token.d();
                if (d10 != null) {
                    for (Bundle b10 : this.f4051a) {
                        androidx.core.app.f.b(b10, "extra_session_binder", d10.asBinder());
                    }
                }
                this.f4051a.clear();
            }
            this.f4052b.setSessionToken((MediaSession.Token) token.g());
        }

        public IBinder onBind(Intent intent) {
            return this.f4052b.onBind(intent);
        }

        public void onCreate() {
            C0067d dVar = new C0067d(d.this);
            this.f4052b = dVar;
            dVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class i extends h {

        /* compiled from: MediaBrowserServiceCompat */
        class a extends m<MediaBrowserCompat.MediaItem> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n f4064f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, n nVar) {
                super(obj);
                this.f4064f = nVar;
            }

            public void a() {
                this.f4064f.a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void e(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f4064f.c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f4064f.c(obtain);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b extends h.C0067d {
            b(Context context) {
                super(context);
            }

            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.i(str, new n(result));
            }
        }

        i() {
            super();
        }

        public void i(String str, n<Parcel> nVar) {
            a aVar = new a(str, nVar);
            d dVar = d.this;
            dVar.f4025f = dVar.f4022b;
            dVar.i(str, aVar);
            d.this.f4025f = null;
        }

        public void onCreate() {
            b bVar = new b(d.this);
            this.f4052b = bVar;
            bVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class j extends i {

        /* compiled from: MediaBrowserServiceCompat */
        class a extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ n f4068f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ Bundle f4069g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, n nVar, Bundle bundle) {
                super(obj);
                this.f4068f = nVar;
                this.f4069g = bundle;
            }

            public void a() {
                this.f4068f.a();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: i */
            public void e(List<MediaBrowserCompat.MediaItem> list) {
                if (list == null) {
                    this.f4068f.c(null);
                    return;
                }
                if ((b() & 1) != 0) {
                    list = d.this.b(list, this.f4069g);
                }
                ArrayList arrayList = new ArrayList(list.size());
                for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                    Parcel obtain = Parcel.obtain();
                    writeToParcel.writeToParcel(obtain, 0);
                    arrayList.add(obtain);
                }
                this.f4068f.c(arrayList);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b extends i.b {
            b(Context context) {
                super(context);
            }

            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j jVar = j.this;
                d dVar = d.this;
                dVar.f4025f = dVar.f4022b;
                jVar.j(str, new n(result), bundle);
                d.this.f4025f = null;
            }
        }

        j() {
            super();
        }

        /* access modifiers changed from: package-private */
        public void e(String str, Bundle bundle) {
            if (bundle != null) {
                this.f4052b.notifyChildrenChanged(str, bundle);
            } else {
                super.e(str, bundle);
            }
        }

        public void j(String str, n<List<Parcel>> nVar, Bundle bundle) {
            a aVar = new a(str, nVar, bundle);
            d dVar = d.this;
            dVar.f4025f = dVar.f4022b;
            dVar.h(str, aVar, bundle);
            d.this.f4025f = null;
        }

        public void onCreate() {
            b bVar = new b(d.this);
            this.f4052b = bVar;
            bVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class k extends j {
        k() {
            super();
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    class l implements g {

        /* renamed from: a  reason: collision with root package name */
        private Messenger f4073a;

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f4075a;

            a(MediaSessionCompat.Token token) {
                this.f4075a = token;
            }

            public void run() {
                Iterator<f> it = d.this.f4024d.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f4046f.c(next.f4048h.d(), this.f4075a, next.f4048h.c());
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Connection for " + next.f4041a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f4077a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f4078b;

            b(String str, Bundle bundle) {
                this.f4077a = str;
                this.f4078b = bundle;
            }

            public void run() {
                for (IBinder iBinder : d.this.f4024d.keySet()) {
                    androidx.collection.a<IBinder, f> aVar = d.this.f4024d;
                    l.this.c(aVar.get(iBinder), this.f4077a, this.f4078b);
                }
            }
        }

        l() {
        }

        public void a(String str, Bundle bundle) {
            d.this.f4026g.post(new b(str, bundle));
        }

        public void b(MediaSessionCompat.Token token) {
            d.this.f4026g.post(new a(token));
        }

        /* access modifiers changed from: package-private */
        public void c(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.d> list = fVar.f4047g.get(str);
            if (list != null) {
                for (androidx.core.util.d dVar : list) {
                    if (c.b(bundle, (Bundle) dVar.f3081b)) {
                        d.this.n(str, fVar, (Bundle) dVar.f3081b, bundle);
                    }
                }
            }
        }

        public IBinder onBind(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f4073a.getBinder();
            }
            return null;
        }

        public void onCreate() {
            this.f4073a = new Messenger(d.this.f4026g);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    public static class m<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4080a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f4081b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4082c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4083d;

        /* renamed from: e  reason: collision with root package name */
        private int f4084e;

        m(Object obj) {
            this.f4080a = obj;
        }

        public void a() {
            if (this.f4081b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f4080a);
            } else if (this.f4082c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f4080a);
            } else if (!this.f4083d) {
                this.f4081b = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f4080a);
            }
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f4084e;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f4081b || this.f4082c || this.f4083d;
        }

        /* access modifiers changed from: package-private */
        public void d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f4080a);
        }

        /* access modifiers changed from: package-private */
        public void e(T t10) {
            throw null;
        }

        public void f(Bundle bundle) {
            if (this.f4082c || this.f4083d) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f4080a);
            }
            this.f4083d = true;
            d(bundle);
        }

        public void g(T t10) {
            if (this.f4082c || this.f4083d) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f4080a);
            }
            this.f4082c = true;
            e(t10);
        }

        /* access modifiers changed from: package-private */
        public void h(int i10) {
            this.f4084e = i10;
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    static class n<T> {

        /* renamed from: a  reason: collision with root package name */
        MediaBrowserService.Result f4085a;

        n(MediaBrowserService.Result result) {
            this.f4085a = result;
        }

        public void a() {
            this.f4085a.detach();
        }

        /* access modifiers changed from: package-private */
        public List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        public void c(T t10) {
            if (t10 instanceof List) {
                this.f4085a.sendResult(b((List) t10));
            } else if (t10 instanceof Parcel) {
                Parcel parcel = (Parcel) t10;
                parcel.setDataPosition(0);
                this.f4085a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f4085a.sendResult((Object) null);
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private class o {

        /* compiled from: MediaBrowserServiceCompat */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4087a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f4088b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f4089c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f4090d;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f4091f;

            a(p pVar, String str, int i10, int i11, Bundle bundle) {
                this.f4087a = pVar;
                this.f4088b = str;
                this.f4089c = i10;
                this.f4090d = i11;
                this.f4091f = bundle;
            }

            public void run() {
                IBinder asBinder = this.f4087a.asBinder();
                d.this.f4024d.remove(asBinder);
                f fVar = new f(this.f4088b, this.f4089c, this.f4090d, this.f4091f, this.f4087a);
                d dVar = d.this;
                dVar.f4025f = fVar;
                e f10 = dVar.f(this.f4088b, this.f4090d, this.f4091f);
                fVar.f4048h = f10;
                d dVar2 = d.this;
                dVar2.f4025f = null;
                if (f10 == null) {
                    Log.i("MBServiceCompat", "No root for client " + this.f4088b + " from service " + getClass().getName());
                    try {
                        this.f4087a.b();
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f4088b);
                    }
                } else {
                    try {
                        dVar2.f4024d.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (d.this.f4027h != null) {
                            this.f4087a.c(fVar.f4048h.d(), d.this.f4027h, fVar.f4048h.c());
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f4088b);
                        d.this.f4024d.remove(asBinder);
                    }
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4093a;

            b(p pVar) {
                this.f4093a = pVar;
            }

            public void run() {
                f remove = d.this.f4024d.remove(this.f4093a.asBinder());
                if (remove != null) {
                    remove.f4046f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4095a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f4096b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ IBinder f4097c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bundle f4098d;

            c(p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.f4095a = pVar;
                this.f4096b = str;
                this.f4097c = iBinder;
                this.f4098d = bundle;
            }

            public void run() {
                f fVar = d.this.f4024d.get(this.f4095a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f4096b);
                    return;
                }
                d.this.a(this.f4096b, fVar, this.f4097c, this.f4098d);
            }
        }

        /* renamed from: androidx.media.d$o$d  reason: collision with other inner class name */
        /* compiled from: MediaBrowserServiceCompat */
        class C0068d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4100a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f4101b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ IBinder f4102c;

            C0068d(p pVar, String str, IBinder iBinder) {
                this.f4100a = pVar;
                this.f4101b = str;
                this.f4102c = iBinder;
            }

            public void run() {
                f fVar = d.this.f4024d.get(this.f4100a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f4101b);
                } else if (!d.this.q(this.f4101b, fVar, this.f4102c)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f4101b + " which is not subscribed");
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4104a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f4105b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e.b f4106c;

            e(p pVar, String str, e.b bVar) {
                this.f4104a = pVar;
                this.f4105b = str;
                this.f4106c = bVar;
            }

            public void run() {
                f fVar = d.this.f4024d.get(this.f4104a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f4105b);
                    return;
                }
                d.this.o(this.f4105b, fVar, this.f4106c);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4108a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f4109b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f4110c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f4111d;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f4112f;

            f(p pVar, int i10, String str, int i11, Bundle bundle) {
                this.f4108a = pVar;
                this.f4109b = i10;
                this.f4110c = str;
                this.f4111d = i11;
                this.f4112f = bundle;
            }

            public void run() {
                f fVar;
                IBinder asBinder = this.f4108a.asBinder();
                d.this.f4024d.remove(asBinder);
                Iterator<f> it = d.this.f4023c.iterator();
                while (true) {
                    fVar = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.f4043c == this.f4109b) {
                        if (TextUtils.isEmpty(this.f4110c) || this.f4111d <= 0) {
                            fVar = new f(next.f4041a, next.f4042b, next.f4043c, this.f4112f, this.f4108a);
                        }
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = new f(this.f4110c, this.f4111d, this.f4109b, this.f4112f, this.f4108a);
                }
                d.this.f4024d.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4114a;

            g(p pVar) {
                this.f4114a = pVar;
            }

            public void run() {
                IBinder asBinder = this.f4114a.asBinder();
                f remove = d.this.f4024d.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4116a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f4117b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f4118c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ e.b f4119d;

            h(p pVar, String str, Bundle bundle, e.b bVar) {
                this.f4116a = pVar;
                this.f4117b = str;
                this.f4118c = bundle;
                this.f4119d = bVar;
            }

            public void run() {
                f fVar = d.this.f4024d.get(this.f4116a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f4117b);
                    return;
                }
                d.this.p(this.f4117b, this.f4118c, fVar, this.f4119d);
            }
        }

        /* compiled from: MediaBrowserServiceCompat */
        class i implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p f4121a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f4122b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f4123c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ e.b f4124d;

            i(p pVar, String str, Bundle bundle, e.b bVar) {
                this.f4121a = pVar;
                this.f4122b = str;
                this.f4123c = bundle;
                this.f4124d = bVar;
            }

            public void run() {
                f fVar = d.this.f4024d.get(this.f4121a.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f4122b + ", extras=" + this.f4123c);
                    return;
                }
                d.this.m(this.f4122b, this.f4123c, fVar, this.f4124d);
            }
        }

        o() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, p pVar) {
            d.this.f4026g.a(new c(pVar, str, iBinder, bundle));
        }

        public void b(String str, int i10, int i11, Bundle bundle, p pVar) {
            if (d.this.c(str, i11)) {
                d.this.f4026g.a(new a(pVar, str, i10, i11, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + str);
        }

        public void c(p pVar) {
            d.this.f4026g.a(new b(pVar));
        }

        public void d(String str, e.b bVar, p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f4026g.a(new e(pVar, str, bVar));
            }
        }

        public void e(p pVar, String str, int i10, int i11, Bundle bundle) {
            d.this.f4026g.a(new f(pVar, i11, str, i10, bundle));
        }

        public void f(String str, IBinder iBinder, p pVar) {
            d.this.f4026g.a(new C0068d(pVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, e.b bVar, p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f4026g.a(new h(pVar, str, bundle, bVar));
            }
        }

        public void h(String str, Bundle bundle, e.b bVar, p pVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f4026g.a(new i(pVar, str, bundle, bVar));
            }
        }

        public void i(p pVar) {
            d.this.f4026g.a(new g(pVar));
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private interface p {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* compiled from: MediaBrowserServiceCompat */
    private static class q implements p {

        /* renamed from: a  reason: collision with root package name */
        final Messenger f4126a;

        q(Messenger messenger) {
            this.f4126a = messenger;
        }

        private void d(int i10, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f4126a.send(obtain);
        }

        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f4126a.getBinder();
        }

        public void b() throws RemoteException {
            d(2, (Bundle) null);
        }

        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }
    }

    /* compiled from: MediaBrowserServiceCompat */
    private final class r extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final o f4127a;

        r() {
            this.f4127a = new o();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    this.f4127a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new q(message.replyTo));
                    return;
                case 2:
                    this.f4127a.c(new q(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    this.f4127a.a(data.getString("data_media_item_id"), androidx.core.app.f.a(data, "data_callback_token"), bundle2, new q(message.replyTo));
                    return;
                case 4:
                    this.f4127a.f(data.getString("data_media_item_id"), androidx.core.app.f.a(data, "data_callback_token"), new q(message.replyTo));
                    return;
                case 5:
                    this.f4127a.d(data.getString("data_media_item_id"), (e.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    o oVar = this.f4127a;
                    q qVar = new q(message.replyTo);
                    oVar.e(qVar, data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f4127a.i(new q(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    this.f4127a.g(data.getString("data_search_query"), bundle4, (e.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    this.f4127a.h(data.getString("data_custom_action"), bundle5, (e.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: " + 2 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<androidx.core.util.d> list = fVar.f4047g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (androidx.core.util.d dVar : list) {
            if (iBinder == dVar.f3080a && c.a(bundle, (Bundle) dVar.f3081b)) {
                return;
            }
        }
        list.add(new androidx.core.util.d(iBinder, bundle));
        fVar.f4047g.put(str, list);
        n(str, fVar, bundle, (Bundle) null);
        this.f4025f = fVar;
        k(str, bundle);
        this.f4025f = null;
    }

    /* access modifiers changed from: package-private */
    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    /* access modifiers changed from: package-private */
    public boolean c(String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i10)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void d(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.f4021a.a(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void e(String str, Bundle bundle, m<Bundle> mVar) {
        mVar.f((Bundle) null);
    }

    public abstract e f(String str, int i10, Bundle bundle);

    public abstract void g(String str, m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void h(String str, m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.h(1);
        g(str, mVar);
    }

    public void i(String str, m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.h(2);
        mVar.g(null);
    }

    public void j(String str, Bundle bundle, m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.h(4);
        mVar.g(null);
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(String str) {
    }

    /* access modifiers changed from: package-private */
    public void m(String str, Bundle bundle, f fVar, e.b bVar) {
        C0066d dVar = new C0066d(str, bVar);
        this.f4025f = fVar;
        e(str, bundle, dVar);
        this.f4025f = null;
        if (!dVar.c()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f4025f = fVar;
        if (bundle == null) {
            g(str, aVar);
        } else {
            h(str, aVar, bundle);
        }
        this.f4025f = null;
        if (!aVar.c()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f4041a + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public void o(String str, f fVar, e.b bVar) {
        b bVar2 = new b(str, bVar);
        this.f4025f = fVar;
        i(str, bVar2);
        this.f4025f = null;
        if (!bVar2.c()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4021a.onBind(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f4021a = new k();
        } else if (i10 >= 26) {
            this.f4021a = new j();
        } else if (i10 >= 23) {
            this.f4021a = new i();
        } else if (i10 >= 21) {
            this.f4021a = new h();
        } else {
            this.f4021a = new l();
        }
        this.f4021a.onCreate();
    }

    /* access modifiers changed from: package-private */
    public void p(String str, Bundle bundle, f fVar, e.b bVar) {
        c cVar = new c(str, bVar);
        this.f4025f = fVar;
        j(str, bundle, cVar);
        this.f4025f = null;
        if (!cVar.c()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q(String str, f fVar, IBinder iBinder) {
        boolean z10 = true;
        boolean z11 = false;
        if (iBinder == null) {
            try {
                if (fVar.f4047g.remove(str) == null) {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f4025f = fVar;
                l(str);
                this.f4025f = null;
            }
        } else {
            List list = fVar.f4047g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((androidx.core.util.d) it.next()).f3080a) {
                        it.remove();
                        z11 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f4047g.remove(str);
                }
            }
            this.f4025f = fVar;
            l(str);
            this.f4025f = null;
            return z11;
        }
    }

    public void r(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        } else if (this.f4027h == null) {
            this.f4027h = token;
            this.f4021a.b(token);
        } else {
            throw new IllegalStateException("The session token has already been set");
        }
    }
}
