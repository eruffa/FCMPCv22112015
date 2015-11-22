/**
 * 
 */
package caf.war.fcmpcPortales.generamarcologico;

/**
 * @author veztm
 *
 */

import javax.portlet.PortletPreferences;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "GeneraMarcoLogico")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "generaMarcoLogico", beanType = BeanType.PORTLET)
public class GeneraMarcoLogico  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private transient caf.war.fcmpcPortales.FcmpcPortales fcmpcPortales = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"tipoProyecto"
	};
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public GeneraMarcoLogico() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.fcmpcPortales.FcmpcPortales getFcmpcPortales()  {
		if (fcmpcPortales == null) {
		    fcmpcPortales = (caf.war.fcmpcPortales.FcmpcPortales)resolveExpression("#{FcmpcPortales}");
		}
		return fcmpcPortales;
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getTipoProyecto() throws Exception {
		return (String) getPreferenceValue("tipoProyecto", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setTipoProyecto(String tipoProyecto) throws Exception {
		setPreferenceValue("tipoProyecto", tipoProyecto);
	}
}