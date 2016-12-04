/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    })
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTID")
    private Integer productid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRODUCTCODE")
    private String productcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "PRODUCTNAME")
    private String productname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "PRODUCTDESCRIPTION")
    private String productdescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICE")
    private int price;
    @Column(name = "PICTURE")
    private Boolean picture;
    @Size(max = 50)
    @Column(name = "AVAILABLECITYPRODUCT")
    private String availablecityproduct;
    @Size(max = 50)
    @Column(name = "ADVERTISERNAME")
    private String advertisername;
    @Size(max = 20)
    @Column(name = "ADVERTISERPHONE")
    private String advertiserphone;

    public Producto() {
    }

    public Producto(Integer productid) {
        this.productid = productid;
    }

    public Producto(Integer productid, String productcode, String productname, String productdescription, int price) {
        this.productid = productid;
        this.productcode = productcode;
        this.productname = productname;
        this.productdescription = productdescription;
        this.price = price;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getPicture() {
        return picture;
    }

    public void setPicture(Boolean picture) {
        this.picture = picture;
    }

    public String getAvailablecityproduct() {
        return availablecityproduct;
    }

    public void setAvailablecityproduct(String availablecityproduct) {
        this.availablecityproduct = availablecityproduct;
    }

    public String getAdvertisername() {
        return advertisername;
    }

    public void setAdvertisername(String advertisername) {
        this.advertisername = advertisername;
    }

    public String getAdvertiserphone() {
        return advertiserphone;
    }

    public void setAdvertiserphone(String advertiserphone) {
        this.advertiserphone = advertiserphone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "me.model.Producto[ productid=" + productid + " ]";
    }
    
}
