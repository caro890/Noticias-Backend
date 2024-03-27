package lab4.tp2.NoticiasBackend.config;

import lab4.tp2.NoticiasBackend.entities.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }
}
