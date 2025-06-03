package model;

public class ProfitRules {

    private static double bookMargin = 0.10;
    private static double cdMargin = 0.10;
    private static double comicsMargin = 0.10;
    private static double magazineMargin = 0.10;
    private static double noneMargin = 0.10;
    //

    public ProfitRules() {
        this.setBookMargin(0.10);
        this.setCdMargin(0.10);
        this.setComicsMargin(0.10);
        this.setMagazineMargin(0.10);
        this.setNoneMargin(0.10);
    }

    public ProfitRules(double bookMargin, double cdMargin, double comicsMargin, double magazineMargin, double noneMargin) {
        this.setBookMargin(bookMargin);
        this.setCdMargin(cdMargin);
        this.setComicsMargin(comicsMargin);
        this.setMagazineMargin(magazineMargin);
        this.setNoneMargin(noneMargin);
    }

    //getters and setters
    public static double getBookMargin() {
        return bookMargin;
    }

    public static double getCdMargin() {
        return cdMargin;
    }

    public static  double getComicsMargin() {
        return comicsMargin;
    }

    public static double getMagazineMargin() {
        return magazineMargin;
    }

    public static double getNoneMargin() {
        return noneMargin;
    }

    //
    public static void setBookMargin(double bookMargin) {
        ProfitRules.bookMargin = bookMargin < 0 ? 0.10 : bookMargin;
    }

    public static void setCdMargin(double cdMargin) {
        ProfitRules.cdMargin = cdMargin < 0 ? 0.10 : cdMargin;
    }

    public static void setComicsMargin(double comicsMargin) {
        ProfitRules.comicsMargin = comicsMargin < 0 ? 0.10 : comicsMargin;
    }

    public static void setMagazineMargin(double magazineMargin) {
        ProfitRules.magazineMargin = magazineMargin < 0 ? 0.10 : magazineMargin;
    }

    public static void setNoneMargin(double noneMargin) {
        ProfitRules.noneMargin = noneMargin < 0 ? 0.10 : noneMargin;
    }

}
