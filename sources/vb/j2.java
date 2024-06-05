package vb;

import com.google.protobuf.d0;

/* compiled from: OperativeEventRequestOuterClass */
public enum j2 implements d0.c {
    OPERATIVE_EVENT_TYPE_UNSPECIFIED(0),
    OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER(1),
    OPERATIVE_EVENT_TYPE_LOAD_ERROR(2),
    OPERATIVE_EVENT_TYPE_SHOW_ERROR(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    private static final d0.d<j2> f38990h = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f38992a;

    /* compiled from: OperativeEventRequestOuterClass */
    class a implements d0.d<j2> {
        a() {
        }

        /* renamed from: b */
        public j2 a(int i10) {
            return j2.c(i10);
        }
    }

    static {
        f38990h = new a();
    }

    private j2(int i10) {
        this.f38992a = i10;
    }

    public static j2 c(int i10) {
        if (i10 == 0) {
            return OPERATIVE_EVENT_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
        }
        if (i10 == 2) {
            return OPERATIVE_EVENT_TYPE_LOAD_ERROR;
        }
        if (i10 != 3) {
            return null;
        }
        return OPERATIVE_EVENT_TYPE_SHOW_ERROR;
    }

    public final int I() {
        if (this != UNRECOGNIZED) {
            return this.f38992a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
