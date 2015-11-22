package caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.leeTablaObjetivos.
 */
@ManagedBean(name = "LeeTablaObjetivos")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaObjetivos extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 6277930900282519552L;
	
	/**
	 * Constructor
	 */
	public LeeTablaObjetivos() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.class,  // port type proxy class
			"leeTablaObjetivos", // method to invoke
			new String[] { "leeTablaObjetivos", } // method parameter names
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

		private static final long serialVersionUID = 4447493493976860672L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.LeeTablaObjetivosE leeTablaObjetivos  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.LeeTablaObjetivosE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.LeeTablaObjetivosE getLeeTablaObjetivos() {
			return leeTablaObjetivos;
		}

		public void setLeeTablaObjetivos(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.LeeTablaObjetivosE leeTablaObjetivos) {
			this.leeTablaObjetivos = leeTablaObjetivos;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.LeeTablaObjetivosResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.SFCMPCServicesLeeTablaObjetivos_WSDStub.LeeTablaObjetivosResponseE)result;
	}
	
	
}