package com.unity3d.ads.core.data.model;

import com.google.protobuf.i;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: SessionChange.kt */
public abstract class SessionChange {

    /* compiled from: SessionChange.kt */
    public static final class PrivacyFsmChange extends SessionChange {
        private final i value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(i iVar) {
            super((h) null);
            m.e(iVar, "value");
            this.value = iVar;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iVar = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(iVar);
        }

        public final i component1() {
            return this.value;
        }

        public final PrivacyFsmChange copy(i iVar) {
            m.e(iVar, "value");
            return new PrivacyFsmChange(iVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && m.a(this.value, ((PrivacyFsmChange) obj).value);
        }

        public final i getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    /* compiled from: SessionChange.kt */
    public static final class UserConsentChange extends SessionChange {
        private final i value;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UserConsentChange(i iVar) {
            super((h) null);
            m.e(iVar, "value");
            this.value = iVar;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iVar = userConsentChange.value;
            }
            return userConsentChange.copy(iVar);
        }

        public final i component1() {
            return this.value;
        }

        public final UserConsentChange copy(i iVar) {
            m.e(iVar, "value");
            return new UserConsentChange(iVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && m.a(this.value, ((UserConsentChange) obj).value);
        }

        public final i getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    private SessionChange() {
    }

    public /* synthetic */ SessionChange(h hVar) {
        this();
    }
}
