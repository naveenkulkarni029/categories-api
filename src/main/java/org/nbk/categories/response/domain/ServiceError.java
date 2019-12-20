package org.nbk.categories.response.domain;

import org.springframework.http.HttpStatus;

public class ServiceError {

	private Integer httpStatusCode;
	private HttpStatus httpStatus;
	private String message;

	public ServiceError(HttpStatus httpStatus, String message) {
		super();
		// this.httpStatusCode = httpStatusCode;
		this.httpStatus = httpStatus;
		this.message = message;
		this.httpStatusCode = getHttpStatusCode();
	}

	public ServiceError(Integer httpStatusCode, HttpStatus httpStatus, String message) {
		super();
		this.httpStatusCode = httpStatusCode;
		this.httpStatus = httpStatus;
		this.message = message;
	}

	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus
	 *            the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
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

	/**
	 * @return the httpStatusCode
	 */
	public Integer getHttpStatusCode() {
		if (null == httpStatusCode) {
			setHttpStatusCode(httpStatus.value());
		}
		return httpStatusCode;
	}

	/**
	 * @param httpStatusCode
	 *            the httpStatusCode to set
	 */
	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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
		builder.append(httpStatusCode);
		builder.append(", httpStatus=");
		builder.append(httpStatus);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}

}
