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
@Table(name = "member", catalog = "javaassignment", schema = "")
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m"),
    @NamedQuery(name = "Member1.findByMemberID", query = "SELECT m FROM Member1 m WHERE m.memberID = :memberID"),
    @NamedQuery(name = "Member1.findByFname", query = "SELECT m FROM Member1 m WHERE m.fname = :fname"),
    @NamedQuery(name = "Member1.findByLname", query = "SELECT m FROM Member1 m WHERE m.lname = :lname"),
    @NamedQuery(name = "Member1.findByDob", query = "SELECT m FROM Member1 m WHERE m.dob = :dob"),
    @NamedQuery(name = "Member1.findByAddress", query = "SELECT m FROM Member1 m WHERE m.address = :address"),
    @NamedQuery(name = "Member1.findByNic", query = "SELECT m FROM Member1 m WHERE m.nic = :nic"),
    @NamedQuery(name = "Member1.findByGender", query = "SELECT m FROM Member1 m WHERE m.gender = :gender")})
public class Member1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MemberID")
    private Integer memberID;
    @Basic(optional = false)
    @Column(name = "Fname")
    private String fname;
    @Basic(optional = false)
    @Column(name = "Lname")
    private String lname;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "NIC")
    private String nic;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;

    public Member1() {
    }

    public Member1(Integer memberID) {
        this.memberID = memberID;
    }

    public Member1(Integer memberID, String fname, String lname, Date dob, String address, String nic, String gender) {
        this.memberID = memberID;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.address = address;
        this.nic = nic;
        this.gender = gender;
    }

    public Integer getMemberID() {
        return memberID;
    }

    public void setMemberID(Integer memberID) {
        Integer oldMemberID = this.memberID;
        this.memberID = memberID;
        changeSupport.firePropertyChange("memberID", oldMemberID, memberID);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        String oldLname = this.lname;
        this.lname = lname;
        changeSupport.firePropertyChange("lname", oldLname, lname);
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        Date oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        String oldNic = this.nic;
        this.nic = nic;
        changeSupport.firePropertyChange("nic", oldNic, nic);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberID != null ? memberID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.memberID == null && other.memberID != null) || (this.memberID != null && !this.memberID.equals(other.memberID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaassignment.Member1[ memberID=" + memberID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
