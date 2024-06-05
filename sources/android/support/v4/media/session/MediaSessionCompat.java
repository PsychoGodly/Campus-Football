package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.l;
import com.unity3d.services.core.device.MimeTypes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat {

    /* renamed from: d  reason: collision with root package name */
    static int f548d;

    /* renamed from: a  reason: collision with root package name */
    private final c f549a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaControllerCompat f550b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<k> f551c;

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final MediaDescriptionCompat f552a;

        /* renamed from: b  reason: collision with root package name */
        private final long f553b;

        /* renamed from: c  reason: collision with root package name */
        private MediaSession.QueueItem f554c;

        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        private static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            this((MediaSession.QueueItem) null, mediaDescriptionCompat, j10);
        }

        public static QueueItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a10 : list) {
                arrayList.add(a(a10));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.f552a;
        }

        public long d() {
            return this.f553b;
        }

        public int describeContents() {
            return 0;
        }

        public Object e() {
            MediaSession.QueueItem queueItem = this.f554c;
            if (queueItem != null || Build.VERSION.SDK_INT < 21) {
                return queueItem;
            }
            MediaSession.QueueItem a10 = b.a((MediaDescription) this.f552a.h(), this.f553b);
            this.f554c = a10;
            return a10;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f552a + ", Id=" + this.f553b + " }";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f552a.writeToParcel(parcel, i10);
            parcel.writeLong(this.f553b);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j10 != -1) {
                this.f552a = mediaDescriptionCompat;
                this.f553b = j10;
                this.f554c = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.f552a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f553b = parcel.readLong();
        }
    }

    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        ResultReceiver f555a;

        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f555a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.f555a.writeToParcel(parcel, i10);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final Object f556a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f557b;

        /* renamed from: c  reason: collision with root package name */
        private b f558c;

        /* renamed from: d  reason: collision with root package name */
        private i1.b f559d;

        class a implements Parcelable.Creator<Token> {
            a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: b */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        Token(Object obj) {
            this(obj, (b) null, (i1.b) null);
        }

        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            b M0 = b.a.M0(androidx.core.app.f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            i1.b b10 = i1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            Token token = (Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new Token(token.f557b, M0, b10);
        }

        public static Token b(Object obj) {
            return c(obj, (b) null);
        }

        public static Token c(Object obj, b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        public b d() {
            b bVar;
            synchronized (this.f556a) {
                bVar = this.f558c;
            }
            return bVar;
        }

        public int describeContents() {
            return 0;
        }

        public i1.b e() {
            i1.b bVar;
            synchronized (this.f556a) {
                bVar = this.f559d;
            }
            return bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f557b;
            if (obj2 != null) {
                Object obj3 = token.f557b;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f557b == null) {
                return true;
            } else {
                return false;
            }
        }

        public Object g() {
            return this.f557b;
        }

        public void h(b bVar) {
            synchronized (this.f556a) {
                this.f558c = bVar;
            }
        }

        public int hashCode() {
            Object obj = this.f557b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void i(i1.b bVar) {
            synchronized (this.f556a) {
                this.f559d = bVar;
            }
        }

        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.f556a) {
                b bVar = this.f558c;
                if (bVar != null) {
                    androidx.core.app.f.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", bVar.asBinder());
                }
                i1.b bVar2 = this.f559d;
                if (bVar2 != null) {
                    i1.a.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2", bVar2);
                }
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f557b, i10);
            } else {
                parcel.writeStrongBinder((IBinder) this.f557b);
            }
        }

        Token(Object obj, b bVar) {
            this(obj, bVar, (i1.b) null);
        }

        Token(Object obj, b bVar, i1.b bVar2) {
            this.f556a = new Object();
            this.f557b = obj;
            this.f558c = bVar;
            this.f559d = bVar2;
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f561a = new Object();

        /* renamed from: b  reason: collision with root package name */
        final MediaSession.Callback f562b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f563c;

        /* renamed from: d  reason: collision with root package name */
        WeakReference<c> f564d;

        /* renamed from: e  reason: collision with root package name */
        a f565e;

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f561a) {
                        cVar = (c) b.this.f564d.get();
                        bVar = b.this;
                        aVar = bVar.f565e;
                    }
                    if (cVar != null && bVar == cVar.i() && aVar != null) {
                        cVar.o((androidx.media.e) message.obj);
                        b.this.a(cVar, aVar);
                        cVar.o((androidx.media.e) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b  reason: collision with other inner class name */
        private class C0006b extends MediaSession.Callback {
            C0006b() {
            }

            private void a(c cVar) {
                cVar.o((androidx.media.e) null);
            }

            private f b() {
                f fVar;
                synchronized (b.this.f561a) {
                    fVar = (f) b.this.f564d.get();
                }
                if (fVar == null || b.this != fVar.i()) {
                    return null;
                }
                return fVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT < 28) {
                    String c10 = cVar.c();
                    if (TextUtils.isEmpty(c10)) {
                        c10 = "android.media.session.MediaController";
                    }
                    cVar.o(new androidx.media.e(c10, -1, -1));
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$f r0 = r5.b()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.v4.media.session.MediaSessionCompat.a(r7)
                    r5.c(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.getSessionToken()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.b r1 = r7.d()     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x002c:
                    androidx.core.app.f.b(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    i1.b r7 = r7.e()     // Catch:{ BadParcelableException -> 0x00b8 }
                    i1.a.c(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.b(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.c(r8, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f577h     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 == 0) goto L_0x00bf
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f577h     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f577h     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$b r6 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.c()     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.q(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$b r1 = android.support.v4.media.session.MediaSessionCompat.b.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    r1.d(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b8:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                L_0x00bf:
                    r5.a(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.b.C0006b.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle2);
                            b.this.l((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            b.this.m();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle3);
                            b.this.n(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle4);
                            b.this.o(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle5);
                            b.this.p((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.a(bundle6);
                            b.this.w((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            b.this.e(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    a(b10);
                }
            }

            public void onFastForward() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.f();
                    a(b10);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                f b10 = b();
                if (b10 == null) {
                    return false;
                }
                c(b10);
                boolean g10 = b.this.g(intent);
                a(b10);
                if (g10 || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.h();
                    a(b10);
                }
            }

            public void onPlay() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.i();
                    a(b10);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.j(str, bundle);
                    a(b10);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.k(str, bundle);
                    a(b10);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.l(uri, bundle);
                    a(b10);
                }
            }

            public void onPrepare() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.m();
                    a(b10);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.n(str, bundle);
                    a(b10);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.o(str, bundle);
                    a(b10);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                f b10 = b();
                if (b10 != null) {
                    MediaSessionCompat.a(bundle);
                    c(b10);
                    b.this.p(uri, bundle);
                    a(b10);
                }
            }

            public void onRewind() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.r();
                    a(b10);
                }
            }

            public void onSeekTo(long j10) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.s(j10);
                    a(b10);
                }
            }

            public void onSetPlaybackSpeed(float f10) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.u(f10);
                    a(b10);
                }
            }

            public void onSetRating(Rating rating) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.v(RatingCompat.a(rating));
                    a(b10);
                }
            }

            public void onSkipToNext() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.z();
                    a(b10);
                }
            }

            public void onSkipToPrevious() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.A();
                    a(b10);
                }
            }

            public void onSkipToQueueItem(long j10) {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.B(j10);
                    a(b10);
                }
            }

            public void onStop() {
                f b10 = b();
                if (b10 != null) {
                    c(b10);
                    b.this.C();
                    a(b10);
                }
            }
        }

        public b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f562b = new C0006b();
            } else {
                this.f562b = null;
            }
            this.f564d = new WeakReference<>((Object) null);
        }

        public void A() {
        }

        public void B(long j10) {
        }

        public void C() {
        }

        /* access modifiers changed from: package-private */
        public void D(c cVar, Handler handler) {
            synchronized (this.f561a) {
                this.f564d = new WeakReference<>(cVar);
                a aVar = this.f565e;
                a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages((Object) null);
                }
                if (cVar != null) {
                    if (handler != null) {
                        aVar2 = new a(handler.getLooper());
                    }
                }
                this.f565e = aVar2;
            }
        }

        /* access modifiers changed from: package-private */
        public void a(c cVar, Handler handler) {
            long j10;
            if (this.f563c) {
                boolean z10 = false;
                this.f563c = false;
                handler.removeMessages(1);
                PlaybackStateCompat b10 = cVar.b();
                if (b10 == null) {
                    j10 = 0;
                } else {
                    j10 = b10.c();
                }
                boolean z11 = b10 != null && b10.i() == 3;
                boolean z12 = (516 & j10) != 0;
                if ((j10 & 514) != 0) {
                    z10 = true;
                }
                if (z11 && z10) {
                    h();
                } else if (!z11 && z12) {
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            long j10;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f561a) {
                cVar = (c) this.f564d.get();
                aVar = this.f565e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.e r10 = cVar.r();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    a(cVar, aVar);
                } else if (this.f563c) {
                    aVar.removeMessages(1);
                    this.f563c = false;
                    PlaybackStateCompat b10 = cVar.b();
                    if (b10 == null) {
                        j10 = 0;
                    } else {
                        j10 = b10.c();
                    }
                    if ((j10 & 32) != 0) {
                        z();
                    }
                } else {
                    this.f563c = true;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, r10), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            a(cVar, aVar);
            return false;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j10) {
        }

        public void t(boolean z10) {
        }

        public void u(float f10) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i10) {
        }

        public void y(int i10) {
        }

        public void z() {
        }
    }

    interface c {
        void a(int i10);

        PlaybackStateCompat b();

        String c();

        void d(int i10);

        void e(PendingIntent pendingIntent);

        void f(b bVar, Handler handler);

        void g(int i10);

        Token getSessionToken();

        void h(boolean z10);

        b i();

        boolean isActive();

        void j(MediaMetadataCompat mediaMetadataCompat);

        void k(PendingIntent pendingIntent);

        void l(List<QueueItem> list);

        void m(int i10);

        void n(boolean z10);

        void o(androidx.media.e eVar);

        void p(PlaybackStateCompat playbackStateCompat);

        void q(androidx.media.l lVar);

        androidx.media.e r();

        void release();
    }

    static class d extends j {
        private static boolean H = true;

        class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
            }

            public void onPlaybackPositionUpdate(long j10) {
                d.this.x(18, -1, -1, Long.valueOf(j10), (Bundle) null);
            }
        }

        d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, i1.b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        /* access modifiers changed from: package-private */
        public void H(PlaybackStateCompat playbackStateCompat) {
            long h10 = playbackStateCompat.h();
            float e10 = playbackStateCompat.e();
            long d10 = playbackStateCompat.d();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.i() == 3) {
                long j10 = 0;
                if (h10 > 0) {
                    if (d10 > 0) {
                        j10 = elapsedRealtime - d10;
                        if (e10 > 0.0f && e10 != 1.0f) {
                            j10 = (long) (((float) j10) * e10);
                        }
                    }
                    h10 += j10;
                }
            }
            this.f596j.setPlaybackState(v(playbackStateCompat.i()), h10, e10);
        }

        /* access modifiers changed from: package-private */
        public void J(PendingIntent pendingIntent, ComponentName componentName) {
            if (H) {
                this.f595i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.J(pendingIntent, componentName);
            }
        }

        public void f(b bVar, Handler handler) {
            super.f(bVar, handler);
            if (bVar == null) {
                this.f596j.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f596j.setPlaybackPositionUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        public int w(long j10) {
            int w10 = super.w(j10);
            return (j10 & 256) != 0 ? w10 | 256 : w10;
        }

        /* access modifiers changed from: package-private */
        public void y(PendingIntent pendingIntent, ComponentName componentName) {
            if (H) {
                try {
                    this.f595i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    H = false;
                }
            }
            if (!H) {
                super.y(pendingIntent, componentName);
            }
        }
    }

    static class e extends d {

        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
            }

            public void onMetadataUpdate(int i10, Object obj) {
                if (i10 == 268435457 && (obj instanceof Rating)) {
                    e.this.x(19, -1, -1, RatingCompat.a(obj), (Bundle) null);
                }
            }
        }

        e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, i1.b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        public void f(b bVar, Handler handler) {
            super.f(bVar, handler);
            if (bVar == null) {
                this.f596j.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f596j.setMetadataUpdateListener(new a());
        }

        /* access modifiers changed from: package-private */
        public RemoteControlClient.MetadataEditor t(Bundle bundle) {
            RemoteControlClient.MetadataEditor t10 = super.t(bundle);
            PlaybackStateCompat playbackStateCompat = this.f607u;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.c()) & 128) != 0) {
                t10.addEditableKey(268435457);
            }
            if (bundle == null) {
                return t10;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                t10.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                t10.putObject(101, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                t10.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return t10;
        }

        /* access modifiers changed from: package-private */
        public int w(long j10) {
            int w10 = super.w(j10);
            return (j10 & 128) != 0 ? w10 | 512 : w10;
        }
    }

    static class f implements c {

        /* renamed from: a  reason: collision with root package name */
        final MediaSession f570a;

        /* renamed from: b  reason: collision with root package name */
        final Token f571b;

        /* renamed from: c  reason: collision with root package name */
        final Object f572c = new Object();

        /* renamed from: d  reason: collision with root package name */
        Bundle f573d;

        /* renamed from: e  reason: collision with root package name */
        boolean f574e = false;

        /* renamed from: f  reason: collision with root package name */
        final RemoteCallbackList<a> f575f = new RemoteCallbackList<>();

        /* renamed from: g  reason: collision with root package name */
        PlaybackStateCompat f576g;

        /* renamed from: h  reason: collision with root package name */
        List<QueueItem> f577h;

        /* renamed from: i  reason: collision with root package name */
        MediaMetadataCompat f578i;

        /* renamed from: j  reason: collision with root package name */
        int f579j;

        /* renamed from: k  reason: collision with root package name */
        boolean f580k;

        /* renamed from: l  reason: collision with root package name */
        int f581l;

        /* renamed from: m  reason: collision with root package name */
        int f582m;

        /* renamed from: n  reason: collision with root package name */
        b f583n;

        /* renamed from: o  reason: collision with root package name */
        l f584o;

        /* renamed from: p  reason: collision with root package name */
        androidx.media.e f585p;

        class a extends b.a {
            a() {
            }

            public void B(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void B0(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public boolean C() {
                throw new AssertionError();
            }

            public void D(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public PendingIntent F() {
                throw new AssertionError();
            }

            public void F0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public int H() {
                return f.this.f579j;
            }

            public void H0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            public void K(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public int R0() {
                return f.this.f582m;
            }

            public void T0(int i10) {
                throw new AssertionError();
            }

            public boolean U0() {
                return f.this.f580k;
            }

            public void W0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public CharSequence X() {
                throw new AssertionError();
            }

            public List<QueueItem> Z0() {
                return null;
            }

            public void a() throws RemoteException {
                throw new AssertionError();
            }

            public void a1() throws RemoteException {
                throw new AssertionError();
            }

            public PlaybackStateCompat b() {
                f fVar = f.this;
                return MediaSessionCompat.d(fVar.f576g, fVar.f578i);
            }

            public MediaMetadataCompat c0() {
                throw new AssertionError();
            }

            public void d(int i10) throws RemoteException {
                throw new AssertionError();
            }

            public void d0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public Bundle e() {
                if (f.this.f573d == null) {
                    return null;
                }
                return new Bundle(f.this.f573d);
            }

            public void e0(a aVar) {
                f.this.f575f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (f.this.f572c) {
                    l lVar = f.this.f584o;
                }
            }

            public void f(long j10) throws RemoteException {
                throw new AssertionError();
            }

            public void f1(long j10) {
                throw new AssertionError();
            }

            public String g() {
                throw new AssertionError();
            }

            public void g0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void g1(boolean z10) throws RemoteException {
            }

            public String getPackageName() {
                throw new AssertionError();
            }

            public void h(boolean z10) throws RemoteException {
                throw new AssertionError();
            }

            public ParcelableVolumeInfo h1() {
                throw new AssertionError();
            }

            public void i() throws RemoteException {
                throw new AssertionError();
            }

            public void i0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public long j() {
                throw new AssertionError();
            }

            public void j0() throws RemoteException {
                throw new AssertionError();
            }

            public int k() {
                return f.this.f581l;
            }

            public void k0(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public Bundle l() {
                throw new AssertionError();
            }

            public void m(int i10) throws RemoteException {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            public void q(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void r(a aVar) {
                if (!f.this.f574e) {
                    f.this.f575f.register(aVar, new androidx.media.e("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                    synchronized (f.this.f572c) {
                        l lVar = f.this.f584o;
                    }
                }
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            public boolean v() {
                return false;
            }

            public void v0(float f10) throws RemoteException {
                throw new AssertionError();
            }

            public void w(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void x(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public boolean x0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public void z(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
        }

        f(Context context, String str, i1.b bVar, Bundle bundle) {
            MediaSession s10 = s(context, str, bundle);
            this.f570a = s10;
            this.f571b = new Token(s10.getSessionToken(), new a(), bVar);
            this.f573d = bundle;
            a(3);
        }

        public void a(int i10) {
            this.f570a.setFlags(i10 | 1 | 2);
        }

        public PlaybackStateCompat b() {
            return this.f576g;
        }

        public String c() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f570a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f570a, new Object[0]);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        public void d(int i10) {
            if (this.f581l != i10) {
                this.f581l = i10;
                synchronized (this.f572c) {
                    for (int beginBroadcast = this.f575f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f575f.getBroadcastItem(beginBroadcast).p(i10);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f575f.finishBroadcast();
                }
            }
        }

        public void e(PendingIntent pendingIntent) {
            this.f570a.setSessionActivity(pendingIntent);
        }

        public void f(b bVar, Handler handler) {
            synchronized (this.f572c) {
                this.f583n = bVar;
                this.f570a.setCallback(bVar == null ? null : bVar.f562b, handler);
                if (bVar != null) {
                    bVar.D(this, handler);
                }
            }
        }

        public void g(int i10) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            this.f570a.setPlaybackToLocal(builder.build());
        }

        public Token getSessionToken() {
            return this.f571b;
        }

        public void h(boolean z10) {
            if (this.f580k != z10) {
                this.f580k = z10;
                synchronized (this.f572c) {
                    for (int beginBroadcast = this.f575f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f575f.getBroadcastItem(beginBroadcast).m0(z10);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f575f.finishBroadcast();
                }
            }
        }

        public b i() {
            b bVar;
            synchronized (this.f572c) {
                bVar = this.f583n;
            }
            return bVar;
        }

        public boolean isActive() {
            return this.f570a.isActive();
        }

        public void j(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f578i = mediaMetadataCompat;
            MediaSession mediaSession = this.f570a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.h();
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        public void k(PendingIntent pendingIntent) {
            this.f570a.setMediaButtonReceiver(pendingIntent);
        }

        public void l(List<QueueItem> list) {
            this.f577h = list;
            if (list == null) {
                this.f570a.setQueue((List) null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (QueueItem e10 : list) {
                arrayList.add((MediaSession.QueueItem) e10.e());
            }
            this.f570a.setQueue(arrayList);
        }

        public void m(int i10) {
            if (this.f582m != i10) {
                this.f582m = i10;
                synchronized (this.f572c) {
                    for (int beginBroadcast = this.f575f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f575f.getBroadcastItem(beginBroadcast).V0(i10);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f575f.finishBroadcast();
                }
            }
        }

        public void n(boolean z10) {
            this.f570a.setActive(z10);
        }

        public void o(androidx.media.e eVar) {
            synchronized (this.f572c) {
                this.f585p = eVar;
            }
        }

        public void p(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f576g = playbackStateCompat;
            synchronized (this.f572c) {
                for (int beginBroadcast = this.f575f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f575f.getBroadcastItem(beginBroadcast).v1(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f575f.finishBroadcast();
            }
            MediaSession mediaSession = this.f570a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.g();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        public void q(androidx.media.l lVar) {
            this.f570a.setPlaybackToRemote((VolumeProvider) lVar.d());
        }

        public androidx.media.e r() {
            androidx.media.e eVar;
            synchronized (this.f572c) {
                eVar = this.f585p;
            }
            return eVar;
        }

        public void release() {
            this.f574e = true;
            this.f575f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f570a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f570a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception e10) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                }
            }
            this.f570a.setCallback((MediaSession.Callback) null);
            this.f570a.release();
        }

        public MediaSession s(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }
    }

    static class g extends f {
        g(Context context, String str, i1.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }
    }

    static class h extends g {
        h(Context context, String str, i1.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        public void o(androidx.media.e eVar) {
        }

        public final androidx.media.e r() {
            return new androidx.media.e(this.f570a.getCurrentControllerInfo());
        }
    }

    static class i extends h {
        i(Context context, String str, i1.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        public MediaSession s(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    static class j implements c {
        int A;
        int B;
        Bundle C;
        int D;
        int E;
        androidx.media.l F;
        private l.d G = new a();

        /* renamed from: a  reason: collision with root package name */
        private final Context f587a;

        /* renamed from: b  reason: collision with root package name */
        private final ComponentName f588b;

        /* renamed from: c  reason: collision with root package name */
        private final PendingIntent f589c;

        /* renamed from: d  reason: collision with root package name */
        private final c f590d;

        /* renamed from: e  reason: collision with root package name */
        private final Token f591e;

        /* renamed from: f  reason: collision with root package name */
        final String f592f;

        /* renamed from: g  reason: collision with root package name */
        final Bundle f593g;

        /* renamed from: h  reason: collision with root package name */
        final String f594h;

        /* renamed from: i  reason: collision with root package name */
        final AudioManager f595i;

        /* renamed from: j  reason: collision with root package name */
        final RemoteControlClient f596j;

        /* renamed from: k  reason: collision with root package name */
        final Object f597k = new Object();

        /* renamed from: l  reason: collision with root package name */
        final RemoteCallbackList<a> f598l = new RemoteCallbackList<>();

        /* renamed from: m  reason: collision with root package name */
        private d f599m;

        /* renamed from: n  reason: collision with root package name */
        boolean f600n = false;

        /* renamed from: o  reason: collision with root package name */
        boolean f601o = false;

        /* renamed from: p  reason: collision with root package name */
        volatile b f602p;

        /* renamed from: q  reason: collision with root package name */
        private androidx.media.e f603q;

        /* renamed from: r  reason: collision with root package name */
        l f604r;

        /* renamed from: s  reason: collision with root package name */
        int f605s = 3;

        /* renamed from: t  reason: collision with root package name */
        MediaMetadataCompat f606t;

        /* renamed from: u  reason: collision with root package name */
        PlaybackStateCompat f607u;

        /* renamed from: v  reason: collision with root package name */
        PendingIntent f608v;

        /* renamed from: w  reason: collision with root package name */
        List<QueueItem> f609w;

        /* renamed from: x  reason: collision with root package name */
        CharSequence f610x;

        /* renamed from: y  reason: collision with root package name */
        int f611y;

        /* renamed from: z  reason: collision with root package name */
        boolean f612z;

        class a extends l.d {
            a() {
            }

            public void a(androidx.media.l lVar) {
                if (j.this.F == lVar) {
                    j jVar = j.this;
                    j.this.G(new ParcelableVolumeInfo(jVar.D, jVar.E, lVar.c(), lVar.b(), lVar.a()));
                }
            }
        }

        private static final class b {

            /* renamed from: a  reason: collision with root package name */
            public final String f614a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f615b;

            /* renamed from: c  reason: collision with root package name */
            public final ResultReceiver f616c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f614a = str;
                this.f615b = bundle;
                this.f616c = resultReceiver;
            }
        }

        class c extends b.a {
            c() {
            }

            public void B(MediaDescriptionCompat mediaDescriptionCompat) {
                D1(27, mediaDescriptionCompat);
            }

            public void B0(int i10, int i11, String str) {
                j.this.s(i10, i11);
            }

            /* access modifiers changed from: package-private */
            public void B1(int i10) {
                j.this.x(i10, 0, 0, (Object) null, (Bundle) null);
            }

            public boolean C() {
                return true;
            }

            /* access modifiers changed from: package-private */
            public void C1(int i10, int i11) {
                j.this.x(i10, i11, 0, (Object) null, (Bundle) null);
            }

            public void D(MediaDescriptionCompat mediaDescriptionCompat) {
                D1(25, mediaDescriptionCompat);
            }

            /* access modifiers changed from: package-private */
            public void D1(int i10, Object obj) {
                j.this.x(i10, 0, 0, obj, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void E1(int i10, Object obj, int i11) {
                j.this.x(i10, i11, 0, obj, (Bundle) null);
            }

            public PendingIntent F() {
                PendingIntent pendingIntent;
                synchronized (j.this.f597k) {
                    pendingIntent = j.this.f608v;
                }
                return pendingIntent;
            }

            public void F0(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                F1(31, ratingCompat, bundle);
            }

            /* access modifiers changed from: package-private */
            public void F1(int i10, Object obj, Bundle bundle) {
                j.this.x(i10, 0, 0, obj, bundle);
            }

            public int H() {
                return j.this.f611y;
            }

            public void H0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                E1(26, mediaDescriptionCompat, i10);
            }

            public void K(String str, Bundle bundle) throws RemoteException {
                F1(5, str, bundle);
            }

            public int R0() {
                return j.this.B;
            }

            public void T0(int i10) {
                C1(28, i10);
            }

            public boolean U0() {
                return j.this.f612z;
            }

            public void W0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver;
                if (resultReceiverWrapper == null) {
                    resultReceiver = null;
                } else {
                    resultReceiver = resultReceiverWrapper.f555a;
                }
                D1(1, new b(str, bundle, resultReceiver));
            }

            public CharSequence X() {
                return j.this.f610x;
            }

            public List<QueueItem> Z0() {
                List<QueueItem> list;
                synchronized (j.this.f597k) {
                    list = j.this.f609w;
                }
                return list;
            }

            public void a() throws RemoteException {
                B1(3);
            }

            public void a1() throws RemoteException {
                B1(17);
            }

            public PlaybackStateCompat b() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.f597k) {
                    j jVar = j.this;
                    playbackStateCompat = jVar.f607u;
                    mediaMetadataCompat = jVar.f606t;
                }
                return MediaSessionCompat.d(playbackStateCompat, mediaMetadataCompat);
            }

            public MediaMetadataCompat c0() {
                return j.this.f606t;
            }

            public void d(int i10) throws RemoteException {
                C1(23, i10);
            }

            public void d0(String str, Bundle bundle) throws RemoteException {
                F1(4, str, bundle);
            }

            public Bundle e() {
                if (j.this.f593g == null) {
                    return null;
                }
                return new Bundle(j.this.f593g);
            }

            public void e0(a aVar) {
                j.this.f598l.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (j.this.f597k) {
                    l lVar = j.this.f604r;
                }
            }

            public void f(long j10) throws RemoteException {
                D1(18, Long.valueOf(j10));
            }

            public void f1(long j10) {
                D1(11, Long.valueOf(j10));
            }

            public String g() {
                return j.this.f594h;
            }

            public void g0(String str, Bundle bundle) throws RemoteException {
                F1(8, str, bundle);
            }

            public void g1(boolean z10) throws RemoteException {
            }

            public String getPackageName() {
                return j.this.f592f;
            }

            public void h(boolean z10) throws RemoteException {
                D1(29, Boolean.valueOf(z10));
            }

            public ParcelableVolumeInfo h1() {
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                synchronized (j.this.f597k) {
                    j jVar = j.this;
                    i10 = jVar.D;
                    i11 = jVar.E;
                    androidx.media.l lVar = jVar.F;
                    i12 = 2;
                    if (i10 == 2) {
                        int c10 = lVar.c();
                        int b10 = lVar.b();
                        i13 = lVar.a();
                        i14 = b10;
                        i12 = c10;
                    } else {
                        i14 = jVar.f595i.getStreamMaxVolume(i11);
                        i13 = j.this.f595i.getStreamVolume(i11);
                    }
                }
                return new ParcelableVolumeInfo(i10, i11, i12, i14, i13);
            }

            public void i() throws RemoteException {
                B1(7);
            }

            public void i0(String str, Bundle bundle) throws RemoteException {
                F1(9, str, bundle);
            }

            public long j() {
                long j10;
                synchronized (j.this.f597k) {
                    j10 = (long) j.this.f605s;
                }
                return j10;
            }

            public void j0() throws RemoteException {
                B1(16);
            }

            public int k() {
                return j.this.A;
            }

            public void k0(Uri uri, Bundle bundle) throws RemoteException {
                F1(10, uri, bundle);
            }

            public Bundle l() {
                Bundle bundle;
                synchronized (j.this.f597k) {
                    bundle = j.this.C;
                }
                return bundle;
            }

            public void m(int i10) throws RemoteException {
                C1(30, i10);
            }

            public void next() throws RemoteException {
                B1(14);
            }

            public void pause() throws RemoteException {
                B1(12);
            }

            public void previous() throws RemoteException {
                B1(15);
            }

            public void q(String str, Bundle bundle) throws RemoteException {
                F1(20, str, bundle);
            }

            public void r(a aVar) {
                if (j.this.f600n) {
                    try {
                        aVar.G0();
                    } catch (Exception unused) {
                    }
                } else {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    j.this.f598l.register(aVar, new androidx.media.e(j.this.u(callingUid), callingPid, callingUid));
                    synchronized (j.this.f597k) {
                        l lVar = j.this.f604r;
                    }
                }
            }

            public void stop() throws RemoteException {
                B1(13);
            }

            public boolean v() {
                return false;
            }

            public void v0(float f10) throws RemoteException {
                D1(32, Float.valueOf(f10));
            }

            public void w(RatingCompat ratingCompat) throws RemoteException {
                D1(19, ratingCompat);
            }

            public void x(int i10, int i11, String str) {
                j.this.I(i10, i11);
            }

            public boolean x0(KeyEvent keyEvent) {
                D1(21, keyEvent);
                return true;
            }

            public void z(Uri uri, Bundle bundle) throws RemoteException {
                F1(6, uri, bundle);
            }
        }

        class d extends Handler {
            public d(Looper looper) {
                super(looper);
            }

            private void a(KeyEvent keyEvent, b bVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = j.this.f607u;
                    long c10 = playbackStateCompat == null ? 0 : playbackStateCompat.c();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((c10 & 1) != 0) {
                                            bVar.C();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((c10 & 32) != 0) {
                                            bVar.z();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((c10 & 16) != 0) {
                                            bVar.A();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((c10 & 8) != 0) {
                                            bVar.r();
                                            return;
                                        }
                                        return;
                                    case 90:
                                        if ((c10 & 64) != 0) {
                                            bVar.f();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((c10 & 2) != 0) {
                                bVar.h();
                                return;
                            } else {
                                return;
                            }
                        } else if ((c10 & 4) != 0) {
                            bVar.i();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            public void handleMessage(Message message) {
                b bVar = j.this.f602p;
                if (bVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.a(data);
                    j.this.o(new androidx.media.e(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.a(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                b bVar2 = (b) message.obj;
                                bVar.d(bVar2.f614a, bVar2.f615b, bVar2.f616c);
                                break;
                            case 2:
                                j.this.s(message.arg1, 0);
                                break;
                            case 3:
                                bVar.m();
                                break;
                            case 4:
                                bVar.n((String) message.obj, bundle);
                                break;
                            case 5:
                                bVar.o((String) message.obj, bundle);
                                break;
                            case 6:
                                bVar.p((Uri) message.obj, bundle);
                                break;
                            case 7:
                                bVar.i();
                                break;
                            case 8:
                                bVar.j((String) message.obj, bundle);
                                break;
                            case 9:
                                bVar.k((String) message.obj, bundle);
                                break;
                            case 10:
                                bVar.l((Uri) message.obj, bundle);
                                break;
                            case 11:
                                bVar.B(((Long) message.obj).longValue());
                                break;
                            case 12:
                                bVar.h();
                                break;
                            case 13:
                                bVar.C();
                                break;
                            case 14:
                                bVar.z();
                                break;
                            case 15:
                                bVar.A();
                                break;
                            case 16:
                                bVar.f();
                                break;
                            case 17:
                                bVar.r();
                                break;
                            case 18:
                                bVar.s(((Long) message.obj).longValue());
                                break;
                            case 19:
                                bVar.v((RatingCompat) message.obj);
                                break;
                            case 20:
                                bVar.e((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!bVar.g(intent)) {
                                    a(keyEvent, bVar);
                                    break;
                                }
                                break;
                            case 22:
                                j.this.I(message.arg1, 0);
                                break;
                            case 23:
                                bVar.x(message.arg1);
                                break;
                            case 25:
                                bVar.b((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                bVar.c((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                bVar.q((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                List<QueueItem> list = j.this.f609w;
                                if (list != null) {
                                    int i10 = message.arg1;
                                    QueueItem queueItem = (i10 < 0 || i10 >= list.size()) ? null : j.this.f609w.get(message.arg1);
                                    if (queueItem != null) {
                                        bVar.q(queueItem.c());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                bVar.t(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                bVar.y(message.arg1);
                                break;
                            case 31:
                                bVar.w((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                bVar.u(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        j.this.o((androidx.media.e) null);
                    }
                }
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, i1.b bVar, Bundle bundle) {
            if (componentName != null) {
                this.f587a = context;
                this.f592f = context.getPackageName();
                this.f593g = bundle;
                this.f595i = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                this.f594h = str;
                this.f588b = componentName;
                this.f589c = pendingIntent;
                c cVar = new c();
                this.f590d = cVar;
                this.f591e = new Token(cVar, (b) null, bVar);
                this.f611y = 0;
                this.D = 1;
                this.E = 3;
                this.f596j = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        private void A(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).J0(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
            }
        }

        private void B(List<QueueItem> list) {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).V(list);
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
            }
        }

        private void C(int i10) {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).p(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
            }
        }

        private void D() {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).G0();
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
                this.f598l.kill();
            }
        }

        private void E(int i10) {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).V0(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
            }
        }

        private void F(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).v1(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
            }
        }

        private void z(boolean z10) {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).m0(z10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
            }
        }

        /* access modifiers changed from: package-private */
        public void G(ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.f597k) {
                for (int beginBroadcast = this.f598l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f598l.getBroadcastItem(beginBroadcast).z1(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                }
                this.f598l.finishBroadcast();
            }
        }

        /* access modifiers changed from: package-private */
        public void H(PlaybackStateCompat playbackStateCompat) {
            this.f596j.setPlaybackState(v(playbackStateCompat.i()));
        }

        /* access modifiers changed from: package-private */
        public void I(int i10, int i11) {
            if (this.D == 2) {
                androidx.media.l lVar = this.F;
                if (lVar != null) {
                    lVar.f(i10);
                    return;
                }
                return;
            }
            this.f595i.setStreamVolume(this.E, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public void J(PendingIntent pendingIntent, ComponentName componentName) {
            this.f595i.unregisterMediaButtonEventReceiver(componentName);
        }

        /* access modifiers changed from: package-private */
        public void K() {
            if (this.f601o) {
                y(this.f589c, this.f588b);
                this.f595i.registerRemoteControlClient(this.f596j);
                j(this.f606t);
                p(this.f607u);
                return;
            }
            J(this.f589c, this.f588b);
            this.f596j.setPlaybackState(0);
            this.f595i.unregisterRemoteControlClient(this.f596j);
        }

        public void a(int i10) {
            synchronized (this.f597k) {
                this.f605s = i10 | 1 | 2;
            }
        }

        public PlaybackStateCompat b() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f597k) {
                playbackStateCompat = this.f607u;
            }
            return playbackStateCompat;
        }

        public String c() {
            return null;
        }

        public void d(int i10) {
            if (this.A != i10) {
                this.A = i10;
                C(i10);
            }
        }

        public void e(PendingIntent pendingIntent) {
            synchronized (this.f597k) {
                this.f608v = pendingIntent;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void f(android.support.v4.media.session.MediaSessionCompat.b r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f597k
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$j$d r1 = r4.f599m     // Catch:{ all -> 0x0037 }
                r2 = 0
                if (r1 == 0) goto L_0x000b
                r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0037 }
            L_0x000b:
                if (r5 == 0) goto L_0x001a
                if (r6 != 0) goto L_0x0010
                goto L_0x001a
            L_0x0010:
                android.support.v4.media.session.MediaSessionCompat$j$d r1 = new android.support.v4.media.session.MediaSessionCompat$j$d     // Catch:{ all -> 0x0037 }
                android.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x0037 }
                r1.<init>(r3)     // Catch:{ all -> 0x0037 }
                goto L_0x001b
            L_0x001a:
                r1 = r2
            L_0x001b:
                r4.f599m = r1     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f602p     // Catch:{ all -> 0x0037 }
                if (r1 == r5) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f602p     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$b r1 = r4.f602p     // Catch:{ all -> 0x0037 }
                r1.D(r2, r2)     // Catch:{ all -> 0x0037 }
            L_0x002a:
                r4.f602p = r5     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f602p     // Catch:{ all -> 0x0037 }
                if (r5 == 0) goto L_0x0035
                android.support.v4.media.session.MediaSessionCompat$b r5 = r4.f602p     // Catch:{ all -> 0x0037 }
                r5.D(r4, r6)     // Catch:{ all -> 0x0037 }
            L_0x0035:
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                return
            L_0x0037:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.f(android.support.v4.media.session.MediaSessionCompat$b, android.os.Handler):void");
        }

        public void g(int i10) {
            androidx.media.l lVar = this.F;
            if (lVar != null) {
                lVar.g((l.d) null);
            }
            this.E = i10;
            this.D = 1;
            int i11 = this.D;
            int i12 = this.E;
            G(new ParcelableVolumeInfo(i11, i12, 2, this.f595i.getStreamMaxVolume(i12), this.f595i.getStreamVolume(this.E)));
        }

        public Token getSessionToken() {
            return this.f591e;
        }

        public void h(boolean z10) {
            if (this.f612z != z10) {
                this.f612z = z10;
                z(z10);
            }
        }

        public b i() {
            b bVar;
            synchronized (this.f597k) {
                bVar = this.f602p;
            }
            return bVar;
        }

        public boolean isActive() {
            return this.f601o;
        }

        public void j(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.f548d).a();
            }
            synchronized (this.f597k) {
                this.f606t = mediaMetadataCompat;
            }
            A(mediaMetadataCompat);
            if (this.f601o) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.d();
                }
                t(bundle).apply();
            }
        }

        public void k(PendingIntent pendingIntent) {
        }

        public void l(List<QueueItem> list) {
            this.f609w = list;
            B(list);
        }

        public void m(int i10) {
            if (this.B != i10) {
                this.B = i10;
                E(i10);
            }
        }

        public void n(boolean z10) {
            if (z10 != this.f601o) {
                this.f601o = z10;
                K();
            }
        }

        public void o(androidx.media.e eVar) {
            synchronized (this.f597k) {
                this.f603q = eVar;
            }
        }

        public void p(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f597k) {
                this.f607u = playbackStateCompat;
            }
            F(playbackStateCompat);
            if (this.f601o) {
                if (playbackStateCompat == null) {
                    this.f596j.setPlaybackState(0);
                    this.f596j.setTransportControlFlags(0);
                    return;
                }
                H(playbackStateCompat);
                this.f596j.setTransportControlFlags(w(playbackStateCompat.c()));
            }
        }

        public void q(androidx.media.l lVar) {
            if (lVar != null) {
                androidx.media.l lVar2 = this.F;
                if (lVar2 != null) {
                    lVar2.g((l.d) null);
                }
                this.D = 2;
                this.F = lVar;
                G(new ParcelableVolumeInfo(this.D, this.E, this.F.c(), this.F.b(), this.F.a()));
                lVar.g(this.G);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        public androidx.media.e r() {
            androidx.media.e eVar;
            synchronized (this.f597k) {
                eVar = this.f603q;
            }
            return eVar;
        }

        public void release() {
            this.f601o = false;
            this.f600n = true;
            K();
            D();
            f((b) null, (Handler) null);
        }

        /* access modifiers changed from: package-private */
        public void s(int i10, int i11) {
            if (this.D == 2) {
                androidx.media.l lVar = this.F;
                if (lVar != null) {
                    lVar.e(i10);
                    return;
                }
                return;
            }
            this.f595i.adjustStreamVolume(this.E, i10, i11);
        }

        /* access modifiers changed from: package-private */
        public RemoteControlClient.MetadataEditor t(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f596j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        /* access modifiers changed from: package-private */
        public String u(int i10) {
            String nameForUid = this.f587a.getPackageManager().getNameForUid(i10);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        /* access modifiers changed from: package-private */
        public int v(int i10) {
            switch (i10) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        /* access modifiers changed from: package-private */
        public int w(long j10) {
            int i10 = (1 & j10) != 0 ? 32 : 0;
            if ((2 & j10) != 0) {
                i10 |= 16;
            }
            if ((4 & j10) != 0) {
                i10 |= 4;
            }
            if ((8 & j10) != 0) {
                i10 |= 2;
            }
            if ((16 & j10) != 0) {
                i10 |= 1;
            }
            if ((32 & j10) != 0) {
                i10 |= 128;
            }
            if ((64 & j10) != 0) {
                i10 |= 64;
            }
            return (j10 & 512) != 0 ? i10 | 8 : i10;
        }

        /* access modifiers changed from: package-private */
        public void x(int i10, int i11, int i12, Object obj, Bundle bundle) {
            synchronized (this.f597k) {
                d dVar = this.f599m;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i10, i11, i12, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", u(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void y(PendingIntent pendingIntent, ComponentName componentName) {
            this.f595i.registerMediaButtonEventReceiver(componentName);
        }
    }

    public interface k {
        void a();
    }

    static final class l extends Handler {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j10 = -1;
        if (playbackStateCompat.h() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.i() != 3 && playbackStateCompat.i() != 4 && playbackStateCompat.i() != 5) {
            return playbackStateCompat;
        }
        long d10 = playbackStateCompat.d();
        if (d10 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long e10 = ((long) (playbackStateCompat.e() * ((float) (elapsedRealtime - d10)))) + playbackStateCompat.h();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j10 = mediaMetadataCompat.g("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.d(playbackStateCompat).h(playbackStateCompat.i(), (j10 < 0 || e10 <= j10) ? e10 < 0 ? 0 : e10 : j10, playbackStateCompat.e(), elapsedRealtime).b();
    }

    public static Bundle u(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public MediaControllerCompat b() {
        return this.f550b;
    }

    public Token c() {
        return this.f549a.getSessionToken();
    }

    public boolean e() {
        return this.f549a.isActive();
    }

    public void f() {
        this.f549a.release();
    }

    public void g(boolean z10) {
        this.f549a.n(z10);
        Iterator<k> it = this.f551c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void h(b bVar) {
        i(bVar, (Handler) null);
    }

    public void i(b bVar, Handler handler) {
        if (bVar == null) {
            this.f549a.f((b) null, (Handler) null);
            return;
        }
        c cVar = this.f549a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.f(bVar, handler);
    }

    public void j(boolean z10) {
        this.f549a.h(z10);
    }

    public void k(int i10) {
        this.f549a.a(i10);
    }

    public void l(PendingIntent pendingIntent) {
        this.f549a.k(pendingIntent);
    }

    public void m(MediaMetadataCompat mediaMetadataCompat) {
        this.f549a.j(mediaMetadataCompat);
    }

    public void n(PlaybackStateCompat playbackStateCompat) {
        this.f549a.p(playbackStateCompat);
    }

    public void o(int i10) {
        this.f549a.g(i10);
    }

    public void p(androidx.media.l lVar) {
        if (lVar != null) {
            this.f549a.q(lVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void q(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem next : list) {
                if (next != null) {
                    if (hashSet.contains(Long.valueOf(next.d()))) {
                        Log.e("MediaSessionCompat", "Found duplicate queue id: " + next.d(), new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(next.d()));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        this.f549a.l(list);
    }

    public void r(int i10) {
        this.f549a.d(i10);
    }

    public void s(PendingIntent pendingIntent) {
        this.f549a.e(pendingIntent);
    }

    public void t(int i10) {
        this.f549a.m(i10);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (i1.b) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, i1.b bVar) {
        this.f551c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = s0.a.a(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            ComponentName componentName2 = componentName;
            if (componentName2 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                if (i10 >= 29) {
                    this.f549a = new i(context, str, bVar, bundle);
                } else if (i10 >= 28) {
                    this.f549a = new h(context, str, bVar, bundle);
                } else if (i10 >= 22) {
                    this.f549a = new g(context, str, bVar, bundle);
                } else {
                    this.f549a = new f(context, str, bVar, bundle);
                }
                i(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f549a.k(pendingIntent2);
            } else if (i10 >= 19) {
                this.f549a = new e(context, str, componentName2, pendingIntent2, bVar, bundle);
            } else if (i10 >= 18) {
                this.f549a = new d(context, str, componentName2, pendingIntent2, bVar, bundle);
            } else {
                this.f549a = new j(context, str, componentName2, pendingIntent2, bVar, bundle);
            }
            this.f550b = new MediaControllerCompat(context, this);
            if (f548d == 0) {
                f548d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
