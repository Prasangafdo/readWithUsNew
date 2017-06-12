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
@Table(name = "bookborrowreports", catalog = "javaassignment", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bookborrowreports_1.findAll", query = "SELECT b FROM Bookborrowreports_1 b")
    , @NamedQuery(name = "Bookborrowreports_1.findByIsbn", query = "SELECT b FROM Bookborrowreports_1 b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Bookborrowreports_1.findByMemberID", query = "SELECT b FROM Bookborrowreports_1 b WHERE b.memberID = :memberID")
    , @NamedQuery(name = "Bookborrowreports_1.findByBorrowedDate", query = "SELECT b FROM Bookborrowreports_1 b WHERE b.borrowedDate = :borrowedDate")
    , @NamedQuery(name = "Bookborrowreports_1.findByReturnedDate", query = "SELECT b FROM Bookborrowreports_1 b WHERE b.returnedDate = :returnedDate")})
public class Bookborrowreports_1 implements Serializable {

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
    @Column(name = "BorrowedDate")
    @Temporal(TemporalType.DATE)
    private Date borrowedDate;
    @Basic(optional = false)
    @Column(name = "ReturnedDate")
    @Temporal(TemporalType.DATE)
    private Date returnedDate;

    public Bookborrowreports_1() {
    }

    public Bookborrowreports_1(String isbn) {
        this.isbn = isbn;
    }

    public Bookborrowreports_1(String isbn, int memberID, Date borrowedDate, Date returnedDate) {
        this.isbn = isbn;
        this.memberID = memberID;
        this.borrowedDate = borrowedDate;
        this.returnedDate = returnedDate;
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

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        Date oldBorrowedDate = this.borrowedDate;
        this.borrowedDate = borrowedDate;
        changeSupport.firePropertyChange("borrowedDate", oldBorrowedDate, borrowedDate);
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        Date oldReturnedDate = this.returnedDate;
        this.returnedDate = returnedDate;
        changeSupport.firePropertyChange("returnedDate", oldReturnedDate, returnedDate);
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
        if (!(object instanceof Bookborrowreports_1)) {
            return false;
        }
        Bookborrowreports_1 other = (Bookborrowreports_1) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaassignment.Bookborrowreports_1[ isbn=" + isbn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
