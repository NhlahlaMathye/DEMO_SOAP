

/**
 * CountryInfoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package org.oorsprong.websamples_countryinfo;

    /*
     *  CountryInfoService java interface
     */

    public interface CountryInfoService {
          

        /**
          * Auto generated method signature
          * Returns a struct with all the stored country information. Pass the ISO country code
                    * @param fullCountryInfo0
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.FullCountryInfoResponse fullCountryInfo(

                        org.oorsprong.www.websamples_countryinfo.FullCountryInfo fullCountryInfo0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a struct with all the stored country information. Pass the ISO country code
                * @param fullCountryInfo0
            
          */
        public void startfullCountryInfo(

            org.oorsprong.www.websamples_countryinfo.FullCountryInfo fullCountryInfo0,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a link to a picture of the country flag
                    * @param countryFlag2
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CountryFlagResponse countryFlag(

                        org.oorsprong.www.websamples_countryinfo.CountryFlag countryFlag2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a link to a picture of the country flag
                * @param countryFlag2
            
          */
        public void startcountryFlag(

            org.oorsprong.www.websamples_countryinfo.CountryFlag countryFlag2,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Searches the database for a country by the passed ISO country code
                    * @param countryName4
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CountryNameResponse countryName(

                        org.oorsprong.www.websamples_countryinfo.CountryName countryName4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Searches the database for a country by the passed ISO country code
                * @param countryName4
            
          */
        public void startcountryName(

            org.oorsprong.www.websamples_countryinfo.CountryName countryName4,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the currency ISO code and name for the passed country ISO code
                    * @param countryCurrency6
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CountryCurrencyResponse countryCurrency(

                        org.oorsprong.www.websamples_countryinfo.CountryCurrency countryCurrency6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the currency ISO code and name for the passed country ISO code
                * @param countryCurrency6
            
          */
        public void startcountryCurrency(

            org.oorsprong.www.websamples_countryinfo.CountryCurrency countryCurrency6,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all stored counties ordered by ISO code
                    * @param listOfCountryNamesByCode8
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCodeResponse listOfCountryNamesByCode(

                        org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCode listOfCountryNamesByCode8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all stored counties ordered by ISO code
                * @param listOfCountryNamesByCode8
            
          */
        public void startlistOfCountryNamesByCode(

            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByCode listOfCountryNamesByCode8,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of currencies ordered by name.
                    * @param listOfCurrenciesByName10
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByNameResponse listOfCurrenciesByName(

                        org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByName listOfCurrenciesByName10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of currencies ordered by name.
                * @param listOfCurrenciesByName10
            
          */
        public void startlistOfCurrenciesByName(

            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByName listOfCurrenciesByName10,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the internation phone code for the passed ISO country code
                    * @param countryIntPhoneCode12
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCodeResponse countryIntPhoneCode(

                        org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCode countryIntPhoneCode12)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the internation phone code for the passed ISO country code
                * @param countryIntPhoneCode12
            
          */
        public void startcountryIntPhoneCode(

            org.oorsprong.www.websamples_countryinfo.CountryIntPhoneCode countryIntPhoneCode12,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the name of the currency (if found)
                    * @param currencyName14
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CurrencyNameResponse currencyName(

                        org.oorsprong.www.websamples_countryinfo.CurrencyName currencyName14)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the name of the currency (if found)
                * @param currencyName14
            
          */
        public void startcurrencyName(

            org.oorsprong.www.websamples_countryinfo.CurrencyName currencyName14,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of currencies ordered by code.
                    * @param listOfCurrenciesByCode16
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCodeResponse listOfCurrenciesByCode(

                        org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCode listOfCurrenciesByCode16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of currencies ordered by code.
                * @param listOfCurrenciesByCode16
            
          */
        public void startlistOfCurrenciesByCode(

            org.oorsprong.www.websamples_countryinfo.ListOfCurrenciesByCode listOfCurrenciesByCode16,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns an array of languages ordered by code
                    * @param listOfLanguagesByCode18
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCodeResponse listOfLanguagesByCode(

                        org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCode listOfLanguagesByCode18)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns an array of languages ordered by code
                * @param listOfLanguagesByCode18
            
          */
        public void startlistOfLanguagesByCode(

            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByCode listOfLanguagesByCode18,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Find a language ISO code based on the passed language name
                    * @param languageISOCode20
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.LanguageISOCodeResponse languageISOCode(

                        org.oorsprong.www.websamples_countryinfo.LanguageISOCode languageISOCode20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Find a language ISO code based on the passed language name
                * @param languageISOCode20
            
          */
        public void startlanguageISOCode(

            org.oorsprong.www.websamples_countryinfo.LanguageISOCode languageISOCode20,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the  name of the captial city for the passed country code
                    * @param capitalCity22
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CapitalCityResponse capitalCity(

                        org.oorsprong.www.websamples_countryinfo.CapitalCity capitalCity22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the  name of the captial city for the passed country code
                * @param capitalCity22
            
          */
        public void startcapitalCity(

            org.oorsprong.www.websamples_countryinfo.CapitalCity capitalCity22,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns an array of languages ordered by name
                    * @param listOfLanguagesByName24
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByNameResponse listOfLanguagesByName(

                        org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByName listOfLanguagesByName24)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns an array of languages ordered by name
                * @param listOfLanguagesByName24
            
          */
        public void startlistOfLanguagesByName(

            org.oorsprong.www.websamples_countryinfo.ListOfLanguagesByName listOfLanguagesByName24,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all stored counties grouped per continent
                    * @param listOfCountryNamesGroupedByContinent26
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinentResponse listOfCountryNamesGroupedByContinent(

                        org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinent listOfCountryNamesGroupedByContinent26)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all stored counties grouped per continent
                * @param listOfCountryNamesGroupedByContinent26
            
          */
        public void startlistOfCountryNamesGroupedByContinent(

            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesGroupedByContinent listOfCountryNamesGroupedByContinent26,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all stored counties ordered by country name
                    * @param listOfCountryNamesByName28
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByNameResponse listOfCountryNamesByName(

                        org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByName listOfCountryNamesByName28)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all stored counties ordered by country name
                * @param listOfCountryNamesByName28
            
          */
        public void startlistOfCountryNamesByName(

            org.oorsprong.www.websamples_countryinfo.ListOfCountryNamesByName listOfCountryNamesByName28,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of continents ordered by name.
                    * @param listOfContinentsByName30
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByNameResponse listOfContinentsByName(

                        org.oorsprong.www.websamples_countryinfo.ListOfContinentsByName listOfContinentsByName30)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of continents ordered by name.
                * @param listOfContinentsByName30
            
          */
        public void startlistOfContinentsByName(

            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByName listOfContinentsByName30,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Find a language name based on the passed ISO language code
                    * @param languageName32
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.LanguageNameResponse languageName(

                        org.oorsprong.www.websamples_countryinfo.LanguageName languageName32)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Find a language name based on the passed ISO language code
                * @param languageName32
            
          */
        public void startlanguageName(

            org.oorsprong.www.websamples_countryinfo.LanguageName languageName32,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of continents ordered by code.
                    * @param listOfContinentsByCode34
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCodeResponse listOfContinentsByCode(

                        org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCode listOfContinentsByCode34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of continents ordered by code.
                * @param listOfContinentsByCode34
            
          */
        public void startlistOfContinentsByCode(

            org.oorsprong.www.websamples_countryinfo.ListOfContinentsByCode listOfContinentsByCode34,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all countries that use the same currency code. Pass a ISO currency code
                    * @param countriesUsingCurrency36
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrencyResponse countriesUsingCurrency(

                        org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrency countriesUsingCurrency36)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all countries that use the same currency code. Pass a ISO currency code
                * @param countriesUsingCurrency36
            
          */
        public void startcountriesUsingCurrency(

            org.oorsprong.www.websamples_countryinfo.CountriesUsingCurrency countriesUsingCurrency36,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * This function tries to found a country based on the passed country name.
                    * @param countryISOCode38
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.CountryISOCodeResponse countryISOCode(

                        org.oorsprong.www.websamples_countryinfo.CountryISOCode countryISOCode38)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * This function tries to found a country based on the passed country name.
                * @param countryISOCode38
            
          */
        public void startcountryISOCode(

            org.oorsprong.www.websamples_countryinfo.CountryISOCode countryISOCode38,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns an array with all countries and all the language information stored
                    * @param fullCountryInfoAllCountries40
                
         */

         
                     public org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountriesResponse fullCountryInfoAllCountries(

                        org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountries fullCountryInfoAllCountries40)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns an array with all countries and all the language information stored
                * @param fullCountryInfoAllCountries40
            
          */
        public void startfullCountryInfoAllCountries(

            org.oorsprong.www.websamples_countryinfo.FullCountryInfoAllCountries fullCountryInfoAllCountries40,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    