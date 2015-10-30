package org.eclipse.core.runtime;

public final class OperationCanceledException extends RuntimeException {
	/**
	 * All serializable objects should have a stable serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a new exception.
	 */
	public OperationCanceledException() {
		super();
	}

	/**
	 * Creates a new exception with the given message.
	 * 
	 * @param message the message for the exception
	 */
	public OperationCanceledException(String message) {
		super(message);
	}
}
