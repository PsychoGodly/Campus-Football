package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: IntentSenderRequest.kt */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final c f745f = new c((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f746a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f747b;

    /* renamed from: c  reason: collision with root package name */
    private final int f748c;

    /* renamed from: d  reason: collision with root package name */
    private final int f749d;

    /* compiled from: IntentSenderRequest.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final IntentSender f750a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f751b;

        /* renamed from: c  reason: collision with root package name */
        private int f752c;

        /* renamed from: d  reason: collision with root package name */
        private int f753d;

        public a(IntentSender intentSender) {
            m.e(intentSender, "intentSender");
            this.f750a = intentSender;
        }

        public final e a() {
            return new e(this.f750a, this.f751b, this.f752c, this.f753d);
        }

        public final a b(Intent intent) {
            this.f751b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f753d = i10;
            this.f752c = i11;
            return this;
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    public static final class b implements Parcelable.Creator<e> {
        b() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            m.e(parcel, "inParcel");
            return new e(parcel);
        }

        /* renamed from: b */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(h hVar) {
            this();
        }
    }

    public e(IntentSender intentSender, Intent intent, int i10, int i11) {
        m.e(intentSender, "intentSender");
        this.f746a = intentSender;
        this.f747b = intent;
        this.f748c = i10;
        this.f749d = i11;
    }

    public final Intent c() {
        return this.f747b;
    }

    public final int d() {
        return this.f748c;
    }

    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f749d;
    }

    public final IntentSender g() {
        return this.f746a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        m.e(parcel, "dest");
        parcel.writeParcelable(this.f746a, i10);
        parcel.writeParcelable(this.f747b, i10);
        parcel.writeInt(this.f748c);
        parcel.writeInt(this.f749d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            kotlin.jvm.internal.m.b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.e.<init>(android.os.Parcel):void");
    }
}
