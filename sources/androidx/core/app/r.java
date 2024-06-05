package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: RemoteInput */
public final class r {

    /* compiled from: RemoteInput */
    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(r rVar) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(r rVar) {
        return a.b(rVar);
    }

    static RemoteInput[] b(r[] rVarArr) {
        if (rVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            remoteInputArr[i10] = a(rVarArr[i10]);
        }
        return remoteInputArr;
    }
}
