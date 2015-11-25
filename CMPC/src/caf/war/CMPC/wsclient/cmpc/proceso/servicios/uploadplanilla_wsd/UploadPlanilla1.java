package caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.CMPCProcesoServiciosUploadPlanilla_WSDStub.uploadPlanilla.
 */
@ManagedBean(name = "UploadPlanilla")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class UploadPlanilla1 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 5936678849414047744L;
	
	/**
	 * Constructor
	 */
	public UploadPlanilla1() {
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

		private static final long serialVersionUID = 5949134148408375296L;
		
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