// Rule 00: Input Validation and Data Sanitization (IDS)
// IDS03: Do not log unsanitized user input
// Non compliant
if (loginSuccesful) {
	logger.severe("User login succeded for: " + username);
}	else {
	logger.severe("User login failed for: " + username);
}

// Compliant
if (loginSuccesful) {
	logger.severe("User login succeded for: " + sanitizeUser(username);
}	else {
	logger.severe("User login failed for: " + sanitizeUser(username));
}

public String sanitizeUser(String username) {
	return Pattern.matches("[A-Za-z0-9_]+", username))
			? username : "unauthorized user";
}
