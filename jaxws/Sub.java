
package br.ufrpe.dc.soa.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.5.1
 * Fri Apr 01 18:01:19 BRT 2022
 * Generated source version: 3.5.1
 */

@XmlRootElement(name = "sub", namespace = "http://soa.dc.ufrpe.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sub", namespace = "http://soa.dc.ufrpe.br/", propOrder = {"arg0", "arg1"})

public class Sub {

    @XmlElement(name = "arg0")
    private float arg0;
    @XmlElement(name = "arg1")
    private float arg1;

    public float getArg0() {
        return this.arg0;
    }

    public void setArg0(float newArg0)  {
        this.arg0 = newArg0;
    }

    public float getArg1() {
        return this.arg1;
    }

    public void setArg1(float newArg1)  {
        this.arg1 = newArg1;
    }

}

