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
@Table(name = "memberreg", catalog = "javaassignment", schema = "")
@NamedQueries({
    @NamedQuery(name = "Memberreg_1.findAll", query = "SELECT m FROM Memberreg_1 m")
    , @NamedQuery(name = "Memberreg_1.findByFname", query = "SELECT m FROM Memberreg_1 m WHERE m.fname = :fname")
    , @NamedQuery(name = "Memberreg_1.findByLname", query = "SELECT m FROM Memberreg_1 m WHERE m.lname = :lname")
    , @NamedQuery(name = "Memberreg_1.findByDob", query = "SELECT m FROM Memberreg_1 m WHERE m.dob = :dob")
    , @NamedQuery(name = "Memberreg_1.findByAddress", query = "SELECT m FROM Memberreg_1 m WHERE m.address = :address")
    , @NamedQuery(name = "Memberreg_1.findByNic", query = "SELECT m FROM Memberreg_1 m WHERE m.nic = :nic")
    , @NamedQuery(name = "Memberreg_1.findByGender", query = "SELECT m FROM Memberreg_1 m WHERE m.gender = :gender")
    , @NamedQuery(name = "Memberreg_1.findByMemberid", query = "SELECT m FROM Memberreg_1 m WHERE m.memberid = :memberid")})
public class Memberreg_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "LNAME")
    private String lname;
    @Basic(optional = false)
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @Column(name = "NIC")
    private String nic;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MEMBERID")
    private Integer memberid;

    public Memberreg_1() {
    }

    public Memberreg_1(Integer memberid) {
        this.memberid = memberid;
    }

    public Memberreg_1(Integer memberid, String fname, String lname, Date dob, String address, String nic, String gender) {
        this.memberid = memberid;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.address = address;
        this.nic = nic;
        this.gender = gender;
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

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        Integer oldMemberid = this.memberid;
        this.memberid = memberid;
        changeSupport.firePropertyChange("memberid", oldMemberid, memberid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberid != null ? memberid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Memberreg_1)) {
            return false;
        }
        Memberreg_1 other = (Memberreg_1) object;
        if ((this.memberid == null && other.memberid != null) || (this.memberid != null && !this.memberid.equals(other.memberid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaassignment.Memberreg_1[ memberid=" + memberid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
