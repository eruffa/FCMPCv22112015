package caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.leeTablaTipoPar.
 */
@ManagedBean(name = "LeeTablaTipoPar")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaTipoPar extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 548765186647007232L;
	
	/**
	 * Constructor
	 */
	public LeeTablaTipoPar() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.class,  // port type proxy class
			"leeTablaTipoPar", // method to invoke
			new String[] { "leeTablaTipoPar", } // method parameter names
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

		private static final long serialVersionUID = 3738797936466543616L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE leeTablaTipoPar  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE getLeeTablaTipoPar() {
			return leeTablaTipoPar;
		}

		public void setLeeTablaTipoPar(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParE leeTablaTipoPar) {
			this.leeTablaTipoPar = leeTablaTipoPar;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.SFCMPCServicesLeeTablaTipoPar_WSDStub.LeeTablaTipoParResponseE)result;
	}
	
	
}