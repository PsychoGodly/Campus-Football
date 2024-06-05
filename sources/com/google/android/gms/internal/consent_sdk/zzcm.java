package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public final class zzcm {
    public String zza;
    public String zzb;
    public String zzc;
    public List zzd = Collections.emptyList();
    public List zze = Collections.emptyList();
    public int zzf = 1;
    public int zzg = 1;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01f2, code lost:
        if (r1.equals("CONSENT_SIGNAL_UNKNOWN") != false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (r1.equals("UNKNOWN") == false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.consent_sdk.zzcm zza(android.util.JsonReader r12) throws java.io.IOException {
        /*
            com.google.android.gms.internal.consent_sdk.zzcm r0 = new com.google.android.gms.internal.consent_sdk.zzcm
            r0.<init>()
            r12.beginObject()
        L_0x0008:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x022b
            java.lang.String r1 = r12.nextName()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 5
            r5 = 6
            r6 = 3
            r7 = 0
            r8 = -1
            r9 = 2
            r10 = 1
            switch(r2) {
                case -2001388947: goto L_0x005e;
                case -1938755376: goto L_0x0054;
                case -1851537225: goto L_0x004a;
                case -1324537865: goto L_0x0040;
                case -1161803523: goto L_0x0036;
                case -986806987: goto L_0x002c;
                case -790907624: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0068
        L_0x0022:
            java.lang.String r2 = "consent_form_payload"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0068
            r1 = 1
            goto L_0x0069
        L_0x002c:
            java.lang.String r2 = "request_info_keys"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0068
            r1 = 4
            goto L_0x0069
        L_0x0036:
            java.lang.String r2 = "actions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0068
            r1 = 5
            goto L_0x0069
        L_0x0040:
            java.lang.String r2 = "privacy_options_required"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0068
            r1 = 6
            goto L_0x0069
        L_0x004a:
            java.lang.String r2 = "consent_form_base_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0068
            r1 = 2
            goto L_0x0069
        L_0x0054:
            java.lang.String r2 = "error_message"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0068
            r1 = 3
            goto L_0x0069
        L_0x005e:
            java.lang.String r2 = "consent_signal"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0068
            r1 = 0
            goto L_0x0069
        L_0x0068:
            r1 = -1
        L_0x0069:
            switch(r1) {
                case 0: goto L_0x01ad;
                case 1: goto L_0x01a5;
                case 2: goto L_0x019d;
                case 3: goto L_0x0195;
                case 4: goto L_0x0176;
                case 5: goto L_0x00c0;
                case 6: goto L_0x0070;
                default: goto L_0x006c;
            }
        L_0x006c:
            r12.skipValue()
            goto L_0x0008
        L_0x0070:
            java.lang.String r1 = r12.nextString()
            int r2 = r1.hashCode()
            r3 = -1888946261(0xffffffff8f68f7ab, float:-1.1486182E-29)
            if (r2 == r3) goto L_0x009b
            r3 = 389487519(0x17371b9f, float:5.916535E-25)
            if (r2 == r3) goto L_0x0091
            r3 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r2 == r3) goto L_0x0088
            goto L_0x00a5
        L_0x0088:
            java.lang.String r2 = "UNKNOWN"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a5
            goto L_0x00a6
        L_0x0091:
            java.lang.String r2 = "REQUIRED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a5
            r7 = 1
            goto L_0x00a6
        L_0x009b:
            java.lang.String r2 = "NOT_REQUIRED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x00a5
            r7 = 2
            goto L_0x00a6
        L_0x00a5:
            r7 = -1
        L_0x00a6:
            if (r7 == 0) goto L_0x00bb
            if (r7 == r10) goto L_0x00b9
            if (r7 != r9) goto L_0x00ad
            goto L_0x00bc
        L_0x00ad:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: "
            java.lang.String r0 = r0.concat(r1)
            r12.<init>(r0)
            throw r12
        L_0x00b9:
            r6 = 2
            goto L_0x00bc
        L_0x00bb:
            r6 = 1
        L_0x00bc:
            r0.zzg = r6
            goto L_0x0008
        L_0x00c0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zze = r1
            r12.beginArray()
        L_0x00ca:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0171
            com.google.android.gms.internal.consent_sdk.zzcl r1 = new com.google.android.gms.internal.consent_sdk.zzcl
            r1.<init>()
            r12.beginObject()
        L_0x00d8:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0167
            java.lang.String r2 = r12.nextName()
            int r3 = r2.hashCode()
            r4 = -2105551094(0xffffffff827fd70a, float:-1.8796154E-37)
            if (r3 == r4) goto L_0x00fb
            r4 = 1583758243(0x5e663ba3, float:4.14750822E18)
            if (r3 == r4) goto L_0x00f1
            goto L_0x0105
        L_0x00f1:
            java.lang.String r3 = "action_type"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0105
            r2 = 0
            goto L_0x0106
        L_0x00fb:
            java.lang.String r3 = "args_json"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0105
            r2 = 1
            goto L_0x0106
        L_0x0105:
            r2 = -1
        L_0x0106:
            if (r2 == 0) goto L_0x0115
            if (r2 == r10) goto L_0x010e
            r12.skipValue()
            goto L_0x00d8
        L_0x010e:
            java.lang.String r2 = r12.nextString()
            r1.zza = r2
            goto L_0x00d8
        L_0x0115:
            java.lang.String r2 = r12.nextString()
            int r3 = r2.hashCode()
            r4 = 64208429(0x3d3be2d, float:1.2445128E-36)
            if (r3 == r4) goto L_0x0141
            r4 = 82862015(0x4f05fbf, float:5.6511658E-36)
            if (r3 == r4) goto L_0x0137
            r4 = 1856333582(0x6ea5670e, float:2.5594806E28)
            if (r3 == r4) goto L_0x012d
            goto L_0x014b
        L_0x012d:
            java.lang.String r3 = "UNKNOWN_ACTION_TYPE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x014b
            r3 = 0
            goto L_0x014c
        L_0x0137:
            java.lang.String r3 = "WRITE"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x014b
            r3 = 1
            goto L_0x014c
        L_0x0141:
            java.lang.String r3 = "CLEAR"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x014b
            r3 = 2
            goto L_0x014c
        L_0x014b:
            r3 = -1
        L_0x014c:
            if (r3 == 0) goto L_0x0162
            if (r3 == r10) goto L_0x0160
            if (r3 != r9) goto L_0x0154
            r2 = 3
            goto L_0x0163
        L_0x0154:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: "
            java.lang.String r0 = r0.concat(r2)
            r12.<init>(r0)
            throw r12
        L_0x0160:
            r2 = 2
            goto L_0x0163
        L_0x0162:
            r2 = 1
        L_0x0163:
            r1.zzb = r2
            goto L_0x00d8
        L_0x0167:
            r12.endObject()
            java.util.List r2 = r0.zze
            r2.add(r1)
            goto L_0x00ca
        L_0x0171:
            r12.endArray()
            goto L_0x0008
        L_0x0176:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzd = r1
            r12.beginArray()
        L_0x0180:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0190
            java.lang.String r1 = r12.nextString()
            java.util.List r2 = r0.zzd
            r2.add(r1)
            goto L_0x0180
        L_0x0190:
            r12.endArray()
            goto L_0x0008
        L_0x0195:
            java.lang.String r1 = r12.nextString()
            r0.zzc = r1
            goto L_0x0008
        L_0x019d:
            java.lang.String r1 = r12.nextString()
            r0.zzb = r1
            goto L_0x0008
        L_0x01a5:
            java.lang.String r1 = r12.nextString()
            r0.zza = r1
            goto L_0x0008
        L_0x01ad:
            java.lang.String r1 = r12.nextString()
            int r2 = r1.hashCode()
            r11 = 7
            switch(r2) {
                case -2058725357: goto L_0x01ff;
                case -1969035850: goto L_0x01f5;
                case -1263695752: goto L_0x01ec;
                case -954325659: goto L_0x01e2;
                case -918677260: goto L_0x01d8;
                case 429411856: goto L_0x01ce;
                case 467888915: goto L_0x01c4;
                case 1725474845: goto L_0x01ba;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            goto L_0x0209
        L_0x01ba:
            java.lang.String r2 = "CONSENT_SIGNAL_NOT_REQUIRED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            r7 = 5
            goto L_0x020a
        L_0x01c4:
            java.lang.String r2 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            r7 = 1
            goto L_0x020a
        L_0x01ce:
            java.lang.String r2 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            r7 = 3
            goto L_0x020a
        L_0x01d8:
            java.lang.String r2 = "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            r7 = 7
            goto L_0x020a
        L_0x01e2:
            java.lang.String r2 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            r7 = 2
            goto L_0x020a
        L_0x01ec:
            java.lang.String r2 = "CONSENT_SIGNAL_UNKNOWN"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            goto L_0x020a
        L_0x01f5:
            java.lang.String r2 = "CONSENT_SIGNAL_ERROR"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            r7 = 6
            goto L_0x020a
        L_0x01ff:
            java.lang.String r2 = "CONSENT_SIGNAL_COLLECT_CONSENT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0209
            r7 = 4
            goto L_0x020a
        L_0x0209:
            r7 = -1
        L_0x020a:
            switch(r7) {
                case 0: goto L_0x0226;
                case 1: goto L_0x0224;
                case 2: goto L_0x0222;
                case 3: goto L_0x0227;
                case 4: goto L_0x0220;
                case 5: goto L_0x021e;
                case 6: goto L_0x021c;
                case 7: goto L_0x0219;
                default: goto L_0x020d;
            }
        L_0x020d:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: "
            java.lang.String r0 = r0.concat(r1)
            r12.<init>(r0)
            throw r12
        L_0x0219:
            r3 = 8
            goto L_0x0227
        L_0x021c:
            r3 = 7
            goto L_0x0227
        L_0x021e:
            r3 = 6
            goto L_0x0227
        L_0x0220:
            r3 = 5
            goto L_0x0227
        L_0x0222:
            r3 = 3
            goto L_0x0227
        L_0x0224:
            r3 = 2
            goto L_0x0227
        L_0x0226:
            r3 = 1
        L_0x0227:
            r0.zzf = r3
            goto L_0x0008
        L_0x022b:
            r12.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzcm.zza(android.util.JsonReader):com.google.android.gms.internal.consent_sdk.zzcm");
    }
}
