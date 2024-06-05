package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class AdActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private zzbrc f14400a;

    private final void a() {
        zzbrc zzbrc = this.f14400a;
        if (zzbrc != null) {
            try {
                zzbrc.zzv();
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzg(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    public final void onBackPressed() {
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null && !zzbrc.zzE()) {
                return;
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbrc zzbrc2 = this.f14400a;
            if (zzbrc2 != null) {
                zzbrc2.zzh();
            }
        } catch (RemoteException e11) {
            zzbza.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzj(b.B1(configuration));
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzbrc m10 = x.a().m(this);
        this.f14400a = m10;
        if (m10 != null) {
            try {
                m10.zzk(bundle);
            } catch (RemoteException e10) {
                zzbza.zzl("#007 Could not call remote method.", e10);
                finish();
            }
        } else {
            zzbza.zzl("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzl();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzn();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzo();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzp();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzq(bundle);
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzr();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzs();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbrc zzbrc = this.f14400a;
            if (zzbrc != null) {
                zzbrc.zzt();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void setContentView(int i10) {
        super.setContentView(i10);
        a();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
