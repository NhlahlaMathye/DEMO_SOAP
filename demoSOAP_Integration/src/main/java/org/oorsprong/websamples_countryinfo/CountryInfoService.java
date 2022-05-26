

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

         
                     public CountryInfoServiceStub.FullCountryInfoResponse fullCountryInfo(

                        CountryInfoServiceStub.FullCountryInfo fullCountryInfo0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a struct with all the stored country information. Pass the ISO country code
                * @param fullCountryInfo0
            
          */
        public void startfullCountryInfo(

            CountryInfoServiceStub.FullCountryInfo fullCountryInfo0,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a link to a picture of the country flag
                    * @param countryFlag2
                
         */

         
                     public CountryInfoServiceStub.CountryFlagResponse countryFlag(

                        CountryInfoServiceStub.CountryFlag countryFlag2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a link to a picture of the country flag
                * @param countryFlag2
            
          */
        public void startcountryFlag(

            CountryInfoServiceStub.CountryFlag countryFlag2,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Searches the database for a country by the passed ISO country code
                    * @param countryName4
                
         */

         
                     public CountryInfoServiceStub.CountryNameResponse countryName(

                        CountryInfoServiceStub.CountryName countryName4)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Searches the database for a country by the passed ISO country code
                * @param countryName4
            
          */
        public void startcountryName(

            CountryInfoServiceStub.CountryName countryName4,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the currency ISO code and name for the passed country ISO code
                    * @param countryCurrency6
                
         */

         
                     public CountryInfoServiceStub.CountryCurrencyResponse countryCurrency(

                        CountryInfoServiceStub.CountryCurrency countryCurrency6)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the currency ISO code and name for the passed country ISO code
                * @param countryCurrency6
            
          */
        public void startcountryCurrency(

            CountryInfoServiceStub.CountryCurrency countryCurrency6,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all stored counties ordered by ISO code
                    * @param listOfCountryNamesByCode8
                
         */

         
                     public CountryInfoServiceStub.ListOfCountryNamesByCodeResponse listOfCountryNamesByCode(

                        CountryInfoServiceStub.ListOfCountryNamesByCode listOfCountryNamesByCode8)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all stored counties ordered by ISO code
                * @param listOfCountryNamesByCode8
            
          */
        public void startlistOfCountryNamesByCode(

            CountryInfoServiceStub.ListOfCountryNamesByCode listOfCountryNamesByCode8,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of currencies ordered by name.
                    * @param listOfCurrenciesByName10
                
         */

         
                     public CountryInfoServiceStub.ListOfCurrenciesByNameResponse listOfCurrenciesByName(

                        CountryInfoServiceStub.ListOfCurrenciesByName listOfCurrenciesByName10)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of currencies ordered by name.
                * @param listOfCurrenciesByName10
            
          */
        public void startlistOfCurrenciesByName(

            CountryInfoServiceStub.ListOfCurrenciesByName listOfCurrenciesByName10,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the internation phone code for the passed ISO country code
                    * @param countryIntPhoneCode12
                
         */

         
                     public CountryInfoServiceStub.CountryIntPhoneCodeResponse countryIntPhoneCode(

                        CountryInfoServiceStub.CountryIntPhoneCode countryIntPhoneCode12)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the internation phone code for the passed ISO country code
                * @param countryIntPhoneCode12
            
          */
        public void startcountryIntPhoneCode(

            CountryInfoServiceStub.CountryIntPhoneCode countryIntPhoneCode12,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the name of the currency (if found)
                    * @param currencyName14
                
         */

         
                     public CountryInfoServiceStub.CurrencyNameResponse currencyName(

                        CountryInfoServiceStub.CurrencyName currencyName14)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the name of the currency (if found)
                * @param currencyName14
            
          */
        public void startcurrencyName(

            CountryInfoServiceStub.CurrencyName currencyName14,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of currencies ordered by code.
                    * @param listOfCurrenciesByCode16
                
         */

         
                     public CountryInfoServiceStub.ListOfCurrenciesByCodeResponse listOfCurrenciesByCode(

                        CountryInfoServiceStub.ListOfCurrenciesByCode listOfCurrenciesByCode16)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of currencies ordered by code.
                * @param listOfCurrenciesByCode16
            
          */
        public void startlistOfCurrenciesByCode(

            CountryInfoServiceStub.ListOfCurrenciesByCode listOfCurrenciesByCode16,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns an array of languages ordered by code
                    * @param listOfLanguagesByCode18
                
         */

         
                     public CountryInfoServiceStub.ListOfLanguagesByCodeResponse listOfLanguagesByCode(

                        CountryInfoServiceStub.ListOfLanguagesByCode listOfLanguagesByCode18)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns an array of languages ordered by code
                * @param listOfLanguagesByCode18
            
          */
        public void startlistOfLanguagesByCode(

            CountryInfoServiceStub.ListOfLanguagesByCode listOfLanguagesByCode18,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Find a language ISO code based on the passed language name
                    * @param languageISOCode20
                
         */

         
                     public CountryInfoServiceStub.LanguageISOCodeResponse languageISOCode(

                        CountryInfoServiceStub.LanguageISOCode languageISOCode20)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Find a language ISO code based on the passed language name
                * @param languageISOCode20
            
          */
        public void startlanguageISOCode(

            CountryInfoServiceStub.LanguageISOCode languageISOCode20,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns the  name of the captial city for the passed country code
                    * @param capitalCity22
                
         */

         
                     public CountryInfoServiceStub.CapitalCityResponse capitalCity(

                        CountryInfoServiceStub.CapitalCity capitalCity22)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns the  name of the captial city for the passed country code
                * @param capitalCity22
            
          */
        public void startcapitalCity(

            CountryInfoServiceStub.CapitalCity capitalCity22,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns an array of languages ordered by name
                    * @param listOfLanguagesByName24
                
         */

         
                     public CountryInfoServiceStub.ListOfLanguagesByNameResponse listOfLanguagesByName(

                        CountryInfoServiceStub.ListOfLanguagesByName listOfLanguagesByName24)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns an array of languages ordered by name
                * @param listOfLanguagesByName24
            
          */
        public void startlistOfLanguagesByName(

            CountryInfoServiceStub.ListOfLanguagesByName listOfLanguagesByName24,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all stored counties grouped per continent
                    * @param listOfCountryNamesGroupedByContinent26
                
         */

         
                     public CountryInfoServiceStub.ListOfCountryNamesGroupedByContinentResponse listOfCountryNamesGroupedByContinent(

                        CountryInfoServiceStub.ListOfCountryNamesGroupedByContinent listOfCountryNamesGroupedByContinent26)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all stored counties grouped per continent
                * @param listOfCountryNamesGroupedByContinent26
            
          */
        public void startlistOfCountryNamesGroupedByContinent(

            CountryInfoServiceStub.ListOfCountryNamesGroupedByContinent listOfCountryNamesGroupedByContinent26,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all stored counties ordered by country name
                    * @param listOfCountryNamesByName28
                
         */

         
                     public CountryInfoServiceStub.ListOfCountryNamesByNameResponse listOfCountryNamesByName(

                        CountryInfoServiceStub.ListOfCountryNamesByName listOfCountryNamesByName28)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all stored counties ordered by country name
                * @param listOfCountryNamesByName28
            
          */
        public void startlistOfCountryNamesByName(

            CountryInfoServiceStub.ListOfCountryNamesByName listOfCountryNamesByName28,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of continents ordered by name.
                    * @param listOfContinentsByName30
                
         */

         
                     public CountryInfoServiceStub.ListOfContinentsByNameResponse listOfContinentsByName(

                        CountryInfoServiceStub.ListOfContinentsByName listOfContinentsByName30)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of continents ordered by name.
                * @param listOfContinentsByName30
            
          */
        public void startlistOfContinentsByName(

            CountryInfoServiceStub.ListOfContinentsByName listOfContinentsByName30,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Find a language name based on the passed ISO language code
                    * @param languageName32
                
         */

         
                     public CountryInfoServiceStub.LanguageNameResponse languageName(

                        CountryInfoServiceStub.LanguageName languageName32)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Find a language name based on the passed ISO language code
                * @param languageName32
            
          */
        public void startlanguageName(

            CountryInfoServiceStub.LanguageName languageName32,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of continents ordered by code.
                    * @param listOfContinentsByCode34
                
         */

         
                     public CountryInfoServiceStub.ListOfContinentsByCodeResponse listOfContinentsByCode(

                        CountryInfoServiceStub.ListOfContinentsByCode listOfContinentsByCode34)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of continents ordered by code.
                * @param listOfContinentsByCode34
            
          */
        public void startlistOfContinentsByCode(

            CountryInfoServiceStub.ListOfContinentsByCode listOfContinentsByCode34,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns a list of all countries that use the same currency code. Pass a ISO currency code
                    * @param countriesUsingCurrency36
                
         */

         
                     public CountryInfoServiceStub.CountriesUsingCurrencyResponse countriesUsingCurrency(

                        CountryInfoServiceStub.CountriesUsingCurrency countriesUsingCurrency36)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns a list of all countries that use the same currency code. Pass a ISO currency code
                * @param countriesUsingCurrency36
            
          */
        public void startcountriesUsingCurrency(

            CountryInfoServiceStub.CountriesUsingCurrency countriesUsingCurrency36,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * This function tries to found a country based on the passed country name.
                    * @param countryISOCode38
                
         */

         
                     public CountryInfoServiceStub.CountryISOCodeResponse countryISOCode(

                        CountryInfoServiceStub.CountryISOCode countryISOCode38)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * This function tries to found a country based on the passed country name.
                * @param countryISOCode38
            
          */
        public void startcountryISOCode(

            CountryInfoServiceStub.CountryISOCode countryISOCode38,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * Returns an array with all countries and all the language information stored
                    * @param fullCountryInfoAllCountries40
                
         */

         
                     public CountryInfoServiceStub.FullCountryInfoAllCountriesResponse fullCountryInfoAllCountries(

                        CountryInfoServiceStub.FullCountryInfoAllCountries fullCountryInfoAllCountries40)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * Returns an array with all countries and all the language information stored
                * @param fullCountryInfoAllCountries40
            
          */
        public void startfullCountryInfoAllCountries(

            CountryInfoServiceStub.FullCountryInfoAllCountries fullCountryInfoAllCountries40,

            final org.oorsprong.websamples_countryinfo.CountryInfoServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    