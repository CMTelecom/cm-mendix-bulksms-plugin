// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bulksms.proxies;

public class statusreport
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject statusreportMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "BulkSMS.statusreport";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CREATED_S("CREATED_S"),
		DATETIME_S("DATETIME_S"),
		GSM("GSM"),
		REFERENCE("REFERENCE"),
		STANDARDERRORTEXT("STANDARDERRORTEXT"),
		STATUS("STATUS"),
		STATUSDESCRIPTION("STATUSDESCRIPTION"),
		EXTERNALSTATUSDESCRIPTION("EXTERNALSTATUSDESCRIPTION"),
		_ID("_ID"),
		OPERATOR("OPERATOR"),
		RECIPIENT("RECIPIENT"),
		STATUSISSUCCESS("STATUSISSUCCESS");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public statusreport(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "BulkSMS.statusreport"));
	}

	protected statusreport(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject statusreportMendixObject)
	{
		if (statusreportMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("BulkSMS.statusreport", statusreportMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a BulkSMS.statusreport");

		this.statusreportMendixObject = statusreportMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'statusreport.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static bulksms.proxies.statusreport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return bulksms.proxies.statusreport.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static bulksms.proxies.statusreport initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bulksms.proxies.statusreport(context, mendixObject);
	}

	public static bulksms.proxies.statusreport load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bulksms.proxies.statusreport.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of CREATED_S
	 */
	public final java.lang.String getCREATED_S()
	{
		return getCREATED_S(getContext());
	}

	/**
	 * @param context
	 * @return value of CREATED_S
	 */
	public final java.lang.String getCREATED_S(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CREATED_S.toString());
	}

	/**
	 * Set value of CREATED_S
	 * @param created_s
	 */
	public final void setCREATED_S(java.lang.String created_s)
	{
		setCREATED_S(getContext(), created_s);
	}

	/**
	 * Set value of CREATED_S
	 * @param context
	 * @param created_s
	 */
	public final void setCREATED_S(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String created_s)
	{
		getMendixObject().setValue(context, MemberNames.CREATED_S.toString(), created_s);
	}

	/**
	 * @return value of DATETIME_S
	 */
	public final java.lang.String getDATETIME_S()
	{
		return getDATETIME_S(getContext());
	}

	/**
	 * @param context
	 * @return value of DATETIME_S
	 */
	public final java.lang.String getDATETIME_S(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DATETIME_S.toString());
	}

	/**
	 * Set value of DATETIME_S
	 * @param datetime_s
	 */
	public final void setDATETIME_S(java.lang.String datetime_s)
	{
		setDATETIME_S(getContext(), datetime_s);
	}

	/**
	 * Set value of DATETIME_S
	 * @param context
	 * @param datetime_s
	 */
	public final void setDATETIME_S(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String datetime_s)
	{
		getMendixObject().setValue(context, MemberNames.DATETIME_S.toString(), datetime_s);
	}

	/**
	 * @return value of GSM
	 */
	public final java.lang.String getGSM()
	{
		return getGSM(getContext());
	}

	/**
	 * @param context
	 * @return value of GSM
	 */
	public final java.lang.String getGSM(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.GSM.toString());
	}

	/**
	 * Set value of GSM
	 * @param gsm
	 */
	public final void setGSM(java.lang.String gsm)
	{
		setGSM(getContext(), gsm);
	}

	/**
	 * Set value of GSM
	 * @param context
	 * @param gsm
	 */
	public final void setGSM(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String gsm)
	{
		getMendixObject().setValue(context, MemberNames.GSM.toString(), gsm);
	}

	/**
	 * @return value of REFERENCE
	 */
	public final java.lang.String getREFERENCE()
	{
		return getREFERENCE(getContext());
	}

	/**
	 * @param context
	 * @return value of REFERENCE
	 */
	public final java.lang.String getREFERENCE(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.REFERENCE.toString());
	}

	/**
	 * Set value of REFERENCE
	 * @param reference
	 */
	public final void setREFERENCE(java.lang.String reference)
	{
		setREFERENCE(getContext(), reference);
	}

	/**
	 * Set value of REFERENCE
	 * @param context
	 * @param reference
	 */
	public final void setREFERENCE(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reference)
	{
		getMendixObject().setValue(context, MemberNames.REFERENCE.toString(), reference);
	}

	/**
	 * @return value of STANDARDERRORTEXT
	 */
	public final java.lang.String getSTANDARDERRORTEXT()
	{
		return getSTANDARDERRORTEXT(getContext());
	}

	/**
	 * @param context
	 * @return value of STANDARDERRORTEXT
	 */
	public final java.lang.String getSTANDARDERRORTEXT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.STANDARDERRORTEXT.toString());
	}

	/**
	 * Set value of STANDARDERRORTEXT
	 * @param standarderrortext
	 */
	public final void setSTANDARDERRORTEXT(java.lang.String standarderrortext)
	{
		setSTANDARDERRORTEXT(getContext(), standarderrortext);
	}

	/**
	 * Set value of STANDARDERRORTEXT
	 * @param context
	 * @param standarderrortext
	 */
	public final void setSTANDARDERRORTEXT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String standarderrortext)
	{
		getMendixObject().setValue(context, MemberNames.STANDARDERRORTEXT.toString(), standarderrortext);
	}

	/**
	 * @return value of STATUS
	 */
	public final java.lang.String getSTATUS()
	{
		return getSTATUS(getContext());
	}

	/**
	 * @param context
	 * @return value of STATUS
	 */
	public final java.lang.String getSTATUS(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.STATUS.toString());
	}

	/**
	 * Set value of STATUS
	 * @param status
	 */
	public final void setSTATUS(java.lang.String status)
	{
		setSTATUS(getContext(), status);
	}

	/**
	 * Set value of STATUS
	 * @param context
	 * @param status
	 */
	public final void setSTATUS(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String status)
	{
		getMendixObject().setValue(context, MemberNames.STATUS.toString(), status);
	}

	/**
	 * @return value of STATUSDESCRIPTION
	 */
	public final java.lang.String getSTATUSDESCRIPTION()
	{
		return getSTATUSDESCRIPTION(getContext());
	}

	/**
	 * @param context
	 * @return value of STATUSDESCRIPTION
	 */
	public final java.lang.String getSTATUSDESCRIPTION(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.STATUSDESCRIPTION.toString());
	}

	/**
	 * Set value of STATUSDESCRIPTION
	 * @param statusdescription
	 */
	public final void setSTATUSDESCRIPTION(java.lang.String statusdescription)
	{
		setSTATUSDESCRIPTION(getContext(), statusdescription);
	}

	/**
	 * Set value of STATUSDESCRIPTION
	 * @param context
	 * @param statusdescription
	 */
	public final void setSTATUSDESCRIPTION(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String statusdescription)
	{
		getMendixObject().setValue(context, MemberNames.STATUSDESCRIPTION.toString(), statusdescription);
	}

	/**
	 * @return value of EXTERNALSTATUSDESCRIPTION
	 */
	public final java.lang.String getEXTERNALSTATUSDESCRIPTION()
	{
		return getEXTERNALSTATUSDESCRIPTION(getContext());
	}

	/**
	 * @param context
	 * @return value of EXTERNALSTATUSDESCRIPTION
	 */
	public final java.lang.String getEXTERNALSTATUSDESCRIPTION(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EXTERNALSTATUSDESCRIPTION.toString());
	}

	/**
	 * Set value of EXTERNALSTATUSDESCRIPTION
	 * @param externalstatusdescription
	 */
	public final void setEXTERNALSTATUSDESCRIPTION(java.lang.String externalstatusdescription)
	{
		setEXTERNALSTATUSDESCRIPTION(getContext(), externalstatusdescription);
	}

	/**
	 * Set value of EXTERNALSTATUSDESCRIPTION
	 * @param context
	 * @param externalstatusdescription
	 */
	public final void setEXTERNALSTATUSDESCRIPTION(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String externalstatusdescription)
	{
		getMendixObject().setValue(context, MemberNames.EXTERNALSTATUSDESCRIPTION.toString(), externalstatusdescription);
	}

	/**
	 * @return value of _ID
	 */
	public final java.lang.String get_ID()
	{
		return get_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of _ID
	 */
	public final java.lang.String get_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._ID.toString());
	}

	/**
	 * Set value of _ID
	 * @param _id
	 */
	public final void set_ID(java.lang.String _id)
	{
		set_ID(getContext(), _id);
	}

	/**
	 * Set value of _ID
	 * @param context
	 * @param _id
	 */
	public final void set_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._ID.toString(), _id);
	}

	/**
	 * @return value of OPERATOR
	 */
	public final java.lang.String getOPERATOR()
	{
		return getOPERATOR(getContext());
	}

	/**
	 * @param context
	 * @return value of OPERATOR
	 */
	public final java.lang.String getOPERATOR(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OPERATOR.toString());
	}

	/**
	 * Set value of OPERATOR
	 * @param operator
	 */
	public final void setOPERATOR(java.lang.String operator)
	{
		setOPERATOR(getContext(), operator);
	}

	/**
	 * Set value of OPERATOR
	 * @param context
	 * @param operator
	 */
	public final void setOPERATOR(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String operator)
	{
		getMendixObject().setValue(context, MemberNames.OPERATOR.toString(), operator);
	}

	/**
	 * @return value of RECIPIENT
	 */
	public final java.lang.String getRECIPIENT()
	{
		return getRECIPIENT(getContext());
	}

	/**
	 * @param context
	 * @return value of RECIPIENT
	 */
	public final java.lang.String getRECIPIENT(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RECIPIENT.toString());
	}

	/**
	 * Set value of RECIPIENT
	 * @param recipient
	 */
	public final void setRECIPIENT(java.lang.String recipient)
	{
		setRECIPIENT(getContext(), recipient);
	}

	/**
	 * Set value of RECIPIENT
	 * @param context
	 * @param recipient
	 */
	public final void setRECIPIENT(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String recipient)
	{
		getMendixObject().setValue(context, MemberNames.RECIPIENT.toString(), recipient);
	}

	/**
	 * @return value of STATUSISSUCCESS
	 */
	public final java.lang.String getSTATUSISSUCCESS()
	{
		return getSTATUSISSUCCESS(getContext());
	}

	/**
	 * @param context
	 * @return value of STATUSISSUCCESS
	 */
	public final java.lang.String getSTATUSISSUCCESS(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.STATUSISSUCCESS.toString());
	}

	/**
	 * Set value of STATUSISSUCCESS
	 * @param statusissuccess
	 */
	public final void setSTATUSISSUCCESS(java.lang.String statusissuccess)
	{
		setSTATUSISSUCCESS(getContext(), statusissuccess);
	}

	/**
	 * Set value of STATUSISSUCCESS
	 * @param context
	 * @param statusissuccess
	 */
	public final void setSTATUSISSUCCESS(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String statusissuccess)
	{
		getMendixObject().setValue(context, MemberNames.STATUSISSUCCESS.toString(), statusissuccess);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return statusreportMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final bulksms.proxies.statusreport that = (bulksms.proxies.statusreport) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "BulkSMS.statusreport";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
