package com.es2.memento;
import java.util.ArrayList;

public class BackupService {

    private Server server;
    private ArrayList<Memento> snapshots = new ArrayList<>();

    public BackupService(Server server) {
        this.server = server;
    }

    public void takeSnapshot(){
        snapshots.add(server.backup());
    }

    public void restoreSnapshot(int snapshotNumber)
            throws NotExistingSnapshotException{
        if (snapshotNumber < 0) {
            throw new NotExistingSnapshotException();
        }

        if (snapshotNumber >= snapshots.size()) {
            throw new NotExistingSnapshotException();
        }
        server.restore(snapshots.get(snapshotNumber));

    }
}
