package facturacionFace;

public class FacturaFactoryAssignmentData {
	
	private String Assignee;
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
	private String PostCodeAndTown;
	private String Individual;
	private String Name;
	private String FirstSurname;
	private String PaymentDetails;
	private String Installment;
	private String InstallmentDueDate;
	private double InstallmentAmount;
	private String PaymentMeans;
	private String IBAN;
	private String AccountNumber;
	private String FactoringAssignmentClauses;
	private String DocumentCharacter;
	private String DocumentType;
	private String RepositoryName;
	private String Reference;
	
	//M�todo constructor por defecto de la clase FacturaFactoryAssignmentData
	public FacturaFactoryAssignmentData() {}
	
	//M�todo constructor mediante el paso de par�metros de la clase FacturaFactoryAssignmentData
	public FacturaFactoryAssignmentData(String Assignee,String TaxIdentification,String PersonTypeCode,String ResidenceTypeCode,String TaxIdentificationNumber,String LegalEntity,String CorporateName,String AddressInSpain,String Address,String PostCode,String Town,String Province,String CountryCode,String OverseasAddress,String PostCodeAndTown,String Individual,String Name,String FirstSurname,String PaymentDetails,String Installment,String InstallmentDueDate,double InstallmentAmount,String PaymentMeans,String IBAN,String AccountNumber,String FactoringAssignmentClauses,String DocumentCharacter,String DocumentType,String RepositoryName,String Reference) {
		
		this.Assignee = Assignee;
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
		this.PostCodeAndTown = PostCodeAndTown;
		this.Individual = Individual;
		this.Name = Name;
		this.FirstSurname = FirstSurname;
		this.PaymentDetails = PaymentDetails;
		this.Installment = Installment;
		this.InstallmentDueDate = InstallmentDueDate;
		this.InstallmentAmount = InstallmentAmount;
		this.PaymentMeans = PaymentMeans;
		this.IBAN = IBAN;
		this.AccountNumber = AccountNumber;
		this.FactoringAssignmentClauses = FactoringAssignmentClauses;
		this.DocumentCharacter = DocumentCharacter;
		this.DocumentType = DocumentType;
		this.RepositoryName = RepositoryName;
		this.Reference = Reference;
		
	}
	
	// **************************************************************************BEGIN m�todos SETS***********************************************************************************************************
	public void setAssignee(String Assignee) {
		this.Assignee = Assignee;
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
	
	public void setPostCodeAndTown(String PostCodeAndTown) {
		this.PostCodeAndTown = PostCodeAndTown;
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
	
	public void setPaymentDetails(String PaymentDetails) {
		this.PaymentDetails = PaymentDetails;
	}
	
	public void setInstallment(String Installment) {
		this.Installment = Installment;
	}
	
	public void setInstallmentDueDate(String InstallmentDueDate) {
		this.InstallmentDueDate = InstallmentDueDate;
	}
	
	public void setInstallmentAmount(double InstallmentAmount) {
		this.InstallmentAmount = InstallmentAmount;
	}
	
	public void setPaymentMeans(String PaymentMeans) {
		this.PaymentMeans = PaymentMeans;
	}
	
	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
	}
	
	public void setAccountNumber(String AccountNumber) {
		this.AccountNumber = AccountNumber;
	}
	
	public void setFactoringAssignmentClauses(String FactoringAssignmentClauses) {
		this.FactoringAssignmentClauses = FactoringAssignmentClauses;
	}
	
	public void setDocumentCharacter(String DocumentCharacter) {
		this.DocumentCharacter = DocumentCharacter;
	}
	
	public void setDocumentType(String DocumentType) {
		this.DocumentType = DocumentType;
	}
	
	public void setRepositoryName(String RepositoryName) {
		this.RepositoryName = RepositoryName;
	}
	
	public void setReference(String Reference) {
		this.Reference = Reference;
	}
	
	// **************************************************************************END m�todos SETS***********************************************************************************************************
	
	// **************************************************************************BEGIN m�todos GETS***********************************************************************************************************
	public String getAssignee() {
		return Assignee;
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
	
	public String getPostCodeAndTown() {
		return PostCodeAndTown;
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
	
	public String getPaymentDetails() {
		return PaymentDetails;
	}
	
	public String getInstallment() {
		return Installment;
	}
	
	public String getInstallmentDueDate() {
		return InstallmentDueDate;
	}
	
	public double getInstallmentAmount() {
		return InstallmentAmount;
	}
	
	public String getPaymentMeans() {
		return PaymentMeans;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	
	public String getAccountNumber() {
		return AccountNumber;
	}
	
	public String getFactoringAssignmentClauses() {
		return FactoringAssignmentClauses;
	}
	
	public String getDocumentCharacter() {
		return DocumentCharacter;
	}
	
	public String getDocumentType() {
		return DocumentType;
	}
	
	public String getRepositoryName() {
		return RepositoryName;
	}
	
	public String getReference() {
		return Reference;
	}
	// **************************************************************************END m�todos GETS***********************************************************************************************************
	
	
	
	
}
