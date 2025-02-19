class USAddress extends AddressAbstractClass{
    
    private static final String COUNTRY = "UNITED STATES";
    private static final String COMMA = ",";
    
    // Concrete method
    public String getCountry(){ return COUNTRY; }
    
    public String getFullAddress(){
        return getStreet() + EOL_STRING +
                getCity() + COMMA + SPACE + getRegion() +
                SPACE + getPostalCode() + EOL_STRING +
                COUNTRY + EOL_STRING;
    }
}
