/*
 * An XML document type.
 * Localname: ListOfCountryNamesByName
 * Namespace: http://www.oorsprong.org/websamples.countryinfo
 * Java type: org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.oorsprong.www.websamples_countryinfo;


/**
 * A document containing one ListOfCountryNamesByName(@http://www.oorsprong.org/websamples.countryinfo) element.
 *
 * This is a complex type.
 */
public interface ListOfCountryNamesByNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfCountryNamesByNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB6F1F2A3F71105CBEFEB2F5E948A2999").resolveHandle("listofcountrynamesbyname8f4adoctype");
    
    /**
     * Gets the "ListOfCountryNamesByName" element
     */
    org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName getListOfCountryNamesByName();
    
    /**
     * Sets the "ListOfCountryNamesByName" element
     */
    void setListOfCountryNamesByName(org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName listOfCountryNamesByName);
    
    /**
     * Appends and returns a new empty "ListOfCountryNamesByName" element
     */
    org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName addNewListOfCountryNamesByName();
    
    /**
     * An XML ListOfCountryNamesByName(@http://www.oorsprong.org/websamples.countryinfo).
     *
     * This is a complex type.
     */
    public interface ListOfCountryNamesByName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListOfCountryNamesByName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB6F1F2A3F71105CBEFEB2F5E948A2999").resolveHandle("listofcountrynamesbynameb205elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName newInstance() {
              return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument.ListOfCountryNamesByName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument newInstance() {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
