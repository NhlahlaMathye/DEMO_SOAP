/*
 * An XML document type.
 * Localname: ListOfContinentsByName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo.impl;
/**
 * A document containing one ListOfContinentsByName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public class ListOfContinentsByNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument
{
    
    public ListOfContinentsByNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTOFCONTINENTSBYNAME$0 = 
        new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "ListOfContinentsByName");
    
    
    /**
     * Gets the "ListOfContinentsByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName getListOfContinentsByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName)get_store().find_element_user(LISTOFCONTINENTSBYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListOfContinentsByName" element
     */
    public void setListOfContinentsByName(org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName listOfContinentsByName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName)get_store().find_element_user(LISTOFCONTINENTSBYNAME$0, 0);
            if (target == null)
            {
                target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName)get_store().add_element_user(LISTOFCONTINENTSBYNAME$0);
            }
            target.set(listOfContinentsByName);
        }
    }
    
    /**
     * Appends and returns a new empty "ListOfContinentsByName" element
     */
    public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName addNewListOfContinentsByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName target = null;
            target = (org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName)get_store().add_element_user(LISTOFCONTINENTSBYNAME$0);
            return target;
        }
    }
    /**
     * An XML ListOfContinentsByName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public static class ListOfContinentsByNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameDocument.ListOfContinentsByName
    {
        
        public ListOfContinentsByNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
