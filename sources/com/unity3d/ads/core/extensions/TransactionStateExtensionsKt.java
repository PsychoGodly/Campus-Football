package com.unity3d.ads.core.extensions;

import vb.n3;

/* compiled from: TransactionStateExtensions.kt */
public final class TransactionStateExtensionsKt {
    public static final n3 fromPurchaseState(int i10) {
        if (i10 == 0) {
            return n3.TRANSACTION_STATE_PURCHASED;
        }
        if (i10 == 1) {
            return n3.TRANSACTION_STATE_UNSPECIFIED;
        }
        if (i10 != 2) {
            return n3.UNRECOGNIZED;
        }
        return n3.TRANSACTION_STATE_PENDING;
    }
}
