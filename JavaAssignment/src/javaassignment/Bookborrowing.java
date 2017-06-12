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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "bookborrowing", catalog = "javaassignment", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookborrowing.findAll", query = "SELECT b FROM Bookborrowing b")
    , @NamedQuery(name = "Bookborrowing.findByBorrowID", query = "SELECT b FROM Bookborrowing b WHERE b.borrowID = :borrowID")
    , @NamedQuery(name = "Bookborrowing.findByIsbn", query = "SELECT b FROM Bookborrowing b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Bookborrowing.findByBookTitle", query = "SELECT b FROM Bookborrowing b WHERE b.bookTitle = :bookTitle")
    , @NamedQuery(name = "Bookborrowing.findByAuthor", query = "SELECT b FROM Bookborrowing b WHERE b.author = :author")
    , @NamedQuery(name = "Bookborrowing.findByPublisher", query = "SELECT b FROM Bookborrowing b WHERE b.publisher = :publisher")
    , @NamedQuery(name = "Bookborrowing.findByEdition", query = "SELECT b FROM Bookborrowing b WHERE b.edition = :edition")
    , @NamedQuery(name = "Bookborrowing.findByCategory", query = "SELECT b FROM Bookborrowing b WHERE b.category = :category")
    , @NamedQuery(name = "Bookborrowing.findByYear", query = "SELECT b FROM Bookborrowing b WHERE b.year = :year")
    , @NamedQuery(name = "Bookborrowing.findByMemberID", query = "SELECT b FROM Bookborrowing b WHERE b.memberID = :memberID")
    , @NamedQuery(name = "Bookborrowing.findByBorrowedDate", query = "SELECT b FROM Bookborrowing b WHERE b.borrowedDate = :borrowedDate")
    , @NamedQuery(name = "Bookborrowing.findByReturnDate", query = "SELECT b FROM Bookborrowing b WHERE b.returnDate = :returnDate")})
public class Bookborrowing implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "borrowID")
    private Integer borrowID;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "bookTitle")
    private String bookTitle;
    @Basic(optional = false)
    @Column(name = "author")
    private String author;
    @Basic(optional = false)
    @Column(name = "publisher")
    private String publisher;
    @Basic(optional = false)
    @Column(name = "edition")
    private String edition;
    @Basic(optional = false)
    @Column(name = "category")
    private String category;
    @Basic(optional = false)
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @Column(name = "memberID")
    private int memberID;
    @Basic(optional = false)
    @Column(name = "borrowedDate")
    @Temporal(TemporalType.DATE)
    private Date borrowedDate;
    @Basic(optional = false)
    @Column(name = "returnDate")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    public Bookborrowing() {
    }

    public Bookborrowing(Integer borrowID) {
        this.borrowID = borrowID;
    }

    public Bookborrowing(Integer borrowID, String isbn, String bookTitle, String author, String publisher, String edition, String category, int year, int memberID, Date borrowedDate, Date returnDate) {
        this.borrowID = borrowID;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.category = category;
        this.year = year;
        this.memberID = memberID;
        this.borrowedDate = borrowedDate;
        this.returnDate = returnDate;
    }

    public Integer getBorrowID() {
        return borrowID;
    }

    public void setBorrowID(Integer borrowID) {
        Integer oldBorrowID = this.borrowID;
        this.borrowID = borrowID;
        changeSupport.firePropertyChange("borrowID", oldBorrowID, borrowID);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        String oldEdition = this.edition;
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

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        int oldMemberID = this.memberID;
        this.memberID = memberID;
        changeSupport.firePropertyChange("memberID", oldMemberID, memberID);
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        Date oldBorrowedDate = this.borrowedDate;
        this.borrowedDate = borrowedDate;
        changeSupport.firePropertyChange("borrowedDate", oldBorrowedDate, borrowedDate);
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        Date oldReturnDate = this.returnDate;
        this.returnDate = returnDate;
        changeSupport.firePropertyChange("returnDate", oldReturnDate, returnDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (borrowID != null ? borrowID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookborrowing)) {
            return false;
        }
        Bookborrowing other = (Bookborrowing) object;
        if ((this.borrowID == null && other.borrowID != null) || (this.borrowID != null && !this.borrowID.equals(other.borrowID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaassignment.Bookborrowing[ borrowID=" + borrowID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
