package com.es2.objectpool;
import java.lang.Object;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.net.URL;
import java.io.IOException;

public class ReusablePool {
    private static ReusablePool instance;
    private Integer maxSize;
    private ArrayList<HttpURLConnection> free;
    private ArrayList<HttpURLConnection> used;

    // Constructor
    private ReusablePool() {
        this.maxSize = 10;
        this.free = new ArrayList<HttpURLConnection>();
        this.used = new ArrayList<HttpURLConnection>();
    };

    // Getters & Setters
    public static ReusablePool getInstance() {
        if (instance == null) {
            instance = new ReusablePool();
        }
        return instance;
    }

    public synchronized HttpURLConnection acquire() throws PoolExhaustedException, IOException {

        HttpURLConnection outConn = null;

        if (used.size() >= maxSize) {
            throw new PoolExhaustedException();
        }

        if (free.isEmpty()) {
            outConn = (HttpURLConnection) new URL("http://ipv.pt").openConnection();
        } else {
            outConn = free.get(0);
            free.remove(0);
            outConn.connect();
        }

        used.add(outConn);
        return outConn;
    }

    public synchronized void release(HttpURLConnection conn) throws ObjectNotFoundException {
        if (!used.contains(conn)) {
            throw new ObjectNotFoundException();
        }
        conn.disconnect();
        used.remove(conn);
        free.add(conn);
    }

    public synchronized void resetPool() {
        for (HttpURLConnection connection : free) {
            connection.disconnect();
        }
        free.clear();
        for (HttpURLConnection connection : used) {
            connection.disconnect();
        }
        used.clear();
    }

    public synchronized void setMaxPoolSize(int maxSize) {
        this.maxSize = maxSize;
    }

}
