/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Prasanga Fernando
 */
@Entity
@Table(name = "bookreservationreports", catalog = "javaassignment", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookreservationreports_1.findAll", query = "SELECT b FROM Bookreservationreports_1 b")
    , @NamedQuery(name = "Bookreservationreports_1.findByIsbn", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Bookreservationreports_1.findByMemberID", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.memberID = :memberID")
    , @NamedQuery(name = "Bookreservationreports_1.findByBookTitle", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.bookTitle = :bookTitle")
    , @NamedQuery(name = "Bookreservationreports_1.findByAuthor", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.author = :author")
    , @NamedQuery(name = "Bookreservationreports_1.findByPublisher", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.publisher = :publisher")
    , @NamedQuery(name = "Bookreservationreports_1.findByEdition", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.edition = :edition")
    , @NamedQuery(name = "Bookreservationreports_1.findByCategory", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.category = :category")
    , @NamedQuery(name = "Bookreservationreports_1.findByYear", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.year = :year")
    , @NamedQuery(name = "Bookreservationreports_1.findByReservedDate", query = "SELECT b FROM Bookreservationreports_1 b WHERE b.reservedDate = :reservedDate")})
public class Bookreservationreports_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "MemberID")
    private int memberID;
    @Basic(optional = false)
    @Column(name = "BookTitle")
    private String bookTitle;
    @Basic(optional = false)
    @Column(name = "Author")
    private String author;
    @Basic(optional = false)
    @Column(name = "Publisher")
    private String publisher;
    @Basic(optional = false)
    @Column(name = "Edition")
    private int edition;
    @Basic(optional = false)
    @Column(name = "Category")
    private String category;
    @Basic(optional = false)
    @Column(name = "Year")
    private int year;
    @Basic(optional = false)
    @Column(name = "ReservedDate")
    @Temporal(TemporalType.DATE)
    private Date reservedDate;

    public Bookreservationreports_1() {
    }

    public Bookreservationreports_1(String isbn) {
        this.isbn = isbn;
    }

    public Bookreservationreports_1(String isbn, int memberID, String bookTitle, String author, String publisher, int edition, String category, int year, Date reservedDate) {
        this.isbn = isbn;
        this.memberID = memberID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.category = category;
        this.year = year;
        this.reservedDate = reservedDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        int oldMemberID = this.memberID;
        this.memberID = memberID;
        changeSupport.firePropertyChange("memberID", oldMemberID, memberID);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        String oldBookTitle = this.bookTitle;
        this.bookTitle = bookTitle;
        changeSupport.firePropertyChange("bookTitle", oldBookTitle, bookTitle);
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

    public Date getReservedDate() {
        return reservedDate;
    }

    public void setReservedDate(Date reservedDate) {
        Date oldReservedDate = this.reservedDate;
        this.reservedDate = reservedDate;
        changeSupport.firePropertyChange("reservedDate", oldReservedDate, reservedDate);
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
        if (!(object instanceof Bookreservationreports_1)) {
            return false;
        }
        Bookreservationreports_1 other = (Bookreservationreports_1) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaassignment.Bookreservationreports_1[ isbn=" + isbn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
