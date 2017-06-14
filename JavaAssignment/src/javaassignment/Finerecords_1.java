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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "finerecords", catalog = "javaassignment", schema = "")
@NamedQueries({
    @NamedQuery(name = "Finerecords_1.findAll", query = "SELECT f FROM Finerecords_1 f")
    , @NamedQuery(name = "Finerecords_1.findByMemberID", query = "SELECT f FROM Finerecords_1 f WHERE f.memberID = :memberID")
    , @NamedQuery(name = "Finerecords_1.findByIsbn", query = "SELECT f FROM Finerecords_1 f WHERE f.isbn = :isbn")
    , @NamedQuery(name = "Finerecords_1.findByFines", query = "SELECT f FROM Finerecords_1 f WHERE f.fines = :fines")
    , @NamedQuery(name = "Finerecords_1.findByFineID", query = "SELECT f FROM Finerecords_1 f WHERE f.fineID = :fineID")})
public class Finerecords_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "memberID")
    private int memberID;
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Basic(optional = false)
    @Column(name = "Fines")
    private int fines;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FineID")
    private Integer fineID;

    public Finerecords_1() {
    }

    public Finerecords_1(Integer fineID) {
        this.fineID = fineID;
    }

    public Finerecords_1(Integer fineID, int memberID, String isbn, int fines) {
        this.fineID = fineID;
        this.memberID = memberID;
        this.isbn = isbn;
        this.fines = fines;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        int oldMemberID = this.memberID;
        this.memberID = memberID;
        changeSupport.firePropertyChange("memberID", oldMemberID, memberID);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public int getFines() {
        return fines;
    }

    public void setFines(int fines) {
        int oldFines = this.fines;
        this.fines = fines;
        changeSupport.firePropertyChange("fines", oldFines, fines);
    }

    public Integer getFineID() {
        return fineID;
    }

    public void setFineID(Integer fineID) {
        Integer oldFineID = this.fineID;
        this.fineID = fineID;
        changeSupport.firePropertyChange("fineID", oldFineID, fineID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fineID != null ? fineID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Finerecords_1)) {
            return false;
        }
        Finerecords_1 other = (Finerecords_1) object;
        if ((this.fineID == null && other.fineID != null) || (this.fineID != null && !this.fineID.equals(other.fineID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaassignment.Finerecords_1[ fineID=" + fineID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
