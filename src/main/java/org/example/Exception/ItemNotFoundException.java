package org.example.Exception;

public class ItemNotFoundException extends StringListException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}