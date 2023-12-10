package model;

public class Grade {
    private String name;
    private String subject;
    private Integer score;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Grade(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

}
