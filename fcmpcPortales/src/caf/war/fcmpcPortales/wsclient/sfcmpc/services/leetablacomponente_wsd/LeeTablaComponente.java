package caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.leeTablaComponente.
 */
@ManagedBean(name = "LeeTablaComponente")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaComponente extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 2515947079652619264L;
	
	/**
	 * Constructor
	 */
	public LeeTablaComponente() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.class,  // port type proxy class
			"leeTablaComponente", // method to invoke
			new String[] { "leeTablaComponente", } // method parameter names
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

		private static final long serialVersionUID = 6781014912021670912L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE leeTablaComponente  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE getLeeTablaComponente() {
			return leeTablaComponente;
		}

		public void setLeeTablaComponente(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteE leeTablaComponente) {
			this.leeTablaComponente = leeTablaComponente;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.SFCMPCServicesLeeTablaComponente_WSDStub.LeeTablaComponenteResponseE)result;
	}
	
	
}