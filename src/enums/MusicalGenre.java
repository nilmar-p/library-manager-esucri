package enums;

public enum MusicalGenre {
    ROCK("ROCK"),
    POP("POP"),
    JAZZ("JAZZ"),
    BLUES("BLUES"),
    CLASSICA("CLÁSSICA"),
    HIP_HOP("HIP HOP"),
    RAP("RAP"),
    ELECTRONIC("ELECTRONICA"),
    REGGAE("REGGAE"),
    COUNTRY("COUNTRY"),
    MPB("MPB"),
    SAMBA("SAMBA"),
    PAGODE("PAGODE"),
    SERTANEJO("SERTANEJO"),
    FUNK("FUNK"),
    FORRO("FORRÓ"),
    SERTANEJO_UNIVERSITARIO("SERTANEJO UNIVERSITÁRIO"),
    GOSPEL("GOSPEL"),
    METAL("METAL"),
    K_POP("K_POP"),
    NONE("NENHUM");

    //
    private final String musicalGenreDescription;

    //
    private MusicalGenre(String musicalGenreDescription) {
        this.musicalGenreDescription = musicalGenreDescription;
    }

    //
    @Override
    public String toString() {
        return musicalGenreDescription;
    }
}
