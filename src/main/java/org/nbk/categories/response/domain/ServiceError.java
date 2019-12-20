package org.nbk.categories.response.domain;

public class ServiceError {

	private String httpStatus;
	private String message;

	public ServiceError(String httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;

	}

	/**
	 * @return the httpStatus
	 */
	public String getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus
	 *            the httpStatus to set
	 */
	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceError [httpStatusCode=");
		builder.append(httpStatus);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}

}
