/**
 * 
 */
package caf.war.CMPC;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author simbius
 *
 */
@ManagedBean(name = "Cmpc")
@ApplicationScoped
@DTManagedBean(displayName = "CMPC", beanType = BeanType.APPLICATION)
public class Cmpc extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Cmpc()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "CMPC" );
	}
}