package org.nbk.categories.response.domain;

import java.net.URI;

public class ServiceError {

	private String httpStatus;
	private String message;
	private URI uri;

	public ServiceError(String httpStatus, String message, URI uri) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.uri = uri;
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

	/**
	 * @return the uri
	 */
	public URI getUri() {
		return uri;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(URI uri) {
		this.uri = uri;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceError [httpStatus=");
		builder.append(httpStatus);
		builder.append(", message=");
		builder.append(message);
		builder.append(", uri=");
		builder.append(uri);
		builder.append("]");
		return builder.toString();
	}
}
