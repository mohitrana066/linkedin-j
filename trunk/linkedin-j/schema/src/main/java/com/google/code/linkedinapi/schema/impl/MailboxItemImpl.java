//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.10 at 10:39:01 AM GMT+05:00 
//


package com.google.code.linkedinapi.schema.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.ItemContent;
import com.google.code.linkedinapi.schema.MailboxItem;
import com.google.code.linkedinapi.schema.Recipients;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recipients",
    "subject",
    "body",
    "itemContent"
})
@XmlRootElement(name = "mailbox-item")
public class MailboxItemImpl
    implements MailboxItem
{

    @XmlElement(required = true, type = RecipientsImpl.class)
    protected RecipientsImpl recipients;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String body;
    @XmlElement(name = "item-content", type = ItemContentImpl.class)
    protected ItemContentImpl itemContent;

    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients value) {
        this.recipients = ((RecipientsImpl) value);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String value) {
        this.subject = value;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String value) {
        this.body = value;
    }

    public ItemContent getItemContent() {
        return itemContent;
    }

    public void setItemContent(ItemContent value) {
        this.itemContent = ((ItemContentImpl) value);
    }

}
