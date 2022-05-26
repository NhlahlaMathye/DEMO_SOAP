
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package org.oorsprong.www.websamples_countryinfo;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "tCountryInfo".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.TCountryInfo.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "ArrayOftContinent".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.ArrayOftContinent.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "tCountryCodeAndName".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.TCountryCodeAndName.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "tLanguage".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.TLanguage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "ArrayOftCountryCodeAndName".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndName.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "ArrayOftCountryCodeAndNameGroupedByContinent".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.ArrayOftCountryCodeAndNameGroupedByContinent.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "tCountryCodeAndNameGroupedByContinent".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.TCountryCodeAndNameGroupedByContinent.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "ArrayOftLanguage".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.ArrayOftLanguage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "ArrayOftCurrency".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.ArrayOftCurrency.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "tCurrency".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.TCurrency.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "tContinent".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.TContinent.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.oorsprong.org/websamples.countryinfo".equals(namespaceURI) &&
                  "ArrayOftCountryInfo".equals(typeName)){
                   
                            return  org.oorsprong.www.websamples_countryinfo.ArrayOftCountryInfo.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    