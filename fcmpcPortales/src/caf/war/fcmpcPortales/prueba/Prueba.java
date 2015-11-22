/**
 * 
 */
package caf.war.fcmpcPortales.prueba;

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

@ManagedBean(name = "Prueba")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "prueba", beanType = BeanType.PORTLET)
public class Prueba  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient caf.war.fcmpcPortales.FcmpcPortales fcmpcPortales = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Prueba() {
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
}