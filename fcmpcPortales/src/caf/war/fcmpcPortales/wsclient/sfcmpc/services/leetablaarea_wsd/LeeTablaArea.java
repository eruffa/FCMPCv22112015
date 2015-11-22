package caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.leeTablaArea.
 */
@ManagedBean(name = "LeeTablaArea")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LeeTablaArea extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 3258382801800738816L;
	
	/**
	 * Constructor
	 */
	public LeeTablaArea() {
		super(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.class,  // port type proxy class
			"leeTablaArea", // method to invoke
			new String[] { "leeTablaArea", } // method parameter names
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

		private static final long serialVersionUID = 3551783428160265216L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE leeTablaArea  = new  caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE() ;

		public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE getLeeTablaArea() {
			return leeTablaArea;
		}

		public void setLeeTablaArea(caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaE leeTablaArea) {
			this.leeTablaArea = leeTablaArea;
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
	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.SFCMPCServicesLeeTablaArea_WSDStub.LeeTablaAreaResponseE)result;
	}
	
	
}