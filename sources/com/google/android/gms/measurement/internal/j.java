package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
enum j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');
    
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final char f24714a;

    private j(char c10) {
        this.f24714a = c10;
    }

    public static j c(char c10) {
        for (j jVar : values()) {
            if (jVar.f24714a == c10) {
                return jVar;
            }
        }
        return UNSET;
    }
}
