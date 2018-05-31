package facturacionFace;

public class FacturaBuyerParty {
	
	private String BuyerParty;
	private String TaxIdentification;
	private String PersonTypeCode;
	private String ResidenceTypeCode;
	private String TaxIdentificationNumber;
	private String AdministrativeCentre;
	private String AddressInSpain;
	private String Address;
	private String PostCode;
	private String Town;
	private String Province;
	private String CountryCode;
	private String OverseasAddress;
	private String LegalEntity;
	private String CorporateName;
	private String Individual;
	private String Name;
	private String FirstSurname;
	
	public FacturaBuyerParty() {}
	
	public FacturaBuyerParty(String BuyerParty,String TaxIdentification,String PersonTypeCode,String ResidenceTypeCode,String TaxIdentificationNumber,String AdministrativeCentre,String AddressInSpain,String Address,String PostCode,String Town,String Province,String CountryCode,String OverseasAddress,String LegalEntity,String CorporateName,String Individual,String Name,String FirstSurname) {
		
		this.BuyerParty = BuyerParty;
		this.TaxIdentification = TaxIdentification;
		this.PersonTypeCode = PersonTypeCode;
		this.ResidenceTypeCode = ResidenceTypeCode;
		this.TaxIdentificationNumber = TaxIdentificationNumber;
		this.AdministrativeCentre = AdministrativeCentre;
		this.AddressInSpain = AddressInSpain;
		this.Address = Address;
		this.PostCode = PostCode;
		this.Town = Town;
		this.Province = Province;
		this.CountryCode = CountryCode;
		this.OverseasAddress = OverseasAddress;
		this.LegalEntity = LegalEntity;
		this.CorporateName = CorporateName;
		this.Individual = Individual;
		this.Name = Name;
		this.FirstSurname = FirstSurname;
	}
	
	// **************************************************************************BEGIN métodos SETS***********************************************************************************************************
	public void setBuyerParty(String BuyerParty) {
		this.BuyerParty = BuyerParty;
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
	
	public void setAdministrativeCentre(String AdministrativeCentre) {
		this.AdministrativeCentre = AdministrativeCentre;
	}
	
	public void setAddressInSpain(String AddressInSpain) {
		this.AddressInSpain = AddressInSpain;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public void setPostCodey(String PostCode) {
		this.PostCode = PostCode;
	}
	
	public void setTown(String Town) {
		this.Town = Town;
	}
	
	public void seProvince(String Province) {
		this.Province = Province;
	}
	
	public void setCountryCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}
	
	public void setOverseasAddress(String OverseasAddress) {
		this.OverseasAddress = OverseasAddress;
	}
	
	public void setLegalEntity(String LegalEntity) {
		this.LegalEntity = LegalEntity;
	}
	
	public void setCorporateNam(String CorporateName) {
		this.CorporateName = CorporateName;
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
	
	// **************************************************************************BEGIN métodos GETS***********************************************************************************************************
	public String getBuyerParty() {
		return BuyerParty;
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
	
	public String getAdministrativeCentre() {
		return AdministrativeCentre;
	}
	
	public String getAddressInSpain() {
		return AddressInSpain;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String getPostCodey() {
		return PostCode;
	}
	
	public String getTown() {
		return Town;
	}
	
	public String geProvince() {
		return Province;
	}
	
	public String getCountryCode() {
		return CountryCode;
	}
	
	public String getOverseasAddress() {
		return OverseasAddress;
	}
	
	public String getLegalEntity() {
		return LegalEntity;
	}
	
	public String getCorporateNam() {
		return CorporateName;
	}
	
	public String getIndividual() {
		return Individual;
	}
	
	public String getName() {
		return Name;
	}
	
	public String etFirstSurname() {
		return FirstSurname;
	}
	// **************************************************************************END métodos GETS***********************************************************************************************************
}
