package facturacionFace;

public class FacturaBatch {
	
	private String BatchIdentifier;
	private int InvoicesCount;
	private int TotalInvoicesAmount;
	private double TotalAmount;
	private double EquivalentInEuros;
	private double TotalOutstandingAmount;
	private double TotalExecutableAmount;
	private String InvoiceCurrencyCode;
	
	//Método constructor por defecto de la clase FacturaBatch
	public FacturaBatch() {}
	
	//Método constructor mediante paso de parámetros de la clase FacturaBatch
	public FacturaBatch(String BatchIdentifier, int InvoicesCount, int TotalInvoicesAmount, double TotalAmount, double EquivalentInEuros, double TotalOutstandingAmount, double TotalExecutableAmount, String InvoiceCurrencyCode) {
		
		this.BatchIdentifier = BatchIdentifier;
		this.InvoicesCount = InvoicesCount;
		this.TotalInvoicesAmount = TotalInvoicesAmount;
		this.TotalAmount = TotalAmount;
		this.EquivalentInEuros = EquivalentInEuros;
		this.TotalOutstandingAmount = TotalOutstandingAmount;
		this.TotalExecutableAmount = TotalExecutableAmount;
		this.InvoiceCurrencyCode = InvoiceCurrencyCode;
		
	}
	
	// **************************************************************************BEGIN métodos SETS***********************************************************************************************************
	public void setBatchIdentifier(String BatchIdentifier) {
		this.BatchIdentifier = BatchIdentifier;
	}
	
	public void setInvoicesCount(int InvoicesCount) {
		this.InvoicesCount = InvoicesCount;
	}
	
	public void setTotalInvoicesAmount(int TotalInvoicesAmount) {
		this.TotalInvoicesAmount = TotalInvoicesAmount;
	}
	
	public void setTotalAmount(double TotalAmount) {
		this.TotalAmount = TotalAmount;
	}
	
	public void setEquivalentInEuros(double EquivalentInEuros) {
		this.EquivalentInEuros = EquivalentInEuros;
	}
	
	public void setTotalOutstandingAmount(double TotalOutstandingAmount) {
		this.TotalOutstandingAmount = TotalOutstandingAmount;
	}
	
	public void setTotalExecutableAmount(double TotalExecutableAmount) {
		this.TotalExecutableAmount = TotalExecutableAmount;
	}
	
	public void setInvoiceCurrencyCode(String InvoiceCurrencyCode) {
		this.InvoiceCurrencyCode = InvoiceCurrencyCode;
	}
	// **************************************************************************END métodos SETS***********************************************************************************************************
	
	// **************************************************************************BEGIN métodos GETS*********************************************************************************************************
	public String getBatchIdentifier() {
		return BatchIdentifier;
	}
	
	public int getInvoicesCount() {
		return InvoicesCount;
	}
	
	public int getTotalInvoicesAmount() {
		return TotalInvoicesAmount;
	}
	
	public double getTotalAmount() {
		return TotalAmount;
	}
	
	public double getEquivalentInEuros() {
		return EquivalentInEuros;
	}
	
	public double getTotalOutstandingAmount() {
		return TotalOutstandingAmount;
	}
	
	public double getTotalExecutableAmount() {
		return TotalExecutableAmount;
	}
	
	public String getInvoiceCurrencyCode() {
		return InvoiceCurrencyCode;
	}
	
	// **************************************************************************END métodos GETS***********************************************************************************************************
}
