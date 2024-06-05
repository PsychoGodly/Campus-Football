package com.applovin.exoplayer2.ui;

public interface i {

    public interface a {
        void a(i iVar, long j10);

        void a(i iVar, long j10, boolean z10);

        void b(i iVar, long j10);
    }

    void a(a aVar);

    void a(long[] jArr, boolean[] zArr, int i10);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setPosition(long j10);
}
