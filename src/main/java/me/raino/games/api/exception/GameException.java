package me.raino.games.api.exception;

import me.raino.games.StringUtil;

public class GameException extends RuntimeException {

    public GameException(String message, Object... arguments) {
        super(StringUtil.format(message, arguments));
    }


}
