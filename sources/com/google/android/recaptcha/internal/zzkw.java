package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public enum zzkw implements zzgq {
    UNKNOWN(0),
    INIT_NATIVE(1),
    INIT_NETWORK(2),
    INIT_JS(3),
    INIT_TOTAL(4),
    EXECUTE_NATIVE(5),
    EXECUTE_JS(6),
    EXECUTE_TOTAL(7),
    CHALLENGE_ACCOUNT_NATIVE(8),
    CHALLENGE_ACCOUNT_JS(9),
    CHALLENGE_ACCOUNT_TOTAL(10),
    VERIFY_PIN_NATIVE(11),
    VERIFY_PIN_JS(12),
    VERIFY_PIN_TOTAL(13),
    RUN_PROGRAM(14),
    FETCH_ALLOWLIST(15),
    JS_LOAD(16),
    UNRECOGNIZED(-1);
    
    private static final zzgr zzs = null;
    private final int zzu;

    static {
        zzs = new zzkv();
    }

    private zzkw(int i10) {
        this.zzu = i10;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzu;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
