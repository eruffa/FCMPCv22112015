package caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.leeTablaCategoria.
 */
@ManagedBean(name = "LeeTablaCategoria")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaCategoria extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 2335675961143861248L;
	
	/**
	 * Constructor
	 */
	public LeeTablaCategoria() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.class,  // port type proxy class
			"leeTablaCategoria", // method to invoke
			new String[] { "leeTablaCategoria", } // method parameter names
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

		private static final long serialVersionUID = 7744504488623363072L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.LeeTablaCategoriaE leeTablaCategoria  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.LeeTablaCategoriaE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.LeeTablaCategoriaE getLeeTablaCategoria() {
			return leeTablaCategoria;
		}

		public void setLeeTablaCategoria(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.LeeTablaCategoriaE leeTablaCategoria) {
			this.leeTablaCategoria = leeTablaCategoria;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.LeeTablaCategoriaResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.SFCMPCServicesLeeTablaCategoria_WSDStub.LeeTablaCategoriaResponseE)result;
	}
	
	
}