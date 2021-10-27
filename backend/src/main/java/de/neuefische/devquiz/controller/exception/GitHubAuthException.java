package de.neuefische.devquiz.controller.exception;

public class GitHubAuthException extends RuntimeException {
    public GitHubAuthException(String message) {
        super(message);
    }
    public GitHubAuthException(String message, Exception e) {
        super(message, e);
    }
}
