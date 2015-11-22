package caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.generaCalendario.
 */
@ManagedBean(name = "GeneraCalendario")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class GeneraCalendario extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 1159554591178712064L;
	
	/**
	 * Constructor
	 */
	public GeneraCalendario() {
		super(caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.class,  // port type proxy class
			"generaCalendario", // method to invoke
			new String[] { "generaCalendario", } // method parameter names
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

		private static final long serialVersionUID = 860862045685630976L;
		
		public Parameters() {
		}
	
	  
		private caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.GeneraCalendarioE generaCalendario  = new  caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.GeneraCalendarioE() ;

		public caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.GeneraCalendarioE getGeneraCalendario() {
			return generaCalendario;
		}

		public void setGeneraCalendario(caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.GeneraCalendarioE generaCalendario) {
			this.generaCalendario = generaCalendario;
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
	public caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.GeneraCalendarioResponseE getResult() {
		return (caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.CalendarioServiceGeneraCalendario_WSDStub.GeneraCalendarioResponseE)result;
	}
	
	
}