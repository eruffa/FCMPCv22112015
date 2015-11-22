/**
 * 
 */
package caf.war.fcmpcPortales.calendario;

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

@ManagedBean(name = "Calendario")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Calendario", beanType = BeanType.PORTLET)
public class Calendario  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	private transient caf.war.fcmpcPortales.FcmpcPortales fcmpcPortales = null;
	/**
	 * List of portlet preference names
	 */
	public static final String[] PREFERENCES_NAMES = new String[] {
		"mes", "anyo"
	};
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Calendario() {
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
	public String getMes() throws Exception {
		return (String) getPreferenceValue("mes", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setMes(String mes) throws Exception {
		setPreferenceValue("mes", mes);
	}

	/**
	 * The algorithm for this 'smart' preference getter is:
	 * 1) Check the Request Map (skip this step if it isn't a 'smart' preference)
	 * 2) Check the Member variable
	 * 3) Fall back to the PortletPreferences
	 */
	public String getAnyo() throws Exception {
		return (String) getPreferenceValue("anyo", String.class);
	}

	/**
	 * Invoke {@link #storePreferences} to persist these changes
	 */
	public void setAnyo(String anyo) throws Exception {
		setPreferenceValue("anyo", anyo);
	}
}