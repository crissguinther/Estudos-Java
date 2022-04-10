package model.exceptions;

public class WithdrawAmmountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public WithdrawAmmountException(String msg) {
		super(msg);
	}

}
