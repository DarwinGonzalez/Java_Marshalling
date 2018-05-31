package facturacionFace;

public class FacturaThirdParty {
	
	private String FileHeader;
	private String SchemaVersion;
	private String Modality;
	private String InvoiceIssuerType;
	private String TaxIdentification;
	private String PersonTypeCode;
	private String ResidenceTypeCode;
	private String TaxIdentificationNumber;
	private String LegalEntity;
	private String CorporateName;
	private String AddressInSpain;
	private String Address;
	private String PostCode;
	private String Town;
	private String Province;
	private String CountryCode;
	private String OverseasAddress;
	private String CountryCod;
	private String Individual;
	private String Name;
	private String FirstSurname;

	//Método constructor por defecto de la clase FacturaThirdParty
	public FacturaThirdParty() {}
	
	//Método constructor meidante paso de parámetros de la clase FacturaThirdParty
	public FacturaThirdParty(String FileHeader, String SchemaVersion, String Modality, String InvoiceIssuerType, String TaxIdentification, String TaxIdentificationprivate, String PersonTypeCode, String ResidenceTypeCode, String TaxIdentificationNumber,String LegalEntity,String CorporateName,String AddressInSpain,String Address,String PostCode,String Town,String Province,String CountryCode,String OverseasAddress,String CountryCod,String Individual,String Name,String FirstSurname ) {
		
		this.FileHeader = FileHeader;
		this.SchemaVersion = SchemaVersion;
		this.Modality = Modality;
		this.InvoiceIssuerType = InvoiceIssuerType;
		this.TaxIdentification = TaxIdentification;
		this.PersonTypeCode = PersonTypeCode;
		this.ResidenceTypeCode = ResidenceTypeCode;
		this.TaxIdentificationNumber = TaxIdentificationNumber;
		this.LegalEntity = LegalEntity;
		this.CorporateName = CorporateName;
		this.AddressInSpain = AddressInSpain;
		this.Address = Address;
		this.PostCode = PostCode;
		this.Town = Town;
		this.Province = Province;
		this.CountryCode = CountryCode;
		this.OverseasAddress = OverseasAddress;
		this.CountryCod = CountryCod;
		this.Individual = Individual;
		this.Name = Name;
		this.FirstSurname = FirstSurname;
	}
	
	// **************************************************************************BEGIN métodos SETS***********************************************************************************************************
	public void setFileHader(String FileHeader) {
		this.FileHeader = FileHeader; 
	}
	
	public void setSchemaVersion(String SchemaVersion) {
		this.SchemaVersion = SchemaVersion;
	}
	
	public void setModality(String Modality) {
		this.Modality = Modality;
	}
	
	public void setInvoiceIssuerType(String InvoiceIssuerType) {
		this.InvoiceIssuerType = InvoiceIssuerType;
	}
	
	public void setTaxIdentification(String TaxIdentification) {
		this.TaxIdentification = TaxIdentification;
	}
	
	public void setPersonTypeCode(String PersonTypeCode) {
		this.PersonTypeCode = PersonTypeCode;
	}
	
	public void setResidenceTypeCode(String ResidenceTypeCode) {
		this.ResidenceTypeCode = ResidenceTypeCode;
	}
	
	public void setTaxIdentificationNumber(String TaxIdentificationNumber) {
		this.TaxIdentificationNumber = TaxIdentificationNumber;
	}
	
	public void setLegalEntity(String LegalEntity) {
		this.LegalEntity = LegalEntity;
	}
	
	public void setCorporateName(String CorporateName) {
		this.CorporateName = CorporateName;
	}
	
	public void setAddressInSpain(String AddressInSpain) {
		this.AddressInSpain = AddressInSpain;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public void setPostCode(String PostCode) {
		this.PostCode = PostCode;
	}
	
	public void setTown(String Town) {
		this.Town = Town;
	}
	
	public void setProvince(String Province) {
		this.Province = Province;
	}
	
	public void setCountryCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}
	
	public void setOverseasAddress(String OverseasAddress) {
		this.OverseasAddress = OverseasAddress;
	}
	
	public void setCountryCod(String CountryCod) {
		this.CountryCod = CountryCod;
	}
	
	public void setIndividual(String Individual) {
		this.Individual = Individual;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setFirstSurname(String FirstSurname) {
		this.FirstSurname = FirstSurname;
	}
	// **************************************************************************END métodos SETS***********************************************************************************************************
	
	// **************************************************************************BEGIN métodos GETS*********************************************************************************************************
	public String getFileHader() {
		return FileHeader; 
	}
	
	public String getSchemaVersion() {
		return SchemaVersion;
	}
	
	public String getModality() {
		return Modality;
	}
	
	public String getInvoiceIssuerType() {
		return InvoiceIssuerType;
	}
	
	public String getTaxIdentification() {
		return TaxIdentification;
	}
	
	public String getPersonTypeCode() {
		return PersonTypeCode;
	}
	
	public String getResidenceTypeCode() {
		return ResidenceTypeCode;
	}
	
	public String getTaxIdentificationNumber() {
		return TaxIdentificationNumber;
	}
	
	public String getLegalEntity() {
		return LegalEntity;
	}
	
	public String getCorporateName() {
		return CorporateName;
	}
	
	public String getAddressInSpain() {
		return AddressInSpain;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String getPostCode() {
		return PostCode;
	}
	
	public String getTown() {
		return Town;
	}
	
	public String getProvince() {
		return Province;
	}
	
	public String getCountryCode() {
		return CountryCode;
	}
	
	public String getOverseasAddress() {
		return OverseasAddress;
	}
	
	public String getCountryCod() {
		return CountryCod;
	}
	
	public String getIndividual() {
		return Individual;
	}
	
	public String getName() {
		return Name;
	}
	
	public String getFirstSurname() {
		return FirstSurname;
	}
	// **************************************************************************END métodos GETS***********************************************************************************************************
	
	
	
}