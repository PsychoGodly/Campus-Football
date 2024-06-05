package com.google.android.recaptcha;

import com.applovin.sdk.AppLovinEventTypes;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class RecaptchaAction {
    public static final Companion Companion = new Companion((h) null);
    public static final RecaptchaAction LOGIN = new RecaptchaAction(AppLovinEventTypes.USER_LOGGED_IN);
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    private final String action;

    /* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final RecaptchaAction custom(String str) {
            return new RecaptchaAction(str, (h) null);
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    public /* synthetic */ RecaptchaAction(String str, h hVar) {
        this(str);
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction recaptchaAction, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    public static final RecaptchaAction custom(String str) {
        return Companion.custom(str);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecaptchaAction) && m.a(this.action, ((RecaptchaAction) obj).action);
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        String str = this.action;
        return "RecaptchaAction(action=" + str + ")";
    }
}
