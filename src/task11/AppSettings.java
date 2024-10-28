package task11;

public class AppSettings implements Prototype {
    private String theme;
    private int fontSize;
    private String language;

    public AppSettings(String theme, int fontSize, String language) {
        this.theme = theme;
        this.fontSize = fontSize;
        this.language = language;
    }

    // Геттеры и сеттеры
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Реализация метода clone
    @Override
    public AppSettings clone() {
        return new AppSettings(this.theme, this.fontSize, this.language);
    }

    @Override
    public String toString() {
        return "AppSettings{" +
                "theme='" + theme + '\'' +
                ", fontSize=" + fontSize +
                ", language='" + language + '\'' +
                '}';
    }
}
