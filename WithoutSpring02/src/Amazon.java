
public class Amazon {

	/*
	 * where the dependent cls are used is called target cls
	 * 
	 * the dependent cls are firstflight,fedex,bluedart cls
	 */
	private DelivaryService service;
	
	
	public void setService(DelivaryService service) {
		this.service = service;
	}


	public boolean initiateDelivery(double amount) {
		
		return service.courierService(amount);
	}
}
