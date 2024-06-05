package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcef implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult zza;
    final /* synthetic */ EditText zzb;

    zzcef(JsPromptResult jsPromptResult, EditText editText) {
        this.zza = jsPromptResult;
        this.zzb = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.confirm(this.zzb.getText().toString());
    }
}
