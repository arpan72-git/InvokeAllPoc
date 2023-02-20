import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class CVF{
    Set<CueEntity> videoCues = new HashSet<>();
    public static void main(String[] args) {
        CVF cvf = new CVF();
        CueEntity cueEntity = new CueEntity();
        cvf.addCue(cueEntity);
        CueEntity cueEntity1 = new CueEntity();
        cvf.addCue(cueEntity1);
        cvf.removeCue(cueEntity);
    }

    public void addCue(CueEntity cue) {
        videoCues.add(cue);
    }

    public void removeCue(CueEntity cue) {
        videoCues.remove(cue);
    }
}

class CueEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CueEntity)) return false;
        CueEntity cueEntity = (CueEntity) o;
        return getId() != null && getId().equals(cueEntity.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
