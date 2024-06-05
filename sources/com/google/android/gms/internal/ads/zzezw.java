package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezw {
    public static ParcelFileDescriptor zza(InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzbzn.zza.execute(new zzezv(inputStream, createPipe[1]));
        return parcelFileDescriptor;
    }
}
