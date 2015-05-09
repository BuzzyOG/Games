package me.raino.games;

import java.text.MessageFormat;

public class StringUtil {

    private StringUtil() {}

    public static String format(String message, Object... arguments) {
        if (arguments.length == 0 || message.indexOf('{') == -1)
            return message;
        return MessageFormat.format(message, arguments);
    }

}
