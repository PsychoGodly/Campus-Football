package bf;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* compiled from: Dns */
public interface n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f31808a = new a();

    /* compiled from: Dns */
    class a implements n {
        a() {
        }

        public List<InetAddress> a(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    }

    List<InetAddress> a(String str) throws UnknownHostException;
}
