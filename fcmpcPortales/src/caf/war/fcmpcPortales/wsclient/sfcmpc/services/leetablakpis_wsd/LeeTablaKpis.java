package caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.leeTablaKpis.
 */
@ManagedBean(name = "LeeTablaKpis")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaKpis extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 5278424679137809408L;
	
	/**
	 * Constructor
	 */
	public LeeTablaKpis() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.class,  // port type proxy class
			"leeTablaKpis", // method to invoke
			new String[] { "leeTablaKpis", } // method parameter names
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

		private static final long serialVersionUID = 125839777088931840L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE leeTablaKpis  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE getLeeTablaKpis() {
			return leeTablaKpis;
		}

		public void setLeeTablaKpis(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisE leeTablaKpis) {
			this.leeTablaKpis = leeTablaKpis;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.SFCMPCServicesLeeTablaKpis_WSDStub.LeeTablaKpisResponseE)result;
	}
	
	
}