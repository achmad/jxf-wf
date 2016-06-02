/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jxf.common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 *
 * @author achmad.ha
 */
@MappedSuperclass
public class BaseAuditVersioning extends BaseAuditImpl implements Serializable{
    
    @Version
    @Column(name="IVER",nullable=false)
    private Integer iver;

    public Integer getIver() {
        return iver;
    }

    public void setIver(Integer iver) {
        this.iver = iver;
    }
}
