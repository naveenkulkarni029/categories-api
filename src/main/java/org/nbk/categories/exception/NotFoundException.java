package org.nbk.categories.exception;

import java.net.URI;

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private URI uri;

	public NotFoundException(String message, URI uri) {
		super(message);
		this.uri = uri;
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
}
