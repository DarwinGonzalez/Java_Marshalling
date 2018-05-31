package facturacionFace;

public class FacturaInvoice {
	
	private String Invoice;
	private String InvoiceHeader;
	private String InvoiceNumber;
	private String InvoiceDocumentType;
	private String InvoiceClass;
	private String ReasonCode; 
	private String ReasonDescription;
	private String TaxPeriod;
	private String StartDate;
	private String EndDate;
	private String CorrectionMethod;
	private String CorrectionMethodDescription;
	private String InvoiceIssueData;
	private String IssueDate;
	private String PostCode;
	private String InvoiceCurrencyCode;
	private double ExchangeRate;
	private String ExchangeRateDate;
	private String TaxCurrencyCode;
	private String LanguageName;
	private String TaxesOutputs;
	private String Tax;
	private String TaxTypeCode;
	private double TaxRate;
	private String TaxableBase;
	private double TotalAmount;
	private double EquivalentInEuros;
	private String InvoiceTotals;
	private double TotalGrossAmount;
	private String Discount;
	private String DiscountReason;
	private double DiscountAmount;
	private String Charge;
	private double ChargeAmount;
	private double TotalGrossAmountBeforeTaxes;
	private double TotalTaxOutputs;
	private double TotalTaxesWithheld;
	private double InvoiceTotal;
	private String Subsidy;
	private String SubsidyDescription;
	private double SubsidyAmount;
	private String PaymentOnAccount;
	private String PaymentOnAccountDate;
	private double PaymentOnAccountAmoun;
	private String ReimbursableExpenses;
	private String PersonTypeCode;
	private String ResidenceTypeCode;
	private String TaxIdentificationNumber;
	private double ReimbursableExpensesAmount;
	private double TotalOutstandingAmount;
	private String WithholdingReason;
	private double WithholdingAmount;
	private double TotalExecutableAmount;
	private String PaymentInKindReason;
	private double PaymentInKindAmount;
	private String Items;
	private String InvoiceLine;
	private String DeliveryNote;
	private String DeliveryNoteNumber;
	private String ItemDescription;
	private double Quantity;
	private double UnitPriceWithoutTax;
	private double TotalCost;
	private double GrossAmount;
	private String SpecialTaxableEventCode;
	private String SpecialTaxableEventReason;
	private String Installment;
	private String InstallmentDueDate;
	private double InstallmentAmount;
	private String PaymentMeans;
	private String IBAN;
	private String AccountNumber;
	private String Address;
	private String Town;
	private String Province;
	private String CountryCode;
	private String Attachment;
	private String AttachmentFormat;
	private String AttachmentData;
	
	//M�todo constructor por defecto de la clase FacturaInvoice
	public FacturaInvoice() {}
	
	//M�todo constructor  de la clase FacturaInvoice
	public FacturaInvoice(String Invoice,String InvoiceHeader,String InvoiceNumber,String InvoiceDocumentType,String InvoiceClass,String ReasonCode,String ReasonDescription,String TaxPeriod,String StartDate,String EndDate,String CorrectionMethod,String CorrectionMethodDescription,String InvoiceIssueData,String IssueDate,String PostCode,String InvoiceCurrencyCode,double ExchangeRate,String ExchangeRateDate,String TaxCurrencyCode,String LanguageName,String TaxesOutputs,String Tax,String TaxTypeCode,double TaxRate,String TaxableBase,double TotalAmount,double EquivalentInEuros,String InvoiceTotals,double TotalGrossAmount,String Discount,String DiscountReason,double DiscountAmount,String Charge,double ChargeAmount,double TotalGrossAmountBeforeTaxes,double TotalTaxOutputs,double TotalTaxesWithheld,double InvoiceTotal,String Subsidy,String SubsidyDescription,double SubsidyAmount,String PaymentOnAccount,String PaymentOnAccountDate,double PaymentOnAccountAmoun,String ReimbursableExpenses,String PersonTypeCode,String ResidenceTypeCode,String TaxIdentificationNumber,double ReimbursableExpensesAmount,double TotalOutstandingAmount,String WithholdingReason,double WithholdingAmount,double TotalExecutableAmount,String PaymentInKindReason,double PaymentInKindAmount,String Items,String InvoiceLine,String DeliveryNote,String DeliveryNoteNumber,String ItemDescription,double Quantity,double UnitPriceWithoutTax,double TotalCost,double GrossAmount,String SpecialTaxableEventCode,String SpecialTaxableEventReason,String Installment,String InstallmentDueDate,double InstallmentAmount,String PaymentMeans,String IBAN,String AccountNumber,String Address,String Town,String Province,String CountryCode,String Attachment,String AttachmentFormat,String AttachmentData) {
		
		this.Invoice = Invoice;
		this.InvoiceHeader = InvoiceHeader;
		this.InvoiceNumber = InvoiceNumber;
		this.InvoiceDocumentType = InvoiceDocumentType;
		this.InvoiceClass = InvoiceClass;
		this.ReasonCode = ReasonCode;
		this.ReasonDescription = ReasonDescription;
		this.TaxPeriod = TaxPeriod;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
		this.CorrectionMethod = CorrectionMethod;
		this.CorrectionMethodDescription = CorrectionMethodDescription;
		this.InvoiceIssueData = InvoiceIssueData;
		this.IssueDate = IssueDate;
		this.PostCode = PostCode;
		this.InvoiceCurrencyCode = InvoiceCurrencyCode;
		this.ExchangeRate = ExchangeRate;
		this.ExchangeRateDate = ExchangeRateDate;
		this.TaxCurrencyCode = TaxCurrencyCode;
		this.LanguageName = LanguageName;
		this.TaxesOutputs = TaxesOutputs;
		this.Tax = Tax;
		this.TaxTypeCode = TaxTypeCode;
		this.TaxRate = TaxRate ;
		this.TaxableBase = TaxableBase;
		this.TotalAmount = TotalAmount;
		this.EquivalentInEuros = EquivalentInEuros;
		this.InvoiceTotals = InvoiceTotals;
		this.TotalGrossAmount = TotalGrossAmount;
		this.Discount = Discount;
		this.DiscountReason = DiscountReason;
		this.DiscountAmount = DiscountAmount;
		this.Charge = Charge;
		this.ChargeAmount = ChargeAmount;
		this.TotalGrossAmountBeforeTaxes = TotalGrossAmountBeforeTaxes;
		this.TotalTaxOutputs = TotalTaxOutputs;
		this.TotalTaxesWithheld = TotalTaxesWithheld;
		this.InvoiceTotal = InvoiceTotal;
		this.Subsidy = Subsidy;
		this.SubsidyDescription = SubsidyDescription;
		this.SubsidyAmount = SubsidyAmount;
		this.PaymentOnAccount = PaymentOnAccount;
		this.PaymentOnAccountDate = PaymentOnAccountDate;
		this.PaymentOnAccountAmoun = PaymentOnAccountAmoun;
		this.ReimbursableExpenses = ReimbursableExpenses;
		this.PersonTypeCode = PersonTypeCode;
		this.ResidenceTypeCode = ResidenceTypeCode;
		this.TaxIdentificationNumber = TaxIdentificationNumber;
		this.ReimbursableExpensesAmount = ReimbursableExpensesAmount;
		this.TotalOutstandingAmount = TotalOutstandingAmount;
		this.WithholdingReason = WithholdingReason;
		this.WithholdingAmount = WithholdingAmount;
		this.TotalExecutableAmount = TotalExecutableAmount;
		this.PaymentInKindReason = PaymentInKindReason;
		this.PaymentInKindAmount = PaymentInKindAmount;
		this.Items = Items;
		this.InvoiceLine = InvoiceLine;
		this.DeliveryNote = DeliveryNote;
		this.DeliveryNoteNumber = DeliveryNoteNumber;
		this.ItemDescription = ItemDescription;
		this.Quantity = Quantity;
		this.UnitPriceWithoutTax = UnitPriceWithoutTax;
		this.TotalCost = TotalCost;
		this.GrossAmount = GrossAmount;
		this.SpecialTaxableEventCode = SpecialTaxableEventCode;
		this.SpecialTaxableEventReason = SpecialTaxableEventReason;
		this.Installment = Installment;
		this.InstallmentDueDate = InstallmentDueDate;
		this.InstallmentAmount = InstallmentAmount;
		this.PaymentMeans = PaymentMeans;
		this.IBAN = IBAN;
		this.AccountNumber = AccountNumber;
		this.Address = Address;
		this.Town = Town;
		this.Province = Province;
		this.CountryCode = CountryCode;
		this.Attachment = Attachment;
		this.AttachmentFormat = AttachmentFormat;
		this.AttachmentData = AttachmentData;
		
	}
	
	// **************************************************************************BEGIN m�todos SETS***********************************************************************************************************
	public void setInvoice(String Invoice) {
		this.Invoice = Invoice;
	}
	
	public void setInvoiceHeader(String InvoiceHeader) {
		this.InvoiceHeader = InvoiceHeader;
	}
	
	public void setInvoiceNumber(String InvoiceNumber) {
		this.InvoiceNumber = InvoiceNumber;
	}
	
	public void setInvoiceDocumentType(String InvoiceDocumentType) {
		this.InvoiceDocumentType = InvoiceDocumentType;
	}
	
	public void setInvoiceClass(String InvoiceClass) {
		this.InvoiceClass = InvoiceClass;
	}
	
	public void setReasonCode(String ReasonCode) {
		this.ReasonCode = ReasonCode;
	}
	
	public void setReasonDescription(String ReasonDescription) {
		this.ReasonDescription = ReasonDescription;
	}
	
	public void setTaxPeriod(String TaxPeriod) {
		this.TaxPeriod = TaxPeriod;
	}
	
	public void setStartDate(String StartDate) {
		this.StartDate = StartDate;
	}
	
	public void setEndDate(String EndDate) {
		this.EndDate = EndDate;
	}
	
	public void setCorrectionMethod(String CorrectionMethod) {
		this.CorrectionMethod = CorrectionMethod;
	}
	
	public void setCorrectionMethodDescription(String CorrectionMethodDescription) {
		this.CorrectionMethodDescription = CorrectionMethodDescription;
	}
	
	public void setInvoiceIssueData(String InvoiceIssueData) {
		this.InvoiceIssueData = InvoiceIssueData;
	}
	
	public void setIssueDate(String IssueDate) {
		this.IssueDate = IssueDate;
	}
	
	public void setPostCode(String PostCode) {
		this.PostCode = PostCode;
	}
	
	public void setInvoiceCurrencyCode(String InvoiceCurrencyCode) {
		this.InvoiceCurrencyCode = InvoiceCurrencyCode;
	}
	
	public void setExchangeRate(double ExchangeRate) {
		this.ExchangeRate = ExchangeRate;
	}
	
	public void setExchangeRateDate(String ExchangeRateDate) {
		this.ExchangeRateDate = ExchangeRateDate;
	}
	
	public void setTaxCurrencyCode(String TaxCurrencyCode) {
		this.TaxCurrencyCode = TaxCurrencyCode;
	}
	
	public void setLanguageName(String LanguageName) {
		this.LanguageName = LanguageName;
	}
	
	public void setTaxesOutputs(String TaxesOutputs) {
		this.TaxesOutputs = TaxesOutputs;
	}
	
	public void setTax(String Tax) {
		this.Tax = Tax;
	}
	
	public void setTaxTypeCode(String TaxTypeCode) {
		this.TaxTypeCode = TaxTypeCode;
	}
	
	public void setTaxRate(double TaxRate) {
		this.TaxRate = TaxRate;
	}
	
	public void setTaxableBase(String TaxableBase) {
		this.TaxableBase = TaxableBase;
	}
	
	public void setTotalAmount(double TotalAmount) {
		this.TotalAmount = TotalAmount;
	}
	
	public void setEquivalentInEuros(double EquivalentInEuros) {
		this.EquivalentInEuros = EquivalentInEuros;
	}
	
	public void setInvoiceTotals(String InvoiceTotals) {
		this.InvoiceTotals = InvoiceTotals;
	}
	
	public void setTotalGrossAmount(double TotalGrossAmount) {
		this.TotalGrossAmount = TotalGrossAmount;
	}
	
	public void setDiscount(String Discount) {
		this.Discount = Discount;
	}
	
	public void setDiscountReason(String DiscountReason) {
		this.DiscountReason = DiscountReason;
	}
	
	public void setDiscountAmount(double DiscountAmount) {
		this.DiscountAmount = DiscountAmount;
	}
	
	public void setCharge(String Charge) {
		this.Charge = Charge;
	}
	
	public void setChargeAmount(double ChargeAmount) {
		this.ChargeAmount = ChargeAmount;
	}
	
	public void setTotalGrossAmountBeforeTaxes(double TotalGrossAmountBeforeTaxes) {
		this.TotalGrossAmountBeforeTaxes = TotalGrossAmountBeforeTaxes;
	}
	
	public void setTotalTaxOutputs(double TotalTaxOutputs) {
		this.TotalTaxOutputs = TotalTaxOutputs;
	}
	
	public void setTotalTaxesWithheld(double TotalTaxesWithheld) {
		this.TotalTaxesWithheld = TotalTaxesWithheld;
	}
	
	public void setInvoiceTotal(double InvoiceTotal) {
		this.InvoiceTotal = InvoiceTotal;
	}
	
	public void setSubsidy(String Subsidy) {
		this.Subsidy = Subsidy;
	}
	
	public void setSubsidyDescription(String SubsidyDescription) {
		this.SubsidyDescription = SubsidyDescription;
	}
	
	public void setSubsidyAmount(double SubsidyAmount) {
		this.SubsidyAmount = SubsidyAmount;
	}
	
	public void setPaymentOnAccount(String PaymentOnAccount) {
		this.PaymentOnAccount = PaymentOnAccount;
	}
	
	public void setPaymentOnAccountDate(String PaymentOnAccountDate) {
		this.PaymentOnAccountDate = PaymentOnAccountDate;
	}
	
	public void setPaymentOnAccountAmoun(double PaymentOnAccountAmoun) {
		this.PaymentOnAccountAmoun = PaymentOnAccountAmoun;
	}
	
	public void setReimbursableExpenses(String ReimbursableExpenses) {
		this.ReimbursableExpenses = ReimbursableExpenses;
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
	
	public void setReimbursableExpensesAmount(double ReimbursableExpensesAmount) {
		this.ReimbursableExpensesAmount = ReimbursableExpensesAmount;
	}
	
	public void setTotalOutstandingAmount(double TotalOutstandingAmount) {
		this.TotalOutstandingAmount = TotalOutstandingAmount;
	}
	
	public void setWithholdingReason(String WithholdingReason) {
		this.WithholdingReason = WithholdingReason;
	}
	
	public void setWithholdingAmount(double WithholdingAmount) {
		this.WithholdingAmount = WithholdingAmount;
	}
	
	public void setTotalExecutableAmount(double TotalExecutableAmount) {
		this.TotalExecutableAmount = TotalExecutableAmount;
	}
	
	public void setPaymentInKindReason(String PaymentInKindReason) {
		this.PaymentInKindReason = PaymentInKindReason;
	}
	
	public void setPaymentInKindAmount(double PaymentInKindAmount) {
		this.PaymentInKindAmount = PaymentInKindAmount;
	}
	
	public void setItems(String Items) {
		this.Items = Items;
	}
	
	public void setInvoiceLine(String InvoiceLine) {
		this.InvoiceLine = InvoiceLine;
	}
	
	public void setDeliveryNote(String DeliveryNote) {
		this.DeliveryNote = DeliveryNote;
	}
	
	public void setDeliveryNoteNumber(String DeliveryNoteNumber) {
		this.DeliveryNoteNumber = DeliveryNoteNumber;
	}
	
	public void setItemDescription(String ItemDescription) {
		this.ItemDescription = ItemDescription;
	}
	
	public void setQuantity(double Quantity) {
		this.Quantity = Quantity;
	}
	
	public void setUnitPriceWithoutTax(double UnitPriceWithoutTax) {
		this.UnitPriceWithoutTax = UnitPriceWithoutTax;
	}
	
	public void setTotalCost(double TotalCost) {
		this.TotalCost = TotalCost;
	}
	
	public void setGrossAmount(double GrossAmount) {
		this.GrossAmount = GrossAmount;
	}
	
	public void setSpecialTaxableEventCode(String SpecialTaxableEventCode) {
		this.SpecialTaxableEventCode = SpecialTaxableEventCode;
	}
	
	public void setSpecialTaxableEventReason(String SpecialTaxableEventReason) {
		this.SpecialTaxableEventReason = SpecialTaxableEventReason;
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
	
	public void setAddress(String Address) {
		this.Address = Address;
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
	
	public void setAttachment(String Attachment) {
		this.Attachment = Attachment;
	}
	
	public void setAttachmentFormat(String AttachmentFormat) {
		this.AttachmentFormat = AttachmentFormat;
	}
	
	public void setAttachmentData(String AttachmentData) {
		this.AttachmentData = AttachmentData;
	}
	// **************************************************************************END m�todos SETS***********************************************************************************************************
	// **************************************************************************BEGIN m�todos GETS***********************************************************************************************************
	public String getInvoice() {
		return Invoice;
	}
	
	public String getInvoiceHeader() {
		return InvoiceHeader;
	}
	
	public String getInvoiceNumber() {
		return InvoiceNumber;
	}
	
	public String getInvoiceDocumentType() {
		return InvoiceDocumentType;
	}
	
	public String getInvoiceClass() {
		return InvoiceClass;
	}
	
	public String getReasonCode() {
		return ReasonCode;
	}
	
	public String getReasonDescription() {
		return ReasonDescription;
	}
	
	public String getTaxPeriod() {
		return TaxPeriod;
	}
	
	public String getStartDate() {
		return StartDate;
	}
	
	public String getEndDate() {
		return EndDate;
	}
	
	public String getCorrectionMethod() {
		return CorrectionMethod;
	}
	
	public String getCorrectionMethodDescription() {
		return CorrectionMethodDescription;
	}
	
	public String getInvoiceIssueData() {
		return InvoiceIssueData;
	}
	
	public String getIssueDate() {
		return IssueDate;
	}
	
	public String getPostCode() {
		return PostCode;
	}
	
	public String getInvoiceCurrencyCode() {
		return InvoiceCurrencyCode;
	}
	
	public double getExchangeRate() {
		return ExchangeRate;
	}
	
	public String getExchangeRateDate() {
		return ExchangeRateDate;
	}
	
	public String getTaxCurrencyCode() {
		return TaxCurrencyCode;
	}
	
	public String getLanguageName() {
		return LanguageName;
	}
	
	public String getTaxesOutputs() {
		return TaxesOutputs;
	}
	
	public String getTax() {
		return Tax;
	}
	
	public String getTaxTypeCode() {
		return TaxTypeCode;
	}
	
	public double getTaxRate() {
		return TaxRate;
	}
	
	public String getTaxableBase() {
		return TaxableBase;
	}
	
	public double getTotalAmount() {
		return TotalAmount;
	}
	
	public double getEquivalentInEuros() {
		return EquivalentInEuros;
	}
	
	public String getInvoiceTotals() {
		return InvoiceTotals;
	}
	
	public double getTotalGrossAmount() {
		return TotalGrossAmount;
	}
	
	public String getDiscount() {
		return Discount;
	}
	
	public String getDiscountReason() {
		return DiscountReason;
	}
	
	public double getDiscountAmount() {
		return DiscountAmount;
	}
	
	public String getCharge() {
		return Charge;
	}
	
	public double getChargeAmount() {
		return ChargeAmount;
	}
	
	public double getTotalGrossAmountBeforeTaxes() {
		return TotalGrossAmountBeforeTaxes;
	}
	
	public double getTotalTaxOutputs() {
		return TotalTaxOutputs;
	}
	
	public double getTotalTaxesWithheld() {
		return TotalTaxesWithheld;
	}
	
	public double getInvoiceTotal() {
		return InvoiceTotal;
	}
	
	public String getSubsidy() {
		return Subsidy;
	}
	
	public String getSubsidyDescription() {
		return SubsidyDescription;
	}
	
	public double getSubsidyAmount() {
		return SubsidyAmount;
	}
	
	public String getPaymentOnAccount() {
		return PaymentOnAccount;
	}
	
	public String getPaymentOnAccountDate() {
		return PaymentOnAccountDate;
	}
	
	public double getPaymentOnAccountAmoun() {
		return PaymentOnAccountAmoun;
	}
	
	public String getReimbursableExpenses() {
		return ReimbursableExpenses;
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
	
	public double getReimbursableExpensesAmount() {
		return ReimbursableExpensesAmount;
	}
	
	public double getTotalOutstandingAmount() {
		return TotalOutstandingAmount;
	}
	
	public String getWithholdingReason() {
		return WithholdingReason;
	}
	
	public double getWithholdingAmount() {
		return WithholdingAmount;
	}
	
	public double getTotalExecutableAmount() {
		return TotalExecutableAmount;
	}
	
	public String getPaymentInKindReason() {
		return PaymentInKindReason;
	}
	public double getPaymentInKindAmount() {
		return PaymentInKindAmount;
	}
	
	public String getItems() {
		return Items;
	}
	
	public String getInvoiceLine() {
		return InvoiceLine;
	}
	
	public String getDeliveryNote() {
		return DeliveryNote;
	}
	
	public String getDeliveryNoteNumber() {
		return DeliveryNoteNumber;
	}
	
	public String getItemDescription() {
		return ItemDescription;
	}
	
	public double getQuantity() {
		return Quantity;
	}
	
	public double getUnitPriceWithoutTax() {
		return UnitPriceWithoutTax;
	}
	
	public double getTotalCost() {
		return TotalCost;
	}
	
	public double getGrossAmount() {
		return GrossAmount;
	}
	
	public String getSpecialTaxableEventCode() {
		return SpecialTaxableEventCode;
	}
	
	public String getSpecialTaxableEventReason() {
		return SpecialTaxableEventReason;
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
	
	public String getAddress() {
		return Address;
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
	
	public String getAttachment() {
		return Attachment;
	}
	
	public String getAttachmentFormat() {
		return AttachmentFormat;
	}
	
	public String getAttachmentData() {
		return AttachmentData;
	}
	// **************************************************************************END m�todos GETS***********************************************************************************************************
	
	
	
}
