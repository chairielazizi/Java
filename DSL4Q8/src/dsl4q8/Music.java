package dsl4q8;

public class Music {
    private String title;
    private String file;

    public Music(String title, String file) {
        this.title = title;
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    
    public String toString() {
        return "Music : " + title;
    }
    
    
}

