// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.publish.CustomRestServiceException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Throws a RestService exception, accepts the following attributes:
 * 
 * * httpStatus: The HTTP status of the request. Has to be between 400 and 599
 * * errorMessage:	The error message
 * * errorCode: Custom error code for this exception, to make the error easier recognizable and referable. 
 */
public class throwRestServiceException extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.Long httpStatus;
	private java.lang.String errorMessage;
	private java.lang.String errorCode;

	public throwRestServiceException(IContext context, java.lang.Long httpStatus, java.lang.String errorMessage, java.lang.String errorCode)
	{
		super(context);
		this.httpStatus = httpStatus;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new CustomRestServiceException(errorCode, errorMessage, (int)(long) httpStatus);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "throwRestServiceException";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}