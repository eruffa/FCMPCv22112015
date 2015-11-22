package caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.getMLogico.
 */
@ManagedBean(name = "GetMLogico")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class GetMLogico extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 8564586189819964416L;
	
	/**
	 * Constructor
	 */
	public GetMLogico() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.class,  // port type proxy class
			"getMLogico", // method to invoke
			new String[] { "getMLogico", } // method parameter names
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

		private static final long serialVersionUID = 5483331431895358464L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE getMLogico  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE getGetMLogico() {
			return getMLogico;
		}

		public void setGetMLogico(caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoE getMLogico) {
			this.getMLogico = getMLogico;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.SFCMPCServicesGetMLogico_WSDStub.GetMLogicoResponseE)result;
	}
	
	
}