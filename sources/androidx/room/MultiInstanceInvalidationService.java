package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    int f4669a = 0;

    /* renamed from: b  reason: collision with root package name */
    final HashMap<Integer, String> f4670b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    final RemoteCallbackList<b> f4671c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final c.a f4672d = new b();

    class a extends RemoteCallbackList<b> {
        a() {
        }

        /* renamed from: a */
        public void onCallbackDied(b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f4670b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends c.a {
        b() {
        }

        public int W(b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4671c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.f4669a + 1;
                multiInstanceInvalidationService.f4669a = i10;
                if (multiInstanceInvalidationService.f4671c.register(bVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.f4670b.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4669a--;
                return 0;
            }
        }

        public void l1(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f4671c) {
                String str = MultiInstanceInvalidationService.this.f4670b.get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f4671c.beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f4671c.getBroadcastCookie(i11)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f4670b.get(Integer.valueOf(intValue));
                        if (i10 != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f4671c.getBroadcastItem(i11).J(strArr);
                        }
                    } catch (RemoteException e10) {
                        Log.w("ROOM", "Error invoking a remote callback", e10);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f4671c.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f4671c.finishBroadcast();
            }
        }

        public void u1(b bVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f4671c) {
                MultiInstanceInvalidationService.this.f4671c.unregister(bVar);
                MultiInstanceInvalidationService.this.f4670b.remove(Integer.valueOf(i10));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f4672d;
    }
}
