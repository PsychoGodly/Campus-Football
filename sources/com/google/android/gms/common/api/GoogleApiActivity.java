package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.q;
import h5.b;
import h5.e;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    protected int f14986a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f14986a = 1;
            } catch (ActivityNotFoundException e10) {
                if (extras.getBoolean("notify_manager", true)) {
                    f.x(this).I(new b(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 36);
                    sb2.append("Activity not found while launching ");
                    sb2.append(obj);
                    sb2.append(".");
                    String sb3 = sb2.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb3 = sb3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb3, e10);
                }
                this.f14986a = 1;
                finish();
            } catch (IntentSender.SendIntentException e11) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                finish();
            }
        } else {
            e.q().r(this, ((Integer) q.k(num)).intValue(), 2, this);
            this.f14986a = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f14986a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                f x10 = f.x(this);
                if (i11 == -1) {
                    x10.a();
                } else if (i11 == 0) {
                    x10.I(new b(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f14986a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f14986a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f14986a = bundle.getInt("resolution");
        }
        if (this.f14986a != 1) {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f14986a);
        super.onSaveInstanceState(bundle);
    }
}
