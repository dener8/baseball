package main.exception;

import main.view.Message;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(Message message) {
        super(message.toString());
    }
}
