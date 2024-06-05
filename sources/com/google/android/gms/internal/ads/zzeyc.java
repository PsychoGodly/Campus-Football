package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.b5;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeyc {
    public final String zzA;
    public final zzbvy zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzeza zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbri zzae;
    public final b5 zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzbup zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzeyh zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x068c, code lost:
        r10 = r76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07f7, code lost:
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x07f9, code lost:
        r9 = r74;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzeyc(android.util.JsonReader r76) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        /*
            r75 = this;
            r0 = r75
            r75.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            java.util.List r2 = java.util.Collections.emptyList()
            java.util.List r3 = java.util.Collections.emptyList()
            java.util.List r4 = java.util.Collections.emptyList()
            java.util.List r5 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r7 = java.util.Collections.emptyList()
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r10 = java.util.Collections.emptyList()
            java.util.List r11 = java.util.Collections.emptyList()
            java.util.List r12 = java.util.Collections.emptyList()
            java.util.List r13 = java.util.Collections.emptyList()
            java.util.List r14 = java.util.Collections.emptyList()
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            org.json.JSONObject r16 = new org.json.JSONObject
            r16.<init>()
            org.json.JSONObject r17 = new org.json.JSONObject
            r17.<init>()
            org.json.JSONObject r18 = new org.json.JSONObject
            r18.<init>()
            org.json.JSONObject r19 = new org.json.JSONObject
            r19.<init>()
            org.json.JSONObject r20 = new org.json.JSONObject
            r20.<init>()
            com.google.android.gms.internal.ads.zzfqk r21 = com.google.android.gms.internal.ads.zzfqk.zzo()
            r76.beginObject()
            r22 = -1
            r23 = 0
            java.lang.String r24 = ""
            r25 = 0
            r26 = r16
            r27 = r17
            r28 = r18
            r29 = r19
            r30 = r20
            r31 = r21
            r19 = r23
            r32 = r19
            r33 = r32
            r34 = r33
            r35 = r34
            r37 = r24
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r52 = r41
            r56 = r52
            r58 = r56
            r60 = r58
            r62 = r60
            r63 = r62
            r64 = r63
            r65 = r64
            r66 = r65
            r71 = r66
            r72 = r71
            r36 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = -1
            r50 = 0
            r51 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = -1
            r59 = 0
            r61 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r21 = r11
            r20 = r12
            r18 = r13
            r17 = r14
            r16 = r15
            r15 = r35
            r11 = r72
            r12 = r11
            r13 = 0
            r14 = 0
        L_0x00db:
            boolean r23 = r76.hasNext()
            if (r23 == 0) goto L_0x07fd
            java.lang.String r23 = r76.nextName()
            if (r23 != 0) goto L_0x00ea
            r73 = r24
            goto L_0x00ec
        L_0x00ea:
            r73 = r23
        L_0x00ec:
            int r23 = r73.hashCode()
            switch(r23) {
                case -2138196627: goto L_0x05b4;
                case -1980587809: goto L_0x05a3;
                case -1965512151: goto L_0x0592;
                case -1871425831: goto L_0x0581;
                case -1812055556: goto L_0x0570;
                case -1776946669: goto L_0x055f;
                case -1662989631: goto L_0x054d;
                case -1620470467: goto L_0x053b;
                case -1550155393: goto L_0x0529;
                case -1440104884: goto L_0x0517;
                case -1439500848: goto L_0x0505;
                case -1428969291: goto L_0x04f3;
                case -1406227629: goto L_0x04e1;
                case -1403779768: goto L_0x04cf;
                case -1375413093: goto L_0x04bd;
                case -1360811658: goto L_0x04ab;
                case -1306015996: goto L_0x0499;
                case -1303332046: goto L_0x0487;
                case -1289032093: goto L_0x0475;
                case -1240082064: goto L_0x0463;
                case -1234181075: goto L_0x0451;
                case -1168140544: goto L_0x043f;
                case -1152230954: goto L_0x042e;
                case -1146534047: goto L_0x041c;
                case -1115838944: goto L_0x040a;
                case -1081936678: goto L_0x03f8;
                case -1078050970: goto L_0x03e6;
                case -1051269058: goto L_0x03d4;
                case -982608540: goto L_0x03c2;
                case -972056451: goto L_0x03b0;
                case -776859333: goto L_0x039f;
                case -544216775: goto L_0x038d;
                case -437057161: goto L_0x037c;
                case -404433734: goto L_0x036a;
                case -404326515: goto L_0x0358;
                case -397704715: goto L_0x0346;
                case -388807511: goto L_0x0334;
                case -369773488: goto L_0x0322;
                case -213449460: goto L_0x0310;
                case -213424028: goto L_0x02fe;
                case -180214626: goto L_0x02ec;
                case -154616268: goto L_0x02da;
                case -29338502: goto L_0x02c8;
                case 3107: goto L_0x02b6;
                case 3355: goto L_0x02a4;
                case 3076010: goto L_0x0292;
                case 37109963: goto L_0x0280;
                case 63195984: goto L_0x026e;
                case 107433883: goto L_0x025c;
                case 230323073: goto L_0x024b;
                case 418392395: goto L_0x0239;
                case 549176928: goto L_0x0227;
                case 597473788: goto L_0x0215;
                case 754887508: goto L_0x0203;
                case 791122864: goto L_0x01f2;
                case 1010584092: goto L_0x01e0;
                case 1100650276: goto L_0x01ce;
                case 1186014765: goto L_0x01bc;
                case 1321720943: goto L_0x01aa;
                case 1437255331: goto L_0x0198;
                case 1637553475: goto L_0x0186;
                case 1638957285: goto L_0x0175;
                case 1686319423: goto L_0x0163;
                case 1688341040: goto L_0x0152;
                case 1799285870: goto L_0x0140;
                case 1839650832: goto L_0x012f;
                case 1875425491: goto L_0x011d;
                case 2068142375: goto L_0x010b;
                case 2072888499: goto L_0x00f9;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            r74 = r9
            r23 = r10
            goto L_0x05c5
        L_0x00f9:
            r23 = r10
            java.lang.String r10 = "manual_tracking_urls"
            r74 = r9
            r9 = r73
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 15
            goto L_0x05c6
        L_0x010b:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "rule_line_external_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 52
            goto L_0x05c6
        L_0x011d:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "is_analytics_logging_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 42
            goto L_0x05c6
        L_0x012f:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "renderers"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 0
            goto L_0x05c6
        L_0x0140:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "use_third_party_container_height"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 48
            goto L_0x05c6
        L_0x0152:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "video_reward_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 7
            goto L_0x05c6
        L_0x0163:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_network_class_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 55
            goto L_0x05c6
        L_0x0175:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "video_start_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 6
            goto L_0x05c6
        L_0x0186:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "bid_response"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 40
            goto L_0x05c6
        L_0x0198:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_source_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 57
            goto L_0x05c6
        L_0x01aa:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "allow_pub_owned_ad_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 31
            goto L_0x05c6
        L_0x01bc:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "cache_hit_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 65
            goto L_0x05c6
        L_0x01ce:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "rewards"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 11
            goto L_0x05c6
        L_0x01e0:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "transaction_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 9
            goto L_0x05c6
        L_0x01f2:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 5
            goto L_0x05c6
        L_0x0203:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "container_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 17
            goto L_0x05c6
        L_0x0215:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "debug_dialog_string"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 27
            goto L_0x05c6
        L_0x0227:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "presentation_error_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 16
            goto L_0x05c6
        L_0x0239:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "is_closable_area_disabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 36
            goto L_0x05c6
        L_0x024b:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_load_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 4
            goto L_0x05c6
        L_0x025c:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "qdata"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 24
            goto L_0x05c6
        L_0x026e:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "render_test_label"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 33
            goto L_0x05c6
        L_0x0280:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "request_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 67
            goto L_0x05c6
        L_0x0292:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 22
            goto L_0x05c6
        L_0x02a4:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 23
            goto L_0x05c6
        L_0x02b6:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 18
            goto L_0x05c6
        L_0x02c8:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "allow_custom_click_gesture"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 32
            goto L_0x05c6
        L_0x02da:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "is_offline_ad"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 60
            goto L_0x05c6
        L_0x02ec:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "native_required_asset_viewability"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 62
            goto L_0x05c6
        L_0x02fe:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "watermark"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 46
            goto L_0x05c6
        L_0x0310:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "force_disable_hardware_acceleration"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 64
            goto L_0x05c6
        L_0x0322:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "is_close_button_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 50
            goto L_0x05c6
        L_0x0334:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "content_url"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 63
            goto L_0x05c6
        L_0x0346:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_close_time_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 45
            goto L_0x05c6
        L_0x0358:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "render_timeout_ms"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 38
            goto L_0x05c6
        L_0x036a:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "rtb_native_required_assets"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 61
            goto L_0x05c6
        L_0x037c:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "imp_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 3
            goto L_0x05c6
        L_0x038d:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "safe_browsing"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 26
            goto L_0x05c6
        L_0x039f:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "click_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 2
            goto L_0x05c6
        L_0x03b0:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_source_instance_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 59
            goto L_0x05c6
        L_0x03c2:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "valid_from_timestamp"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 10
            goto L_0x05c6
        L_0x03d4:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "active_view"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 25
            goto L_0x05c6
        L_0x03e6:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "video_complete_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 8
            goto L_0x05c6
        L_0x03f8:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "allocation_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 21
            goto L_0x05c6
        L_0x040a:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "fill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 12
            goto L_0x05c6
        L_0x041c:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "is_scroll_aware"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 43
            goto L_0x05c6
        L_0x042e:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 1
            goto L_0x05c6
        L_0x043f:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "presentation_error_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 14
            goto L_0x05c6
        L_0x0451:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "allow_pub_rendered_attribution"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 30
            goto L_0x05c6
        L_0x0463:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_event_value"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 51
            goto L_0x05c6
        L_0x0475:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "extras"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 29
            goto L_0x05c6
        L_0x0487:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "test_mode_enabled"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 34
            goto L_0x05c6
        L_0x0499:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "adapters"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 20
            goto L_0x05c6
        L_0x04ab:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_sizes"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 19
            goto L_0x05c6
        L_0x04bd:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_cover"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 54
            goto L_0x05c6
        L_0x04cf:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "showable_impression_type"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 44
            goto L_0x05c6
        L_0x04e1:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "buffer_click_url_as_ready_to_ping"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 66
            goto L_0x05c6
        L_0x04f3:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "enable_omid"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 39
            goto L_0x05c6
        L_0x0505:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "orientation"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 37
            goto L_0x05c6
        L_0x0517:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "is_custom_close_blocked"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 35
            goto L_0x05c6
        L_0x0529:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "nofill_urls"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 13
            goto L_0x05c6
        L_0x053b:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "backend_query_id"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 47
            goto L_0x05c6
        L_0x054d:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "is_interscroller"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 53
            goto L_0x05c6
        L_0x055f:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_source_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 56
            goto L_0x05c6
        L_0x0570:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "play_prewarm_options"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 49
            goto L_0x05c6
        L_0x0581:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "recursive_server_response_data"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 68
            goto L_0x05c6
        L_0x0592:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "omid_settings"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 41
            goto L_0x05c6
        L_0x05a3:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "debug_signals"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 28
            goto L_0x05c6
        L_0x05b4:
            r74 = r9
            r23 = r10
            r9 = r73
            java.lang.String r10 = "ad_source_instance_name"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05c5
            r9 = 58
            goto L_0x05c6
        L_0x05c5:
            r9 = -1
        L_0x05c6:
            switch(r9) {
                case 0: goto L_0x07f1;
                case 1: goto L_0x07e6;
                case 2: goto L_0x07df;
                case 3: goto L_0x07d8;
                case 4: goto L_0x07d1;
                case 5: goto L_0x07c6;
                case 6: goto L_0x07bf;
                case 7: goto L_0x07b8;
                case 8: goto L_0x07b1;
                case 9: goto L_0x07aa;
                case 10: goto L_0x07a3;
                case 11: goto L_0x0798;
                case 12: goto L_0x0790;
                case 13: goto L_0x0786;
                case 14: goto L_0x077d;
                case 15: goto L_0x0775;
                case 16: goto L_0x076d;
                case 17: goto L_0x0765;
                case 18: goto L_0x075a;
                case 19: goto L_0x0754;
                case 20: goto L_0x074e;
                case 21: goto L_0x0748;
                case 22: goto L_0x0742;
                case 23: goto L_0x073c;
                case 24: goto L_0x0736;
                case 25: goto L_0x072c;
                case 26: goto L_0x0722;
                case 27: goto L_0x071c;
                case 28: goto L_0x0716;
                case 29: goto L_0x0710;
                case 30: goto L_0x070a;
                case 31: goto L_0x0704;
                case 32: goto L_0x06fe;
                case 33: goto L_0x06f8;
                case 34: goto L_0x06f2;
                case 35: goto L_0x06ec;
                case 36: goto L_0x06e6;
                case 37: goto L_0x06dc;
                case 38: goto L_0x06d6;
                case 39: goto L_0x06d0;
                case 40: goto L_0x06ca;
                case 41: goto L_0x06c4;
                case 42: goto L_0x06be;
                case 43: goto L_0x06b8;
                case 44: goto L_0x06b2;
                case 45: goto L_0x06ac;
                case 46: goto L_0x06a6;
                case 47: goto L_0x06a0;
                case 48: goto L_0x069a;
                case 49: goto L_0x0690;
                case 50: goto L_0x0689;
                case 51: goto L_0x067f;
                case 52: goto L_0x0679;
                case 53: goto L_0x0673;
                case 54: goto L_0x066d;
                case 55: goto L_0x0667;
                case 56: goto L_0x064f;
                case 57: goto L_0x0637;
                case 58: goto L_0x061f;
                case 59: goto L_0x0606;
                case 60: goto L_0x0600;
                case 61: goto L_0x05fa;
                case 62: goto L_0x05f4;
                case 63: goto L_0x05ee;
                case 64: goto L_0x05e8;
                case 65: goto L_0x05e2;
                case 66: goto L_0x05dc;
                case 67: goto L_0x05d6;
                case 68: goto L_0x05d0;
                default: goto L_0x05c9;
            }
        L_0x05c9:
            r10 = r76
            r76.skipValue()
            goto L_0x07f7
        L_0x05d0:
            java.lang.String r72 = r76.nextString()
            goto L_0x07f7
        L_0x05d6:
            java.lang.String r71 = r76.nextString()
            goto L_0x07f7
        L_0x05dc:
            boolean r70 = r76.nextBoolean()
            goto L_0x07f7
        L_0x05e2:
            java.util.List r31 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x05e8:
            boolean r69 = r76.nextBoolean()
            goto L_0x07f7
        L_0x05ee:
            java.lang.String r35 = r76.nextString()
            goto L_0x07f7
        L_0x05f4:
            boolean r68 = r76.nextBoolean()
            goto L_0x07f7
        L_0x05fa:
            org.json.JSONObject r30 = com.google.android.gms.ads.internal.util.w0.h(r76)
            goto L_0x07f7
        L_0x0600:
            boolean r67 = r76.nextBoolean()
            goto L_0x07f7
        L_0x0606:
            com.google.android.gms.internal.ads.zzbaj r9 = com.google.android.gms.internal.ads.zzbar.zzgq
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x061a
            java.lang.String r66 = r76.nextString()
            goto L_0x07f7
        L_0x061a:
            r76.skipValue()
            goto L_0x068c
        L_0x061f:
            com.google.android.gms.internal.ads.zzbaj r9 = com.google.android.gms.internal.ads.zzbar.zzgq
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0633
            java.lang.String r65 = r76.nextString()
            goto L_0x07f7
        L_0x0633:
            r76.skipValue()
            goto L_0x068c
        L_0x0637:
            com.google.android.gms.internal.ads.zzbaj r9 = com.google.android.gms.internal.ads.zzbar.zzgq
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x064b
            java.lang.String r64 = r76.nextString()
            goto L_0x07f7
        L_0x064b:
            r76.skipValue()
            goto L_0x068c
        L_0x064f:
            com.google.android.gms.internal.ads.zzbaj r9 = com.google.android.gms.internal.ads.zzbar.zzgq
            java.lang.Object r9 = r9.zzl()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0663
            java.lang.String r63 = r76.nextString()
            goto L_0x07f7
        L_0x0663:
            r76.skipValue()
            goto L_0x068c
        L_0x0667:
            java.lang.String r62 = r76.nextString()
            goto L_0x07f7
        L_0x066d:
            org.json.JSONObject r29 = com.google.android.gms.ads.internal.util.w0.h(r76)
            goto L_0x07f7
        L_0x0673:
            boolean r61 = r76.nextBoolean()
            goto L_0x07f7
        L_0x0679:
            java.lang.String r60 = r76.nextString()
            goto L_0x07f7
        L_0x067f:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.w0.h(r76)
            com.google.android.gms.ads.internal.client.b5 r34 = com.google.android.gms.ads.internal.client.b5.b(r9)
            goto L_0x07f7
        L_0x0689:
            r76.nextBoolean()
        L_0x068c:
            r10 = r76
            goto L_0x07f7
        L_0x0690:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.w0.h(r76)
            com.google.android.gms.internal.ads.zzbri r33 = com.google.android.gms.internal.ads.zzbri.zza(r9)
            goto L_0x07f7
        L_0x069a:
            boolean r59 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06a0:
            java.lang.String r58 = r76.nextString()
            goto L_0x07f7
        L_0x06a6:
            java.lang.String r56 = r76.nextString()
            goto L_0x07f7
        L_0x06ac:
            int r57 = r76.nextInt()
            goto L_0x07f7
        L_0x06b2:
            int r55 = r76.nextInt()
            goto L_0x07f7
        L_0x06b8:
            boolean r54 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06be:
            boolean r53 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06c4:
            org.json.JSONObject r28 = com.google.android.gms.ads.internal.util.w0.h(r76)
            goto L_0x07f7
        L_0x06ca:
            java.lang.String r52 = r76.nextString()
            goto L_0x07f7
        L_0x06d0:
            boolean r51 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06d6:
            int r50 = r76.nextInt()
            goto L_0x07f7
        L_0x06dc:
            java.lang.String r9 = r76.nextString()
            int r49 = zzd(r9)
            goto L_0x07f7
        L_0x06e6:
            boolean r48 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06ec:
            boolean r47 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06f2:
            boolean r46 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06f8:
            boolean r45 = r76.nextBoolean()
            goto L_0x07f7
        L_0x06fe:
            boolean r44 = r76.nextBoolean()
            goto L_0x07f7
        L_0x0704:
            boolean r43 = r76.nextBoolean()
            goto L_0x07f7
        L_0x070a:
            boolean r42 = r76.nextBoolean()
            goto L_0x07f7
        L_0x0710:
            org.json.JSONObject r27 = com.google.android.gms.ads.internal.util.w0.h(r76)
            goto L_0x07f7
        L_0x0716:
            org.json.JSONObject r26 = com.google.android.gms.ads.internal.util.w0.h(r76)
            goto L_0x07f7
        L_0x071c:
            java.lang.String r41 = r76.nextString()
            goto L_0x07f7
        L_0x0722:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.w0.h(r76)
            com.google.android.gms.internal.ads.zzbvy r32 = com.google.android.gms.internal.ads.zzbvy.zza(r9)
            goto L_0x07f7
        L_0x072c:
            org.json.JSONObject r9 = com.google.android.gms.ads.internal.util.w0.h(r76)
            java.lang.String r40 = r9.toString()
            goto L_0x07f7
        L_0x0736:
            java.lang.String r39 = r76.nextString()
            goto L_0x07f7
        L_0x073c:
            java.lang.String r38 = r76.nextString()
            goto L_0x07f7
        L_0x0742:
            org.json.JSONObject r16 = com.google.android.gms.ads.internal.util.w0.h(r76)
            goto L_0x07f7
        L_0x0748:
            java.lang.String r37 = r76.nextString()
            goto L_0x07f7
        L_0x074e:
            java.util.List r18 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x0754:
            java.util.List r17 = com.google.android.gms.internal.ads.zzeyd.zza(r76)
            goto L_0x07f7
        L_0x075a:
            com.google.android.gms.internal.ads.zzeyh r9 = new com.google.android.gms.internal.ads.zzeyh
            r10 = r76
            r9.<init>(r10)
            r19 = r9
            goto L_0x07f7
        L_0x0765:
            r10 = r76
            java.util.List r20 = com.google.android.gms.internal.ads.zzeyd.zza(r76)
            goto L_0x07f7
        L_0x076d:
            r10 = r76
            int r36 = r76.nextInt()
            goto L_0x07f7
        L_0x0775:
            r10 = r76
            java.util.List r21 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x077d:
            r10 = r76
            java.util.List r9 = com.google.android.gms.ads.internal.util.w0.d(r76)
            r10 = r9
            goto L_0x07f9
        L_0x0786:
            r10 = r76
            java.util.List r9 = com.google.android.gms.ads.internal.util.w0.d(r76)
            r10 = r23
            goto L_0x00db
        L_0x0790:
            r10 = r76
            java.util.List r8 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x0798:
            r10 = r76
            org.json.JSONArray r9 = com.google.android.gms.ads.internal.util.w0.e(r76)
            com.google.android.gms.internal.ads.zzbup r15 = com.google.android.gms.internal.ads.zzbup.zza(r9)
            goto L_0x07f7
        L_0x07a3:
            r10 = r76
            java.lang.String r11 = r76.nextString()
            goto L_0x07f7
        L_0x07aa:
            r10 = r76
            java.lang.String r12 = r76.nextString()
            goto L_0x07f7
        L_0x07b1:
            r10 = r76
            java.util.List r7 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x07b8:
            r10 = r76
            java.util.List r6 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x07bf:
            r10 = r76
            java.util.List r5 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x07c6:
            r10 = r76
            int r9 = r76.nextInt()
            int r14 = zzc(r9)
            goto L_0x07f7
        L_0x07d1:
            r10 = r76
            java.util.List r4 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x07d8:
            r10 = r76
            java.util.List r3 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x07df:
            r10 = r76
            java.util.List r2 = com.google.android.gms.ads.internal.util.w0.d(r76)
            goto L_0x07f7
        L_0x07e6:
            r10 = r76
            java.lang.String r9 = r76.nextString()
            int r13 = zzb(r9)
            goto L_0x07f7
        L_0x07f1:
            r10 = r76
            java.util.List r1 = com.google.android.gms.ads.internal.util.w0.d(r76)
        L_0x07f7:
            r10 = r23
        L_0x07f9:
            r9 = r74
            goto L_0x00db
        L_0x07fd:
            r74 = r9
            r23 = r10
            r10 = r76
            r76.endObject()
            r0.zza = r1
            r0.zzb = r13
            r0.zzc = r2
            r0.zzd = r3
            r0.zzg = r4
            r0.zzf = r14
            r0.zzh = r5
            r0.zzi = r6
            r0.zzj = r7
            r0.zzk = r12
            r0.zzl = r11
            r0.zzm = r15
            r0.zzn = r8
            r0.zzo = r9
            r9 = r23
            r0.zzp = r9
            r11 = r21
            r0.zzq = r11
            r1 = r36
            r0.zzr = r1
            r12 = r20
            r0.zzs = r12
            r9 = r19
            r0.zzt = r9
            r13 = r18
            r0.zzu = r13
            r14 = r17
            r0.zzv = r14
            r1 = r37
            r0.zzx = r1
            r15 = r16
            r0.zzw = r15
            r1 = r38
            r0.zzy = r1
            r1 = r39
            r0.zzz = r1
            r1 = r40
            r0.zzA = r1
            r1 = r32
            r0.zzB = r1
            r1 = r41
            r0.zzC = r1
            r1 = r26
            r0.zzD = r1
            r1 = r27
            r0.zzE = r1
            r1 = r42
            r0.zzK = r1
            r1 = r43
            r0.zzL = r1
            r1 = r44
            r0.zzM = r1
            r1 = r45
            r0.zzN = r1
            r1 = r46
            r0.zzO = r1
            r1 = r47
            r0.zzP = r1
            r1 = r48
            r0.zzQ = r1
            r1 = r49
            r0.zzR = r1
            r1 = r50
            r0.zzS = r1
            r1 = r51
            r0.zzU = r1
            r1 = r52
            r0.zzV = r1
            com.google.android.gms.internal.ads.zzeza r1 = new com.google.android.gms.internal.ads.zzeza
            r2 = r28
            r1.<init>(r2)
            r0.zzW = r1
            r1 = r53
            r0.zzX = r1
            r1 = r54
            r0.zzY = r1
            r1 = r55
            r0.zzZ = r1
            r1 = r56
            r0.zzaa = r1
            r1 = r57
            r0.zzab = r1
            r1 = r58
            r0.zzac = r1
            r1 = r59
            r0.zzad = r1
            r1 = r33
            r0.zzae = r1
            r1 = r34
            r0.zzaf = r1
            r1 = r60
            r0.zzag = r1
            r1 = r61
            r0.zzah = r1
            r1 = r29
            r0.zzai = r1
            r1 = r62
            r0.zzF = r1
            r1 = r63
            r0.zzG = r1
            r1 = r64
            r0.zzH = r1
            r1 = r65
            r0.zzI = r1
            r1 = r66
            r0.zzJ = r1
            r1 = r67
            r0.zzaj = r1
            r1 = r30
            r0.zzak = r1
            r1 = r68
            r0.zzal = r1
            r1 = r35
            r0.zzam = r1
            r1 = r69
            r0.zzan = r1
            r1 = r31
            r0.zze = r1
            r1 = r70
            r0.zzT = r1
            r1 = r71
            r0.zzao = r1
            r1 = r72
            r0.zzap = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyc.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i10) {
        switch (i10) {
            case 1:
                return AdPreferences.TYPE_BANNER;
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i10) {
        if (i10 == 0 || i10 == 1) {
            return i10;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
