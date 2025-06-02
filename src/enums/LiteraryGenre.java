package enums;

public enum LiteraryGenre {
    ROMANCE("ROMANCE"),
    AVENTURA("AVENTURA"),
    TERROR("TERROR"),
    FICCAO_CIENTIFICA("FICÇÃO CIENTÍFICA"),
    FANTASIA("FANTASIA"),
    DRAMA("DRAMA"),
    BIOGRAFIA("BIOGRAFIA"),
    TECNICO("TECNICO"),
    HISTORIA("HISTÓRIA"),
    INFANTIL("INFANTIL"),
    AUTOAJUDA("AUTOAJUDA"),
    NONE("NENHUM");

    //
    private final String literaryGenreDescription;

    //
    private LiteraryGenre(String literaryGenreDescription) {
        this.literaryGenreDescription = literaryGenreDescription;
    }

    //
    @Override
    public String toString() {
        return literaryGenreDescription;
    }
}
