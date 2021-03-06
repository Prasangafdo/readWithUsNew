/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Prasanga Fernando
 */
@Entity
@Table(name = "bookreg", catalog = "javaassignment", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookreg_1.findAll", query = "SELECT b FROM Bookreg_1 b")
    , @NamedQuery(name = "Bookreg_1.findByIsbn", query = "SELECT b FROM Bookreg_1 b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Bookreg_1.findByTitle", query = "SELECT b FROM Bookreg_1 b WHERE b.title = :title")
    , @NamedQuery(name = "Bookreg_1.findByAuthor", query = "SELECT b FROM Bookreg_1 b WHERE b.author = :author")
    , @NamedQuery(name = "Bookreg_1.findByPublisher", query = "SELECT b FROM Bookreg_1 b WHERE b.publisher = :publisher")
    , @NamedQuery(name = "Bookreg_1.findByEdition", query = "SELECT b FROM Bookreg_1 b WHERE b.edition = :edition")
    , @NamedQuery(name = "Bookreg_1.findByCategory", query = "SELECT b FROM Bookreg_1 b WHERE b.category = :category")
    , @NamedQuery(name = "Bookreg_1.findByYear", query = "SELECT b FROM Bookreg_1 b WHERE b.year = :year")})
public class Bookreg_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "AUTHOR")
    private String author;
    @Basic(optional = false)
    @Column(name = "PUBLISHER")
    private String publisher;
    @Basic(optional = false)
    @Column(name = "EDITION")
    private int edition;
    @Basic(optional = false)
    @Column(name = "CATEGORY")
    private String category;
    @Basic(optional = false)
    @Column(name = "YEAR")
    private int year;

    public Bookreg_1() {
    }

    public Bookreg_1(String isbn) {
        this.isbn = isbn;
    }

    public Bookreg_1(String isbn, String title, String author, String publisher, int edition, String category, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.category = category;
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        String oldAuthor = this.author;
        this.author = author;
        changeSupport.firePropertyChange("author", oldAuthor, author);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String oldPublisher = this.publisher;
        this.publisher = publisher;
        changeSupport.firePropertyChange("publisher", oldPublisher, publisher);
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        int oldEdition = this.edition;
        this.edition = edition;
        changeSupport.firePropertyChange("edition", oldEdition, edition);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookreg_1)) {
            return false;
        }
        Bookreg_1 other = (Bookreg_1) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaassignment.Bookreg_1[ isbn=" + isbn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
