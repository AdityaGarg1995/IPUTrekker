package com.example.ipu_trekker.ggsipu.Streams;


public class SubjectQuadruplet {

    String subject, sem, subjectName, book;
    public SubjectQuadruplet(String subject, String sem, String subjectName, String book){
        this.subject = subject;
        this.sem = sem;
        this.subjectName = subjectName;
        this.book = book;
    }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

    public String getSem() { return sem; }

    public void setSem(String sem) { this.sem = sem; }

    public String getSubjectName() { return subjectName; }

    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }

    public String getBook() { return book; }

    public void setBook(String book) { this.book = book; }

}
