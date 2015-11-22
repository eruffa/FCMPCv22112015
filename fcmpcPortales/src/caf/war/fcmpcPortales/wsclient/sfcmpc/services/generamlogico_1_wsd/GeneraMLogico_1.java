package caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.generaMLogico_1.
 */
@ManagedBean(name = "GeneraMLogico_1")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class GeneraMLogico_1 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3164966841866916864L;
	
	/**
	 * Constructor
	 */
	public GeneraMLogico_1() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.class,  // port type proxy class
			"generaMLogico_1", // method to invoke
			new String[] { "generaMLogico_1", } // method parameter names
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

		private static final long serialVersionUID = 9078547187898236928L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.GeneraMLogico_1E generaMLogico_1  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.GeneraMLogico_1E() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.GeneraMLogico_1E getGeneraMLogico_1() {
			return generaMLogico_1;
		}

		public void setGeneraMLogico_1(caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.GeneraMLogico_1E generaMLogico_1) {
			this.generaMLogico_1 = generaMLogico_1;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.GeneraMLogico_1ResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.GeneraMLogico_1ResponseE)result;
	}
	
	
}