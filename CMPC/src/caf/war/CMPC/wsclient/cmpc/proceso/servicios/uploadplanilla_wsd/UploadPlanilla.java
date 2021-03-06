package caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd;


import java.io.Serializable;

/**
 * Web Service Client bean generated for 
 * caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.uploadPlanilla.
 */
public class UploadPlanilla extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8078913516475931648L;
	
	/**
	 * Constructor
	 */
	public UploadPlanilla() {
		super(caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.class,  // port type proxy class
			"uploadPlanilla", // method to invoke
			new String[] { "uploadPlanilla", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 162722545940144128L;
		
		public Parameters() {
		}
	
	  
		private caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.UploadPlanillaE uploadPlanilla  = new  caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.UploadPlanillaE() ;

		public caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.UploadPlanillaE getUploadPlanilla() {
			return uploadPlanilla;
		}

		public void setUploadPlanilla(caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.UploadPlanillaE uploadPlanilla) {
			this.uploadPlanilla = uploadPlanilla;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result bean
	 */
	public caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.UploadPlanillaResponseE getResult() {
		return (caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.UploadPlanillaResponseE)result;
	}
	
	
}