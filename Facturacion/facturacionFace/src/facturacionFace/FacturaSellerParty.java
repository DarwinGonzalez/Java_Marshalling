package facturacionFace;

public class FacturaSellerParty {
	
	private String SellerParty;
	private String TaxIdentification;
	private String PersonTypeCode;
	private String ResidenceTypeCode;
	private String TaxIdentificationNumber;
	private String AdministrativeCentre;
	private String RoleTypeCode;
	private String AddressInSpain;
	private String Address;
	private String PostCode;
	private String Town;
	private String Province;
	private String CountryCode;
	private String OverseasAddress;
	private String LegalEntity;
	private String Individual;
	private String Name;
	private String FirstSurname;

	//Método constructor por defecto de la clase FacturaSellerParty
	public FacturaSellerParty(){}
	
	//Método constructor mediante el paso de parametros de la clase FacturaSellerParty
	public FacturaSellerParty(String SellerParty,String TaxIdentification,String PersonTypeCode,String ResidenceTypeCode,String TaxIdentificationNumber,String AdministrativeCentre,String RoleTypeCode,String AddressInSpain,String Address,String PostCode,String Town,String Province,String CountryCode,String OverseasAddress,String LegalEntity,String Individual,String Name,String FirstSurname){
		
		this.SellerParty = SellerParty;
		this.TaxIdentification = TaxIdentification;
		this.PersonTypeCode = PersonTypeCode;
		this.ResidenceTypeCode = ResidenceTypeCode;
		this.TaxIdentificationNumber = TaxIdentificationNumber;
		this.AdministrativeCentre = AdministrativeCentre;
		this.RoleTypeCode = RoleTypeCode;
		this.AddressInSpain = AddressInSpain;
		this.Address = Address;
		this.PostCode = PostCode;
		this.Town = Town;
		this.Province = Province;
		this.CountryCode = CountryCode;
		this.OverseasAddress = OverseasAddress;
		this.LegalEntity = LegalEntity;
		this.Individual = Individual;
		this.Name = Name;
		this.FirstSurname = FirstSurname;
	}
	
	// **************************************************************************BEGIN métodos SETS***********************************************************************************************************
	public void setSellerParty(String SellerParty) {
		this.SellerParty = SellerParty;
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
	
	public void setRoleTypeCode(String RoleTypeCode) {
		this.RoleTypeCode = RoleTypeCode;
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
	
	public void setLegalEntity(String LegalEntity) {
		this.LegalEntity = LegalEntity;
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
	public String getSellerParty() {
		return SellerParty;
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
	
	public String getRoleTypeCode() {
		return RoleTypeCode;
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
	
	public String getLegalEntity() {
		return LegalEntity;
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
