package com.ryanheise.audioservice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.view.KeyEvent;
import androidx.core.app.l;
import androidx.media.d;
import androidx.media.l;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ta.f;
import ta.g;

public class AudioService extends androidx.media.d {
    static AudioService D;
    private static PendingIntent E;
    /* access modifiers changed from: private */
    public static e F;
    private static List<MediaSessionCompat.QueueItem> G = new ArrayList();
    private static final Map<String, MediaMetadataCompat> H = new HashMap();
    private boolean A;
    private final Handler B = new Handler(Looper.getMainLooper());
    private l C;

    /* renamed from: j  reason: collision with root package name */
    private io.flutter.embedding.engine.a f15519j;

    /* renamed from: k  reason: collision with root package name */
    private ta.c f15520k;

    /* renamed from: l  reason: collision with root package name */
    private PowerManager.WakeLock f15521l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public MediaSessionCompat f15522m;

    /* renamed from: n  reason: collision with root package name */
    private d f15523n;

    /* renamed from: o  reason: collision with root package name */
    private List<g> f15524o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private List<l.a> f15525p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private List<PlaybackStateCompat.CustomAction> f15526q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    private int[] f15527r;

    /* renamed from: s  reason: collision with root package name */
    private MediaMetadataCompat f15528s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap f15529t;

    /* renamed from: u  reason: collision with root package name */
    private String f15530u;

    /* renamed from: v  reason: collision with root package name */
    private LruCache<String, Bitmap> f15531v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f15532w = false;

    /* renamed from: x  reason: collision with root package name */
    private ta.a f15533x = ta.a.idle;

    /* renamed from: y  reason: collision with root package name */
    private int f15534y;

    /* renamed from: z  reason: collision with root package name */
    private int f15535z;

    class a extends LruCache<String, Bitmap> {
        a(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    class b extends androidx.media.l {
        b(int i10, int i11, int i12) {
            super(i10, i11, i12);
        }

        public void e(int i10) {
            if (AudioService.F != null) {
                AudioService.F.D(i10);
            }
        }

        public void f(int i10) {
            if (AudioService.F != null) {
                AudioService.F.i(i10);
            }
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15538a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ta.a[] r0 = ta.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15538a = r0
                ta.a r1 = ta.a.idle     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15538a     // Catch:{ NoSuchFieldError -> 0x001d }
                ta.a r1 = ta.a.loading     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15538a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ta.a r1 = ta.a.buffering     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15538a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ta.a r1 = ta.a.ready     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f15538a     // Catch:{ NoSuchFieldError -> 0x003e }
                ta.a r1 = ta.a.completed     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f15538a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ta.a r1 = ta.a.error     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.c.<clinit>():void");
        }
    }

    public class d extends MediaSessionCompat.b {
        public d() {
        }

        private f E(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                return f.media;
            }
            if (keyCode == 87) {
                return f.next;
            }
            if (keyCode != 88) {
                return f.media;
            }
            return f.previous;
        }

        public void A() {
            if (AudioService.F != null) {
                AudioService.F.q();
            }
        }

        public void B(long j10) {
            if (AudioService.F != null) {
                AudioService.F.l(j10);
            }
        }

        public void C() {
            if (AudioService.F != null) {
                AudioService.F.onStop();
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.F != null) {
                AudioService.F.k(AudioService.J(mediaDescriptionCompat.i()));
            }
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (AudioService.F != null) {
                AudioService.F.x(AudioService.J(mediaDescriptionCompat.i()), i10);
            }
        }

        public void e(String str, Bundle bundle) {
            if (AudioService.F != null) {
                if ("com.ryanheise.audioservice.action.STOP".equals(str)) {
                    AudioService.F.onStop();
                } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(str)) {
                    AudioService.F.z();
                } else if ("com.ryanheise.audioservice.action.REWIND".equals(str)) {
                    AudioService.F.h();
                } else {
                    AudioService.F.B(str, bundle);
                }
            }
        }

        public void f() {
            if (AudioService.F != null) {
                AudioService.F.z();
            }
        }

        public boolean g(Intent intent) {
            if (AudioService.F == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() != 0) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    h();
                    return true;
                } else if (!(keyCode == 126 || keyCode == 127)) {
                    switch (keyCode) {
                        case 85:
                        case 87:
                        case 88:
                            break;
                        case 86:
                            C();
                            return true;
                        case 89:
                            r();
                            return true;
                        case 90:
                            f();
                            return true;
                        case 91:
                            i();
                            return true;
                        default:
                            return true;
                    }
                }
            }
            AudioService.F.u(E(keyEvent));
            return true;
        }

        public void h() {
            if (AudioService.F != null) {
                AudioService.F.onPause();
            }
        }

        public void i() {
            if (AudioService.F != null) {
                AudioService.F.n();
            }
        }

        public void j(String str, Bundle bundle) {
            if (AudioService.F != null) {
                AudioService.F.y(str, bundle);
            }
        }

        public void k(String str, Bundle bundle) {
            if (AudioService.F != null) {
                AudioService.F.w(str, bundle);
            }
        }

        public void l(Uri uri, Bundle bundle) {
            if (AudioService.F != null) {
                AudioService.F.E(uri, bundle);
            }
        }

        public void m() {
            if (AudioService.F != null) {
                if (!AudioService.this.f15522m.e()) {
                    AudioService.this.f15522m.g(true);
                }
                AudioService.F.s();
            }
        }

        public void n(String str, Bundle bundle) {
            if (AudioService.F != null) {
                if (!AudioService.this.f15522m.e()) {
                    AudioService.this.f15522m.g(true);
                }
                AudioService.F.p(str, bundle);
            }
        }

        public void o(String str, Bundle bundle) {
            if (AudioService.F != null) {
                if (!AudioService.this.f15522m.e()) {
                    AudioService.this.f15522m.g(true);
                }
                AudioService.F.C(str, bundle);
            }
        }

        public void p(Uri uri, Bundle bundle) {
            if (AudioService.F != null) {
                if (!AudioService.this.f15522m.e()) {
                    AudioService.this.f15522m.g(true);
                }
                AudioService.F.t(uri, bundle);
            }
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.F != null) {
                AudioService.F.r(AudioService.J(mediaDescriptionCompat.i()));
            }
        }

        public void r() {
            if (AudioService.F != null) {
                AudioService.F.h();
            }
        }

        public void s(long j10) {
            if (AudioService.F != null) {
                AudioService.F.A(j10);
            }
        }

        public void t(boolean z10) {
            if (AudioService.F != null) {
                AudioService.F.o(z10);
            }
        }

        public void u(float f10) {
            if (AudioService.F != null) {
                AudioService.F.g(f10);
            }
        }

        public void v(RatingCompat ratingCompat) {
            if (AudioService.F != null) {
                AudioService.F.v(ratingCompat);
            }
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
            if (AudioService.F != null) {
                AudioService.F.m(ratingCompat, bundle);
            }
        }

        public void x(int i10) {
            if (AudioService.F != null) {
                AudioService.F.a(i10);
            }
        }

        public void y(int i10) {
            if (AudioService.F != null) {
                AudioService.F.b(i10);
            }
        }

        public void z() {
            if (AudioService.F != null) {
                AudioService.F.f();
            }
        }
    }

    public interface e {
        void A(long j10);

        void B(String str, Bundle bundle);

        void C(String str, Bundle bundle);

        void D(int i10);

        void E(Uri uri, Bundle bundle);

        void a(int i10);

        void b(int i10);

        void c(String str, Bundle bundle, d.m<List<MediaBrowserCompat.MediaItem>> mVar);

        void d(String str, d.m<MediaBrowserCompat.MediaItem> mVar);

        void e(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle);

        void f();

        void g(float f10);

        void h();

        void i(int i10);

        void j();

        void k(MediaMetadataCompat mediaMetadataCompat);

        void l(long j10);

        void m(RatingCompat ratingCompat, Bundle bundle);

        void n();

        void o(boolean z10);

        void onClose();

        void onDestroy();

        void onPause();

        void onStop();

        void p(String str, Bundle bundle);

        void q();

        void r(MediaMetadataCompat mediaMetadataCompat);

        void s();

        void t(Uri uri, Bundle bundle);

        void u(f fVar);

        void v(RatingCompat ratingCompat);

        void w(String str, Bundle bundle);

        void x(MediaMetadataCompat mediaMetadataCompat, int i10);

        void y(String str, Bundle bundle);

        void z();
    }

    private void C() {
        NotificationManager L = L();
        if (L.getNotificationChannel(this.f15530u) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(this.f15530u, this.f15520k.f22751d, 2);
            notificationChannel.setShowBadge(this.f15520k.f22755h);
            String str = this.f15520k.f22752e;
            if (str != null) {
                notificationChannel.setDescription(str);
            }
            L.createNotificationChannel(notificationChannel);
        }
    }

    private void F() {
        if (this.f15522m.e()) {
            this.f15522m.g(false);
        }
        L().cancel(1124);
    }

    private void G() {
        androidx.core.content.a.startForegroundService(this, new Intent(this, AudioService.class));
        if (!this.f15522m.e()) {
            this.f15522m.g(true);
        }
        v();
        this.f15522m.s(E);
        Q();
    }

    private void H() {
        R(false);
        W();
    }

    private void I() {
        if (this.f15520k.f22758k) {
            H();
        }
    }

    static MediaMetadataCompat J(String str) {
        return H.get(str);
    }

    private l.e K() {
        if (Build.VERSION.SDK_INT >= 26) {
            C();
        }
        l.e s10 = new l.e(this, this.f15530u).M(1).F(false).s(w());
        s10.G(N(this.f15520k.f22754g));
        return s10;
    }

    private NotificationManager L() {
        return (NotificationManager) getSystemService("notification");
    }

    public static void P(e eVar) {
        F = eVar;
    }

    private void Q() {
        startForeground(1124, y());
        this.A = true;
    }

    private void R(boolean z10) {
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(z10 ? 1 : 0);
        } else {
            stopForeground(z10);
        }
    }

    private Bundle T(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            String obj = next.getKey().toString();
            Object value = next.getValue();
            if (value instanceof Integer) {
                bundle.putInt(obj, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(obj, ((Long) value).longValue());
            } else {
                bundle.putString(obj, value.toString());
            }
        }
        return bundle;
    }

    private MediaMetadataCompat U(MediaMetadataCompat mediaMetadataCompat) {
        return new MediaMetadataCompat.b(mediaMetadataCompat).b("android.media.metadata.ALBUM_ART", this.f15529t).b("android.media.metadata.DISPLAY_ICON", this.f15529t).a();
    }

    private void V() {
        if (this.f15522m != null) {
            F();
            this.f15522m.f();
            this.f15522m = null;
        }
    }

    private void W() {
        if (this.f15521l.isHeld()) {
            this.f15521l.release();
        }
    }

    public static int c0(long j10) {
        if (j10 == 4) {
            return 91;
        }
        if (j10 == 2) {
            return 130;
        }
        return PlaybackStateCompat.j(j10);
    }

    /* access modifiers changed from: private */
    public void d0() {
        if (this.A) {
            L().notify(1124, y());
        }
    }

    private void v() {
        if (!this.f15521l.isHeld()) {
            this.f15521l.acquire();
        }
    }

    private Notification y() {
        int[] iArr = this.f15527r;
        if (iArr == null) {
            int min = Math.min(3, this.f15525p.size());
            int[] iArr2 = new int[min];
            for (int i10 = 0; i10 < min; i10++) {
                iArr2[i10] = i10;
            }
            iArr = iArr2;
        }
        l.e K = K();
        MediaMetadataCompat mediaMetadataCompat = this.f15528s;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat e10 = mediaMetadataCompat.e();
            if (e10.l() != null) {
                K.q(e10.l());
            }
            if (e10.k() != null) {
                K.p(e10.k());
            }
            if (e10.c() != null) {
                K.J(e10.c());
            }
            synchronized (this) {
                Bitmap bitmap = this.f15529t;
                if (bitmap != null) {
                    K.x(bitmap);
                }
            }
        }
        if (this.f15520k.f22756i) {
            K.o(this.f15522m.b().b());
        }
        int i11 = this.f15520k.f22753f;
        if (i11 != -1) {
            K.m(i11);
        }
        for (l.a b10 : this.f15525p) {
            K.b(b10);
        }
        androidx.media.app.c s10 = new androidx.media.app.c().s(this.f15522m.c());
        if (Build.VERSION.SDK_INT < 33) {
            s10.t(iArr);
        }
        if (this.f15520k.f22757j) {
            s10.u(true);
            s10.r(x(1));
            K.B(true);
        }
        K.I(s10);
        return K.c();
    }

    private static int z(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    public void A(ta.c cVar) {
        this.f15520k = cVar;
        String str = cVar.f22750c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f15530u = str;
        if (cVar.f22761n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, cVar.f22761n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            int i10 = 134217728;
            if (Build.VERSION.SDK_INT >= 23) {
                i10 = 201326592;
            }
            E = PendingIntent.getActivity(applicationContext, 1000, intent, i10);
        } else {
            E = null;
        }
        if (!cVar.f22749b) {
            this.f15522m.l((PendingIntent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public l.a B(String str, String str2, long j10) {
        return new l.a(N(str), (CharSequence) str2, x(j10));
    }

    /* access modifiers changed from: package-private */
    public PlaybackStateCompat.CustomAction D(g gVar) {
        int N = N(gVar.f22769a);
        ta.e eVar = gVar.f22772d;
        if (eVar != null) {
            return new PlaybackStateCompat.CustomAction.b(eVar.f22763a, gVar.f22770b, N).b(T(gVar.f22772d.f22764b)).a();
        }
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        long j10 = gVar.f22771c;
        if (j10 == 1) {
            return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.STOP", gVar.f22770b, N).a();
        }
        if (j10 == 64) {
            return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.FAST_FORWARD", gVar.f22770b, N).a();
        }
        if (j10 == 8) {
            return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.REWIND", gVar.f22770b, N).a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public MediaMetadataCompat E(String str, String str2, String str3, String str4, String str5, Long l10, String str6, Boolean bool, String str7, String str8, String str9, RatingCompat ratingCompat, Map<?, ?> map) {
        MediaMetadataCompat.b e10 = new MediaMetadataCompat.b().e("android.media.metadata.MEDIA_ID", str).e("android.media.metadata.TITLE", str2);
        if (str3 != null) {
            e10.e("android.media.metadata.ALBUM", str3);
        }
        if (str4 != null) {
            e10.e("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            e10.e("android.media.metadata.GENRE", str5);
        }
        if (l10 != null) {
            e10.c("android.media.metadata.DURATION", l10.longValue());
        }
        if (str6 != null) {
            e10.e("android.media.metadata.DISPLAY_ICON_URI", str6);
        }
        if (bool != null) {
            e10.c("playable_long", bool.booleanValue() ? 1 : 0);
        }
        if (str7 != null) {
            e10.e("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            e10.e("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            e10.e("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        if (ratingCompat != null) {
            e10.d("android.media.metadata.RATING", ratingCompat);
        }
        if (map != null) {
            Iterator<?> it = map.keySet().iterator();
            while (it.hasNext()) {
                String str10 = (String) it.next();
                Object obj = map.get(str10);
                if (obj instanceof Long) {
                    e10.c(str10, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    e10.c(str10, (long) ((Integer) obj).intValue());
                } else if (obj instanceof String) {
                    e10.e(str10, (String) obj);
                } else if (obj instanceof Boolean) {
                    e10.c(str10, ((Boolean) obj).booleanValue() ? 1 : 0);
                } else if (obj instanceof Double) {
                    e10.e(str10, obj.toString());
                }
            }
        }
        MediaMetadataCompat a10 = e10.a();
        H.put(str, a10);
        return a10;
    }

    public int M() {
        int i10 = c.f15538a[this.f15533x.ordinal()];
        if (i10 == 2) {
            return 8;
        }
        if (i10 == 3) {
            return 6;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return i10 != 6 ? 0 : 7;
            }
            if (this.f15532w) {
                return 3;
            }
            return 2;
        } else if (this.f15532w) {
            return 3;
        } else {
            return 2;
        }
    }

    /* access modifiers changed from: package-private */
    public int N(String str) {
        String[] split = str.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH);
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    public void O() {
        e eVar = F;
        if (eVar != null) {
            eVar.onClose();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[Catch:{ Exception -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4 A[Catch:{ Exception -> 0x00b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap S(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r8.f15531v
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            r1 = 0
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r3 = "content"
            java.lang.String r4 = r2.getScheme()     // Catch:{ Exception -> 0x00b9 }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00b9 }
            r4 = -1
            if (r3 == 0) goto L_0x0064
            if (r10 == 0) goto L_0x0052
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            r5 = 29
            if (r10 < r5) goto L_0x0052
            android.util.Size r10 = new android.util.Size     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            r0 = 192(0xc0, float:2.69E-43)
            r10.<init>(r0, r0)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            android.util.Size r5 = new android.util.Size     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            ta.c r6 = r8.f15520k     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            int r6 = r6.f22759l     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r6 != r4) goto L_0x003c
            int r6 = r10.getWidth()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
        L_0x003c:
            ta.c r7 = r8.f15520k     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            int r7 = r7.f22760m     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r7 != r4) goto L_0x0046
            int r7 = r10.getHeight()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
        L_0x0046:
            r5.<init>(r6, r7)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            android.graphics.Bitmap r10 = r0.loadThumbnail(r2, r5, r1)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r10 != 0) goto L_0x0050
            return r1
        L_0x0050:
            r0 = r10
            goto L_0x0064
        L_0x0052:
            android.content.ContentResolver r10 = r8.getContentResolver()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r2, r5)     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            if (r10 == 0) goto L_0x0063
            java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch:{ FileNotFoundException | IOException -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            return r1
        L_0x0064:
            r10 = r1
        L_0x0065:
            if (r3 == 0) goto L_0x0069
            if (r10 == 0) goto L_0x00b3
        L_0x0069:
            ta.c r0 = r8.f15520k     // Catch:{ Exception -> 0x00b9 }
            int r0 = r0.f22759l     // Catch:{ Exception -> 0x00b9 }
            if (r0 == r4) goto L_0x00a4
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x00b9 }
            r0.<init>()     // Catch:{ Exception -> 0x00b9 }
            r3 = 1
            r0.inJustDecodeBounds = r3     // Catch:{ Exception -> 0x00b9 }
            if (r10 == 0) goto L_0x007d
            android.graphics.BitmapFactory.decodeFileDescriptor(r10, r1, r0)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0084
        L_0x007d:
            java.lang.String r3 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
            android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch:{ Exception -> 0x00b9 }
        L_0x0084:
            ta.c r3 = r8.f15520k     // Catch:{ Exception -> 0x00b9 }
            int r4 = r3.f22759l     // Catch:{ Exception -> 0x00b9 }
            int r3 = r3.f22760m     // Catch:{ Exception -> 0x00b9 }
            int r3 = z(r0, r4, r3)     // Catch:{ Exception -> 0x00b9 }
            r0.inSampleSize = r3     // Catch:{ Exception -> 0x00b9 }
            r3 = 0
            r0.inJustDecodeBounds = r3     // Catch:{ Exception -> 0x00b9 }
            if (r10 == 0) goto L_0x009b
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFileDescriptor(r10, r1, r0)     // Catch:{ Exception -> 0x00b9 }
        L_0x0099:
            r0 = r10
            goto L_0x00b3
        L_0x009b:
            java.lang.String r10 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFile(r10, r0)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x0099
        L_0x00a4:
            if (r10 == 0) goto L_0x00ab
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r10)     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00b3
        L_0x00ab:
            java.lang.String r10 = r2.getPath()     // Catch:{ Exception -> 0x00b9 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r10)     // Catch:{ Exception -> 0x00b9 }
        L_0x00b3:
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r10 = r8.f15531v     // Catch:{ Exception -> 0x00b9 }
            r10.put(r9, r0)     // Catch:{ Exception -> 0x00b9 }
            return r0
        L_0x00b9:
            r9 = move-exception
            r9.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.S(java.lang.String, java.lang.String):android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    public synchronized void X(MediaMetadataCompat mediaMetadataCompat) {
        String j10 = mediaMetadataCompat.j("artCacheFile");
        if (j10 != null) {
            this.f15529t = S(j10, (String) null);
            mediaMetadataCompat = U(mediaMetadataCompat);
        } else {
            String j11 = mediaMetadataCompat.j("android.media.metadata.DISPLAY_ICON_URI");
            if (j11 == null || !j11.startsWith("content:")) {
                this.f15529t = null;
            } else {
                this.f15529t = S(j11, mediaMetadataCompat.j("loadThumbnailUri"));
                mediaMetadataCompat = U(mediaMetadataCompat);
            }
        }
        this.f15528s = mediaMetadataCompat;
        this.f15522m.m(mediaMetadataCompat);
        this.B.removeCallbacksAndMessages((Object) null);
        this.B.post(new ta.b(this));
    }

    public void Y(int i10, Integer num, Integer num2, Integer num3) {
        if (i10 == 1) {
            this.f15522m.o(3);
            this.C = null;
        } else if (i10 == 2) {
            if (this.C != null && num.intValue() == this.C.c() && num2.intValue() == this.C.b()) {
                this.C.h(num3.intValue());
            } else {
                this.C = new b(num.intValue(), num2.intValue(), num3.intValue());
            }
            this.f15522m.p(this.C);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void Z(List<MediaSessionCompat.QueueItem> list) {
        G = list;
        this.f15522m.q(list);
    }

    /* access modifiers changed from: package-private */
    public void a0(List<g> list, long j10, int[] iArr, ta.a aVar, boolean z10, long j11, long j12, float f10, long j13, Integer num, String str, int i10, int i11, boolean z11, Long l10) {
        List<g> list2 = list;
        int[] iArr2 = iArr;
        ta.a aVar2 = aVar;
        boolean z12 = z10;
        String str2 = str;
        int i12 = i10;
        int i13 = i11;
        boolean z13 = true;
        boolean z14 = !Arrays.equals(iArr2, this.f15527r);
        if (list2.equals(this.f15524o)) {
            z13 = z14;
        }
        this.f15524o = list2;
        this.f15525p.clear();
        this.f15526q.clear();
        for (g next : list) {
            PlaybackStateCompat.CustomAction D2 = D(next);
            if (D2 != null) {
                this.f15526q.add(D2);
            } else {
                this.f15525p.add(B(next.f22769a, next.f22770b, next.f22771c));
            }
        }
        this.f15527r = iArr2;
        boolean z15 = this.f15532w;
        ta.a aVar3 = this.f15533x;
        this.f15533x = aVar2;
        this.f15532w = z12;
        this.f15534y = i12;
        this.f15535z = i13;
        PlaybackStateCompat.d e10 = new PlaybackStateCompat.d().c(j10 | 3669711).h(M(), j11, f10, j13).e(j12);
        for (PlaybackStateCompat.CustomAction a10 : this.f15526q) {
            e10.a(a10);
        }
        if (l10 != null) {
            e10.d(l10.longValue());
        }
        if (num != null && str2 != null) {
            e10.f(num.intValue(), str2);
        } else if (str2 != null) {
            e10.f(-987654, str2);
        }
        if (this.f15528s != null) {
            Bundle bundle = new Bundle();
            bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.f15528s.e().i());
            e10.g(bundle);
        }
        this.f15522m.n(e10.b());
        this.f15522m.r(i12);
        this.f15522m.t(i13);
        this.f15522m.j(z11);
        if (!z15 && z12) {
            G();
        } else if (z15 && !z12) {
            I();
        }
        ta.a aVar4 = ta.a.idle;
        if (aVar3 != aVar4 && aVar2 == aVar4) {
            b0();
        } else if (aVar2 != aVar4 && z13) {
            d0();
        }
    }

    public void b0() {
        F();
        stopSelf();
    }

    public d.e f(String str, int i10, Bundle bundle) {
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = Boolean.FALSE;
        }
        return new d.e(valueOf.booleanValue() ? "recent" : "root", this.f15520k.a());
    }

    public void g(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        h(str, mVar, (Bundle) null);
    }

    public void h(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        e eVar = F;
        if (eVar == null) {
            mVar.g(new ArrayList());
        } else {
            eVar.e(str, mVar, bundle);
        }
    }

    public void i(String str, d.m<MediaBrowserCompat.MediaItem> mVar) {
        e eVar = F;
        if (eVar == null) {
            mVar.g(null);
        } else {
            eVar.d(str, mVar);
        }
    }

    public void j(String str, Bundle bundle, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        e eVar = F;
        if (eVar == null) {
            mVar.g(new ArrayList());
        } else {
            eVar.c(str, bundle, mVar);
        }
    }

    public void onCreate() {
        super.onCreate();
        D = this;
        this.f15534y = 0;
        this.f15535z = 0;
        this.A = false;
        this.f15532w = false;
        this.f15533x = ta.a.idle;
        this.f15522m = new MediaSessionCompat(this, "media-session");
        A(new ta.c(getApplicationContext()));
        this.f15522m.k(4);
        this.f15522m.n(new PlaybackStateCompat.d().c(3669711).b());
        MediaSessionCompat mediaSessionCompat = this.f15522m;
        d dVar = new d();
        this.f15523n = dVar;
        mediaSessionCompat.h(dVar);
        r(this.f15522m.c());
        this.f15522m.q(G);
        this.f15521l = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f15531v = new a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        this.f15519j = a.B(this);
        System.out.println("flutterEngine warmed up");
    }

    public void onDestroy() {
        super.onDestroy();
        e eVar = F;
        if (eVar != null) {
            eVar.onDestroy();
            F = null;
        }
        this.f15528s = null;
        this.f15529t = null;
        G.clear();
        H.clear();
        this.f15524o.clear();
        this.f15531v.evictAll();
        this.f15527r = null;
        V();
        R(!this.f15520k.f22749b);
        W();
        D = null;
        this.A = false;
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        s0.a.c(this.f15522m, intent);
        return 2;
    }

    public void onTaskRemoved(Intent intent) {
        e eVar = F;
        if (eVar != null) {
            eVar.j();
        }
        super.onTaskRemoved(intent);
    }

    /* access modifiers changed from: package-private */
    public PendingIntent w() {
        Intent intent = new Intent(this, MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        return PendingIntent.getBroadcast(this, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0);
    }

    /* access modifiers changed from: package-private */
    public PendingIntent x(long j10) {
        int c02 = c0(j10);
        if (c02 == 0) {
            return null;
        }
        Intent intent = new Intent(this, MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        int i10 = 0;
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, c02));
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 67108864;
        }
        return PendingIntent.getBroadcast(this, c02, intent, i10);
    }
}
